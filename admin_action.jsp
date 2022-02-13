<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page import="java.sql.*" %>

<%
//文字コードの指定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //データベースに接続するために使用する変数宣言
        Connection con = null;
        Statement stmt = null;
        StringBuffer SQL = null;
        ResultSet rs = null;

        //ローカルのMySQLに接続する設定
        String USER ="root";
        String PASSWORD ="root";
        String URL ="jdbc:mysql://localhost/nhs10599db";
        String DRIVER ="com.mysql.jdbc.Driver";

        //確認メッセージ
        StringBuffer ERMSG = null;
        //確認メッセージ
        String COMPMSG = null ;
        String COMPPRO = null ;
        boolean flg = true ;
        //ヒットフラグ
        int hit_flag = 0 ;
        
		//入力データ受信
		String users_numStr = request.getParameter("users_num");
		String users_pasStr = request.getParameter("users_pas");
        
        if(users_numStr != ""&&users_pasStr!=""){
        	try{
        	//JDBCドライバのロード
            Class.forName(DRIVER).newInstance();

            //Connectionオブジェクトの作成
            con = DriverManager.getConnection(URL,USER,PASSWORD);

            //Statementオブジェクトの作成
            stmt = con.createStatement();
        
        //SQLステートメントの作成(選択クエリ)
        SQL = new StringBuffer();
        SQL.append("select users_name from admin_tbl ");
        SQL.append("where users_num='" + users_numStr +"'and users_pas='" +users_pasStr+"'");

        //SQL文の発行(選択クエリ)
        rs = stmt.executeQuery(SQL.toString());

        //読み込み確認
        if(rs.next()==true){  //ログインOK
        //有効期限30秒
        	session.setMaxInactiveInterval(30);
        //セッションにバインド
        	session.setAttribute("login_name",rs.getString("users_name"));
        	
        //メインページへ遷移
        response.sendRedirect("adminmain.jsp");
        }else{ //ログインNG
        COMPMSG ="該当レコードは存在しません";
        }
        
        } //tryブロック終了
        catch(ClassNotFoundException e){
            ERMSG = new StringBuffer();
            ERMSG.append(e.getMessage());
        }
        catch(SQLException e){
            ERMSG = new StringBuffer();
            ERMSG.append(e.getMessage());
        }
        catch(Exception e){
            ERMSG = new StringBuffer();
            ERMSG.append(e.getMessage());
        }

        finally{
            //各種オブジェクトクローズ
            try{
                if(rs != null){
                    rs.close();
                }
                if(stmt != null){
                    stmt.close();
                }
                if(con != null){
                    con.close();
                }
            }
                catch(SQLException e){
                ERMSG = new StringBuffer();
                ERMSG.append(e.getMessage());
                }
        }
		}else{
			COMPMSG ="未入力項目があります";
		}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>認証処理</title>
     <link rel="stylesheet" type="text/css" href="css/reset.css">
      <link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
<%
	if(ERMSG!=null){ //認証OK
%>
  <div class="login">
    <div class="login-triangle"></div>
    
    <h2 class="login-header">IDまたはパスワードが誤っています</h2>

    <div class="login-container">
      <form method="post" action="admin.jsp">
        <p><input type="ID" placeholder="ID" name="users_num"disabled></p>
        <p><input type="password" placeholder="Password"name="users_pas"disabled></p>
        <p><input type="submit" value="ログイン画面へ"></p>
      </form>
    </div>
  </div>
<%
	}else{ //認証不可
%>
  <div class="login">
    <div class="login-triangle"></div>
    
    <h2 class="login-header">IDまたはパスワードが誤っています</h2>

    <div class="login-container">
      <form method="post" action="admin.jsp">
        <p><input type="ID" placeholder="ID" name="users_num"disabled></p>
        <p><input type="password" placeholder="Password"name="users_pas"disabled></p>
        <p><input type="submit" value="ログイン画面へ"></p>
      </form>
    </div>
  </div>
<%  
  }
%>

</form>
</body>
</html>
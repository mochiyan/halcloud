<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%
		//文字コードの指定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

		//入力データ受信
		String users_numStr = request.getParameter("users_num");
		String users_pasStr = request.getParameter("users_pas");
		
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
        
        //ヒットフラグ
        int hit_flag = 0 ;

        //HashMap(１件分のデータを格納する連想配列)
        HashMap<String,String>map = null;
        
        //ArrayList(すべての件数を格納する配列)
        ArrayList<HashMap>list = null;
        list = new ArrayList<HashMap>();
        
        try{//ロードに失敗したときのための例外処理
    //JDBCドライバのロード
    Class.forName(DRIVER).newInstance();

    //Connectionオブジェクトの作成
    con = DriverManager.getConnection(URL,USER,PASSWORD);

    //Statementオブジェクトの作成
    stmt = con.createStatement();

    //SQLステートメントの作成(選択クエリ)
    SQL = new StringBuffer();

    //SQL文の発行(選択クエリ)
    SQL.append("select * from admin_tbl where users_num ='");
    SQL.append(users_numStr);
    SQL.append("'and users_pas='");
    SQL.append(users_pasStr);
    SQL.append("'");
    //SQL.append("'and users_roleid= 1");
    //SQL.append(1);
    //SQL.append("'");
    
    //System.out.println(SQL.toString());

    //SQL文の発行(選択クエリ)
    rs = stmt.executeQuery(SQL.toString());
    //抽出したデータを繰り返し処理で表示する
    if(rs.next()){
    	//ヒットフラグオン
    	hit_flag = 1;
        //DBのデータをHashMapへ格納する
            map = new HashMap<String,String>();
            map.put("users_no",rs.getString("users_no"));
            map.put("users_num",rs.getString("users_num"));
            map.put("users_pas",rs.getString("users_pas"));
            map.put("users_name",rs.getString("users_name"));
            map.put("users_roleid",rs.getString("users_roleid"));

            //１件分のデータを(HashMap)をArrayListへ追加
            list.add(map);
	    }else{
	    //ヒットフラグオフ
	    hit_flag= 0 ;
	    }
	    
	}   //tryブロック終了
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
%>

<html>
  <head>
    <meta charset="utf-8">
    <title>ログイン画面</title>
      <link rel="stylesheet" type="text/css" href="css/reset.css">
      <link rel="stylesheet" type="text/css" href="css/login.css">
  </head>

  <body>
<%
	if(hit_flag == 1){//認証OK
%>
  <div class="login">
    <div class="login-triangle"></div>
    
    <h2 class="login-header">認証OK</h2>

    <div class="login-container">
      <form method="post" action="adminmain.jsp">
        <p><input type="ID" placeholder="ID" name="users_num"disabled></p>
        <p><input type="password" placeholder="Password"name="users_pas"disabled></p>
        <p><input type="submit" value="メイン画面へ"></p>
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


  </body>
</html>
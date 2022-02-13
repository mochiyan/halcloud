<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%
        //文字コードの指定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //入力データ受信
        String form_idStr = request.getParameter("form_id");

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

        //削除件数
        int del_count = 0 ;

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
            SQL.append("delete from form_tbl where form_id =");
            SQL.append(form_idStr);

            del_count = stmt.executeUpdate(SQL.toString());

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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>削除</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/newssubmit.css">
    </head>
</head>
<body>
     <header>
        <h1>
        </h1>
      </header>
    <div id="wrap">
      <div class="nav">
       <nav>
          <ul>
              <li><a href="adminmain.jsp">ホーム</a></li><!--
            --><li><a href="newslist.jsp">お知らせ</a></li><!--
            --><li><a href="foodadmin.jsp">グルメナビ</a></li><!--
            --><li><a href="formlist.jsp">お問い合わせ</a></li>
             <li><a href="adminsetting.jsp">設定</a></li>
          </ul>
        </nav>
      </div>

      <main>
      


<%
    if(del_count == 0){ //追加処理失敗
%>
    <div class="txt">削除処理が失敗しました</div>
<%
    }else{ //削除OK
%>
  <div class="txt">削除が完了しました</div>
<%
    }
%>
<br><br>
        <div class="check">
          <img src="./images/submit.png" alt="完了">
        </div>


        <div class="button">  
        <div class="button-container">
          <form method="post" action="formlist.jsp">
            <p><input type="submit" value="申請一覧に戻る"></p>
          </form>
        </div>
        </div>
  	 
    </main>

  </div>

</body>
</html>

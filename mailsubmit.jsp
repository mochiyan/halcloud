<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	//文字コードの指定
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    
    //入力データ受信
     String mail_oldStr = request.getParameter("old1");
     String mail_newStr = request.getParameter("new1");
	
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
        
        //更新件数
        int upd_count = 0;

        
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
			SQL.append("update mail_tbl set mail_txt = '");
	        SQL.append(mail_newStr);
		    SQL.append("'");
		    
		    //SQL文の発行(選択クエリ)
			upd_count = stmt.executeUpdate(SQL.toString());
	    
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



<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>メールアドレス変更完了</title>
  <link rel="stylesheet" type="text/css" href="css/reset.css">
  <link rel="stylesheet" type="text/css" href="css/common.css">
  <link rel="stylesheet" type="text/css" href="css/mailsubmit.css">
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
              <li><a href="main.jsp">ホーム</a></li><!--
            --><li><a href="time.jsp">時間割</a></li><!--
            --><li><a href="foodlog.jsp">グルメナビ</a></li><!--
            --><li><a href="todo.jsp">TODO</a></li>
            <li><a href="game.jsp">ミニゲーム</a></li>
             <li><a href="setting.jsp">設定</a></li>
         </ul>
       </nav>
     </div>
 
 <%
    if(upd_count == 0){ //更新処理失敗
%> 
	<main>    
  	<h1><%= "更新処理が失敗しました" %></h1>
  	        <div class="button">  
        <div class="button-container">
          <form method="post" action="main.jsp">
            <p><input type="submit" value="メイン画面に戻る"></p>
          </form>
        </div>
        </div>
<%
    }else{ //認証ok
%>
	   <main> 
        <h1>変更が完了しました</h1>
        <div class="check">
          <img src="./images/submit.png" alt="変更完了">
        </div>
        <div class="button">  
        <div class="button-container">
          <form method="post" action="main.jsp">
            <p><input type="submit" value="メイン画面に戻る"></p>
          </form>
        </div>
        </div>
    </main>
<%
    }
%>

  </div>
  </body>
 

</html>

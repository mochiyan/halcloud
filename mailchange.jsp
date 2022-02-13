<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%
	//文字コードの指定
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    
    //入力データ受信
    
	String oldStr = request.getParameter("old");
	String newStr = request.getParameter("new");
	
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
		    SQL.append("select * from mail_tbl where mail_txt = '");
		    SQL.append(oldStr);
		    SQL.append("'");
		    
		       //SQL文の発行(選択クエリ)
		    rs = stmt.executeQuery(SQL.toString());
		    //抽出したデータを繰り返し処理で表示する
		    if(rs.next()){
		    	//ヒットフラグオン
		    	hit_flag = 1;
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

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>メールアドレス変更画面</title>
      <link rel="stylesheet" type="text/css" href="css/reset.css">
      <link rel="stylesheet" type="text/css" href="css/common.css">
      <link rel="stylesheet" type="text/css" href="css/mailchange.css">
  </head>


  <body>
    <header></header>

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
    <main>
    <section>
  
<%
	if(hit_flag == 1){//認証OK
%>
  <div class="button">  
    <!--<h2 class="login-header">設定</h2>-->
    <p class="news">以下の内容で変更しますか？</p>
    <div class="button-container">
    
      <form method="post" action="mailsubmit.jsp"> 
          <p>認証済みメールアドレス</p>
          <p><input type="text" name="old1" value="<%=oldStr%>" size="40"></p>
          <p>新しいメールアドレス</p>
          <p><input type="text" name="new1" value="<%=newStr%>" size="40"></p>
          <p><input type="submit" value="変更する"></p>
      </form>
    <form method="post" action="mail.jsp"> 
       	<p><input type="submit" value="修正する"></p>
   </form>

    </div>
  </div>
  
 <%
	}else{ //認証不可
%> 
  <div class="button">  
    <!--<h2 class="login-header">設定</h2>-->
    <p class="news">メールアドレスが誤っています</p>
    <div class="button-container">
    
      <form method="post" action="mailsubmit.jsp"> 
          <p>認証済みメールアドレス</p>
          <p><input type="text" name="old" placeholder="<%=oldStr%>" size="40"disabled></p>
          <p>新しいメールアドレス</p>
          <p><input type="text" name="new" placeholder="<%=newStr%>" size="40"disabled></p>
      </form>
      <form method="post" action="mail.jsp"> 
        <p><input type="submit" value="修正する"></p>
      </form>
    </div>
  </div>
<%  
  }
%>

        
      </main>
    </div>
  </body>
  
</html>

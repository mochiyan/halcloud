<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>

<%
		//文字コードの指定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
		//入力データ受信
		String news_idStr = request.getParameter("news_id");

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
    SQL.append("select * from news_tbl where news_id =");
    SQL.append(news_idStr);
    
    //System.out.println(SQL.toString());

    //SQL文の発行(選択クエリ)
    rs = stmt.executeQuery(SQL.toString());
    //抽出したデータを繰り返し処理で表示する
    while(rs.next()){
        //DBのデータをHashMapへ格納する
            map = new HashMap<String,String>();
            map.put("news_id",rs.getString("news_id"));
            map.put("news_txt",rs.getString("news_txt"));
            map.put("news_date",rs.getString("news_date"));
            map.put("news_name",rs.getString("news_name"));

            //１件分のデータを(HashMap)をArrayListへ追加
            list.add(map);
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


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<%
        //文字コードの設定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
%>
<html>
  <head>
    <meta charset="utf-8">
    <title>お知らせ編集画面</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/newsadd.css">
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
    //ArrayListからデータを取り出す
   for(int i=0;i<list.size();i++){
 %>
      <div class="cp_form">
        <form action="news_updateout.jsp" method="post" class="cp_group">
	        <div class="title">
	        <h2>お知らせ編集</h2>
	     	</div>
	     	<input type="hidden" name="news_id" value="<%= list.get(i).get("news_id") %>">
	        <div class="cp_tx">
	        <label class="title">日付(例: 2029/12/01):</label>
	        <input type="date" name="news_date" class="large" value="<fmt:formatDate value="${mealCancel.mealCancelDate}" pattern="yyyy-MM-dd" required />
	        </div>
	       	<div class="cp_tx">
	        <label class="title">氏名:</label>
	        <input class="large" type="text" name="news_name" placeholder="<%= list.get(i).get("news_name") %>"required>
	        </div>
	        <div class="cp_textarea">
	        <label class="title">お知らせ内容:</label>
	        <textarea name="news_txt" cols="70" style="height: 100px;" required><%= list.get(i).get("news_txt") %></textarea>
	        </div>
	
	        <div class="submit">
	        <input type="submit" value="更新する" />
	        </div>
        </form>
      </div>
<%
	}
%>
      
      <div class="button">
        <div class="button-container">
          <form method="post" action="/halcloud/newslist.jsp"> 
              <p><input type="submit" value="お知らせ画面に戻る"></p>
          </form>
       </div>
      </div>	
      
      
      
    </main>

  </div>
  </body>

</html>  
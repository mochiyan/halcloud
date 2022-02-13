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
		String post_idStr = request.getParameter("post_id");

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
    SQL.append("select * from post_tbl where post_id =");
    SQL.append(post_idStr);
    
    //System.out.println(SQL.toString());

    //SQL文の発行(選択クエリ)
    rs = stmt.executeQuery(SQL.toString());
    //抽出したデータを繰り返し処理で表示する
    while(rs.next()){
        //DBのデータをHashMapへ格納する
            map = new HashMap<String,String>();
            map.put("post_id",rs.getString("post_id"));
            map.put("post_users",rs.getString("post_users"));
            map.put("post_name",rs.getString("post_name"));
            map.put("post_category",rs.getString("post_category"));
            map.put("post_star",rs.getString("post_star"));
            map.put("post_address",rs.getString("post_address"));
            map.put("post_tel",rs.getString("post_tel"));
            map.put("post_txt",rs.getString("post_txt"));

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
    <title>グルメナビ編集画面</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/food_updatein.css">
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
        <form action="food_insert.jsp" method="post" class="cp_group">
        <div class="title">
        <h2>店舗登録</h2>
      </div>
        <div class="cp_tx">
        
        <label class="title">店舗名:</label>
        <input class="large" type="text" name="post_name" value="<%= list.get(i).get("post_name") %>"required/>
        <label class="title">住所:</label>
        <input type="text" class="large" name="post_address"  value="<%= list.get(i).get("post_address") %>"required/>
        <label class="title">電話番号:</label>
        <input class="large" type="text" name="post_tel" value="<%= list.get(i).get("post_tel") %>"required/>
        <label class="title">カテゴリー:</label>
		<label>
		  <input type="radio" name="post_radio" value="安い" checked>安い 
		  <input type="radio" name="post_radio" value="ガッツリ">ガッツリ
		  <input type="radio" name="post_radio" value="お一人様ok">お一人様ok
		  <input type="radio" name="post_radio" value="居酒屋">居酒屋
		  <input type="radio" name="post_radio" value="高級">高級
		</label>
        <label class="title">星:</label>
          <select name="post_star" id="star">
            <option value="50">星5</option>
            <option value="45">星4.5</option>
            <option value="40">星4</option>
            <option value="35">星3.5</option>
            <option value="30">星3</option>
            <option value="25">星2.5</option>
            <option value="20">星2</option>
            <option value="15">星1.5</option>
            <option value="10">星1</option>
          </select>
        <label class="title">申請者氏名:</label>
        <input class="large" type="text" name="post_users" value="<%= list.get(i).get("post_users") %>"required />
        </div>
        <div class="cp_textarea">
        <label class="title">店舗説明:</label>
        <textarea name="post_txt" cols="70" style="height: 100px;"required><%= list.get(i).get("post_txt") %></textarea>
        </div>

        <!--ファイル-->
        <div class="cp_file">
        <label class="title">画像:</label>
        <label class="large">
      	<p>共有フォルダのグルメナビ申請フォルダに店舗名+氏名を付けて提出して下さい(例 〇〇ラーメン山本修輔.png)</p>
        </label>
        
        <div class="submit">
        <input type="submit" value="登録する" />
        </div>
        </form>
        </div>

<%
	}
%>
      <div class="button">
        <div class="button-container">
          <form method="post" action="/halcloud/foodlist.jsp"> 
              <p><input type="submit" value="戻る"></p>
          </form>
       </div>
      </div>	
      
      
      
    </main>

  </div>
  </body>

</html> 
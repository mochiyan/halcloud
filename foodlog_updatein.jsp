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
		String shop_idStr = request.getParameter("shop_id");

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
    SQL.append("select * from shop_tbl where shop_id =");
    SQL.append(shop_idStr);
    
    //System.out.println(SQL.toString());

    //SQL文の発行(選択クエリ)
    rs = stmt.executeQuery(SQL.toString());
    //抽出したデータを繰り返し処理で表示する
    while(rs.next()){
        //DBのデータをHashMapへ格納する
            map = new HashMap<String,String>();
            map.put("shop_id",rs.getString("shop_id"));
            map.put("shop_name",rs.getString("shop_name"));
            map.put("shop_address",rs.getString("shop_address"));
            map.put("shop_tel",rs.getString("shop_tel"));
            map.put("shop_category",rs.getString("shop_category"));
              map.put("shop_star",rs.getString("shop_star"));
                map.put("shop_txt",rs.getString("shop_txt"));

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
        <form action="foodlog_updateout.jsp" method="post" class="cp_group">
        <div class="title">
        <h2>店舗登録</h2>
      </div>
        <div class="cp_tx">
        <input type="hidden" name="shop_id" value="<%= list.get(i).get("shop_id") %>">
        <label class="title">店舗名:</label>
        <input class="large" type="text" name="shop_name" value="<%= list.get(i).get("shop_name") %>"required/>
        <label class="title">住所:</label>
        <input type="text" class="large" name="shop_address"  value="<%= list.get(i).get("shop_address") %>"required/>
        <label class="title">電話番号:</label>
        <input class="large" type="text" name="shop_tel" value="<%= list.get(i).get("shop_tel") %>"required/>
        <label class="title">カテゴリー:</label>
		<label>
		  <input type="radio" name="shop_radio" value="安い" checked>安い 
		  <input type="radio" name="shop_radio" value="ガッツリ">ガッツリ
		  <input type="radio" name="shop_radio" value="お一人様ok">お一人様ok
		  <input type="radio" name="shop_radio" value="居酒屋">居酒屋
		  <input type="radio" name="shop_radio" value="高級">高級
		</label>
        <label class="title">星:</label>
          <select name="shop_star" id="star">
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
        <div class="cp_textarea">
        <label class="title">店舗説明:</label>
        <textarea name="shop_txt" cols="70" style="height: 100px;"required><%= list.get(i).get("shop_txt") %></textarea>
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
          <form method="post" action="/halcloud/foodlogadmin.jsp"> 
              <p><input type="submit" value="戻る"></p>
          </form>
       </div>
      </div>	
      
      
      
    </main>

  </div>
  </body>

</html> 
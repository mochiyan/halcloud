<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%
	//文字コードの指定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
		
		String  session_name = (String)session.getAttribute("login_name");
	
		if(session_name == null)
		{
			response.sendRedirect("index.jsp");
		}
		
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
        SQL.append(" select news_id,news_txt,news_date from news_tbl order by news_id DESC ");


        //SQL文の発行(選択クエリ)
        rs = stmt.executeQuery(SQL.toString());

        //抽出したデータを繰り返し処理で表示する
            while(rs.next()){
                //DBのデータをHashMapへ格納する
                    map = new HashMap<String,String>();
                    map.put("news_id",rs.getString("news_id"));
                    map.put("news_txt",rs.getString("news_txt"));
                    map.put("news_date",rs.getString("news_date"));
                    
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
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
 	<title>メイン画面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta http-equiv="Content-Security-Policy" content="default-src * data: gap: content: https://ssl.gstatic.com; style-src * 'unsafe-inline'; script-src * 'unsafe-inline' 'unsafe-eval'">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/main.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/weather.css">
    <script src="js/weather.js" async>
    </script>
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
      
	<h2 class="sa">ようこそ!  <%= session_name %>さん</h2>
    
     <!--カレンダー画面-->
      <div class="container-calendar">
        <h4 id="monthAndYear"></h4>
        <div class="button-container-calendar">
            <button id="previous" onclick="previous()">‹</button>
            <button id="next" onclick="next()">›</button>
        </div>
        
        <table class="table-calendar" id="calendar" data-lang="ja">
            <thead id="thead-month"></thead>
            <tbody id="calendar-body"></tbody>
        </table>
        
        <div class="footer-container-calendar">
            <label for="month">日付指定：</label>
            <select id="month" onchange="jump()">
                <option value=0>1月</option>
                <option value=1>2月</option>
                <option value=2>3月</option>
                <option value=3>4月</option>
                <option value=4>5月</option>
                <option value=5>6月</option>
                <option value=6>7月</option>
                <option value=7>8月</option>
                <option value=8>9月</option>
                <option value=9>10月</option>
                <option value=10>11月</option>
                <option value=11>12月</option>
            </select>
            <select id="year" onchange="jump()"></select>
          </div>
     	 </div>	
    
  <div class="container-weather">
     <h1>名古屋の天気予報</h1>
  
    <table class="table-weather">
        <tr id="today">
            <th>今日の天気</th>
            <td></td>
        </tr>            
        <tr id="tomorrow">
            <th>明日の天気</th>
            <td></td>
        </tr>
        <tr id="dayAfterTomorrow">
            <th>明後日の天気</th>
            <td></td>
        </tr>
        <tr id="publishingOffice">
            <th>配信元</th>
            <td></td>
        </tr>
        <tr id="reportDatetime" >
            <th>報告日時</th>
            <td></td>
        </tr>
    </table> 
  </div>
  
  
    
    
        <!--お知らせ-->
    <div class="container-news">
    <p class="news">お知らせ</p>
       <div class="info">
    <%
       for(int i = 0 ; i<list.size();i++){
    %> 
      <dl><dt><%= list.get(i).get("news_date")%></dt><dd><%= list.get(i).get("news_txt")%></dd></dl>
    <%
       }
    %> 
   	 </div>	
   	</div>
   
    </main>
   

  <script src="js/calendar.js" type="text/javascript"></script>
 
  <!--ここまで-->


  </div>
</body>
</html>

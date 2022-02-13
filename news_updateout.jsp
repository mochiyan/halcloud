<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%
        //文字コードの指定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //入力データ受信
        String news_idStr = request.getParameter("news_id");
        String news_dateStr = request.getParameter("news_date");
        String news_nameStr = request.getParameter("news_name");
        String news_txtStr = request.getParameter("news_txt");
    

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
	        
	        //SQL文の構築
	        SQL.append("update news_tbl AS s set s.news_name = '");
	        SQL.append(news_nameStr);
	        SQL.append("',s.news_date = '");
	        SQL.append(news_dateStr);
	        SQL.append("',s.news_txt ='");
	        SQL.append(news_txtStr);
	        SQL.append("'where s.news_id =");
	        SQL.append(news_idStr);

	        
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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/newssubmit.css">
    </head>
<title>お知らせ更新</title>
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
    if(upd_count == 0){ //更新処理失敗
%>
    更新NG<br>
    <%= "更新処理が失敗しました" %>
<%
    }else{ //認証ok
%>
	    更新OK<br>
	<%= upd_count +"件　更新が完了しました" %>
<%
    }
%>

        <div class="check">
          <img src="./images/submit.png" alt="完了">
        </div>


        <div class="button">  
        <div class="button-container">
          <form method="post" action="newslist.jsp">
            <p><input type="submit" value="お知らせ一覧に戻る"></p>
          </form>
        </div>
        </div>
  	 
    </main>

  </div>


</body>
</html>
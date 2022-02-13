<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%
        //文字コードの指定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //入力データ受信
        String shop_idStr = request.getParameter("shop_id");
        String shop_nameStr = request.getParameter("shop_name");
        String shop_addressStr = request.getParameter("shop_address");
        String shop_telStr = request.getParameter("shop_tel");
        String shop_radioStr = request.getParameter("shop_radio");
        String shop_starStr = request.getParameter("shop_star");
        String shop_txtStr = request.getParameter("shop_txt");
        

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
	        SQL.append("update shop_tbl AS s set s.shop_name = '");
	        SQL.append(shop_nameStr);
	        SQL.append("',s.shop_address = '");
	        SQL.append(shop_addressStr);
	        SQL.append("',s.shop_tel ='");
	        SQL.append(shop_telStr);
	       	SQL.append("',s.shop_category='");
	        SQL.append(shop_radioStr);
	       	SQL.append("',s.shop_star='");
	        SQL.append(shop_starStr);
	       	SQL.append("',s.shop_txt='");
	        SQL.append(shop_txtStr);
	        SQL.append("'where s.shop_id =");
	        SQL.append(shop_idStr);
	        
	        
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
<title>店舗情報更新</title>
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
   <h1><%= "更新処理が失敗しました" %></h1>
<%
    }else{ //認証ok
%>
	 <h1>変更が完了しました</h1>
<%
    }
%>

        <div class="check">
          <img src="./images/submit.png" alt="完了">
        </div>


        <div class="button">  
        <div class="button-container">
          <form method="post" action="foodlogadmin.jsp">
            <p><input type="submit" value="店舗一覧に戻る"></p>
          </form>
        </div>
        </div>
  	 
    </main>

  </div>


</body>
</html>
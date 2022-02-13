<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%
//文字コードの指定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

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
        SQL.append(" select * from post_tbl ");


        //SQL文の発行(選択クエリ)
        rs = stmt.executeQuery(SQL.toString());

        //抽出したデータを繰り返し処理で表示する
            while(rs.next()){
                //DBのデータをHashMapへ格納する
                    map = new HashMap<String,String>();
                    map.put("post_id",rs.getString("post_id"));
                    map.put("post_name",rs.getString("post_name"));
                    map.put("post_address",rs.getString("post_address"));
                    map.put("post_tel",rs.getString("post_tel"));
                    map.put("post_category",rs.getString("post_category"));
                    map.put("post_star",rs.getString("post_star"));
                    map.put("post_users",rs.getString("post_users"));
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
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>グルメナビ</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/foodlist.css">
</head>
<% if(ERMSG != null){ %>
予期せぬエラーが発生しました<br/>
<%= ERMSG %>
<% } %>
<body>
    <header></header>

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
            <p class="news">グルメナビ 申請一覧</p>
     

    <%
                for(int i = 0 ; i<list.size();i++){
    %>           
    
    	<h2>No.<%= list.get(i).get("post_id")%></h2>     
                <table id="prof">

                <tr>
                    <th>
                      	  申請者名
                    </th>
                    <td width="500">
                        <%= list.get(i).get("post_users")%>
                    </td>
                </tr>
                <tr>
                    <th>
                        	店舗名
                    </th>
                    <td width="500">
                        <%= list.get(i).get("post_name")%>
                    </td>
                </tr>
                <tr>
                    <th>
                     	   カテゴリー
                    </th>
                    <td width="500">
                        <%= list.get(i).get("post_category")%>
                    </td>
                </tr>
                <tr>
                    <th>
                      	  オススメ度
                    </th>
                    <td width="500">
                        <span class="rate rate<%= list.get(i).get("post_star")%>"></span>
                    </td>
                </tr>
                <tr>
                    <th>
                       	 住所
                    </th>
                    <td width="500">
                        <%= list.get(i).get("post_address")%>
                    </td>
                </tr>
                <tr>
                    <th>
                      	  電話番号
                    </th>
                    <td width="500">
                        <%= list.get(i).get("post_tel")%>
                    </td>
                </tr>
                <tr>
                    <th>
                      	  コメント
                    </th>
                    <td width="500">
                        <%= list.get(i).get("post_txt")%>
                    </td>
                </tr>
                <tr>  
		     	<td>   
			     <a href="food_delete.jsp?post_id=<%= list.get(i).get("post_id")%>">[削除]</a>
			    </td>
			    <td>
			     <a href="food_updatein.jsp?post_id=<%= list.get(i).get("post_id")%>">[編集して登録]</a>
		   		</td>	
	
                </table>
           

    <%
                }
    %>
     <div class="button">
        <div class="button-container">
          <form method="post" action="foodlist_add.jsp"> 
              <p><input type="submit" value="追加する"></p>
          </form>
       </div>
      </div>
    </main>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%
	String  session_name = (String)session.getAttribute("login_name");
	
	if(session_name == null)
		{
			response.sendRedirect("index.jsp");
		}

%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>設定画面</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/setting.css">
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
    <section>
<main>
  <p class="news">設定</p>
  <div class="button">
    
    <!--<h2 class="login-header">設定</h2>-->

    <div class="button-container">
      <form method="post" action="adminrule.jsp">
      <p><input type="submit" value="利用規約"></p>
      </form>
     <form method="post" action="index.jsp">
			<input type="hidden" name="logout" value="logout">
			<p><input type="submit" value="ログアウト"></p>
	</form>
    </div>
    
  </div>



          </section>
      </main>
    </div>
  </body>
</html>
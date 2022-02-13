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
              <li><a href="main.jsp">ホーム</a></li><!--
            --><li><a href="time.jsp">時間割</a></li><!--
            --><li><a href="foodlog.jsp">グルメナビ</a></li><!--
            --><li><a href="todo.jsp">TODO</a></li>
            <li><a href="game.jsp">ミニゲーム</a></li>
             <li><a href="setting.jsp">設定</a></li>
          </ul>
        </nav>
      </div>
    <section>
<main>
  <p class="news">設定</p>
  <div class="button">
    
    <!--<h2 class="login-header">設定</h2>-->

    <div class="button-container">
    
      <form method="post" action="foodadd.jsp"> 
      <p><input type="submit" value="店舗申請"></p>
      </form>
      <form method="post" action="mail.jsp">
      <p><input type="submit" value="メールアドレス変更"></p>
      </form>
      <form method="post" action="form.jsp">
      <p><input type="submit" value="お問い合わせ"></p>
      </form>
      <form method="post" action="rule.jsp">
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

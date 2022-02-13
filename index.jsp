<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<%
	String  logout = request.getParameter("logout");
	if(logout!= null){
		//セッション変数を削除
		session.removeAttribute("login_name");
		}
		String session_name = (String)session.getAttribute("login_name");
		
		if(session_name != null)
		{
			response.sendRedirect("main.jsp");
		}
		
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>ログイン</title>
      <link rel="stylesheet" type="text/css" href="./css/reset.css">
      <link rel="stylesheet" type="text/css" href="./css/index.css">
  </head>

  <body>
  <div class="login">
    <div class="login-triangle"></div>
    
    <h2 class="login-header">HALcloud</h2>

    <div class="login-container">
      <form method="post" action="index_action.jsp">
        <p><input type="ID" placeholder="ID" name="users_num"></p>
        <p><input type="password" placeholder="Password" name="users_pas"></p>
        <p><input type="submit" value="ログイン"></p>
      </form>
      <form method="post" action="admin.jsp">
        <p><input type="submit" value="管理者はこちら"></p>
      </form>
    </div>
    
  </div>
  </body>
</html>
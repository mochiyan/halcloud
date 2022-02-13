<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<%
        //文字コードの設定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
%>
<html>
  <head>
    <meta charset="utf-8">
    <title>お知らせ追加画面</title>
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
      
      
      <div class="button">
        <div class="button-container">
          <form method="post" action="/halcloud/foodlist.jsp"> 
              <p><input type="submit" value="申請一覧を表示"></p>
          </form>
       </div>
      </div>


      
      <div class="button">
        <div class="button-container">
          <form method="post" action="/halcloud/foodlogadmin.jsp"> 
              <p><input type="submit" value="グルメナビを編集"></p>
          </form>
       </div>
      </div>	
      
      
      
    </main>

  </div>
  </body>

</html>  
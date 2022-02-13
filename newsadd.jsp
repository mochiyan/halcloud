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
      
      
      <div class="cp_form">
        <form action="newsaddout.jsp" method="post" class="cp_group">
	        <div class="title">
	        <h2>お知らせ追加</h2>
	     	</div>
	        <div class="cp_tx">
	        <label class="title">日付(例: 20XX/08/02):</label>
	        <input type="date" name="news_date" class="large" value="<fmt:formatDate value="${mealCancel.mealCancelDate}" pattern="yyyy-MM-dd"required />
	        
	        </div>
	       	<div class="cp_tx">
	        <label class="title">氏名:</label>
	        <input class="large" type="text" name="news_name" required>
	        </div>
	        <div class="cp_textarea">
	        <label class="title">お知らせ内容:</label>
	        <textarea name="news_txt" cols="70" style="height: 100px;" required>入力して下さい。</textarea>
	        </div>
	
	        <div class="submit">
	        <input type="submit" value="追加する" />
	        </div>
        </form>
      </div>

      
      <div class="button">
        <div class="button-container">
          <form method="post" action="/halcloud/newslist.jsp"> 
              <p><input type="submit" value="お知らせ画面に戻る"></p>
          </form>
       </div>
      </div>	
      
      
      
    </main>

  </div>
  </body>

</html>  
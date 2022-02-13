<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.lang.Math" %>
<% request.setCharacterEncoding("UTF-8");%>
<%
	String[] unsei = {"大吉","中吉","小吉"};
	double ran = Math.floor(Math.random()*3);
	int i = (int)ran ;
	
	String hantei ;
	if(unsei[i]=="大吉"){
		hantei = "チャンス到来！新たな才能が大きく開花しそうです";
	}
	else if(unsei[i]=="中吉"){
		hantei = "健康で大きな病気もない良い年になりそうです";
	}
	else{
		hantei = "日々の努力が実を結ぶでしょう";
	}
%>

<html>
  <head>
    <meta charset="utf-8">
    <title>運勢</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/gameifin.css">
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
  <p class="news">ミニゲーム</p>
  
   
      
     <div id="answer_01" class="result">
      <div class="result_theme ">
            <p>今年の運勢は</p>
      </div>
      <div class="result_type0 ">
            <h4><%=unsei[i]%></h4>
      </div>
      <div class="result_discription0">
        <h2></h2><br><br>
        <p>
         <%=hantei%>
        </p>
      </div>
       <div class="return-btn">
        <a class="return" href="game.jsp">もどる</a>
       </div>
     </div>
      
      
      


      </main>
    </div>
  </body>
</html>
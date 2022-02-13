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
  <p class="news">ミニゲーム</p>
  <div class="button">
    
    <!--<h2 class="login-header">設定</h2>-->

    <div class="button-container">
      <form method="post" action="gameifin.jsp">
      <p><input type="submit" value="性格診断"></p>
      </form>
      <form method="post" action="gameunsei.jsp">
      <p><input type="submit" value="今年の運勢"></p>
      </form>
    </div>
    
  </div>


      </main>
    </div>
  </body>
</html>

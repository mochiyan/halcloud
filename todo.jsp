<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="UTF-8">
    <title>todo</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/todo.css">
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
    
	<main>
	<body>
	    
	    <div class="button">
	    	        <h1 class="todo-title">TODO</h1>
	     <div class="button-container">
	        <form id="form" class="mb-4">
	            <input type="text" id="input" class="form-control" placeholder="TODOを入力" autocomplete="off">
	        </form>
	    <table>
        <tr class="list-group" id="tr">
            
        </tr>
        </table>
        </div>
	    </div>
	    <script src="js/todo.js"></script>
	</body>

      </main>
    </div>
  </body>
</html>
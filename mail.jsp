<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>メールアドレス変更画面</title>
      <link rel="stylesheet" type="text/css" href="css/reset.css">
      <link rel="stylesheet" type="text/css" href="css/common.css">
      <link rel="stylesheet" type="text/css" href="css/mail.css">
  </head>


  <body>

    <header></header>
    
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
    <section>

  <div class="button">
    
    <!--<h2 class="login-header">設定</h2>-->
    <p class="news">メールアドレス変更</p>
    <div class="button-container">
      <form method="post" action="mailchange.jsp">
          <p>認証済みメールアドレス</p>
          <p><input type="text" name="old" placeholder="oldmail@example.com" size="40"required></p>
          <p>新しいメールアドレス</p>
          <p><input type="text" name="new" placeholder="*********@example.com" size="40"required></p>
        <p><input type="submit" value="次へ"></p>
      </form>
    </div>
    
  </div>

      </main>
    </div>
  </body>
</html>

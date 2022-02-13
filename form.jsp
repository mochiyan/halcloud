<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>お問い合わせ</title>
  <link rel="stylesheet" type="text/css" href="css/reset.css">
  <link rel="stylesheet" type="text/css" href="css/common.css">
  <link rel="stylesheet" type="text/css" href="css/foodadd.css">
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

      <div class="cp_form">
        <form action="form_submit.jsp" method="post" class="cp_group">
        <div class="title">
        <h2>お問い合わせフォーム</h2>
      </div>
        <div class="cp_tx">
        
        <label class="title">名前:</label>
        <input class="large" type="text" name="form_name" required/>
        <label class="title">学籍番号:</label>
        <input class="large" type="text" name="form_number" required />
        <label class="title">お問い合わせ理由:</label>
		<label>
		  <input type="radio" name="form_radio" value="質問" checked>質問 
		  <input type="radio" name="form_radio" value="ご意見ご要望">ご意見ご要望
		  <input type="radio" name="form_radio" value="掲載依頼">掲載依頼
		  <input type="radio" name="form_radio" value="その他">その他
		</label>
        </div>
        <div class="cp_textarea">
        <label class="title">お問い合わせ内容:</label>
        <textarea name="form_txt" cols="70" style="height: 100px;"required>入力して下さい。</textarea>
        </div>
             
        <div class="submit">
        <input type="submit" value="申請する" />
        </div>
        </form>
        </div>

  </div>
  </body>

</html>
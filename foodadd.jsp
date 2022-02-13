<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>グルメナビ</title>
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
        <form action="foodlog_submit.jsp" method="post" class="cp_group">
        <div class="title">
        <h2>店舗情報申請</h2>
      </div>
        <div class="cp_tx">
        <label class="tiltle">店舗情報:</label>
        
        <label class="title">店舗名:</label>
        <input class="large" type="text" name="post_name" required/>
        <label class="title">住所:</label>
        <input class="large" type="text" name="post_address" required />
        <label class="title">電話番号:</label>
        <input class="large" type="text" name="post_tel" required/>
        <label class="title">カテゴリー:</label>
		<label>
		  <input type="radio" name="post_radio" value="安い" checked>安い 
		  <input type="radio" name="post_radio" value="ガッツリ">ガッツリ
		  <input type="radio" name="post_radio" value="お一人様ok">お一人様ok
		  <input type="radio" name="post_radio" value="居酒屋">居酒屋
		  <input type="radio" name="post_radio" value="高級">高級
		</label>
        <label class="title">オススメ度:</label>
          <select name="post_star" id="star">
            <option value="50">星5</option>
            <option value="45">星4.5</option>
            <option value="40">星4</option>
            <option value="35">星3.5</option>
            <option value="30">星3</option>
            <option value="25">星2.5</option>
            <option value="20">星2</option>
            <option value="15">星1.5</option>
            <option value="10">星1</option>
          </select>
        <label class="title">申請者氏名:</label>
        <input class="large" type="text" name="post_users"required />
        </div>
        <div class="cp_textarea">
        <label class="title">店舗説明:</label>
        <textarea name="post_txt" cols="70" style="height: 100px;"required>入力して下さい。</textarea>
        </div>

        <!--ファイル-->
        <div class="cp_file">
        <label class="title">画像:</label>
        <label class="title">
      	<p>共有フォルダのグルメナビ申請フォルダに店舗名+氏名を付けて提出して下さい(例 〇〇ラーメン山本修輔.png)</p>
        </label>
        
        <div class="submit">
        <input type="submit" value="申請する" />
        </div>
        </form>
        </div>

  </div>
  </body>

</html>
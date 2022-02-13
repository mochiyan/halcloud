
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta charset="utf-8">
    <title>グルメナビ編集画面</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/food_updatein.css">
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
        <form action="foodlist_addout.jsp" method="post" class="cp_group">
        <div class="title">
        <h2>店舗登録</h2>
      </div>
        <div class="cp_tx">
        
        <label class="title">店舗名:</label>
        <input class="large" type="text" name="post_name" required/>
        <label class="title">住所:</label>
        <input type="text" class="large" name="post_address" required/>
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
        <label class="title">星:</label>
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
        <input class="large" type="text" name="post_users" required />
        </div>
        <div class="cp_textarea">
        <label class="title">店舗説明:</label>
        <textarea name="post_txt" cols="70" style="height: 100px;"required>入力して下さい</textarea>
        </div>

        <!--ファイル-->
        <div class="cp_file">
        <label class="title">画像:</label>
        <label class="title">
      	<p>共有フォルダのグルメナビ申請フォルダに店舗名+氏名を付けて提出して下さい(例 〇〇ラーメン山本修輔.png)</p>
        </label>
        
        <div class="submit">
        <input type="submit" value="登録する" />
        </div>
        </form>
        </div>


      <div class="button">
        <div class="button-container">
          <form method="post" action="/halcloud/foodlist.jsp"> 
              <p><input type="submit" value="戻る"></p>
          </form>
       </div>
      </div>	
      
      
      
    </main>

  </div>
  </body>

</html> 
<!DOCTYPE html>
<head>
	<meta charset="utf-8">
  <title>性格診断</title>
  	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/reset.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/gameifin.css">
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
</script>

<div class="choose_box">
      <!-- 質問一覧 -->
      <div class="app-theme">
        <p>性格診断(全5問)</p>
      </div>
      <!-- 質問1 -->
      <div id="q_01" class="fit">
        <p>質問1: あなたは普段は非常に意欲的で、エネルギッシュである。　</p>
        <ul>
          <li><a class="btn" href="#q_02" data-value="a">はい</a></li>
          <li><a class="btn" href="#q_02" data-value="b">いいえ</a></li>
        </ul>
      </div>

      <!-- 質問2 -->
      <div id="q_02" style="display: none;">
        <p>質問2:旅行に行くときはかなり計画を練る方である。</p>
        <ul>
          <li><a class="btn" href="#q_03" data-value="b">はい</a></li>
          <li><a class="btn" href="#q_03" data-value="a">いいえ</a></li>
        </ul>
      </div>

      <!-- 質問3 -->
      <div id="q_03" style="display: none;">
        <p>質問3:　あなたの話し方は</p>
        <ul>
          <li><a class="btn" href="#q_04" data-value="a">語尾がキッパリ</a></li>
          <li><a class="btn" href="#q_04" data-value="b">語尾がソフト</a></li>
        </ul>
      </div>

      <!-- 質問4 -->
      <div id="q_04" style="display: none;">
        <p>質問4:　重要な決定を行うとなると、心情よりも論理の方がより重要である。</p>
        <ul>
          <li><a class="btn" href="#q_05" data-value="b">はい</a></li>
          <li><a class="btn" href="#q_05" data-value="a">いいえ</a></li>
        </ul>
      </div>

      <!-- 質問5 -->
      <div id="q_05" style="display: none;">
        <p>質問5:　意見を求められた時、あなたは</p>
        <ul>
          <li><a class="btn end" data-value="a">自分から口火を切る</a></li>
          <li><a class="btn end" data-value="b">後から発言する</a></li>
        </ul>
      </div>



<!-- ここから以下回答 -->
  <!-- 回答の答え1 -->
     <div id="answer_01" class="result" style="display: none;">
      <div class="result_theme ">
            <p>あなたの性格は</p>
      </div>
      <div class="result_type0 ">
            <h4>リーダー型</h4>
      </div>
      <div class="result_discription0">
        <h2>エネルギッシュ× 責任感</h2>
        <p>
          　あなたはチームや組織を率いて目標達成に向かうことが得意。
        </p>
      </div>
       <div class="return-btn">
        <a class="return" href="gameifin.jsp">もどる</a>
       </div>
     </div>



  <!-- 回答の答え2 -->
     <div id="answer_02" style="display: none;">
          <div class="result_theme ">
            <p>あなたの性格は</p>
      </div>
      <div class="result_type1 ">
            <h4>冷静</h4>
      </div>
      <div class="result_discription1">
        <h2>判断力 ×サポート</h2>
        <p>
          　あなたは物事をじっくり考えて、最善策を練ることが得意。組織や周りを支えることが得意。
        </p>
      </div>
       <div class="return-btn">
        <a class="return" href="gameifin.jsp">もどる</a>
       </div>
     </div>

 </div>

  </main>


  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="js/gameifin.js" type="text/javascript" ></script>
    
    </div>
</body>
</html>

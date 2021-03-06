package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class mailchange_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	//文字コードの指定
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    
    //入力データ受信
    
	String oldStr = request.getParameter("old");
	String newStr = request.getParameter("new");
	
	//データベースに接続するために使用する変数宣言
        Connection con = null;
        Statement stmt = null;
        StringBuffer SQL = null;
        ResultSet rs = null;

        //ローカルのMySQLに接続する設定
        String USER ="root";
        String PASSWORD ="root";
        String URL ="jdbc:mysql://localhost/nhs10599db";
        String DRIVER ="com.mysql.jdbc.Driver";

        //確認メッセージ
        StringBuffer ERMSG = null;
        
        //ヒットフラグ
        int hit_flag = 0 ;

        //HashMap(１件分のデータを格納する連想配列)
        HashMap<String,String>map = null;
        
        //ArrayList(すべての件数を格納する配列)
        ArrayList<HashMap>list = null;
        list = new ArrayList<HashMap>();
        
    try{//ロードに失敗したときのための例外処理
		    //JDBCドライバのロード
		    Class.forName(DRIVER).newInstance();
		
		    //Connectionオブジェクトの作成
		    con = DriverManager.getConnection(URL,USER,PASSWORD);
		
		    //Statementオブジェクトの作成
		    stmt = con.createStatement();
		
		    //SQLステートメントの作成(選択クエリ)
		    SQL = new StringBuffer();
		    
		        //SQL文の発行(選択クエリ)
		    SQL.append("select * from mail_tbl where mail_txt = '");
		    SQL.append(oldStr);
		    SQL.append("'");
		    
		       //SQL文の発行(選択クエリ)
		    rs = stmt.executeQuery(SQL.toString());
		    //抽出したデータを繰り返し処理で表示する
		    if(rs.next()){
		    	//ヒットフラグオン
		    	hit_flag = 1;
		    }else{
			    //ヒットフラグオフ
			    hit_flag= 0 ;
		    }
	    
	}   //tryブロック終了
	catch(ClassNotFoundException e){
	    ERMSG = new StringBuffer();
	    ERMSG.append(e.getMessage());
	}
	catch(SQLException e){
	    ERMSG = new StringBuffer();
	    ERMSG.append(e.getMessage());
	}
	catch(Exception e){
	    ERMSG = new StringBuffer();
	    ERMSG.append(e.getMessage());
	}

	finally{
	    //各種オブジェクトクローズ
	    try{
	        if(rs != null){
	            rs.close();
	        }
	        if(stmt != null){
	            stmt.close();
	        }
	        if(con != null){
	            con.close();
	        }
	    }
        catch(SQLException e){
        ERMSG = new StringBuffer();
        ERMSG.append(e.getMessage());
        }
}
	    
	


      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>メールアドレス変更画面</title>\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mailchange.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <header></header>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("     \r\n");
      out.write("      <div class=\"nav\">\r\n");
      out.write("       <nav>\r\n");
      out.write("          <ul>\r\n");
      out.write("              <li><a href=\"main.jsp\">ホーム</a></li><!--\r\n");
      out.write("            --><li><a href=\"time.jsp\">時間割</a></li><!--\r\n");
      out.write("            --><li><a href=\"foodlog.jsp\">グルメナビ</a></li><!--\r\n");
      out.write("            --><li><a href=\"todo.jsp\">TODO</a></li>\r\n");
      out.write("            <li><a href=\"game.jsp\">ミニゲーム</a></li>\r\n");
      out.write("             <li><a href=\"setting.jsp\">設定</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("    <main>\r\n");
      out.write("    <section>\r\n");
      out.write("  \r\n");

	if(hit_flag == 1){//認証OK

      out.write("\r\n");
      out.write("  <div class=\"button\">  \r\n");
      out.write("    <!--<h2 class=\"login-header\">設定</h2>-->\r\n");
      out.write("    <p class=\"news\">以下の内容で変更しますか？</p>\r\n");
      out.write("    <div class=\"button-container\">\r\n");
      out.write("    \r\n");
      out.write("      <form method=\"post\" action=\"mailsubmit.jsp\"> \r\n");
      out.write("          <p>認証済みメールアドレス</p>\r\n");
      out.write("          <p><input type=\"text\" name=\"old1\" value=\"");
      out.print(oldStr);
      out.write("\" size=\"40\"></p>\r\n");
      out.write("          <p>新しいメールアドレス</p>\r\n");
      out.write("          <p><input type=\"text\" name=\"new1\" value=\"");
      out.print(newStr);
      out.write("\" size=\"40\"></p>\r\n");
      out.write("          <p><input type=\"submit\" value=\"変更する\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("    <form method=\"post\" action=\"mail.jsp\"> \r\n");
      out.write("       \t<p><input type=\"submit\" value=\"修正する\"></p>\r\n");
      out.write("   </form>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write(" ");

	}else{ //認証不可

      out.write(" \r\n");
      out.write("  <div class=\"button\">  \r\n");
      out.write("    <!--<h2 class=\"login-header\">設定</h2>-->\r\n");
      out.write("    <p class=\"news\">メールアドレスが誤っています</p>\r\n");
      out.write("    <div class=\"button-container\">\r\n");
      out.write("    \r\n");
      out.write("      <form method=\"post\" action=\"mailsubmit.jsp\"> \r\n");
      out.write("          <p>認証済みメールアドレス</p>\r\n");
      out.write("          <p><input type=\"text\" name=\"old\" placeholder=\"");
      out.print(oldStr);
      out.write("\" size=\"40\"disabled></p>\r\n");
      out.write("          <p>新しいメールアドレス</p>\r\n");
      out.write("          <p><input type=\"text\" name=\"new\" placeholder=\"");
      out.print(newStr);
      out.write("\" size=\"40\"disabled></p>\r\n");
      out.write("      </form>\r\n");
      out.write("      <form method=\"post\" action=\"mail.jsp\"> \r\n");
      out.write("        <p><input type=\"submit\" value=\"修正する\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
  
  }

      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      </main>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("  \r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

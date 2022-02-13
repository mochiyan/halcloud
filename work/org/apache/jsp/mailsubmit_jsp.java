package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class mailsubmit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	//文字コードの指定
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    
    //入力データ受信
     String mail_oldStr = request.getParameter("old1");
     String mail_newStr = request.getParameter("new1");
	
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
        
        //更新件数
        int upd_count = 0;

        
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
			SQL.append("update mail_tbl set mail_txt = '");
	        SQL.append(mail_newStr);
		    SQL.append("'");
		    
		    //SQL文の発行(選択クエリ)
			upd_count = stmt.executeUpdate(SQL.toString());
	    
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>メールアドレス変更完了</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mailsubmit.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("      <header>\r\n");
      out.write("        <h1>\r\n");
      out.write("        </h1>\r\n");
      out.write("      </header>\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("       \r\n");
      out.write("      <div class=\"nav\">\r\n");
      out.write("      <nav>\r\n");
      out.write("         <ul>\r\n");
      out.write("              <li><a href=\"main.jsp\">ホーム</a></li><!--\r\n");
      out.write("            --><li><a href=\"time.jsp\">時間割</a></li><!--\r\n");
      out.write("            --><li><a href=\"foodlog.jsp\">グルメナビ</a></li><!--\r\n");
      out.write("            --><li><a href=\"todo.jsp\">TODO</a></li>\r\n");
      out.write("            <li><a href=\"game.jsp\">ミニゲーム</a></li>\r\n");
      out.write("             <li><a href=\"setting.jsp\">設定</a></li>\r\n");
      out.write("         </ul>\r\n");
      out.write("       </nav>\r\n");
      out.write("     </div>\r\n");
      out.write(" \r\n");
      out.write(" ");

    if(upd_count == 0){ //更新処理失敗

      out.write(" \r\n");
      out.write("\t<main>    \r\n");
      out.write("  \t<h1>");
      out.print( "更新処理が失敗しました" );
      out.write("</h1>\r\n");
      out.write("  \t        <div class=\"button\">  \r\n");
      out.write("        <div class=\"button-container\">\r\n");
      out.write("          <form method=\"post\" action=\"main.jsp\">\r\n");
      out.write("            <p><input type=\"submit\" value=\"メイン画面に戻る\"></p>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");

    }else{ //認証ok

      out.write("\r\n");
      out.write("\t   <main> \r\n");
      out.write("        <h1>変更が完了しました</h1>\r\n");
      out.write("        <div class=\"check\">\r\n");
      out.write("          <img src=\"./images/submit.png\" alt=\"変更完了\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"button\">  \r\n");
      out.write("        <div class=\"button-container\">\r\n");
      out.write("          <form method=\"post\" action=\"main.jsp\">\r\n");
      out.write("            <p><input type=\"submit\" value=\"メイン画面に戻る\"></p>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");

    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  </body>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
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

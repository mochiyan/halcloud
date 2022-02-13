package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class setting_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

	String  session_name = (String)session.getAttribute("login_name");
	
	if(session_name == null)
		{
			response.sendRedirect("index.jsp");
		}


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>設定画面</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reset.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/setting.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <header>\r\n");
      out.write("      <h1>\r\n");
      out.write("      </h1>\r\n");
      out.write("    </header>\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("      \r\n");
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
      out.write("    <section>\r\n");
      out.write("<main>\r\n");
      out.write("  <p class=\"news\">設定</p>\r\n");
      out.write("  <div class=\"button\">\r\n");
      out.write("    \r\n");
      out.write("    <!--<h2 class=\"login-header\">設定</h2>-->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"button-container\">\r\n");
      out.write("    \r\n");
      out.write("      <form method=\"post\" action=\"foodadd.jsp\"> \r\n");
      out.write("      <p><input type=\"submit\" value=\"店舗申請\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("      <form method=\"post\" action=\"mail.jsp\">\r\n");
      out.write("      <p><input type=\"submit\" value=\"メールアドレス変更\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("      <form method=\"post\" action=\"form.jsp\">\r\n");
      out.write("      <p><input type=\"submit\" value=\"お問い合わせ\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("      <form method=\"post\" action=\"rule.jsp\">\r\n");
      out.write("      <p><input type=\"submit\" value=\"利用規約\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("     <form method=\"post\" action=\"index.jsp\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"logout\" value=\"logout\">\r\n");
      out.write("\t<p><input type=\"submit\" value=\"ログアウト\"></p>\r\n");
      out.write("\t</form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </section>\r\n");
      out.write("      </main>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
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

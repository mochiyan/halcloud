package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class foodlist_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>ã°ã«ã¡ããç·¨éç»é¢</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reset.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/food_updatein.css\">\r\n");
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
      out.write("      <div class=\"nav\">\r\n");
      out.write("       <nav>\r\n");
      out.write("          <ul>\r\n");
      out.write("              <li><a href=\"adminmain.jsp\">ãã¼ã </a></li><!--\r\n");
      out.write("            --><li><a href=\"newslist.jsp\">ãç¥ãã</a></li><!--\r\n");
      out.write("            --><li><a href=\"foodadmin.jsp\">ã°ã«ã¡ãã</a></li><!--\r\n");
      out.write("            --><li><a href=\"formlist.jsp\">ãåãåãã</a></li>\r\n");
      out.write("             <li><a href=\"adminsetting.jsp\">è¨­å®</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("     <main>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      <div class=\"cp_form\">\r\n");
      out.write("        <form action=\"foodlist_addout.jsp\" method=\"post\" class=\"cp_group\">\r\n");
      out.write("        <div class=\"title\">\r\n");
      out.write("        <h2>åºèç»é²</h2>\r\n");
      out.write("      </div>\r\n");
      out.write("        <div class=\"cp_tx\">\r\n");
      out.write("        \r\n");
      out.write("        <label class=\"title\">åºèå:</label>\r\n");
      out.write("        <input class=\"large\" type=\"text\" name=\"post_name\" required/>\r\n");
      out.write("        <label class=\"title\">ä½æ:</label>\r\n");
      out.write("        <input type=\"text\" class=\"large\" name=\"post_address\" required/>\r\n");
      out.write("        <label class=\"title\">é»è©±çªå·:</label>\r\n");
      out.write("        <input class=\"large\" type=\"text\" name=\"post_tel\" required/>\r\n");
      out.write("        <label class=\"title\">ã«ãã´ãªã¼:</label>\r\n");
      out.write("\t\t<label>\r\n");
      out.write("\t\t  <input type=\"radio\" name=\"post_radio\" value=\"å®ã\" checked>å®ã \r\n");
      out.write("\t\t  <input type=\"radio\" name=\"post_radio\" value=\"ã¬ãããª\">ã¬ãããª\r\n");
      out.write("\t\t  <input type=\"radio\" name=\"post_radio\" value=\"ãä¸äººæ§ok\">ãä¸äººæ§ok\r\n");
      out.write("\t\t  <input type=\"radio\" name=\"post_radio\" value=\"å±éå±\">å±éå±\r\n");
      out.write("\t\t  <input type=\"radio\" name=\"post_radio\" value=\"é«ç´\">é«ç´\r\n");
      out.write("\t\t</label>\r\n");
      out.write("        <label class=\"title\">æ:</label>\r\n");
      out.write("          <select name=\"post_star\" id=\"star\">\r\n");
      out.write("            <option value=\"50\">æ5</option>\r\n");
      out.write("            <option value=\"45\">æ4.5</option>\r\n");
      out.write("            <option value=\"40\">æ4</option>\r\n");
      out.write("            <option value=\"35\">æ3.5</option>\r\n");
      out.write("            <option value=\"30\">æ3</option>\r\n");
      out.write("            <option value=\"25\">æ2.5</option>\r\n");
      out.write("            <option value=\"20\">æ2</option>\r\n");
      out.write("            <option value=\"15\">æ1.5</option>\r\n");
      out.write("            <option value=\"10\">æ1</option>\r\n");
      out.write("          </select>\r\n");
      out.write("        <label class=\"title\">ç³è«èæ°å:</label>\r\n");
      out.write("        <input class=\"large\" type=\"text\" name=\"post_users\" required />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"cp_textarea\">\r\n");
      out.write("        <label class=\"title\">åºèèª¬æ:</label>\r\n");
      out.write("        <textarea name=\"post_txt\" cols=\"70\" style=\"height: 100px;\"required>å¥åãã¦ä¸ãã</textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--ãã¡ã¤ã«-->\r\n");
      out.write("        <div class=\"cp_file\">\r\n");
      out.write("        <label class=\"title\">ç»å:</label>\r\n");
      out.write("        <label class=\"title\">\r\n");
      out.write("      \t<p>å±æãã©ã«ãã®ã°ã«ã¡ããç³è«ãã©ã«ãã«åºèå+æ°åãä»ãã¦æåºãã¦ä¸ãã(ä¾ ããã©ã¼ã¡ã³å±±æ¬ä¿®è¼.png)</p>\r\n");
      out.write("        </label>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"submit\">\r\n");
      out.write("        <input type=\"submit\" value=\"ç»é²ãã\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div class=\"button\">\r\n");
      out.write("        <div class=\"button-container\">\r\n");
      out.write("          <form method=\"post\" action=\"/halcloud/foodlist.jsp\"> \r\n");
      out.write("              <p><input type=\"submit\" value=\"æ»ã\"></p>\r\n");
      out.write("          </form>\r\n");
      out.write("       </div>\r\n");
      out.write("      </div>\t\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  </body>\r\n");
      out.write("\r\n");
      out.write("</html> ");
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

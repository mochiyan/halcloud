package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gameifin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("  <title>æ§æ ¼è¨ºæ­</title>\r\n");
      out.write("  \t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reset.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/gameifin.css\">\r\n");
      out.write("</head>\r\n");
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
      out.write("              <li><a href=\"main.jsp\">ãã¼ã </a></li><!--\r\n");
      out.write("            --><li><a href=\"time.jsp\">æéå²</a></li><!--\r\n");
      out.write("            --><li><a href=\"foodlog.jsp\">ã°ã«ã¡ãã</a></li><!--\r\n");
      out.write("            --><li><a href=\"todo.jsp\">TODO</a></li>\r\n");
      out.write("            <li><a href=\"game.jsp\">ããã²ã¼ã </a></li>\r\n");
      out.write("             <li><a href=\"setting.jsp\">è¨­å®</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <main>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"choose_box\">\r\n");
      out.write("      <!-- è³ªåä¸è¦§ -->\r\n");
      out.write("      <div class=\"app-theme\">\r\n");
      out.write("        <p>æ§æ ¼è¨ºæ­(å¨5å)</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- è³ªå1 -->\r\n");
      out.write("      <div id=\"q_01\" class=\"fit\">\r\n");
      out.write("        <p>è³ªå1: ããªãã¯æ®æ®µã¯éå¸¸ã«ææ¬²çã§ãã¨ãã«ã®ãã·ã¥ã§ãããã</p>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a class=\"btn\" href=\"#q_02\" data-value=\"a\">ã¯ã</a></li>\r\n");
      out.write("          <li><a class=\"btn\" href=\"#q_02\" data-value=\"b\">ããã</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- è³ªå2 -->\r\n");
      out.write("      <div id=\"q_02\" style=\"display: none;\">\r\n");
      out.write("        <p>è³ªå2:æè¡ã«è¡ãã¨ãã¯ããªãè¨ç»ãç·´ãæ¹ã§ããã</p>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a class=\"btn\" href=\"#q_03\" data-value=\"b\">ã¯ã</a></li>\r\n");
      out.write("          <li><a class=\"btn\" href=\"#q_03\" data-value=\"a\">ããã</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- è³ªå3 -->\r\n");
      out.write("      <div id=\"q_03\" style=\"display: none;\">\r\n");
      out.write("        <p>è³ªå3:ãããªãã®è©±ãæ¹ã¯</p>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a class=\"btn\" href=\"#q_04\" data-value=\"a\">èªå°¾ãã­ãããª</a></li>\r\n");
      out.write("          <li><a class=\"btn\" href=\"#q_04\" data-value=\"b\">èªå°¾ãã½ãã</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- è³ªå4 -->\r\n");
      out.write("      <div id=\"q_04\" style=\"display: none;\">\r\n");
      out.write("        <p>è³ªå4:ãéè¦ãªæ±ºå®ãè¡ãã¨ãªãã¨ãå¿æãããè«çã®æ¹ãããéè¦ã§ããã</p>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a class=\"btn\" href=\"#q_05\" data-value=\"b\">ã¯ã</a></li>\r\n");
      out.write("          <li><a class=\"btn\" href=\"#q_05\" data-value=\"a\">ããã</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- è³ªå5 -->\r\n");
      out.write("      <div id=\"q_05\" style=\"display: none;\">\r\n");
      out.write("        <p>è³ªå5:ãæè¦ãæ±ããããæãããªãã¯</p>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a class=\"btn end\" data-value=\"a\">èªåããå£ç«ãåã</a></li>\r\n");
      out.write("          <li><a class=\"btn end\" data-value=\"b\">å¾ããçºè¨ãã</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ããããä»¥ä¸åç­ -->\r\n");
      out.write("  <!-- åç­ã®ç­ã1 -->\r\n");
      out.write("     <div id=\"answer_01\" class=\"result\" style=\"display: none;\">\r\n");
      out.write("      <div class=\"result_theme \">\r\n");
      out.write("            <p>ããªãã®æ§æ ¼ã¯</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"result_type0 \">\r\n");
      out.write("            <h4>ãªã¼ãã¼å</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"result_discription0\">\r\n");
      out.write("        <h2>ã¨ãã«ã®ãã·ã¥Ã è²¬ä»»æ</h2>\r\n");
      out.write("        <p>\r\n");
      out.write("          ãããªãã¯ãã¼ã ãçµç¹ãçãã¦ç®æ¨éæã«åãããã¨ãå¾æã\r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("       <div class=\"return-btn\">\r\n");
      out.write("        <a class=\"return\" href=\"gameifin.jsp\">ãã©ã</a>\r\n");
      out.write("       </div>\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- åç­ã®ç­ã2 -->\r\n");
      out.write("     <div id=\"answer_02\" style=\"display: none;\">\r\n");
      out.write("          <div class=\"result_theme \">\r\n");
      out.write("            <p>ããªãã®æ§æ ¼ã¯</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"result_type1 \">\r\n");
      out.write("            <h4>å·é</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"result_discription1\">\r\n");
      out.write("        <h2>å¤æ­å Ããµãã¼ã</h2>\r\n");
      out.write("        <p>\r\n");
      out.write("          ãããªãã¯ç©äºããã£ããèãã¦ãæåç­ãç·´ããã¨ãå¾æãçµç¹ãå¨ããæ¯ãããã¨ãå¾æã\r\n");
      out.write("        </p>\r\n");
      out.write("      </div>\r\n");
      out.write("       <div class=\"return-btn\">\r\n");
      out.write("        <a class=\"return\" href=\"gameifin.jsp\">ãã©ã</a>\r\n");
      out.write("       </div>\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("  </main>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"js/gameifin.js\" type=\"text/javascript\" ></script>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
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

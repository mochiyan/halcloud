package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>ã¡ã¼ã«ã¢ãã¬ã¹å¤æ´ç»é¢</title>\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mail.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("    <header></header>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("      \r\n");
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
      out.write("    <main>\r\n");
      out.write("    <section>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"button\">\r\n");
      out.write("    \r\n");
      out.write("    <!--<h2 class=\"login-header\">è¨­å®</h2>-->\r\n");
      out.write("    <p class=\"news\">ã¡ã¼ã«ã¢ãã¬ã¹å¤æ´</p>\r\n");
      out.write("    <div class=\"button-container\">\r\n");
      out.write("      <form method=\"post\" action=\"mailchange.jsp\">\r\n");
      out.write("          <p>èªè¨¼æ¸ã¿ã¡ã¼ã«ã¢ãã¬ã¹</p>\r\n");
      out.write("          <p><input type=\"text\" name=\"old\" placeholder=\"oldmail@example.com\" size=\"40\"required></p>\r\n");
      out.write("          <p>æ°ããã¡ã¼ã«ã¢ãã¬ã¹</p>\r\n");
      out.write("          <p><input type=\"text\" name=\"new\" placeholder=\"*********@example.com\" size=\"40\"required></p>\r\n");
      out.write("        <p><input type=\"submit\" value=\"æ¬¡ã¸\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
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

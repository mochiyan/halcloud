package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class submitlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>SD01ãã¡ã¤ã«ã®ã¢ããã­ã¼ãã¨ãã¦ã³ã­ã¼ã</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/submitlist.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("      <header>\r\n");
      out.write("   \r\n");
      out.write("      </header>\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("      <div class=\"nav\">\r\n");
      out.write("       <nav>\r\n");
      out.write("          <ul>\r\n");
      out.write("              <li><a href=\"main.jsp\">ãã¼ã </a></li><!--\r\n");
      out.write("            --><li><a href=\"sozaisubmit.jsp\">èª²é¡æåº</a></li><!--\r\n");
      out.write("            --><li><a href=\"time.jsp\">æéå²</a></li><!--\r\n");
      out.write("            --><li><a href=\"foodlog.jsp\">ã°ã«ã¡ãã</a></li>\r\n");
      out.write("             <li><a href=\"setting.jsp\">è¨­å®</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <main>\r\n");
      out.write("\r\n");
      out.write("    <section>\r\n");
      out.write("      <p class=\"news\">èª²é¡æåº</p>\r\n");
      out.write("      <details >\r\n");
      out.write("        <summary>Java</summary>\r\n");
      out.write("        <p>\r\n");
      out.write("          <a href=\"jv05.jsp\">javaèª²é¡05</a>\r\n");
      out.write("        </p>\r\n");
      out.write("      </details>\r\n");
      out.write("      <details>\r\n");
      out.write("        <summary>å½å®¶è©¦é¨å¯¾ç­</summary>\r\n");
      out.write("        <p>\r\n");
      out.write("          <a href=\"cs15k08.jsp\">å½å®¶è©¦é¨å¯¾ç­èª²é¡08</a>\r\n");
      out.write("        </p>\r\n");
      out.write("      </details>\r\n");
      out.write("      <details>\r\n");
      out.write("        <summary>ã·ã¹ãã è¨­è¨</summary>\r\n");
      out.write("        <p>\r\n");
      out.write("          <a href=\"sd03.jsp\">ã·ã¹ãã è¨­è¨èª²é¡03</a>\r\n");
      out.write("        </p>\r\n");
      out.write("      </details>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("      </main>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

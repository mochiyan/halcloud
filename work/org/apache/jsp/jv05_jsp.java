package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jv05_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>jv05èª²é¡</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jv05.css\">\r\n");
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
      out.write("              <li><a href=\"main.jsp\">ãã¼ã </a></li><!--\r\n");
      out.write("            --><li><a href=\"submitlist.jsp\">èª²é¡æåº</a></li><!--\r\n");
      out.write("            --><li><a href=\"time.jsp\">æéå²</a></li><!--\r\n");
      out.write("            --><li><a href=\"foodlog.jsp\">ã°ã«ã¡ãã</a></li>\r\n");
      out.write("             <li><a href=\"setting.jsp\">è¨­å®</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"cp_form\">\r\n");
      out.write("        <form action=\"/halcloud/servlet/Main\" method=\"post\" enctype=\"multipart/form-data\" class=\"cp_group\">\r\n");
      out.write("        <div class=\"title\">\r\n");
      out.write("        <h2>ç§ç®Java èª²é¡05</h2></div>\r\n");
      out.write("        <div class=\"cp_tx\">\r\n");
      out.write("        <label class=\"tiltle\">èª²é¡åå®¹:</label>\r\n");
      out.write("        <div class=\"kadai\">èªåã®çå¹´ææ¥ãå¥åãã¦ãçã¾ããæ¥ã®ææ¥ãåºåãããå¥åæ¥ä»ããææ¥ãè¿ãã¯ã©ã¹ã\r\n");
      out.write("          ä½æãã¦å¼ã³åºãããã«ãããæã®è¨­å®ã¯-1ããã<br>\r\n");
      out.write("          å¥åé ç®<br>\r\n");
      out.write("          çå¹´ææ¥ã®å¹´(è¥¿æ¦4æ¡ã®æ´æ°)<br>\r\n");
      out.write("          çå¹´ææ¥ã®æ(1ï½12ã®æ´æ°)<br>\r\n");
      out.write("          çå¹´ææ¥ã®æ¥(1ï½12ã®æ´æ°)<br>\r\n");
      out.write("          åºåé ç®<br>\r\n");
      out.write("          çå¹´ææ¥ã®ææ¥<br><br>\r\n");
      out.write("          æéã¯2021å¹´11/08æ¥<br><br>\r\n");
      out.write("        </div>\r\n");
      out.write("        <label class=\"title\">å­¦ç±çªå·:</label>\r\n");
      out.write("        <input type=\"text\" class=\"large\" name=\"num\" ><br>\r\n");
      out.write("        <label class=\"title\">æ°å:</label>\r\n");
      out.write("        <input type=\"text\" class=\"large\" name=\"name\" >\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--ãã¡ã¤ã«-->\r\n");
      out.write("        <div class=\"cp_file\">\r\n");
      out.write("        <label class=\"title\">ãã¡ã¤ã«:</label>\r\n");
      out.write("        <label class=\"large\">\r\n");
      out.write("      \r\n");
      out.write("        <input type=\"file\" class=\"file_input\" name=\"file\" accept=\".java\" required/>\r\n");
      out.write("        </label>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"submit\">\r\n");
      out.write("        <input type=\"submit\" value=\"éä¿¡\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  </body>\r\n");
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

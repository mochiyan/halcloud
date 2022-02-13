package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class time_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>æéå²</title>\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/time.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <header>\r\n");
      out.write("        \r\n");
      out.write("    </header>\r\n");
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
      out.write("    <section>\r\n");
      out.write("\r\n");
      out.write("    <main>\r\n");
      out.write("      <p class=\"news\">2022å¹´     å¾ææéå²</p>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("      <table class=\"biz-hour\">\r\n");
      out.write("        <tbody>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th>æ°å</th>\r\n");
      out.write("          <th>ZOOMID</th>\r\n");
      out.write("          <th>ãã¹ã¯ã¼ã</th>\r\n");
      out.write("          <th>æ°å</th>\r\n");
      out.write("          <th>ZOOMID</th>\r\n");
      out.write("          <th>ãã¹ã¯ã¼ã</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>é·å±åç</td>\r\n");
      out.write("          <td>AAAA-AAA-AAAA</td>\r\n");
      out.write("          <td>***********</td>\r\n");
      out.write("            <td>å¤ç°åç</td>\r\n");
      out.write("            <td>CCCC-CCC-CCCC</td>\r\n");
      out.write("            <td>***********</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>ä¸­è°·åç</td>\r\n");
      out.write("          <td>BBBB-BBB-BBBB</td>\r\n");
      out.write("          <td>***********</td>\r\n");
      out.write("          <td>åç°åç</td>\r\n");
      out.write("          <td>DDDD-DDD-DDDD</td>\r\n");
      out.write("          <td>***********</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write(" \r\n");
      out.write("      </table>\r\n");
      out.write("      <table class=\"biz-hour\">\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>æéå²</th>\r\n");
      out.write("            <th>æ</th>\r\n");
      out.write("            <th>ç«</th>\r\n");
      out.write("            <th>æ°´</th>\r\n");
      out.write("            <th>æ¨</th>\r\n");
      out.write("            <th>é</th>\r\n");
      out.write("            <th class=\"sat\">å</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"3\"><br>1éç®<br><br><br>9:30ï½11:00</td>\r\n");
      out.write("            <td rowspan=\"1\">ã·ã¹ãã è¨­è¨</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">Webå¶ä½</td>\r\n");
      out.write("            <td rowspan=\"1\">ãã¼ã¿ãã¼ã¹</td>\r\n");
      out.write("            <td rowspan=\"1\">å°±è·ã¬ã¤ãã³ã¹</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\">ç«¹ååç</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">å±±å£åç</td>\r\n");
      out.write("            <td rowspan=\"1\">é·å±åç</td>\r\n");
      out.write("            <td rowspan=\"1\">åç°åç</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\">159æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">182æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\">191æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\">zoom</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"3\"><br>2éç®<br><br><br>11:15ï½12:45</td>\r\n");
      out.write("            <td rowspan=\"1\">ã·ã¹ãã è¨­è¨</td>\r\n");
      out.write("            <td rowspan=\"1\">ãããã¯ã¼ã¯</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">Webå¶ä½</td>\r\n");
      out.write("            <td rowspan=\"1\">ãã¼ã¿ãã¼ã¹</td>\r\n");
      out.write("            <td rowspan=\"1\">å°±è·ã¬ã¤ãã³ã¹</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\">ç«¹ååç</td>\r\n");
      out.write("            <td rowspan=\"1\">é·å±åç</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">å±±å£åç</td>\r\n");
      out.write("            <td rowspan=\"1\">é·å±åç</td>\r\n");
      out.write("            <td rowspan=\"1\">åç°åç</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\">159æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\">zoom</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">182æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\">191æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\">zoom</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"3\"><br>3éç®<br><br><br>13:00ï½14:30</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">Java</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">ã·ã¹ãã è¨­è¨</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">å¤ç°åç</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">ç«¹ååç</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">171æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">202æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"3\"><br>4éç®<br><br><br>14:40ï½16:10</td>\r\n");
      out.write("            <td rowspan=\"1\">Java</td>\r\n");
      out.write("            <td rowspan=\"1\">å½å®¶è©¦é¨å¯¾ç­</td>\r\n");
      out.write("            <td rowspan=\"1\">Java</td>\r\n");
      out.write("            <td rowspan=\"1\">ãããã¯ã¼ã¯</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\">å¤ç°åç</td>\r\n");
      out.write("            <td rowspan=\"1\">ä¸­è°·åç</td>\r\n");
      out.write("            <td rowspan=\"1\">å¤ç°åç</td>\r\n");
      out.write("            <td rowspan=\"1\">é·å±åç</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\">159æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\">zoom</td>\r\n");
      out.write("            <td rowspan=\"1\">171æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\">181æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"3\"><br>5éç®<br><br><br>16:20ï½17:50</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">å½å®¶è©¦é¨å¯¾ç­</td>\r\n");
      out.write("            <td rowspan=\"1\">å½å®¶è©¦é¨å¯¾ç­</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">ä¸­è°·åç</td>\r\n");
      out.write("            <td rowspan=\"1\">ä¸­è°·åç</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">zoom</td>\r\n");
      out.write("            <td rowspan=\"1\">171æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"3\"><br>6éç®<br><br>18:00ï½19:30<br>(18:00ï½18:50)</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">ãã¼ã ã«ã¼ã </td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">å¤ç°åç</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\">202æå®¤</td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("            <td rowspan=\"1\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      \r\n");
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

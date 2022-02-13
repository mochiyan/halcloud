package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newsadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");

        //文字コードの設定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>お知らせ追加画面</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reset.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/newsadd.css\">\r\n");
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
      out.write("                 <li><a href=\"adminmain.jsp\">ホーム</a></li><!--\r\n");
      out.write("            --><li><a href=\"newslist.jsp\">お知らせ</a></li><!--\r\n");
      out.write("            --><li><a href=\"foodadmin.jsp\">グルメナビ</a></li><!--\r\n");
      out.write("            --><li><a href=\"formlist.jsp\">お問い合わせ</a></li>\r\n");
      out.write("             <li><a href=\"adminsetting.jsp\">設定</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("     <main>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <div class=\"cp_form\">\r\n");
      out.write("        <form action=\"newsaddout.jsp\" method=\"post\" class=\"cp_group\">\r\n");
      out.write("\t        <div class=\"title\">\r\n");
      out.write("\t        <h2>お知らせ追加</h2>\r\n");
      out.write("\t     \t</div>\r\n");
      out.write("\t        <div class=\"cp_tx\">\r\n");
      out.write("\t        <label class=\"title\">日付(例: 20XX/08/02):</label>\r\n");
      out.write("\t        <input type=\"date\" name=\"news_date\" class=\"large\" value=\"<fmt:formatDate value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mealCancel.mealCancelDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" pattern=\"yyyy-MM-dd\"required />\r\n");
      out.write("\t        \r\n");
      out.write("\t        </div>\r\n");
      out.write("\t       \t<div class=\"cp_tx\">\r\n");
      out.write("\t        <label class=\"title\">氏名:</label>\r\n");
      out.write("\t        <input class=\"large\" type=\"text\" name=\"news_name\" required>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        <div class=\"cp_textarea\">\r\n");
      out.write("\t        <label class=\"title\">お知らせ内容:</label>\r\n");
      out.write("\t        <textarea name=\"news_txt\" cols=\"70\" style=\"height: 100px;\" required>入力して下さい。</textarea>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t\r\n");
      out.write("\t        <div class=\"submit\">\r\n");
      out.write("\t        <input type=\"submit\" value=\"追加する\" />\r\n");
      out.write("\t        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"button\">\r\n");
      out.write("        <div class=\"button-container\">\r\n");
      out.write("          <form method=\"post\" action=\"/halcloud/newslist.jsp\"> \r\n");
      out.write("              <p><input type=\"submit\" value=\"お知らせ画面に戻る\"></p>\r\n");
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
      out.write("</html>  ");
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

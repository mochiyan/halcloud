package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminrule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>å©ç¨è¦ç´</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/rule.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("      <header>\r\n");
      out.write(" \r\n");
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
      out.write("      <main>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("<p class=\"news\">å©ç¨è¦ç´</p>\r\n");
      out.write("<div class=\"rule\">\r\n");
      out.write("  <p>\r\n");
      out.write("    ãã®å©ç¨è¦ç´ï¼ä»¥ä¸ï¼ãæ¬è¦ç´ãã¨ããã¾ããï¼ã¯ï¼ããä¼ç¤¾ï¼ä»¥ä¸ï¼ãå½ç¤¾ãã¨ããã¾ããï¼ããã®ã¦ã§ããµã¤ãä¸ã§æä¾ãããµã¼ãã¹ï¼ä»¥ä¸ï¼ãæ¬ãµã¼ãã¹ãã¨ããã¾ããï¼ã®å©ç¨æ¡ä»¶ãå®ãããã®ã§ããç»é²ã¦ã¼ã¶ã¼ã®çãã¾ï¼ä»¥ä¸ï¼ãã¦ã¼ã¶ã¼ãã¨ããã¾ããï¼ã«ã¯ï¼æ¬è¦ç´ã«å¾ã£ã¦ï¼æ¬ãµã¼ãã¹ããå©ç¨ããã ãã¾ãã<br><br>\r\n");
      out.write("\r\n");
      out.write("    ç¬¬1æ¡ï¼é©ç¨)<br>\r\n");
      out.write("    æ¬è¦ç´ã¯ï¼ã¦ã¼ã¶ã¼ã¨å½ç¤¾ã¨ã®éã®æ¬ãµã¼ãã¹ã®å©ç¨ã«é¢ããä¸åã®é¢ä¿ã«é©ç¨ããããã®ã¨ãã¾ãã\r\n");
      out.write("    å½ç¤¾ã¯æ¬ãµã¼ãã¹ã«é¢ãï¼æ¬è¦ç´ã®ã»ãï¼ãå©ç¨ã«ããã£ã¦ã®ã«ã¼ã«ç­ï¼åç¨®ã®å®ãï¼ä»¥ä¸ï¼ãåå¥è¦å®ãã¨ããã¾ããï¼ããããã¨ãããã¾ãããããåå¥è¦å®ã¯ãã®åç§°ã®ãããã«é¢ãããï¼æ¬è¦ç´ã®ä¸é¨ãæ§æãããã®ã¨ãã¾ãã\r\n");
      out.write("    æ¬è¦ç´ã®è¦å®ãåæ¡ã®åå¥è¦å®ã®è¦å®ã¨çç¾ããå ´åã«ã¯ï¼åå¥è¦å®ã«ããã¦ç¹æ®µã®å®ããªãéãï¼åå¥è¦å®ã®è¦å®ãåªåããããã®ã¨ãã¾ãã<br><br>\r\n");
      out.write("  \r\n");
      out.write("    ç¬¬2æ¡ï¼ã¦ã¼ã¶ã¼IDããã³ãã¹ã¯ã¼ãã®ç®¡çï¼<br>\r\n");
      out.write("    ã¦ã¼ã¶ã¼ã¯ï¼èªå·±ã®è²¬ä»»ã«ããã¦ï¼æ¬ãµã¼ãã¹ã®ã¦ã¼ã¶ã¼IDããã³ãã¹ã¯ã¼ããé©åã«ç®¡çãããã®ã¨ãã¾ãã\r\n");
      out.write("    ã¦ã¼ã¶ã¼ã¯ï¼ãããªãå ´åã«ãï¼ã¦ã¼ã¶ã¼IDããã³ãã¹ã¯ã¼ããç¬¬ä¸èã«è­²æ¸¡ã¾ãã¯è²¸ä¸ãï¼ãããã¯ç¬¬ä¸èã¨å±ç¨ãããã¨ã¯ã§ãã¾ãããå½ç¤¾ã¯ï¼ã¦ã¼ã¶ã¼IDã¨ãã¹ã¯ã¼ãã®çµã¿åãããç»é²æå ±ã¨ä¸è´ãã¦ã­ã°ã¤ã³ãããå ´åã«ã¯ï¼ãã®ã¦ã¼ã¶ã¼IDãç»é²ãã¦ããã¦ã¼ã¶ã¼èªèº«ã«ããå©ç¨ã¨ã¿ãªãã¾ãã\r\n");
      out.write("    ã¦ã¼ã¶ã¼IDåã³ãã¹ã¯ã¼ããç¬¬ä¸èã«ãã£ã¦ä½¿ç¨ããããã¨ã«ãã£ã¦çããæå®³ã¯ï¼å½ç¤¾ã«ææåã¯éå¤§ãªéå¤±ãããå ´åãé¤ãï¼å½ç¤¾ã¯ä¸åã®è²¬ä»»ãè² ããªããã®ã¨ãã¾ãã<br><br>\r\n");
      out.write("    ç¬¬3æ¡ï¼ç¦æ­¢äºé ï¼<br>\r\n");
      out.write("    ã¦ã¼ã¶ã¼ã¯ï¼æ¬ãµã¼ãã¹ã®å©ç¨ã«ãããï¼ä»¥ä¸ã®è¡çºããã¦ã¯ãªãã¾ããã<br>\r\n");
      out.write("    1.æ³ä»¤ã¾ãã¯å¬åºè¯ä¿ã«éåããè¡çº<br>\r\n");
      out.write("    2.ç¯ç½ªè¡çºã«é¢é£ããè¡çº<br>\r\n");
      out.write("    3.æ¬ãµã¼ãã¹ã®åå®¹ç­ï¼æ¬ãµã¼ãã¹ã«å«ã¾ããèä½æ¨©ï¼åæ¨æ¨©ã»ãç¥çè²¡ç£æ¨©ãä¾µå®³ããè¡çº<br>\r\n");
      out.write("    4.å½ç¤¾ï¼ã»ãã®ã¦ã¼ã¶ã¼ï¼ã¾ãã¯ãã®ä»ç¬¬ä¸èã®ãµã¼ãã¼ã¾ãã¯ãããã¯ã¼ã¯ã®æ©è½ãç ´å£ãããï¼å¦¨å®³ãããããè¡çº<br>\r\n");
      out.write("    5.æ¬ãµã¼ãã¹ã«ãã£ã¦å¾ãããæå ±ãåæ¥­çã«å©ç¨ããè¡çº<br>\r\n");
      out.write("    6.å½ç¤¾ã®ãµã¼ãã¹ã®éå¶ãå¦¨å®³ãããããã®ããè¡çº<br>\r\n");
      out.write("    7.ä¸æ­£ã¢ã¯ã»ã¹ããï¼ã¾ãã¯ãããè©¦ã¿ãè¡çº<br>\r\n");
      out.write("    8.ä»ã®ã¦ã¼ã¶ã¼ã«é¢ããåäººæå ±ç­ãåéã¾ãã¯èç©ããè¡çº<br>\r\n");
      out.write("    9.ä¸æ­£ãªç®çãæã£ã¦æ¬ãµã¼ãã¹ãå©ç¨ããè¡çº<br>\r\n");
      out.write("    10.æ¬ãµã¼ãã¹ã®ä»ã®ã¦ã¼ã¶ã¼ã¾ãã¯ãã®ä»ã®ç¬¬ä¸èã«ä¸å©çï¼æå®³ï¼ä¸å¿«æãä¸ããè¡çº<br>\r\n");
      out.write("    11.ä»ã®ã¦ã¼ã¶ã¼ã«æããã¾ãè¡çº<br>\r\n");
      out.write("    12.å½ç¤¾ãè¨±è«¾ããªãæ¬ãµã¼ãã¹ä¸ã§ã®å®£ä¼ï¼åºåï¼å§èªï¼ã¾ãã¯å¶æ¥­è¡çº<br>\r\n");
      out.write("    13.é¢è­ã®ãªãç°æ§ã¨ã®åºä¼ããç®çã¨ããè¡çº<br>\r\n");
      out.write("    14.å½ç¤¾ã®ãµã¼ãã¹ã«é¢é£ãã¦ï¼åç¤¾ä¼çå¢åã«å¯¾ãã¦ç´æ¥ã¾ãã¯éæ¥ã«å©çãä¾ä¸ããè¡çº<br>\r\n");
      out.write("    15.ãã®ä»ï¼å½ç¤¾ãä¸é©åã¨å¤æ­ããè¡çº<br><br>\r\n");
      out.write("    ç¬¬4æ¡ï¼æ¬ãµã¼ãã¹ã®æä¾ã®åæ­¢ç­ï¼<br>\r\n");
      out.write("    å½ç¤¾ã¯ï¼ä»¥ä¸ã®ããããã®äºç±ãããã¨å¤æ­ããå ´åï¼ã¦ã¼ã¶ã¼ã«äºåã«éç¥ãããã¨ãªãæ¬ãµã¼ãã¹ã®å¨é¨ã¾ãã¯ä¸é¨ã®æä¾ãåæ­¢ã¾ãã¯ä¸­æ­ãããã¨ãã§ãããã®ã¨ãã¾ãã\r\n");
      out.write("    æ¬ãµã¼ãã¹ã«ãããã³ã³ãã¥ã¼ã¿ã·ã¹ãã ã®ä¿å®ç¹æ¤ã¾ãã¯æ´æ°ãè¡ãå ´å\r\n");
      out.write("    å°éï¼è½é·ï¼ç«ç½ï¼åé»ã¾ãã¯å¤©ç½ãªã©ã®ä¸å¯æåã«ããï¼æ¬ãµã¼ãã¹ã®æä¾ãå°é£ã¨ãªã£ãå ´å\r\n");
      out.write("    ã³ã³ãã¥ã¼ã¿ã¾ãã¯éä¿¡åç·ç­ãäºæã«ããåæ­¢ããå ´å\r\n");
      out.write("    ãã®ä»ï¼å½ç¤¾ãæ¬ãµã¼ãã¹ã®æä¾ãå°é£ã¨å¤æ­ããå ´å\r\n");
      out.write("    å½ç¤¾ã¯ï¼æ¬ãµã¼ãã¹ã®æä¾ã®åæ­¢ã¾ãã¯ä¸­æ­ã«ããï¼ã¦ã¼ã¶ã¼ã¾ãã¯ç¬¬ä¸èãè¢«ã£ããããªãä¸å©çã¾ãã¯æå®³ã«ã¤ãã¦ãï¼ä¸åã®è²¬ä»»ãè² ããªããã®ã¨ãã¾ãã<br><br>\r\n");
      out.write("    ç¬¬5æ¡ï¼ãµã¼ãã¹åå®¹ã®å¤æ´ç­ï¼<br>\r\n");
      out.write("    å½ç¤¾ã¯ï¼ã¦ã¼ã¶ã¼ã«éç¥ãããã¨ãªãï¼æ¬ãµã¼ãã¹ã®åå®¹ãå¤æ´ãã¾ãã¯æ¬ãµã¼ãã¹ã®æä¾ãä¸­æ­¢ãããã¨ãã§ãããã®ã¨ãï¼ããã«ãã£ã¦ã¦ã¼ã¶ã¼ã«çããæå®³ã«ã¤ãã¦ä¸åã®è²¬ä»»ãè² ãã¾ããã<br><br>\r\n");
      out.write("    \r\n");
      out.write("    ç¬¬6æ¡ï¼å©ç¨è¦ç´ã®å¤æ´ï¼<br>\r\n");
      out.write("    å½ç¤¾ã¯ï¼å¿è¦ã¨å¤æ­ããå ´åã«ã¯ï¼ã¦ã¼ã¶ã¼ã«éç¥ãããã¨ãªããã¤ã§ãæ¬è¦ç´ãå¤æ´ãããã¨ãã§ãããã®ã¨ãã¾ãããªãï¼æ¬è¦ç´ã®å¤æ´å¾ï¼æ¬ãµã¼ãã¹ã®å©ç¨ãéå§ããå ´åã«ã¯ï¼å½è©²ã¦ã¼ã¶ã¼ã¯å¤æ´å¾ã®è¦ç´ã«åæãããã®ã¨ã¿ãªãã¾ãã<br><br>\r\n");
      out.write("    \r\n");
      out.write("    ç¬¬7æ¡ï¼åäººæå ±ã®åæ±ãï¼<br>\r\n");
      out.write("    å½ç¤¾ã¯ï¼æ¬ãµã¼ãã¹ã®å©ç¨ã«ãã£ã¦åå¾ããåäººæå ±ã«ã¤ãã¦ã¯ï¼å½ç¤¾ããã©ã¤ãã·ã¼ããªã·ã¼ãã«å¾ãé©åã«åãæ±ããã®ã¨ãã¾ãã<br><br>\r\n");
      out.write("    \r\n");
      out.write("    ç¬¬8æ¡ï¼æ¨©å©ç¾©åã®è­²æ¸¡ã®ç¦æ­¢ï¼<br>\r\n");
      out.write("    ã¦ã¼ã¶ã¼ã¯ï¼å½ç¤¾ã®æ¸é¢ã«ããäºåã®æ¿è«¾ãªãï¼å©ç¨å¥ç´ä¸ã®å°ä½ã¾ãã¯æ¬è¦ç´ã«åºã¥ãæ¨©å©ãããã¯ç¾©åãç¬¬ä¸èã«è­²æ¸¡ãï¼ã¾ãã¯æä¿ã«ä¾ãããã¨ã¯ã§ãã¾ããã<br><br>\r\n");
      out.write("    \r\n");
      out.write("    ç¬¬9æ¡ï¼æºæ æ³ã»è£å¤ç®¡è½ï¼<br>\r\n");
      out.write("    æ¬è¦ç´ã®è§£éã«ããã£ã¦ã¯ï¼æ¥æ¬æ³ãæºæ æ³ã¨ãã¾ãã<br>\r\n");
      out.write("    æ¬ãµã¼ãã¹ã«é¢ãã¦ç´äºãçããå ´åã«ã¯ï¼å½ç¤¾ã®æ¬åºæå¨å°ãç®¡è½ããè£å¤æãå°å±çåæç®¡è½ã¨ãã¾ãã<br>\r\n");
      out.write("\r\n");
      out.write("  </p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=login>\r\n");
      out.write("   <div class=\"login-container\">\r\n");
      out.write("      <form method=\"post\" action=\"adminmain.jsp\">\r\n");
      out.write("        <p><input type=\"submit\" value=\"ã¡ã¤ã³ç»é¢ã«æ»ã\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      </main>\r\n");
      out.write("\r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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

//文字コードの指定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

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

        //HashMap(１件分のデータを格納する連想配列)
        HashMap<String,String>map = null;
        
        //ArrayList(すべての件数を格納する配列)
        ArrayList<HashMap>list = null;
        list = new ArrayList<HashMap>();

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
        SQL.append(" select news_id,news_txt,news_date from news_tbl order by news_id DESC ");


        //SQL文の発行(選択クエリ)
        rs = stmt.executeQuery(SQL.toString());

        //抽出したデータを繰り返し処理で表示する
            while(rs.next()){
                //DBのデータをHashMapへ格納する
                    map = new HashMap<String,String>();
                    map.put("news_id",rs.getString("news_id"));
                    map.put("news_txt",rs.getString("news_txt"));
                    map.put("news_date",rs.getString("news_date"));
                    
                    //１件分のデータを(HashMap)をArrayListへ追加
                    list.add(map);
            }
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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write(" \t<title>メイン画面</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("    <meta http-equiv=\"Content-Security-Policy\" content=\"default-src * data: gap: content: https://ssl.gstatic.com; style-src * 'unsafe-inline'; script-src * 'unsafe-inline' 'unsafe-eval'\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reset.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/main.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/weather.css\">\r\n");
      out.write("    <script src=\"js/weather.js\" async>\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("        <h1>\r\n");
      out.write("        </h1>\r\n");
      out.write("      </header>\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("      <div class=\"nav\">\r\n");
      out.write("       <nav>\r\n");
      out.write("          <ul>\r\n");
      out.write("              <li><a href=\"main.jsp\">ホーム</a></li><!--\r\n");
      out.write("            --><li><a href=\"time.jsp\">時間割</a></li><!--\r\n");
      out.write("            --><li><a href=\"foodlog.jsp\">グルメナビ</a></li><!--\r\n");
      out.write("            --><li><a href=\"game.jsp\">ミニゲーム</a></li>\r\n");
      out.write("             <li><a href=\"setting.jsp\">設定</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("     <!--カレンダー画面-->\r\n");
      out.write("      <div class=\"container-calendar\">\r\n");
      out.write("        <h4 id=\"monthAndYear\"></h4>\r\n");
      out.write("        <div class=\"button-container-calendar\">\r\n");
      out.write("            <button id=\"previous\" onclick=\"previous()\">‹</button>\r\n");
      out.write("            <button id=\"next\" onclick=\"next()\">›</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <table class=\"table-calendar\" id=\"calendar\" data-lang=\"ja\">\r\n");
      out.write("            <thead id=\"thead-month\"></thead>\r\n");
      out.write("            <tbody id=\"calendar-body\"></tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"footer-container-calendar\">\r\n");
      out.write("            <label for=\"month\">日付指定：</label>\r\n");
      out.write("            <select id=\"month\" onchange=\"jump()\">\r\n");
      out.write("                <option value=0>1月</option>\r\n");
      out.write("                <option value=1>2月</option>\r\n");
      out.write("                <option value=2>3月</option>\r\n");
      out.write("                <option value=3>4月</option>\r\n");
      out.write("                <option value=4>5月</option>\r\n");
      out.write("                <option value=5>6月</option>\r\n");
      out.write("                <option value=6>7月</option>\r\n");
      out.write("                <option value=7>8月</option>\r\n");
      out.write("                <option value=8>9月</option>\r\n");
      out.write("                <option value=9>10月</option>\r\n");
      out.write("                <option value=10>11月</option>\r\n");
      out.write("                <option value=11>12月</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <select id=\"year\" onchange=\"jump()\"></select>\r\n");
      out.write("          </div>\r\n");
      out.write("     \t </div>\t\r\n");
      out.write("    \r\n");
      out.write("  <div class=\"container-weather\">\r\n");
      out.write("     <h1>名古屋の天気予報</h1>\r\n");
      out.write("  \r\n");
      out.write("    <table class=\"table-weather\">\r\n");
      out.write("        <tr id=\"today\">\r\n");
      out.write("            <th>今日の天気</th>\r\n");
      out.write("            <td></td>\r\n");
      out.write("        </tr>            \r\n");
      out.write("        <tr id=\"tomorrow\">\r\n");
      out.write("            <th>明日の天気</th>\r\n");
      out.write("            <td></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr id=\"dayAfterTomorrow\">\r\n");
      out.write("            <th>明後日の天気</th>\r\n");
      out.write("            <td></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr id=\"publishingOffice\">\r\n");
      out.write("            <th>発表者</th>\r\n");
      out.write("            <td></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr id=\"reportDatetime\" >\r\n");
      out.write("            <th>報告日時</th>\r\n");
      out.write("            <td></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table> \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        <!--お知らせ-->\r\n");
      out.write("    <div class=\"container-news\">\r\n");
      out.write("    <p class=\"news\">お知らせ</p>\r\n");
      out.write("       <div class=\"info\">\r\n");
      out.write("    ");

       for(int i = 0 ; i<list.size();i++){
    
      out.write(" \r\n");
      out.write("      <dl><dt>");
      out.print( list.get(i).get("news_date"));
      out.write("</dt><dd>");
      out.print( list.get(i).get("news_txt"));
      out.write("</dd></dl>\r\n");
      out.write("    ");

       }
    
      out.write(" \r\n");
      out.write("   \t </div>\t\r\n");
      out.write("   \t</div>\r\n");
      out.write("   \r\n");
      out.write("    </main>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("  <script src=\"js/calendar.js\" type=\"text/javascript\"></script>\r\n");
      out.write(" \r\n");
      out.write("  <!--ここまで-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
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

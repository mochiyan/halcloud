package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class newslist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>お知らせ管理画面</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reset.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/newslist.css\">\r\n");
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
      out.write("               <li><a href=\"adminmain.jsp\">ホーム</a></li><!--\r\n");
      out.write("            --><li><a href=\"newslist.jsp\">お知らせ</a></li><!--\r\n");
      out.write("            --><li><a href=\"foodadmin.jsp\">グルメナビ</a></li><!--\r\n");
      out.write("            --><li><a href=\"formlist.jsp\">お問い合わせ</a></li>\r\n");
      out.write("             <li><a href=\"adminsetting.jsp\">設定</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <main>\r\n");
      out.write("      \r\n");
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("        <!--お知らせ-->\r\n");
      out.write("    <p class=\"news\">お知らせ</p>\r\n");
      out.write("       <div class=\"info\">\r\n");
      out.write("    ");

       for(int i = 0 ; i<list.size();i++){
    
      out.write(" \r\n");
      out.write("      <dl><dt>");
      out.print( list.get(i).get("news_date"));
      out.write("</dt><dd>");
      out.print( list.get(i).get("news_txt"));
      out.write(" \r\n");
      out.write("      <a href=\"news_updatein.jsp?news_id=");
      out.print( list.get(i).get("news_id"));
      out.write("\">[編集]</a>\r\n");
      out.write("      <a href=\"newsdelete.jsp?news_id=");
      out.print( list.get(i).get("news_id"));
      out.write("\">[削除]</a></dt></dl>\r\n");
      out.write("    ");

       }
    
      out.write(" \r\n");
      out.write("   \t </div>\r\n");
      out.write("   \t \r\n");
      out.write("   \t      <div class=\"button\">\r\n");
      out.write("        <div class=\"button-container\">\r\n");
      out.write("          <form method=\"post\" action=\"newsadd.jsp\"> \r\n");
      out.write("              <p><input type=\"submit\" value=\"追加する\"></p>\r\n");
      out.write("          </form>\r\n");
      out.write("       </div>\r\n");
      out.write("      </div>\t\r\n");
      out.write("   \t \r\n");
      out.write("   \t \r\n");
      out.write("   \t \r\n");
      out.write("   \t \r\n");
      out.write("   \t \r\n");
      out.write("    </main>\r\n");
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

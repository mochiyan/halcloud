package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class form_005fsubmit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

        //文字コードの指定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //入力データ受信
        String form_nameStr = request.getParameter("form_name");
        String form_numberStr = request.getParameter("form_number");
        String form_radioStr = request.getParameter("form_radio");
        String form_txtStr = request.getParameter("form_txt");
        

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

        //ヒットフラグ
        int hit_flag = 0;

        //追加件数
        int ins_count = 0;

        try{//ロードに失敗したときのための例外処理
            //JDBCドライバのロード
            Class.forName(DRIVER).newInstance();

            //Connectionオブジェクトの作成
            con = DriverManager.getConnection(URL,USER,PASSWORD);

            //Statementオブジェクトの作成
            stmt = con.createStatement();
        
        //SQLステートメントの作成(選択クエリ)
        SQL = new StringBuffer();    
                 
        //SQL文の構築
        SQL.append("select * from form_tbl where form_id = null ");
        
        //SQL文の実行(DB検索)
        rs = stmt.executeQuery(SQL.toString());

        //入力したデータがデータベース
        if(rs.next()){//存在する(追加NG)
            //ヒットフラグON
            hit_flag = 1 ;
        }else{ //存在しない(追加ok)
            //ヒットフラグOFF
            hit_flag = 0 ;
            //SQLステートメントの作成(選択クエリ)
            SQL = new StringBuffer();
            
            //SQL文の構築(DB追加)
            SQL.append("insert into form_tbl(form_name,form_number,form_radio,form_txt)");
            SQL.append(" value('");
            SQL.append(form_nameStr);
            SQL.append("','");
            SQL.append(form_numberStr);
            SQL.append("','");
            SQL.append(form_radioStr);
            SQL.append("','");
            SQL.append(form_txtStr);
            SQL.append("')");   
        }

        //SQL文の実行(DB追加)
        ins_count = stmt.executeUpdate(SQL.toString());


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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("<title>お問い合わせ</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reset.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/newssubmit.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <header>\r\n");
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
      out.write("            --><li><a href=\"todo.jsp\">TODO</a></li>\r\n");
      out.write("            <li><a href=\"game.jsp\">ミニゲーム</a></li>\r\n");
      out.write("             <li><a href=\"setting.jsp\">設定</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <main>\r\n");
      out.write("      \r\n");
      out.write("\r\n");

    if(hit_flag == 1){ //追加NG

      out.write("\r\n");
      out.write("    <div class=\"txt\">お問い合わせは既に存在しています</div>\r\n");

    }else if(ins_count == 0){//追加処理失敗

      out.write("\r\n");
      out.write("    <div class=\"txt\">送信処理が失敗しました</div>\r\n");

    }else{ //認証ok

      out.write("\r\n");
      out.write("    <div class=\"txt\">送信が完了しました</div>\r\n");

    }

      out.write("\r\n");
      out.write("        <div class=\"check\">\r\n");
      out.write("          <img src=\"./images/submit.png\" alt=\"完了\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"button\">  \r\n");
      out.write("        <div class=\"button-container\">\r\n");
      out.write("          <form method=\"post\" action=\"main.jsp\">\r\n");
      out.write("            <p><input type=\"submit\" value=\"メイン画面に戻る\"></p>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("       </main>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
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

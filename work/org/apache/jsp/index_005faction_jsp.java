package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_005faction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        //確認メッセージ
        String COMPMSG = null ;
        String COMPPRO = null ;
        boolean flg = true ;
        //ヒットフラグ
        int hit_flag = 0 ;
        
		//入力データ受信
		String users_numStr = request.getParameter("users_num");
		String users_pasStr = request.getParameter("users_pas");
        
        if(users_numStr != ""&&users_pasStr!=""){
        	try{
        	//JDBCドライバのロード
            Class.forName(DRIVER).newInstance();

            //Connectionオブジェクトの作成
            con = DriverManager.getConnection(URL,USER,PASSWORD);

            //Statementオブジェクトの作成
            stmt = con.createStatement();
        
        //SQLステートメントの作成(選択クエリ)
        SQL = new StringBuffer();
        SQL.append("select users_name from users_tbl ");
        SQL.append("where users_num='" + users_numStr +"'and users_pas='" +users_pasStr+"'");

        //SQL文の発行(選択クエリ)
        rs = stmt.executeQuery(SQL.toString());

        //読み込み確認
        if(rs.next()==true){  //ログインOK
        //有効期限30秒
        	session.setMaxInactiveInterval(30);
        //セッションにバインド
        	session.setAttribute("login_name",rs.getString("users_name"));
        	
        //メインページへ遷移
        response.sendRedirect("main.jsp");
        }else{ //ログインNG
        COMPMSG ="該当レコードは存在しません";
        }
        
        } //tryブロック終了
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
		}else{
			COMPMSG ="未入力項目があります";
		}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("<title>認証処理</title>\r\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	if(ERMSG!=null){ //認証OK

      out.write("\r\n");
      out.write("  <div class=\"login\">\r\n");
      out.write("    <div class=\"login-triangle\"></div>\r\n");
      out.write("    \r\n");
      out.write("    <h2 class=\"login-header\">IDまたはパスワードが誤っています</h2>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"login-container\">\r\n");
      out.write("      <form method=\"post\" action=\"index.jsp\">\r\n");
      out.write("        <p><input type=\"ID\" placeholder=\"ID\" name=\"users_num\"disabled></p>\r\n");
      out.write("        <p><input type=\"password\" placeholder=\"Password\"name=\"users_pas\"disabled></p>\r\n");
      out.write("        <p><input type=\"submit\" value=\"ログイン画面へ\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");

	}else{ //認証不可

      out.write("\r\n");
      out.write("  <div class=\"login\">\r\n");
      out.write("    <div class=\"login-triangle\"></div>\r\n");
      out.write("    \r\n");
      out.write("    <h2 class=\"login-header\">IDまたはパスワードが誤っています</h2>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"login-container\">\r\n");
      out.write("      <form method=\"post\" action=\"index.jsp\">\r\n");
      out.write("        <p><input type=\"ID\" placeholder=\"ID\" name=\"users_num\"disabled></p>\r\n");
      out.write("        <p><input type=\"password\" placeholder=\"Password\"name=\"users_pas\"disabled></p>\r\n");
      out.write("        <p><input type=\"submit\" value=\"ログイン画面へ\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
  
  }

      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
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

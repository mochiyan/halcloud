package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class foodlog_005fupdatein_jsp extends org.apache.jasper.runtime.HttpJspBase
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
		//入力データ受信
		String shop_idStr = request.getParameter("shop_id");

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
    SQL.append("select * from shop_tbl where shop_id =");
    SQL.append(shop_idStr);
    
    //System.out.println(SQL.toString());

    //SQL文の発行(選択クエリ)
    rs = stmt.executeQuery(SQL.toString());
    //抽出したデータを繰り返し処理で表示する
    while(rs.next()){
        //DBのデータをHashMapへ格納する
            map = new HashMap<String,String>();
            map.put("shop_id",rs.getString("shop_id"));
            map.put("shop_name",rs.getString("shop_name"));
            map.put("shop_address",rs.getString("shop_address"));
            map.put("shop_tel",rs.getString("shop_tel"));
            map.put("shop_category",rs.getString("shop_category"));
              map.put("shop_star",rs.getString("shop_star"));
                map.put("shop_txt",rs.getString("shop_txt"));

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

        //文字コードの設定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>グルメナビ編集画面</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reset.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/food_updatein.css\">\r\n");
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
      out.write("                <li><a href=\"adminmain.jsp\">ホーム</a></li><!--\r\n");
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
      out.write("      ");

    //ArrayListからデータを取り出す
   for(int i=0;i<list.size();i++){
 
      out.write("\r\n");
      out.write("      <div class=\"cp_form\">\r\n");
      out.write("        <form action=\"foodlog_updateout.jsp\" method=\"post\" class=\"cp_group\">\r\n");
      out.write("        <div class=\"title\">\r\n");
      out.write("        <h2>店舗登録</h2>\r\n");
      out.write("      </div>\r\n");
      out.write("        <div class=\"cp_tx\">\r\n");
      out.write("        <input type=\"hidden\" name=\"shop_id\" value=\"");
      out.print( list.get(i).get("shop_id") );
      out.write("\">\r\n");
      out.write("        <label class=\"title\">店舗名:</label>\r\n");
      out.write("        <input class=\"large\" type=\"text\" name=\"shop_name\" value=\"");
      out.print( list.get(i).get("shop_name") );
      out.write("\"required/>\r\n");
      out.write("        <label class=\"title\">住所:</label>\r\n");
      out.write("        <input type=\"text\" class=\"large\" name=\"shop_address\"  value=\"");
      out.print( list.get(i).get("shop_address") );
      out.write("\"required/>\r\n");
      out.write("        <label class=\"title\">電話番号:</label>\r\n");
      out.write("        <input class=\"large\" type=\"text\" name=\"shop_tel\" value=\"");
      out.print( list.get(i).get("shop_tel") );
      out.write("\"required/>\r\n");
      out.write("        <label class=\"title\">カテゴリー:</label>\r\n");
      out.write("\t\t<label>\r\n");
      out.write("\t\t  <input type=\"radio\" name=\"shop_radio\" value=\"安い\" checked>安い \r\n");
      out.write("\t\t  <input type=\"radio\" name=\"shop_radio\" value=\"ガッツリ\">ガッツリ\r\n");
      out.write("\t\t  <input type=\"radio\" name=\"shop_radio\" value=\"お一人様ok\">お一人様ok\r\n");
      out.write("\t\t  <input type=\"radio\" name=\"shop_radio\" value=\"居酒屋\">居酒屋\r\n");
      out.write("\t\t  <input type=\"radio\" name=\"shop_radio\" value=\"高級\">高級\r\n");
      out.write("\t\t</label>\r\n");
      out.write("        <label class=\"title\">星:</label>\r\n");
      out.write("          <select name=\"shop_star\" id=\"star\">\r\n");
      out.write("            <option value=\"50\">星5</option>\r\n");
      out.write("            <option value=\"45\">星4.5</option>\r\n");
      out.write("            <option value=\"40\">星4</option>\r\n");
      out.write("            <option value=\"35\">星3.5</option>\r\n");
      out.write("            <option value=\"30\">星3</option>\r\n");
      out.write("            <option value=\"25\">星2.5</option>\r\n");
      out.write("            <option value=\"20\">星2</option>\r\n");
      out.write("            <option value=\"15\">星1.5</option>\r\n");
      out.write("            <option value=\"10\">星1</option>\r\n");
      out.write("          </select>\r\n");
      out.write("        <div class=\"cp_textarea\">\r\n");
      out.write("        <label class=\"title\">店舗説明:</label>\r\n");
      out.write("        <textarea name=\"shop_txt\" cols=\"70\" style=\"height: 100px;\"required>");
      out.print( list.get(i).get("shop_txt") );
      out.write("</textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--ファイル-->\r\n");
      out.write("        <div class=\"cp_file\">\r\n");
      out.write("        <label class=\"title\">画像:</label>\r\n");
      out.write("        <label class=\"large\">\r\n");
      out.write("      \t<p>共有フォルダのグルメナビ申請フォルダに店舗名+氏名を付けて提出して下さい(例 〇〇ラーメン山本修輔.png)</p>\r\n");
      out.write("        </label>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"submit\">\r\n");
      out.write("        <input type=\"submit\" value=\"登録する\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");

	}

      out.write("\r\n");
      out.write("      <div class=\"button\">\r\n");
      out.write("        <div class=\"button-container\">\r\n");
      out.write("          <form method=\"post\" action=\"/halcloud/foodlogadmin.jsp\"> \r\n");
      out.write("              <p><input type=\"submit\" value=\"戻る\"></p>\r\n");
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
      out.write("</html> ");
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

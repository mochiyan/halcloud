package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class foodlogadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        SQL.append(" select shop_id,shop_name,shop_address,shop_tel,shop_category,shop_star,shop_txt from shop_tbl ");


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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("<title>グルメナビ</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/foodlog.css\">\r\n");
      out.write("</head>\r\n");
 if(ERMSG != null){ 
      out.write("\r\n");
      out.write("予期せぬエラーが発生しました<br/>\r\n");
      out.print( ERMSG );
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <header></header>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("    \t\r\n");
      out.write("        <div class=\"nav\">\r\n");
      out.write("         <nav>\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"adminmain.jsp\">ホーム</a></li><!--\r\n");
      out.write("            --><li><a href=\"newslist.jsp\">お知らせ</a></li><!--\r\n");
      out.write("            --><li><a href=\"foodadmin.jsp\">グルメナビ</a></li><!--\r\n");
      out.write("            --><li><a href=\"formlist.jsp\">お問い合わせ</a></li>\r\n");
      out.write("             <li><a href=\"adminsetting.jsp\">設定</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <main>\r\n");
      out.write("            <p class=\"news\">グルメナビ</p>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("    ");

                for(int i = 0 ; i<list.size();i++){
    
      out.write("                \r\n");
      out.write("                <table id=\"prof\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td rowspan=\"9\">\r\n");
      out.write("                        <img src=\"./images/");
      out.print( list.get(i).get("shop_id"));
      out.write(".png\"height=\"300px\" width=\"300px\"/>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                                \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        \tNo\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <td width=\"300\">\r\n");
      out.write("                        ");
      out.print( list.get(i).get("shop_id"));
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        \t店舗名\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <td width=\"300\">\r\n");
      out.write("                        ");
      out.print( list.get(i).get("shop_name"));
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                     \t   カテゴリー\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <td width=\"300\">\r\n");
      out.write("                        ");
      out.print( list.get(i).get("shop_category"));
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                      \t  オススメ度\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <td width=\"300\">\r\n");
      out.write("                        <span class=\"rate rate");
      out.print( list.get(i).get("shop_star"));
      out.write("\"></span>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                       \t 住所\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <td width=\"300\">\r\n");
      out.write("                        ");
      out.print( list.get(i).get("shop_address"));
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                      \t  電話番号\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <td width=\"300\">\r\n");
      out.write("                        ");
      out.print( list.get(i).get("shop_tel"));
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                      \t  コメント\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <td width=\"300\">\r\n");
      out.write("                        ");
      out.print( list.get(i).get("shop_txt"));
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <td>   \r\n");
      out.write("\t\t\t     <a href=\"foodlog_delete.jsp?shop_id=");
      out.print( list.get(i).get("shop_id"));
      out.write("\">[削除]</a>\r\n");
      out.write("\t\t\t    </td>\r\n");
      out.write("\t\t\t    <td>\r\n");
      out.write("\t\t\t     <a href=\"foodlog_updatein.jsp?shop_id=");
      out.print( list.get(i).get("shop_id"));
      out.write("\">[編集して登録]</a>\r\n");
      out.write("\t\t   \t\t</td>\r\n");
      out.write("                </table>\r\n");
      out.write("    ");

                }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </main>\r\n");
      out.write("    </div>\r\n");
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

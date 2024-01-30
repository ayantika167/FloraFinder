package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import java.sql.Blob;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class PrintFromDatabaseImg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\n");
      out.write("          integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\n");
      out.write("          crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <style>\n");
      out.write("        .card {\n");
      out.write("            width: 10rem;\n");
      out.write("            height: 10rem;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<!--    navbar-->\n");
      out.write("\n");
      out.write("<!--    end of navbar-->\n");
      out.write("    ");

    Connection conn= null;
    Statement st=null;
    ResultSet rs=null;
    try {
        String url = "jdbc:oracle:thin:@Ankita:1521:orcl";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection(url,"ankita","mitra");
        st = conn.createStatement();
       // ss=conn.createStatement();

        String s = "select * from product";
       // String t="Select * from testimg";
        rs = st.executeQuery(s);

      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        ");
 
        while (rs.next()) { 
      out.write("\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("\n");
      out.write("            <table >\n");
      out.write("            <thead>\n");
      out.write("            <th></th>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("                    <td >\n");
      out.write("                        <center>");
 //to show the image
                        Blob imageBlob = rs.getBlob("image");
                        byte[] imageBytes = imageBlob.getBytes(1, (int) imageBlob.length());
                        out.write("<img style='width:140px;height:235px'src=\"data:image/jpeg;base64," + new String(Base64.getEncoder().encode(imageBytes)) + "\"/>");
                        
      out.write("\n");
      out.write("                        </center>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                    <!--<tr> <th>");
      out.print( rs.getString(1));
      out.write("</th></tr> -->\n");
      out.write("                <tr> <th> Product Name: ");
      out.print( rs.getString(2));
      out.write("</th></tr>\n");
      out.write("                <tr> <th> Category: ");
      out.print( rs.getString(3));
      out.write("</th></tr>\n");
      out.write("                <tr> <th> Price: ");
      out.print( rs.getString(4));
      out.write("</th></tr>\n");
      out.write("                 \n");
      out.write("<!--                <td>\n");
      out.write("                \n");
      out.write("                    <button class=\"btn btn-primary\">Edit</button>\n");
      out.write("                    <div>\n");
      out.write("                    <form method=\"POST\" action=\"http://localhost:8080/ecommerce/productdetails.jsp\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-danger\">Delete</button>\n");
      out.write("                    </form>  \n");
      out.write("                    </div>\n");
      out.write("                </td>-->\n");
      out.write("                \n");
      out.write("        </table>\n");
      out.write("                <br>\n");
      out.write("                <hr>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");

    } catch(Exception e){
        e.printStackTrace();
    } finally {
        try { rs.close(); } catch (Exception e) { }
        try { st.close(); } catch (Exception e) { }
        try { conn.close(); } catch (Exception e) { }
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.0.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

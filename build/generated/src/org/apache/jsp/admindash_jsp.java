package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jdbc.OracleResultSetMetaData;
import oracle.jdbc.OracleStatement;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleConnection;
import java.sql.DriverManager;
import java.util.Base64;
import java.sql.Blob;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSetMetaData;
import java.sql.DriverManager;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleStatement;
import oracle.jdbc.OracleConnection;

public final class admindash_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            OracleConnection oconn;
            OracleStatement ost;
            OraclePreparedStatement opst;
            OracleResultSet ors;
            OracleResultSetMetaData orsmd;
            String r;
            int counter, reccounter;
        

            OracleConnection oconn2;
            OracleStatement ost2;
            OraclePreparedStatement opst2;
            OracleResultSet ors2;
            OracleResultSetMetaData orsmd2;
            String p;
            int counter2, reccounter2;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/PrintFromDatabaseImg.jsp");
    _jspx_dependants.add("/cartdetails.jsp");
    _jspx_dependants.add("/probdetails.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\" integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <section id=\"menu\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <img src=\"img/logo.png\" alt=\"\">\n");
      out.write("            <h2>FloraFinder</h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"items\">\n");
      out.write("            <li><h5><a href=\"#admin\">Admin Details</a></h5></li>\n");
      out.write("            <li><h5><a href=\"#products\">Products</a></h5></li>\n");
      out.write("            <li><h5><a href=\"#cartdetails\">Cart</a></h5></li>\n");
      out.write("            <li><h5><a href=\"#userdetails\">Users Details</a></h5></li>\n");
      out.write("            <li><h5><a href=\"#probdetails\">Messages Details</a></h5></li>\n");
      out.write("            <li><h5><a href=\"login.jsp\">Log Out</a></h5></li>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section id=\"interface\">\n");
      out.write("        <div id=\"admin\">\n");
      out.write("        <h3 class=\"i-name\">\n");
      out.write("            Dashboard\n");
      out.write("        </h3>\n");
      out.write("         <dir class=\"board\">\n");
      out.write("            \n");
      out.write("        ");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            table, tr, td\n");
      out.write("            {\n");
      out.write("                margin: auto;\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 3px solid darkblue;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("            th\n");
      out.write("            {\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 3px solid darkblue;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function funDelete()\n");
      out.write("            {\n");
      out.write("                if (confirm(\"Are you sure you want to delete the record?\") === true)\n");
      out.write("                    return true;\n");
      out.write("                else\n");
      out.write("                    return false;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: rgb(200, 226, 242)\">\n");
      out.write("        <div>\n");
      out.write("            <span style=\"font-weight: bold; font-size: 250%\">ADMIN DETAILS....</span>\n");
      out.write("            <span>\n");
      out.write("                <form method=\"POST\" action=\"admindetails.jsp\">\n");
      out.write("                    <input type=\"text\" placeholder=\"&#128269;Enter User to search\" name=\"tSearch\" style=\"width: 500px; height: 25px\" required>\n");
      out.write("                    <button type=\"submit\" name=\"bSearch\" class= \"btn-success\" style=\"height: 30px; width: 100px; font-style: italic\" >Search</button>\n");
      out.write("                </form>\n");
      out.write("            </span>\n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        ");

            // STEP 1: REGISTERING THE JSP WITH ORACLE
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            //STEP 2: CREATING THE CONNECTION OBJECT
            oconn = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl", "ankita", "mitra");

            if (request.getParameter("bSearch") != null) {
                String vSearchUser = request.getParameter("tSearch");

                //STEP 4: CREATING THE QUERY
                r = "select * from admin where usr=?";

                //STEP 3: CREATING THE STATEMENT
                opst = (OraclePreparedStatement) oconn.prepareStatement(r);

                //STEP 5: FILLING UP THE PARAMETERS
                opst.setString(1, vSearchUser);

                //STEP 5: Executing the query and populating the resultset
                ors = (OracleResultSet) opst.executeQuery();

        
      out.write("\n");
      out.write("        <form method=\"POST\" action=\"admindetails.jsp\">\n");
      out.write("            <button type=\"submit\" class=\"btn-aqua\" style=\"height: 30px; width: 200px;  font-style: italic; font-weight: bold\">Display all Admins</button>\n");
      out.write("        </form>\n");
      out.write("        ");
                        } else {

                //STEP 3: CREATING THE STATEMENT
                ost = (OracleStatement) oconn.createStatement();

                //STEP 4: CREATING THE QUERY
                r = "select * from admin order by 1";

                //STEP 5: Executing the query and populating the resultset
                ors = (OracleResultSet) ost.executeQuery(r);

            }
            //STEP 6: Getting the Headings
            orsmd = (OracleResultSetMetaData) ors.getMetaData();
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    ");

                        for (counter = 1; counter <= orsmd.getColumnCount(); counter++) {
                    
      out.write("\n");
      out.write("                    <th>");
      out.print(orsmd.getColumnName(counter));
      out.write("</th>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    <th colspan=\"2\">ACTIONS</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    reccounter = 0;
                    while (ors.next()) {
                        reccounter++;
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    ");

                        for (int i = 1; i <= 5; i++) {
                    
      out.write("\n");
      out.write("                    <td>");
      out.print(ors.getString(i));
      out.write("</td>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    <form action=\"http://localhost:8080/ecommerce/update.jsp?id=");
      out.print(ors.getString(1));
      out.write("\" method=\"POST\">\n");
      out.write("                            <td>\n");
      out.write("                                <button class=\"btn-primary\" type=\"submit\" name=\"edit\">Edit</button>\n");
      out.write("                            </td>\n");
      out.write("                </form>\n");
      out.write("            <form method=\"POST\" action=\"http://localhost:8080/ecommerce/DelAdmin?id=");
      out.print(ors.getString(1));
      out.write("\"  onsubmit=\" return funDelete()\">\n");
      out.write("                <td><button type=\"submit\" class=\"btn-danger\">Delete</button></td>\n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("        ");

            }

        
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("    <tfoot></tfoot>\n");
      out.write("</table>\n");
            if (reccounter == 0) {

      out.write("\n");
      out.write("<h2 style=\"font-family: monospace; color: black; font-weight: bold\">No matching records exists. Try with a better match</h2>\n");

    }
    // ors.close();
    //  ost.close();
    oconn.close();


      out.write("\n");
      out.write("\n");
      out.write("         </dir>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <br><br><br><br>\n");
      out.write("    <div id=\"products\">\n");
      out.write("        <h3 class=\"i-name\">\n");
      out.write("            Products\n");
      out.write("        </h3>\n");
      out.write("        <dir class=\"board\">\n");
      out.write("            ");
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
      out.write("\n");
      out.write("           \n");
      out.write("        </dir>\n");
      out.write("            <div id=\"cartdetails\">\n");
      out.write("        <h3 class=\"i-name\">\n");
      out.write("            Cart Details\n");
      out.write("        </h3>\n");
      out.write("        <dir class=\"board\">\n");
      out.write("            ");
      out.write("package firstpack;\n");
      out.write("\n");
      out.write("import java.io.IOException;\n");
      out.write("import java.io.PrintWriter;\n");
      out.write("import java.sql.DriverManager;\n");
      out.write("import java.sql.SQLException;\n");
      out.write("import java.util.logging.Level;\n");
      out.write("import java.util.logging.Logger;\n");
      out.write("import javax.servlet.ServletException;\n");
      out.write("import javax.servlet.http.HttpServlet;\n");
      out.write("import javax.servlet.http.HttpServletRequest;\n");
      out.write("import javax.servlet.http.HttpServletResponse;\n");
      out.write("import oracle.jdbc.OracleConnection;\n");
      out.write("import oracle.jdbc.OraclePreparedStatement;\n");
      out.write("\n");
      out.write("public class DelCart extends HttpServlet {\n");
      out.write("\n");
      out.write("        String vp_name,query;\n");
      out.write("        OracleConnection oconn;\n");
      out.write("        OraclePreparedStatement ost;\n");
      out.write("\n");
      out.write("    protected void processRequest(HttpServletRequest request, HttpServletResponse response)\n");
      out.write("            throws ServletException, IOException {\n");
      out.write("        response.setContentType(\"text/html;charset=UTF-8\");\n");
      out.write("        try (PrintWriter out = response.getWriter()) {\n");
      out.write("            out.println(\"<!DOCTYPE html>\");\n");
      out.write("            out.println(\"<html>\");\n");
      out.write("            out.println(\"<head>\");\n");
      out.write("            out.println(\"<title>Servlet DelUser</title>\");            \n");
      out.write("            out.println(\"</head>\");\n");
      out.write("            out.println(\"<body>\");\n");
      out.write("            //STEP 1 : REGISTERING OF THE REQUIRED DRIVER WITH THE JAVA PROGRAM\n");
      out.write("            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());\n");
      out.write("                \n");
      out.write("                 //STEP 2: INSTANTIATING THE CONNECTION OBJECT \n");
      out.write("                oconn = (OracleConnection)DriverManager.getConnection(\"jdbc:oracle:thin:@LAPTOP-GGS6B1M4:1521:ORCL\",\"AHELEE\",\"DUTTA\");\n");
      out.write("                \n");
      out.write("                //STEP 3: CREATING THE QUERY\n");
      out.write("                query = \"delete from  cart where p_name = ?\";\n");
      out.write("            \n");
      out.write("                //STEP 4: INSTANTIATING STATEMENT OBJECT FOR EXECUTING SQL QUERIES\n");
      out.write("                ost =(OraclePreparedStatement) oconn.prepareStatement(query);\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                //STEP 6: FILLING THE BLANK VALUES OF THE QUERY MARKED WITH ? \n");
      out.write("                vp_name = request.getParameter(\"p_name\");\n");
      out.write("                ost.setString(1,vp_name);\n");
      out.write("                \n");
      out.write("                //STEP 7: EXECUTING THE QUERY\n");
      out.write("                \n");
      out.write("                int ra = ost.executeUpdate();\n");
      out.write("                \n");
      out.write("                out.println(\"<h2>Rows affected is : \" + ra + \"</h2>\");\n");
      out.write("                out.println(\"<h2 style='color:green'>Data saved successfully.........</h2>\");\n");
      out.write("                \n");
      out.write("                ost.close();\n");
      out.write("                oconn.close();\n");
      out.write("\n");
      out.write("            out.println(\"</body>\");\n");
      out.write("            out.println(\"</html>\");\n");
      out.write("            response.sendRedirect(\"http://localhost:8080/ecommerce/admindash_1.jsp#cart\");\n");
      out.write("        }   catch (SQLException ex) {\n");
      out.write("                Logger.getLogger(DelUser.class.getName()).log(Level.SEVERE, null, ex);\n");
      out.write("            }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // <editor-fold defaultstate=\"collapsed\" desc=\"HttpServlet methods. Click on the + sign on the left to edit the code.\">\n");
      out.write("    /**\n");
      out.write("     * Handles the HTTP <code>GET</code> method.\n");
      out.write("     *\n");
      out.write("     * @param request servlet request\n");
      out.write("     * @param response servlet response\n");
      out.write("     * @throws ServletException if a servlet-specific error occurs\n");
      out.write("     * @throws IOException if an I/O error occurs\n");
      out.write("     */\n");
      out.write("    @Override\n");
      out.write("    protected void doGet(HttpServletRequest request, HttpServletResponse response)\n");
      out.write("            throws ServletException, IOException {\n");
      out.write("        processRequest(request, response);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /**\n");
      out.write("     * Handles the HTTP <code>POST</code> method.\n");
      out.write("     *\n");
      out.write("     * @param request servlet request\n");
      out.write("     * @param response servlet response\n");
      out.write("     * @throws ServletException if a servlet-specific error occurs\n");
      out.write("     * @throws IOException if an I/O error occurs\n");
      out.write("     */\n");
      out.write("    @Override\n");
      out.write("    protected void doPost(HttpServletRequest request, HttpServletResponse response)\n");
      out.write("            throws ServletException, IOException {\n");
      out.write("        processRequest(request, response);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /**\n");
      out.write("     * Returns a short description of the servlet.\n");
      out.write("     *\n");
      out.write("     * @return a String containing servlet description\n");
      out.write("     */\n");
      out.write("    @Override\n");
      out.write("    public String getServletInfo() {\n");
      out.write("        return \"Short description\";\n");
      out.write("    }// </editor-fold>\n");
      out.write("\n");
      out.write("}");
      out.write("\n");
      out.write("        </dir>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"userdetails\">\n");
      out.write("        <h3 class=\"i-name\">\n");
      out.write("            User Details\n");
      out.write("        </h3>\n");
      out.write("        <dir class=\"board\">\n");
      out.write("            \n");
      out.write("    \n");
      out.write("        ");

                OracleConnection oconn;
                OracleStatement ost;
                OraclePreparedStatement opst;
                OracleResultSet ors;
                OracleResultSetMetaData orsmd;
                String q;
                int counter1, reccounter1;
            
      out.write("\n");
      out.write("            <style>\n");
      out.write("                table, tr, td\n");
      out.write("                {\n");
      out.write("                   margin: auto;\n");
      out.write("                    padding: 10px;\n");
      out.write("                    border: 3px solid darkblue;\n");
      out.write("                    border-collapse: collapse;\n");
      out.write("                   width: 50%;\n");
      out.write("                 }\n");
      out.write("                th\n");
      out.write("                {\n");
      out.write("                    padding: 10px;\n");
      out.write("                    border: 3px solid darkblue;\n");
      out.write("                    border-collapse: collapse;\n");
      out.write("                    color: black;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("            <script>\n");
      out.write("                function funDelete()\n");
      out.write("                {\n");
      out.write("                    if(confirm(\"Are you sure you want to delete the record?\") === true)\n");
      out.write("                        return true;\n");
      out.write("                    else return false;\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: rgb(200, 226, 242)\">\n");
      out.write("        <div>\n");
      out.write("            <span style=\"font-weight: bold; font-size: 250%\">USER DETAILS....</span>\n");
      out.write("            <span>\n");
      out.write("                <form method=\"POST\" action=\"userdetails.jsp\">\n");
      out.write("                    <input type=\"text\" placeholder=\"&#128269;Enter User to search\" name=\"tSearch\" style=\"width: 500px; height: 25px\" required>\n");
      out.write("                    <button type=\"submit\" name=\"bSearch\" class=\"btn-success\" style=\"height: 30px; width: 100px; font-style: italic\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </span>\n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        \n");
      out.write("        ");

            // STEP 1: REGISTERING THE JSP WITH ORACLE
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            
            //STEP 2: CREATING THE CONNECTION OBJECT
            oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl","ankita","mitra");
            
            if(request.getParameter("bSearch")!=null)
            {
                String vSearchUser = request.getParameter("tSearch");
        
                    //STEP 4: CREATING THE QUERY
                    q = "select * from userss where usr=?";
           
                    //STEP 3: CREATING THE STATEMENT
                    opst = (OraclePreparedStatement)oconn.prepareStatement(q);
            
                    //STEP 5: FILLING UP THE PARAMETERS
                    opst.setString(1, vSearchUser);
            
                    //STEP 5: Executing the query and populating the resultset
                    ors = (OracleResultSet)opst.executeQuery();
                     
                    
      out.write("\n");
      out.write("                    <form method=\"POST\" action=\"userdetails.jsp\">\n");
      out.write("                        <button type=\"submit\" class=\"btn-aqua\" style=\"height: 30px; width: 200px;  font-style: italic; font-weight: bold\">Display all Users</button>\n");
      out.write("                    </form>\n");
      out.write("                    ");

            }
            else
            {
                           
            //STEP 3: CREATING THE STATEMENT
            ost = (OracleStatement)oconn.createStatement();
            
            //STEP 4: CREATING THE QUERY
            q = "select * from userss order by 1";
            
            //STEP 5: Executing the query and populating the resultset
            ors = (OracleResultSet)ost.executeQuery(q);
            
            
            }
            //STEP 6: Getting the Headings
            orsmd = (OracleResultSetMetaData)ors.getMetaData();
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                ");

                    for(counter1 = 1; counter1 <= orsmd.getColumnCount(); counter1 ++)
                    {
                    
      out.write("\n");
      out.write("                    <th>");
      out.print(orsmd.getColumnName(counter1));
      out.write("</th>\n");
      out.write("                    ");

                        }
                        
      out.write("\n");
      out.write("                    <th colspan=\"2\">ACTIONS</th>\n");
      out.write("                    </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    reccounter1 = 0;
                    while(ors.next())
                    {
                        reccounter1++;
                    
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    ");

                        for(int i = 1; i <= 4; i ++)
                        {
                    
      out.write("\n");
      out.write("                    <td>");
      out.print(ors.getString(i));
      out.write("</td>\n");
      out.write("                    ");

                        }
                     
      out.write("\n");
      out.write("                     <form action=\"http://localhost:8080/ecommerce/updateuser.jsp?usr=");
      out.print(ors.getString(1));
      out.write("\" method=\"POST\">\n");
      out.write("                         <td><button type=\"submit\" class=\"btn-primary\">Edit</button></td></form>\n");
      out.write("            <form method=\"POST\" action=\"http://localhost:8080/ecommerce/DelUser?usr=");
      out.print(ors.getString(1));
      out.write("\"  onsubmit=\" return funDelete()\">\n");
      out.write("                     <td><button type=\"submit\" class=\"btn-danger\">Delete</button></td>\n");
      out.write("                     </form>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                    
                    
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("            <tfoot></tfoot>\n");
      out.write("        </table>\n");
      out.write("        ");

           if (reccounter1 == 0)
                    {
                    
      out.write("\n");
      out.write("                    <h2 style=\"font-family: monospace; color: black; font-weight: bold\">No matching records exists. Try with a better match</h2>\n");
      out.write("                    ");

                    }
        // ors.close();
       //  ost.close();
           oconn.close();
           
         
      out.write("\n");
      out.write("     </dir> \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("      <div id=\"probdetails\">\n");
      out.write("        <h3 class=\"i-name\">\n");
      out.write("            Messages\n");
      out.write("        </h3>\n");
      out.write("        <dir class=\"board\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Displaying all complaints</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            table, tr, td\n");
      out.write("            {\n");
      out.write("                margin: auto;\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 3px solid darkblue;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 50%;\n");
      out.write("            }\n");
      out.write("            th\n");
      out.write("            {\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 3px solid darkblue;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function funDelete()\n");
      out.write("            {\n");
      out.write("                if (confirm(\"Are you sure you want to delete the record?\") === true)\n");
      out.write("                    return true;\n");
      out.write("                else\n");
      out.write("                    return false;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: rgb(200, 226, 242)\">\n");
      out.write("        <div>\n");
      out.write("            <span style=\"font-weight: bold; font-size: 250%\">COMPLAINTS DETAILS....</span>\n");
      out.write("            <span>\n");
      out.write("                <form method=\"POST\" action=\"probdetails.jsp\">\n");
      out.write("                    <input type=\"text\" placeholder=\"&#128269;Enter User to search\" name=\"tSearch\" style=\"width: 500px; height: 25px\" required>\n");
      out.write("                    <button type=\"submit\" name=\"bSearch\" class=\"btn-success\" style=\"height: 30px; width: 100px; font-style: italic\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </span>\n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        ");

            // STEP 1: REGISTERING THE JSP WITH ORACLE
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            //STEP 2: CREATING THE CONNECTION OBJECT
            oconn2 = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl","ankita","mitra");

            if (request.getParameter("bSearch") != null) {
                String vSearchUser = request.getParameter("tSearch");

                //STEP 4: CREATING THE QUERY
                p = "select * from custprob where firstname=?";

                //STEP 3: CREATING THE STATEMENT
                opst2 = (OraclePreparedStatement) oconn2.prepareStatement(p);

                //STEP 5: FILLING UP THE PARAMETERS
                opst2.setString(1, vSearchUser);

                //STEP 5: Executing the query and populating the resultset
                ors2 = (OracleResultSet) opst2.executeQuery();

        
      out.write("\n");
      out.write("        <form method=\"POST\" action=\"probdetails.jsp\">\n");
      out.write("            <button type=\"submit\" class=\"btn-aqua\" style=\"height: 30px; width: 200px;  font-style: italic; font-weight: bold\">Display all Messages</button>\n");
      out.write("        </form>\n");
      out.write("        ");
                        } else {

                //STEP 3: CREATING THE STATEMENT
                ost2 = (OracleStatement) oconn2.createStatement();

                //STEP 4: CREATING THE QUERY
                p = "select * from custprob order by 1";

                //STEP 5: Executing the query and populating the resultset
                ors2 = (OracleResultSet) ost2.executeQuery(p);

            }
            //STEP 6: Getting the Headings
            orsmd2 = (OracleResultSetMetaData) ors2.getMetaData();
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    ");

                        for (counter2 = 1; counter2 <= orsmd2.getColumnCount(); counter2++) {
                    
      out.write("\n");
      out.write("                    <th>");
      out.print(orsmd2.getColumnName(counter2));
      out.write("</th>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    <th colspan=\"2\">ACTIONS</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    reccounter2 = 0;
                    while (ors2.next()) {
                        reccounter2++;
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    ");

                        for (int i = 1; i <= 5; i++) {
                    
      out.write("\n");
      out.write("                    <td>");
      out.print(ors2.getString(i));
      out.write("</td>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                   \n");
      out.write("            <form method=\"POST\" action=\"http://localhost:8080/ecommerce/DelProb?firstname=");
      out.print(ors2.getString(1));
      out.write("\"  onsubmit=\" return funDelete()\">\n");
      out.write("                <td><button type=\"submit\" class=\"btn-danger\">Delete</button></td>\n");
      out.write("            </form>\n");
      out.write("        </tr>\n");
      out.write("        ");

            }

        
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("    <tfoot></tfoot>\n");
      out.write("</table>\n");
            if (reccounter2 == 0) {

      out.write("\n");
      out.write("<h2 style=\"font-family: monospace; color: black; font-weight: bold\">No matching records exists. Try with a better match</h2>\n");

    }
    // ors.close();
    //  ost.close();
    oconn2.close();


      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        </dir>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
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

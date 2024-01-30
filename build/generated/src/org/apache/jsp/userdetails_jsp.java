package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSetMetaData;
import java.sql.DriverManager;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OracleStatement;
import oracle.jdbc.OracleConnection;

public final class userdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                OracleConnection oconn;
                OracleStatement ost;
                OraclePreparedStatement opst;
                OracleResultSet ors;
                OracleResultSetMetaData orsmd;
                String q;
                int counter, reccounter;
            
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Displaying all user details</title>\n");
      out.write("        ");
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
      out.write("                    <button type=\"submit\" name=\"bSearch\" style=\"height: 30px; width: 100px; font-style: italic\">Search</button>\n");
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

                    for(counter = 1; counter <= orsmd.getColumnCount(); counter ++)
                    {
                    
      out.write("\n");
      out.write("                    <th>");
      out.print(orsmd.getColumnName(counter));
      out.write("</th>\n");
      out.write("                    ");

                        }
                        
      out.write("\n");
      out.write("                    <th colspan=\"2\">ACTIONS</th>\n");
      out.write("                    </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    reccounter = 0;
                    while(ors.next())
                    {
                        reccounter++;
                    
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
      out.write("                     <td><button type=\"submit\">Edit</button></td>\n");
      out.write("            <form method=\"POST\" action=\"http://localhost:8080/ecommerce/DelUser?usr=");
      out.print(ors.getString(1));
      out.write("\"  onsubmit=\" return funDelete()\">\n");
      out.write("                     <td><button type=\"submit\">Delete</button></td>\n");
      out.write("                     </form>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                    
                    
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("            <tfoot></tfoot>\n");
      out.write("        </table>\n");
      out.write("        ");

           if (reccounter == 0)
                    {
                    
      out.write("\n");
      out.write("                    <h2 style=\"font-family: monospace; color: black; font-weight: bold\">No matching records exists. Try with a better match</h2>\n");
      out.write("                    ");

                    }
        // ors.close();
       //  ost.close();
           oconn.close();
           
         
      out.write("\n");
      out.write("    </body>\n");
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

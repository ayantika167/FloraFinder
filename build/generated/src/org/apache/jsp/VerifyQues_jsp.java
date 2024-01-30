package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jdbc.OracleResultSet;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleConnection;
import java.sql.DriverManager;

public final class VerifyQues_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String vemail, vques, vans;
            OracleConnection oconn;
          OraclePreparedStatement ost;
          OracleResultSet ors = null;
            
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function funClose()\n");
      out.write("            {\n");
      out.write("                if(window.parent) if(confirm(\"Closing window......\") === true)  window.parent.window.close();    \n");
      out.write("                else if(confirm(\"Closing window......\") === true) window.close();   \n");
      out.write("              }\n");
      out.write("         </script>     \n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    min-height: 100vh;\n");
      out.write("    background: url(\"img/banner.jpg\") no-repeat center center / cover;\n");
      out.write("}\n");
      out.write(".box\n");
      out.write("{\n");
      out.write("    position: relative;\n");
      out.write("    width: 400px;\n");
      out.write("    height: 550px;\n");
      out.write("    background: #1c1c1c;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write(".box::before\n");
      out.write("{\n");
      out.write("    content: '';\n");
      out.write("    position: absolute;\n");
      out.write("    top: -50%;\n");
      out.write("    left: -50%;\n");
      out.write("    width: 380px;\n");
      out.write("    height: 420px;\n");
      out.write("    background: linear-gradient(0deg, transparent, transparent, #035d64, #035d64, #035d64);\n");
      out.write("    z-index: 1;\n");
      out.write("    transform-origin: bottom right;\n");
      out.write("    animation: animate 6s linear infinite;\n");
      out.write("}\n");
      out.write(".box::after\n");
      out.write("{\n");
      out.write("    content: '';\n");
      out.write("    position: absolute;\n");
      out.write("    top: -50%;\n");
      out.write("    left: -50%;\n");
      out.write("    width: 380px;\n");
      out.write("    height: 420px;\n");
      out.write("    background: linear-gradient(0deg, transparent, transparent, #035d64, #035d64, #035d64);\n");
      out.write("    z-index: 1;\n");
      out.write("    transform-origin: bottom right;\n");
      out.write("    animation: animate 6s linear infinite;\n");
      out.write("    animation-delay: -3s;\n");
      out.write("}\n");
      out.write(".borderLine\n");
      out.write("{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    inset: 0;\n");
      out.write("}\n");
      out.write(".borderLine::before\n");
      out.write("{\n");
      out.write("    content: '';\n");
      out.write("    position: absolute;\n");
      out.write("    top: -50%;\n");
      out.write("    left: -50%;\n");
      out.write("    width: 380px;\n");
      out.write("    height: 420px;\n");
      out.write("    background: linear-gradient(0deg, transparent, transparent, #ab0e42, #ab0e42, #ab0e42);\n");
      out.write("    z-index: 1;\n");
      out.write("    transform-origin: bottom right;\n");
      out.write("    animation: animate 6s linear infinite;\n");
      out.write("    animation-delay: -1.5s;\n");
      out.write("}\n");
      out.write(".borderLine::after\n");
      out.write("{\n");
      out.write("    content: '';\n");
      out.write("    position: absolute;\n");
      out.write("    top: -50%;\n");
      out.write("    left: -50%;\n");
      out.write("    width: 380px;\n");
      out.write("    height: 420px;\n");
      out.write("    background: linear-gradient(0deg, transparent, transparent, #ab0e42, #ab0e42, #ab0e42);\n");
      out.write("    z-index: 1;\n");
      out.write("    transform-origin: bottom right;\n");
      out.write("    animation: animate 6s linear infinite;\n");
      out.write("    animation-delay: -4.5s;\n");
      out.write("}\n");
      out.write("@keyframes animate\n");
      out.write("{\n");
      out.write("    0%\n");
      out.write("    {\n");
      out.write("        transform: rotate(0deg);\n");
      out.write("    }\n");
      out.write("    100%\n");
      out.write("    {\n");
      out.write("        transform: rotate(360deg);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write(".box form\n");
      out.write("{\n");
      out.write("    position: absolute;\n");
      out.write("    inset: 4px;\n");
      out.write("    background: linear-gradient(#07093e, #09303c);\n");
      out.write("    padding: 50px 40px;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    z-index: 2;\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("}\n");
      out.write(".box form h2\n");
      out.write("{\n");
      out.write("    color: #fff;\n");
      out.write("    font-weight: 500;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".box form .inputBox\n");
      out.write("{\n");
      out.write("    position: relative;\n");
      out.write("    width: 300px;\n");
      out.write("    margin-top: 35px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box form .inputBox input\n");
      out.write("{\n");
      out.write("    position: relative;\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 20px 10px 10px;\n");
      out.write("    background: transparent;\n");
      out.write("    outline: none;\n");
      out.write("    border: none;\n");
      out.write("    box-sizing: none;\n");
      out.write("    color: #23242a;\n");
      out.write("    font-size: 1.2em;\n");
      out.write("    letter-spacing: 0.05em;\n");
      out.write("    transition: 0.5s;\n");
      out.write("    z-index: 10;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box form .inputBox i\n");
      out.write("{\n");
      out.write("    position: absolute;\n");
      out.write("    left: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 2px;\n");
      out.write("    background: #fff;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    overflow: hidden;\n");
      out.write("    transition: 0.5s;\n");
      out.write("    pointer-events: none;\n");
      out.write("}\n");
      out.write(".box form .inputBox input:valid ~ i,\n");
      out.write(".box form .inputBox input:focus ~ i\n");
      out.write("{\n");
      out.write("    height: 44px;\n");
      out.write("}\n");
      out.write(".box form .sub\n");
      out.write("{\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    gap: 10px\n");
      out.write("}\n");
      out.write("h3\n");
      out.write("{\n");
      out.write("    margin-bottom: 40%;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("   \n");
      out.write("}\n");
      out.write(".box form button[type=\"submit\"]\n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    padding: 9px 25px;\n");
      out.write("    background: #fff;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 0.9em;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    font-weight: 600;\n");
      out.write("    width: 290px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".box form button[type=\"submit\"]:active\n");
      out.write("{\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write(".box form button[type=\"reset\"]\n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    padding: 9px 25px;\n");
      out.write("    background: #fff;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 0.9em;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    font-weight: 600;\n");
      out.write("    width: 290px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("     font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;\n");
      out.write("     \n");
      out.write("}\n");
      out.write(".box form button[type=\"reset\"]:active\n");
      out.write("{\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write(".box form button[type=\"button\"]\n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    padding: 9px 25px;\n");
      out.write("    background: #fff;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 0.9em;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    font-weight: 600;\n");
      out.write("    width: 290px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("     font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".box form button[type=\"button\"]:active\n");
      out.write("{\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("\n");
      out.write("        ");

            vemail = request.getParameter("pemail");
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            oconn = (OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@Ankita:1521:orcl","ankita","mitra");
           ost =(OraclePreparedStatement) oconn.prepareStatement("SELECT * FROM USERSS where mail=?");
            ost.setString(1, vemail);
            ors = (OracleResultSet) ost.executeQuery();
            if(ors.next()) 
            {
                //vques = ors.getString("SQUES"); //SQUES IS D COL NAME FOR SECURITY QUES IN UR DB
                vans = ors.getString("PASSWORD");
            }
            else
            {
                 
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    alert(\"Do not try any malaligned URL. \\n You can only use  the link received in mail \");\n");
      out.write("                    window.close();\n");
      out.write("                </script>\n");
      out.write("                ");

            }
            ost.close();
            oconn.close();
            if(request.getParameter("bVerify")!=null)
            {
                if(request.getParameter("tbAns").equals(vans))
                {
                
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    alert(\"Security Answer verified successfully!!!\");\n");
      out.write("                    location.href=\"http://localhost:8080/ecommerce/NewPassword.jsp?pemail=");
      out.print(vemail);
      out.write("\";\n");
      out.write("                </script>\n");
      out.write("                ");

                }
                else
                {
                       
      out.write(" \n");
      out.write("                       <h3 style=\"color:red\">Wrong Answer. Please try again!!!</h3>                 \n");
      out.write("                        ");

                }
            }
            else
            {
                   
      out.write("\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                    ");

            }   
            
      out.write(" \n");
      out.write("         <div class=\"box\">\n");
      out.write("            <span class=\"borderLine\"></span>\n");
      out.write("        <form name=\"frmSecurity\" method=\"POST\" action=\"http://localhost:8080/ecommerce/VerifyQues.jsp?pemail=");
      out.print(vemail);
      out.write("\">\n");
      out.write("\n");
      out.write("            <h2> <b> SECURITY VERIFICATION FORM</b> </h2>\n");
      out.write("    \n");
      out.write("             <div class=\"inputBox\">\n");
      out.write("                 <span style=\"color: #fff\">Previous Password</span>\n");
      out.write("                 <input type=\"text\" size=\"30\" name=\"tbQues\" value=\"");
      out.print(vans);
      out.write("\" style=\"color: solid black\" readonly />\n");
      out.write("                \n");
      out.write("                <i></i>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("                <span style=\"color: #fff\">Confirm Password</span>\n");
      out.write("                <input type=\"text\" size=\"30\" name=\"tbAns\" required/>\n");
      out.write("                <i></i>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"sub\">\n");
      out.write("                <button type=\"submit\" name=\"bVerify\">Verify</button>\n");
      out.write("           \n");
      out.write("                <button type=\"reset\" name=\"bReset\">Reset</button>\n");
      out.write("                <button type=\"button\" name=\"bClose\" onclick=\"funClose();\">Close</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("         </div>\n");
      out.write("    </body>\n");
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

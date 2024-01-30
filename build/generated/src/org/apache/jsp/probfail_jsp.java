package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class probfail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: teal;\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                background-color: lightblue;\n");
      out.write("                width: 500px;\n");
      out.write("                height: 300px;\n");
      out.write("               margin: auto;\n");
      out.write("               margin-top: 150px;\n");
      out.write("            }\n");
      out.write("            img {\n");
      out.write("                 height: 100px;\n");
      out.write("                width: 100px;\n");
      out.write("                border-radius: 10%;\n");
      out.write("                padding-left: 200px;\n");
      out.write("                padding-top: 50px;\n");
      out.write("                padding-bottom: 0;\n");
      out.write("                padding-right: 0;\n");
      out.write("              }\n");
      out.write("              h2\n");
      out.write("              {\n");
      out.write("                  padding-left: 180px;\n");
      out.write("                  padding-top: 15px;\n");
      out.write("              }\n");
      out.write("              h3 a\n");
      out.write("              {\n");
      out.write("                  text-decoration: none;\n");
      out.write("                  color: red;\n");
      out.write("                  padding-left: 120px;\n");
      out.write("                  font-size: 26px;\n");
      out.write("                                 \n");
      out.write("              }\n");
      out.write("        </style>\n");
      out.write("        </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("        <img src=\"img/sad.jpg\" alt=\"\"/>\n");
      out.write("        <h2>Message not sent...</h2>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <h3><a href = \"contact.jsp\">Click Here to BACK!!</a></h3>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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

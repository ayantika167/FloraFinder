package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Ecommerce Website</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v6.4.0/css/all.css\"/>\n");
      out.write("        <link href=\"css/spec.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                color: white;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;       \n");
      out.write("            }\n");
      out.write("            nav\n");
      out.write("            {\n");
      out.write("                background: rgb(59, 48, 79);\n");
      out.write("            }\n");
      out.write("            nav:after\n");
      out.write("            {\n");
      out.write("                content: ' ';\n");
      out.write("                clear: both;\n");
      out.write("                display: table;\n");
      out.write("            }\n");
      out.write("            nav .logo\n");
      out.write("            {\n");
      out.write("                float: left;\n");
      out.write("                color:white;\n");
      out.write("                font-size: 29px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                line-height: 70px;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                padding-bottom: 25px;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                padding-left: 30px;\n");
      out.write("            }\n");
      out.write("            nav .logo img{\n");
      out.write("                height: 70px;\n");
      out.write("                width: 70px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                margin-right: 15px;\n");
      out.write("            }\n");
      out.write("            nav ul{\n");
      out.write("                float: right;\n");
      out.write("                list-style: none;\n");
      out.write("                margin-right: 40px;\n");
      out.write("                position: relative;\n");
      out.write("                padding-top: 10px;\n");
      out.write("            }\n");
      out.write("            nav ul li{\n");
      out.write("                float: left;\n");
      out.write("                display:inline-block;\n");
      out.write("                background: rgb(59, 48, 79);\n");
      out.write("                margin: 0 5px;\n");
      out.write("            }\n");
      out.write("            nav ul li a{\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                line-height: 70px;\n");
      out.write("                font-size:24px;\n");
      out.write("                padding: 8px 15px;             \n");
      out.write("            }\n");
      out.write("            nav ul li a:hover{\n");
      out.write("                color: cyan;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                box-shadow: 0 0 5px #33ffff, 0 0 5px #66ffff;                     \n");
      out.write("            }\n");
      out.write("            nav ul ul li a:hover{\n");
      out.write("                color:cyan;\n");
      out.write("                box-shadow:none;\n");
      out.write("                z-index: 5;\n");
      out.write("            }\n");
      out.write("            nav ul ul{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 90px;\n");
      out.write("                border-top: 3px solid cyan;\n");
      out.write("                opacity: 0;\n");
      out.write("                visibility: hidden;    \n");
      out.write("                transition: top .3s;\n");
      out.write("                z-index: 5;\n");
      out.write("            }\n");
      out.write("            nav ul ul a{\n");
      out.write("                font-size: 18px;\n");
      out.write("                 z-index: 5;\n");
      out.write("            }           \n");
      out.write("                         \n");
      out.write("            nav ul  li:hover > ul{\n");
      out.write("                top: 70px;\n");
      out.write("                opacity: 1;\n");
      out.write("                visibility: visible;\n");
      out.write("            }\n");
      out.write("            nav ul ul li{\n");
      out.write("                position: relative;\n");
      out.write("                margin: 0px;\n");
      out.write("                width: 200px;\n");
      out.write("                float: none;\n");
      out.write("                display:list-item;\n");
      out.write("                border-bottom: 1px solid rgba(0,0,0,0.3);\n");
      out.write("                 z-index: 5;\n");
      out.write("            }\n");
      out.write("            nav ul ul li a{\n");
      out.write("                line-height: 50px;\n");
      out.write("                 z-index: 5;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            nav ul li a.log{\n");
      out.write("                border: 2px solid cyan;\n");
      out.write("                font-style: italic;\n");
      out.write("                margin-left: 40px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("            <img src= \"img/logo.png\" alt=\"Logo\">FloraFinder</div>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">Products</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"Plants.jsp\">Plants</a></li>\n");
      out.write("                        <li><a href=\"Tools.jsp\">Tools</a></li>\n");
      out.write("                        <li><a href=\"Fertilizers.jsp\">Fertilizers and Books</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                 <li><a href=\"#special\">Special Offers</a></li>      \n");
      out.write("                <li>\n");
      out.write("                    <a href=\"aboutus.jsp\">About Us</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"contact.jsp\">Contact Us</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Addtocart.jsp\"><i class=\"fas fa-shopping-cart\"></i></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a  class=\"log\" href=\"custlog.jsp\">Logout</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

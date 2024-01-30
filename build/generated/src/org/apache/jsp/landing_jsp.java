package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class landing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<title>landing</title>\n");
      out.write("\t</head>\n");
      out.write("        <body>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <h1>Flora Finder</h1>\n");
      out.write("                <h3>Grow with us</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cookie\" id=\"cookie\">\n");
      out.write("\t\t<span>&times;</span>\n");
      out.write("\t\t<h2>Cookies & Privacy</h2>\n");
      out.write("\t\t<p> To give you a better experience,we use our own and third party cookies. You can read more about them in our <a>cookie policy</a>. </p>\n");
      out.write("\t\t<div class=\"btnGrp\">\n");
      out.write("\t\t\t<button id=\"decline\" onclick=\"decline();\">Decline Now</button>\n");
      out.write("\t\t\t<button id=\"accepts\" onclick=\"accepts();\">Accept all cookies</button>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"alert\" id=\"alert\"> Please accept cookies to continue... <br>\n");
      out.write("\t\t<button onclick=\"alertAccept();\">Accept cookies</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"loader-hold\" id=\"loaderHold\">\n");
      out.write("\t\t<span class=\"loader\"></span>\n");
      out.write("            </div>\n");
      out.write("            <style type=\"text/css\">\n");
      out.write("\t\t* {\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tbox-shadow: border-box;\n");
      out.write("\t\t\tborder: 0;\n");
      out.write("\t\t\toutline: 0;\n");
      out.write("\t\t\tbackground: transparent;\n");
      out.write("\t\t\tfont-size: 16px;\n");
      out.write("\t\t\tline-height: 20px;\n");
      out.write("\t\t\tfont-family: Calisto MT;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tbody {\n");
      out.write("\t\t\tbackground: transparent url('img/backImage.jpeg') no-repeat center / cover;\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\tmin-height: 100vh;\n");
      out.write("\t\t}\n");
      out.write("                .logo {\n");
      out.write("                    display: block;\n");
      out.write("                    position: absolute;\n");
      out.write("                    inset: 50% auto auto 50%;\n");
      out.write("                    transform: translate(-50%, -50%);\n");
      out.write("                    text-align: center;\n");
      out.write("                    color: #fff;\n");
      out.write("                    text-shadow: 2px 2px 5px rgb(59, 49, 79);\n");
      out.write("                }\n");
      out.write("                .logo h1 {\n");
      out.write("                    margin-bottom: 10px;\n");
      out.write("                    font-size: 90px;\n");
      out.write("                    font-family: Segoe Script;\n");
      out.write("                }\n");
      out.write("                .logo h3 {\n");
      out.write("                    margin-top: 40px;\n");
      out.write("                    font-size: 60px;\n");
      out.write("                    font-family: Colonna MT;\n");
      out.write("                    font-weight: normal;\n");
      out.write("                }\n");
      out.write("\t\t.cookie {\n");
      out.write("\t\t\tposition: fixed;\n");
      out.write("\t\t\tinset: auto 25px 25px auto;\n");
      out.write("\t\t\twidth: 365px;\n");
      out.write("\t\t\theight: auto;\n");
      out.write("\t\t\tbackground: #fff;\n");
      out.write("\t\t\tbox-shadow: 0 0 25px -5px rgba(170, 180, 150, .5);\n");
      out.write("\t\t\tpadding: 20px;\n");
      out.write("\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\tz-index: 30;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.cookie h2 {\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tline-height: 30px;\n");
      out.write("\t\t\tcolor: rgb(59, 48, 79);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.cookie span {\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tinset: 7.5px 15px auto auto;\n");
      out.write("\t\t\tfont-size: 25px;\n");
      out.write("\t\t\tcolor: rgb(59, 48, 79);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.cookie a {\n");
      out.write("\t\t\tcolor: rgb(59, 48, 79);\n");
      out.write("\t\t\tfont-weight: bold;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.cookie .btnGrp {\n");
      out.write("\t\t\tpadding: 10px 10px 0 10px;\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tgap: 10px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.cookie button {\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\tborder: 2px solid rgb(59, 48, 79);\n");
      out.write("\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\tcolor: rgb(59, 48, 79);\n");
      out.write("\t\t\tfont-weight: bold;\n");
      out.write("\t\t\tfont-size: 15px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.cookie button:last-child {\n");
      out.write("\t\t\tbackground: rgb(59, 48, 79);\n");
      out.write("\t\t\tcolor: #fff;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.alert {\n");
      out.write("\t\t\tposition: fixed;\n");
      out.write("\t\t\tinset: 15px auto auto 50%;\n");
      out.write("\t\t\ttransform: translateX(-50%);\n");
      out.write("\t\t\tcolor: rgb(59, 48, 79);\n");
      out.write("\t\t\tbackground-color: #fff;\n");
      out.write("\t\t\tborder-color: #b6d4fe;\n");
      out.write("\t\t\tpadding: 20px;\n");
      out.write("\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tdisplay: none;\n");
      out.write("\t\t\tz-index: 30;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.alert button {\n");
      out.write("\t\t\tpadding: 10px 0 0 0;\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\tfont-size: 18px;\n");
      out.write("\t\t\tcolor: blue;\n");
      out.write("                        cursor: pointer;\n");
      out.write("\t\t}\n");
      out.write("            </style>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("\t\tfunction decline() {\n");
      out.write("\t\t\tvar decline = document.getElementById(\"decline\");\n");
      out.write("\t\t\tvar cookie = document.getElementById(\"cookie\");\n");
      out.write("\t\t\tvar alert = document.getElementById(\"alert\");\n");
      out.write("\t\t\talert.style.display = 'block';\n");
      out.write("\t\t\tcookie.style.display = \"none\";\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction alertAccept() {\n");
      out.write("\t\t\tvar alert = document.getElementById(\"alert\");\n");
      out.write("\t\t\tvar cookie = document.getElementById(\"cookie\");\n");
      out.write("\t\t\tcookie.style.display = \"block\";\n");
      out.write("\t\t\talert.style.display = 'none';\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction accepts() {\n");
      out.write("\t\t\twindow.location.replace(\"http://localhost:8080/ecommerce/custlog.jsp\");\n");
      out.write("\t\t}\n");
      out.write("            </script>\n");
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

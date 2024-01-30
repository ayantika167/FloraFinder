package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class custlog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <!--<link rel=\"stylesheet\" href=\"css/style2.css\">-->\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"form-box\">\n");
      out.write("        <div class=\"button-box\">\n");
      out.write("            <div id=\"btn\"></div>\n");
      out.write("            <button type=\"button\" class=\"toggle-btn\" onclick=\"login()\">Log In</button>\n");
      out.write("            <button type=\"button\" class=\"toggle-btn\" onclick=\"signin()\">Sign In</button>\n");
      out.write("        </div>\n");
      out.write("        <form id=\"login\" action=\"http://localhost:8080/ecommerce/login\" method=\"POST\" class=\"input-group\">\n");
      out.write("            <input type=\"text\" class=\"input-field\" name=\"username\" placeholder=\"User Id\" required>\n");
      out.write("            <input type=\"password\" class=\"input-field\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("            <label class=\"check-box\"><input type=\"checkbox\">Remember me </label>\n");
      out.write("            <p align=\"center\"><a href=\"http://localhost:8080/ecommerce/ValidateEmail.html\">Forgot password??</a></p>\n");
      out.write("            <br>\n");
      out.write("            <button type=\"submit\" class=\"submit-btn\">Log in</button>\n");
      out.write("            <br>\n");
      out.write("            <button class=\"submit-btn\"><a style=\"text-decoration: none; color: #fff\" href=\"login.jsp\">If you are admin,Log In</a></button>\n");
      out.write("        </form>\n");
      out.write("        <form id=\"signin\"  method= \"POST\" action=\"http://localhost:8080/ecommerce/registration\" class=\"input-group\">\n");
      out.write("            <input type=\"text\" name=\"tbUserName\" class=\"input-field\"   placeholder=\"User Id\" required>\n");
      out.write("            <input type=\"email\" name=\"tbMail\" class=\"input-field\" placeholder=\"Mail Id\" required>\n");
      out.write("            <input type=\"number\" name=\"tbP_No\" class=\"input-field\" placeholder=\"Phone Number\" required>\n");
      out.write("            <input type=\"password\" name=\"tbPassword\" class=\"input-field\" placeholder=\"Password\" id=\"password\" onChange=\"validatePassword();\" required>\n");
      out.write("            <input type=\"password\" name=\"tbConPassword\" class=\"input-field\" placeholder=\"Confirm Password\" id=\"confirm_password\" onKeyup=\"validatePassword();\" required>\n");
      out.write("            <span id=\"errorMsg\">cc</span>\n");
      out.write("            <label class=\"check-box\"><input type=\"checkbox\">I agree to the terms and conditions</label>\n");
      out.write("            <button type=\"submit\" class=\"submit-btn\">Sign In</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        var x = document.getElementById(\"login\");\n");
      out.write("        var y = document.getElementById(\"signin\");\n");
      out.write("        var z = document.getElementById(\"btn\");\n");
      out.write("\n");
      out.write("        function signin() {\n");
      out.write("            x.style.left = \"-100%\";\n");
      out.write("            y.style.right = \"50%\";\n");
      out.write("            z.style.left = \"110px\";\n");
      out.write("        }\n");
      out.write("        function login() {\n");
      out.write("            x.style.left = \"50%\";\n");
      out.write("            y.style.right = \"-100%\";\n");
      out.write("            z.style.left = \"0px\";\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function validatePassword(){\n");
      out.write("            var password = document.getElementById(\"password\");\n");
      out.write("            var confirm_password = document.getElementById(\"confirm_password\");\n");
      out.write("            var errorMsg = document.getElementById(\"errorMsg\");\n");
      out.write("            if(password.value != confirm_password.value) {\n");
      out.write("                errorMsg.style.display = \"block\";\n");
      out.write("                errorMsg.innerHTML = \"Passwords Don't Match\";\n");
      out.write("            } else {\n");
      out.write("                errorMsg.style.display = \"none\";\n");
      out.write("                errorMsg.innerHTML = \"\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        #loader {\n");
      out.write("            border: 12px solid #f3f3f3;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            border-top: 12px solid #444444;\n");
      out.write("            width: 70px;\n");
      out.write("            height: 70px;\n");
      out.write("            animation: spin 1s linear infinite;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes spin {\n");
      out.write("            100% {\n");
      out.write("                transform: rotate(360deg);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .center {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            bottom: 0;\n");
      out.write("            left: 0;\n");
      out.write("            right: 0;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("* {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    background:  url(\"img/banner.jpg\") no-repeat center center ;\n");
      out.write("    background-size: cover;\n");
      out.write("    min-height: 100vh;\n");
      out.write("    position: relative;\n");
      out.write("    display: block;\n");
      out.write("    width: 100%;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".form-box {\n");
      out.write("    position: absolute;\n");
      out.write("    inset: 50% auto auto 50%;\n");
      out.write("    transform: translate(-50%, -50%);\n");
      out.write("    display: block;\n");
      out.write("    width: 380px;\n");
      out.write("    height: 480px;\n");
      out.write("    background: #fff;\n");
      out.write("    padding: 25px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    box-shadow: 0 0 15px -5px rgba(180, 170, 150, 1);\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button-box {\n");
      out.write("    width: 220px;\n");
      out.write("    margin: 35px auto;\n");
      out.write("   position: relative;\n");
      out.write("    box-shadow: 0 0 20px 9px #ff61241f;\n");
      out.write("    border-radius: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".toggle-btn {\n");
      out.write("    padding: 10px 30px;\n");
      out.write("    cursor: text;\n");
      out.write("    background: transparent;\n");
      out.write("    border: 0;\n");
      out.write("    outline: none;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#btn {\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    position: absolute;\n");
      out.write("    width: 110px;\n");
      out.write("    height: 100%;\n");
      out.write("    background: linear-gradient(to right, #ff105f, #ffad06);\n");
      out.write("    color: #fff;\n");
      out.write("    border-radius: 30px;\n");
      out.write("    transition: .5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group {\n");
      out.write("    inset: 195px auto auto 50% ;\n");
      out.write("    transform: translateX(-50%);\n");
      out.write("    position: absolute;\n");
      out.write("    width: 280px;\n");
      out.write("    margin: auto;\n");
      out.write("    transition: .5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#signin {\n");
      out.write("\tinset: 155px -100% auto auto;\n");
      out.write("    transform: translateX(50%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-field {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px 0;\n");
      out.write("    margin: 5px 0;\n");
      out.write("    border-left: 0;\n");
      out.write("    border-top: 0;\n");
      out.write("    border-right: 0;\n");
      out.write("    border-bottom: 1px solid #999;\n");
      out.write("    outline: none;\n");
      out.write("    background: transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submit-btn {\n");
      out.write("    width: 85%;\n");
      out.write("    padding: 10px 30px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    display: block;\n");
      out.write("    margin: auto;\n");
      out.write("    background: linear-gradient(to right, #ff105f, #ffad06);\n");
      out.write("    color: #fff;\n");
      out.write("    border: 0;\n");
      out.write("    outline: none;\n");
      out.write("    border-radius: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label.check-box {\n");
      out.write("    display: flex;\n");
      out.write("    gap: 10px;\n");
      out.write("    margin: 10px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span:not(#errorMsg) {\n");
      out.write("    color: #777;\n");
      out.write("    font-size: 12px;\n");
      out.write("    bottom: 68px;\n");
      out.write("    position: absolute;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span#errorMsg {\n");
      out.write("\tcolor: red;\n");
      out.write("\tdisplay: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#signin {\n");
      out.write("    right: -100%;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <!--<div id=\"loader\" class=\"center\"></div>\n");
      out.write("    <script>\n");
      out.write("        document.onreadystatechange = function () {\n");
      out.write("            if (document.readyState !== \"complete\") {\n");
      out.write("                document.querySelector(\"body\").style.visibility = \"hidden\";\n");
      out.write("                document.querySelector(\"#loader\").style.visibility = \"visible\";\n");
      out.write("            } else {\n");
      out.write("                document.querySelector(\"#loader\").style.display = \"none\";\n");
      out.write("                document.querySelector(\"body\").style.visibility = \"visible\";\n");
      out.write("            }\n");
      out.write("        };\n");
      out.write("    </script>-->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
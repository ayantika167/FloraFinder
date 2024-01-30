package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loader1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"loader-hold\" id=\"loaderHold\">\n");
      out.write("\t\t\t<span class=\"loader\"></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("\t\t* {\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tbox-shadow: border-box;\n");
      out.write("\t\t\tborder: 0;\n");
      out.write("\t\t\toutline: 0;\n");
      out.write("\t\t\tbackground: transparent;\n");
      out.write("\t\t\tfont-size: 16px;\n");
      out.write("\t\t\tline-height: 20px;\n");
      out.write("\t\t\tfont-family: sans-serif;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t.loader-hold {\n");
      out.write("\t\t\toverflow: hidden;\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\theight: 100vh;\n");
      out.write("\t\t\tdisplay: grid;\n");
      out.write("\t\t\tplace-items: center;\n");
      out.write("\t\t\tbackground-color: #000d1a;\n");
      out.write("\t\t\tz-index: 50;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.loader {\n");
      out.write("\t\t\twidth: 120px;\n");
      out.write("\t\t\theight: 120px;\n");
      out.write("\t\t\tborder-radius: 50%;\n");
      out.write("\t\t\tdisplay: inline-block;\n");
      out.write("\t\t\tborder-top: 5px solid #ddd;\n");
      out.write("\t\t\tborder-right: 5px solid transparent;\n");
      out.write("\t\t\tbox-sizing: border-box;\n");
      out.write("\t\t\tanimation: rotation 3s linear infinite;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.loader::after {\n");
      out.write("\t\t\tcontent: '';\n");
      out.write("\t\t\tbox-sizing: border-box;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tleft: 0;\n");
      out.write("\t\t\ttop: 0;\n");
      out.write("\t\t\twidth: 120px;\n");
      out.write("\t\t\theight: 120px;\n");
      out.write("\t\t\tborder-radius: 50%;\n");
      out.write("\t\t\tborder-left: 5px solid #FF3D00;\n");
      out.write("\t\t\tborder-bottom: 5px solid transparent;\n");
      out.write("\t\t\tanimation: rotation 1.5s linear infinite reverse;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t@keyframes rotation {\n");
      out.write("\t\t\t0% {\n");
      out.write("\t\t\t\ttransform: rotate(0deg);\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t100% {\n");
      out.write("\t\t\t\ttransform: rotate(360deg);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tsetTimeout(function hideLoader() {\n");
      out.write("\t\t\twindow.location.replace(\"http://localhost:8080/ecommerce/landing.jsp\");\n");
      out.write("\t\t}, 5000);\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\t</body>\n");
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

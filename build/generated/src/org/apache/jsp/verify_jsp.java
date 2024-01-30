package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/verify.css\">\n");
      out.write("    <title>Verification Acoount</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Verify Your Account</h2>\n");
      out.write("        <p>\n");
      out.write("            We emailed you the six digit to your email account <br>\n");
      out.write("            Enter the code to conifirm your email address\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <div class=\"code-container\">\n");
      out.write("            <input type=\"text\" class=\"code\" placeholder=\"0\" min=\"0\" max=\"9\" maxlength=\"1\" required>\n");
      out.write("            <input type=\"text\" class=\"code\" placeholder=\"0\" min=\"0\" max=\"9\" maxlength=\"1\" required>\n");
      out.write("            <input type=\"text\" class=\"code\" placeholder=\"0\" min=\"0\" max=\"9\" maxlength=\"1\" required>\n");
      out.write("            <input type=\"text\" class=\"code\" placeholder=\"0\" min=\"0\" max=\"9\" maxlength=\"1\" required>\n");
      out.write("            <input type=\"text\" class=\"code\" placeholder=\"0\" min=\"0\" max=\"9\" maxlength=\"1\" required>\n");
      out.write("            <input type=\"text\" class=\"code\" placeholder=\"0\" min=\"0\" max=\"9\" maxlength=\"1\" required>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <button type=\"submit\" class=\"active\"> <b>Verify</b> </button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <small>\n");
      out.write("            If you didn't receive a code !! <a href=\"#\"> <strong>RESEND</strong> </a>\n");
      out.write("        </small>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
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

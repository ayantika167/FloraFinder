package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/nav1.jsp");
    _jspx_dependants.add("/slider.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>My Flower Plant Website</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/aboutus.css\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/spec.css\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/contact.css\">\n");
      out.write("<a href=\"index.jsp\"></a>\n");
      out.write("     \n");
      out.write("     <style>\n");
      out.write("         body::-webkit-scrollbar {\n");
      out.write("             width: 0;\n");
      out.write("             display: none;\n");
      out.write("         }\n");
      out.write("     </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("                ");
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
      out.write("                background: rgb(35, 29, 47);\n");
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
      out.write("                background: rgb(35, 29, 47);\n");
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
      out.write("                \n");
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
      out.write("\n");
      out.write("                ");
      out.write("<div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\"></li>\n");
      out.write("    <li data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\"></li>\n");
      out.write("  </ol>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("        <img src=\"img/pos1.jpg\"  height=\"600\" width=\"150\"class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"img/slide2.jpg\" height=\"600\" width=\"150\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"img/slide3.jpg\" height=\"600\" width=\"150\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#carouselExampleCaptions\" role=\"button\" data-bs-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#carouselExampleCaptions\" role=\"button\" data-bs-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Next</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("               \n");
      out.write("<section class=\"special-offers\" id=\"special\">\n");
      out.write("    <div class=\"container\" style=\" color: #ccffff;\">\n");
      out.write("    <h2>Special Offers</h2>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("           \n");
      out.write("          <img src=\"img/jasmin.jpg\" class=\"card-img-top\" alt=\"Product 1\">\n");
      out.write("           \n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <h5 class=\"card-title\">Jasmine</h5>\n");
      out.write("            <p class=\"card-text\">Night Bloom Jasmine Plant</p>\n");
      out.write("            <p class=\"card-text\">Price: ₹80</p>\n");
      out.write("            <div class=\"countdown-timer\">\n");
      out.write("                <p>Offer ends in: \n");
      out.write("                    <strong id=\"timer-1\"></strong>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            \n");
      out.write("          <img src=\"img/a1.jpg\" class=\"card-img-top\" alt=\"Product 2\">\n");
      out.write("          \n");
      out.write("            <div class=\"card-body\">\n");
      out.write("            <h5 class=\"card-title\">Flamingo lily</h5>\n");
      out.write("            <p class=\"card-text\"> Flamingo Lily is a herbaceous evergreen plant</p>\n");
      out.write("            <p class=\"card-text\">Price: ₹75</p>\n");
      out.write("            <div class=\"countdown-timer\">\n");
      out.write("                <p>Offer ends in: \n");
      out.write("                    <strong id=\"timer-2\"></strong>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            \n");
      out.write("          <img src=\"img/a7.jpg\" class=\"card-img-top\" alt=\"Product 3\">\n");
      out.write("            \n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <h5 class=\"card-title\">Peace lily</h5>\n");
      out.write("            <p class=\"card-text\">Peace lily a very popular indoor house plant of the family Araceae</p>\n");
      out.write("            <p class=\"card-text\">Price: ₹100</p>\n");
      out.write("            <div class=\"countdown-timer\">\n");
      out.write("                <p>Offer ends in: \n");
      out.write("                    <strong id=\"timer-3\"></strong>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("   \n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        // Set the date for the offer end\n");
      out.write("var countDownDate = new Date(\"May 24, 2023 15:37:25\").getTime();\n");
      out.write("\n");
      out.write("// Update the count down every 1 second\n");
      out.write("var x = setInterval(function() {\n");
      out.write("\n");
      out.write("  // Get the current date and time\n");
      out.write("  var now = new Date().getTime();\n");
      out.write("\n");
      out.write("  // Calculate the distance between now and the count down date\n");
      out.write("  var distance = countDownDate - now;\n");
      out.write("\n");
      out.write("  // Calculate the days, hours, minutes and seconds remaining\n");
      out.write("  var days = Math.floor(distance / (1000 * 60 * 60 * 24));\n");
      out.write("  var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));\n");
      out.write("  var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));\n");
      out.write("  var seconds = Math.floor((distance % (1000 * 60)) / 1000);\n");
      out.write("\n");
      out.write("  // Display the remaining time in the special offer section\n");
      out.write("  document.getElementById(\"timer-1\").innerHTML = days + \"d \" + hours + \"h \" + minutes + \"m \" + seconds + \"s\";\n");
      out.write("  document.getElementById(\"timer-2\").innerHTML = days + \"d \" + hours + \"h \" + minutes + \"m \" + seconds + \"s\";\n");
      out.write("  document.getElementById(\"timer-3\").innerHTML = days + \"d \" + hours + \"h \" + minutes + \"m \" + seconds + \"s\";\n");
      out.write("\n");
      out.write("  // If the count down is finished, display a message\n");
      out.write("  if (distance < 0) {\n");
      out.write("    clearInterval(x);\n");
      out.write("    document.getElementById(\"timer-1\").innerHTML = \"EXPIRED\";\n");
      out.write("    document.getElementById(\"timer-2\").innerHTML = \"EXPIRED\";\n");
      out.write("    document.getElementById(\"timer-3\").innerHTML = \"EXPIRED\";\n");
      out.write("  }\n");
      out.write("}, 1000);\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- jQuery -->\n");
      out.write("      <script src=\"js/jquery.min.js\"></script>\n");
      out.write("      <!-- Bootstrap JS -->\n");
      out.write("      <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("      <!-- Custom JS -->\n");
      out.write("      <script>\n");
      out.write("         $(document).ready(function(){\n");
      out.write("             // Add smooth scrolling to all links\n");
      out.write("             $(\"a\").on('click', function(event) {\n");
      out.write("         \n");
      out.write("                 // Make sure this.hash has a value before overriding default behavior\n");
      out.write("                 if (this.hash !== \"\") {\n");
      out.write("                     // Prevent default anchor click behavior\n");
      out.write("                     event.preventDefault();\n");
      out.write("         \n");
      out.write("                     // Store hash\n");
      out.write("                     var hash = this.hash;\n");
      out.write("         \n");
      out.write("                     // Using jQuery's animate() method to add smooth page scroll\n");
      out.write("                     // The optional number (800) specifies the number of milliseconds it takes to scroll to the specified area\n");
      out.write("                     $('html, body').animate({\n");
      out.write("                         scrollTop: $(hash).offset().top\n");
      out.write("                     }, 800, function(){\n");
      out.write("              \n");
      out.write("                         // Add hash (#) to URL when done scrolling (default click behavior)\n");
      out.write("                         window.location.hash = hash;\n");
      out.write("                     });\n");
      out.write("                 } // End if\n");
      out.write("             });\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      <script>\n");
      out.write("    const stars = document.querySelectorAll('.star-rating input');\n");
      out.write("\n");
      out.write("stars.forEach(star => {\n");
      out.write("  star.addEventListener('click', function() {\n");
      out.write("    const rating = this.value;\n");
      out.write("    for (let i = 1; i <= rating; i++) {\n");
      out.write("      document.getElementById(`star");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`).checked = true;\n");
      out.write("    }\n");
      out.write("    for (let i = parseInt(rating) + 1; i <= 5; i++) {\n");
      out.write("      document.getElementById(`star");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`).checked = false;\n");
      out.write("    }\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("   </body>\n");
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

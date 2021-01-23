package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <link rel =\"stylesheet\" href=\"home.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"header\"></div><br><br>\n");
      out.write("    \n");
      out.write("    <div class=\"topnav\">\n");
      out.write("        <a class=\"active\"\n");
      out.write("           href=\"#home\">Home</a>        \n");
      out.write("        <a href=\"contactus.jsp\">Contact Us</a>\n");
      out.write("        <a href=\"AdminLogin.jsp\">Admin</a>\n");
      out.write("        <a href=\"UserLogin.jsp\">User</a>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    <br><br>\n");
      out.write("        <body>\n");
      out.write("            <div class=\"p\">\n");
      out.write("       <p>Electronic waste or e-waste is generated when electronic and electrical equipment become unfit for their originally intended use or have crossed the expiry date. Computers, servers, mainframes, monitors, compact discs (CDs), printers, scanners, copiers, calculators, fax machines, battery cells, cellular phones, transceivers, TVs, iPods, medical apparatus, washing machines, refrigerators, and air conditioners are examples of e-waste (when unfit for use). These electronic equipments get fast replaced with newer models due to the rapid technology advancements and production of newer electronic equipment. This has led to an exponential increase in e-waste generation. People tend to switch over to the newer models and the life of products has also decreased.\n");
      out.write("            </div><br><br><br><br><br>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("  <div class=\"column\">\n");
      out.write("    <img src=\"img/1.jpg\" alt=\"1\" style=\"width:80%\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\">\n");
      out.write("    <img src=\"img/2.jpg\" alt=\"2\" style=\"width:80%\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\">\n");
      out.write("    <img src=\"img/3.png\" alt=\"3\" style=\"width:80%\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\">\n");
      out.write("    <img src=\"img/4.jpg\" alt=\"4\" style=\"width:80%\">\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
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

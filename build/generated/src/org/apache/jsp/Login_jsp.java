package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Login</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .paddingBtm {\n");
      out.write("                padding-bottom: 12px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel =\"stylesheet\" href=\"login.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("        <center>\n");
      out.write("            \n");
      out.write("            <h2> Admin Login</h2>\n");
      out.write("           \n");
      out.write("            <form id=\"loginFormId\" name=\"loginForm\" method=\"post\" action=\"loginServlet\">\n");
      out.write("                <div id=\"usernameDiv\" class=\"paddingBtm\">\n");
      out.write("                    <span id=\"user\">Username: </span><input type=\"text\" name=\"username\" />\n");
      out.write("                </div>\n");
      out.write("                <div id=\"passwordDiv\" class=\"paddingBtm\">\n");
      out.write("                    <span id=\"pass\">Password: </span><input type=\"password\" name=\"password\" />\n");
      out.write("                </div>\n");
      out.write("                <div id=\"loginBtn\">\n");
      out.write("                    <input id=\"btn\" type=\"submit\" value=\"Login\" />\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </center>\n");
      out.write("        \n");
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

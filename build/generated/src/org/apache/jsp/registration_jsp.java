package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registration Page</title>\n");
      out.write("        <link rel =\"stylesheet\" href=\"registration.css\">\n");
      out.write("        \n");
      out.write("        <script> \n");
      out.write("function validate()\n");
      out.write("{ \n");
      out.write("     var firstname = document.form.firstname.value;\n");
      out.write("     var lastname = document.form.lastname.value;\n");
      out.write("     var email = document.form.email.value; \n");
      out.write("     var mobileno = document.form.mobileno.value;\n");
      out.write("     var password = document.form.password.value;\n");
      out.write("     var address= document.form.address.value;\n");
      out.write("     \n");
      out.write("     if (fullname==null || fullname==\"\")\n");
      out.write("     { \n");
      out.write("     alert(\"Full Name can't be blank\"); \n");
      out.write("     return false; \n");
      out.write("     }\n");
      out.write("     else if (email==null || email==\"\")\n");
      out.write("     { \n");
      out.write("     alert(\"Email can't be blank\"); \n");
      out.write("     return false; \n");
      out.write("     }\n");
      out.write("     else if (username==null || username==\"\")\n");
      out.write("     { \n");
      out.write("     alert(\"Username can't be blank\"); \n");
      out.write("     return false; \n");
      out.write("     }\n");
      out.write("     else if(password.length<6)\n");
      out.write("     { \n");
      out.write("     alert(\"Password must be at least 6 characters long.\"); \n");
      out.write("     return false; \n");
      out.write("     } \n");
      out.write("     else if (password!=conpassword)\n");
      out.write("     { \n");
      out.write("     alert(\"Confirm Password should match with the Password\"); \n");
      out.write("     return false; \n");
      out.write("     } \n");
      out.write(" } \n");
      out.write("</script> \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("           <center> \n");
      out.write("        <h2>Registration Form</h2> \n");
      out.write("        <form action=\"LoginCheck.jsp\" method=\"post\"> \n");
      out.write("            <br/>\n");
      out.write("            <label for=\"firstname\">First Name</label>\n");
      out.write("            <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Your first name..\"><br><br\n");
      out.write("    \n");
      out.write("    <label for=lastname\">Last Name</label>\n");
      out.write("    <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Your last name..\"><br>\n");
      out.write("    \n");
      out.write("    <label for=\"email\">Email </label>\n");
      out.write("    <input type=\"text\" id=\"email \" name=\"email \" placeholder=\"Your email..\"><br>\n");
      out.write("    \n");
      out.write("    <label for=\"mobileno\">Mobile No</label>\n");
      out.write("    <input type=\"text\" id=\"mobileno\" name=\"mobileno\" placeholder=\"Your mobile no..\"><br>\n");
      out.write("    \n");
      out.write("    <label for=\"password\">Password</label>\n");
      out.write("    <input type=\"text\" id=\"password\" name=\"password\" placeholder=\"Your password..\"><br>\n");
      out.write("    \n");
      out.write("    <label for=\"address\">Address</label>\n");
      out.write("    <input type=\"text\" id=\"address\" name=\"address\" placeholder=\"Your address..\"><br>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("           \n");
      out.write("            <input type=\"submit\" value=\"Submit\"> \n");
      out.write("        </form> \n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("\n");
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

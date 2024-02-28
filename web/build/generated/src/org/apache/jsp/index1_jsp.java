package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/app.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\">\r\n");
      out.write("    <title>Đăng nhập</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t  \r\n");
      out.write("    <div id=\"wrapper\">\t\r\n");
      out.write("        <form action=\"login\" id=\"form-login\"  method=\"post\">\r\n");
      out.write("            <h1 class=\"form-heading\">Đăng nhập</h1>\r\n");
      out.write("          \r\n");
      out.write("               <script>alert('Nhập đúng tên đăng nhập và mật khẩu!')</script>\r\n");
      out.write("           \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <i class=\"far fa-user\"></i>\r\n");
      out.write("                <input type=\"text\" class=\"form-input\" placeholder=\"Tên đăng nhập\" name=\"user\" value=\"\" ><!--  autocomplete=\"off\" autofocus/>-->\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <i class=\"fas fa-key\"></i>\r\n");
      out.write("                <input type=\"password\" class=\"form-input\" placeholder=\"Mật khẩu\" name=\"pass\" value=\"\"  ><!--  autocomplete=\"off\" autofocus/>-->\r\n");
      out.write("                <div id=\"eye\">\r\n");
      out.write("                    <i class=\"far fa-eye\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("            \r\n");
      out.write("            <input type=\"submit\" value=\"Đăng nhập\" name =\"ok\" class=\"form-submit\">\r\n");
      out.write("            <a class=\"dropdown-item\"  href=\"dangki.jsp\" ><i class=\"fa fa-sign-out pull-right\"></i> Sign Up</a>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\r\n");
      out.write("<script src=\"js/app.js\"></script>\r\n");
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

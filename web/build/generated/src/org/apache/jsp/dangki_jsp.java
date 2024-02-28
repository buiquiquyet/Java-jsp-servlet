package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dangki_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/app.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\">\n");
      out.write("    <title>Đăng kí</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t  \n");
      out.write("    <div id=\"wrapper\">\t\n");
      out.write("        <form action=\"dangki\" id=\"form-login\"  method=\"post\">\n");
      out.write("            <h1 class=\"form-heading\">Đăng kí</h1>\n");
      out.write("           \t        <p class =\"text-danger\"><font color =\"red\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font> </p>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <i class=\"far fa-user\"></i>\n");
      out.write("                <input type=\"text\" class=\"form-input\" placeholder=\"Tên đăng nhập\" name=\"user\" value=\"\" ><!--  autocomplete=\"off\" autofocus/>-->\n");
      out.write("            </div>\n");
      out.write("\t\t\t\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <i class=\"fas fa-key\"></i>\n");
      out.write("                <input type=\"password\" class=\"form-input\" placeholder=\"Mật khẩu\" name=\"pass\" value=\"\"  ><!--  autocomplete=\"off\" autofocus/>-->\n");
      out.write("                <div id=\"eye\">\n");
      out.write("                    <i class=\"far fa-eye\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <i class=\"fas fa-key\"></i>\n");
      out.write("                <input type=\"password\" class=\"form-input\" placeholder=\"Nhập Lại Mật khẩu\" name=\"repass\" value=\"\"  ><!--  autocomplete=\"off\" autofocus/>-->\n");
      out.write("                <div id=\"eye\">\n");
      out.write("                    <i class=\"far fa-eye\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\t\t\t\n");
      out.write("            <input type=\"submit\" value=\"Đăng kí\" class=\"form-submit\">\n");
      out.write("                        <a class=\"dropdown-item\"  href=\"index1.jsp\" ><i class=\"fa fa-sign-out pull-right\"></i> Back</a>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\n");
      out.write("<script src=\"js/app.js\"></script>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editPhong_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Edit sinh viên</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"css/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t\n");
      out.write("\t<link rel=\"icon\" href=\"image/favicon.ico\" type=\"image/favicon.ico\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("\t <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\n");
      out.write("\t<div class=\"limiter\">\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"container-login100\">\n");
      out.write("\t\t\t<div class=\"wrap-login100\">\n");
      out.write("\t\t\t\t<div class=\"login100-pic js-tilt\" data-tilt>\n");
      out.write("\t\t\t\t\t<img src=\"image/img-01.png\" alt=\"IMG\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<form action=\"editPhong\"  method =\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t<form class=\"login100-form validate-form\">\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title\">\n");
      out.write("\t\t\t\t\t\tEdit phòng\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t <label>ID:</label>\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Valid email is required: ex@abc.xyz\">\n");
      out.write("                                            <input class=\"input100\" type=\"text\" name=\"id\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"TÊN SINH VIÊN\" readonly>\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"symbol-input100\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-globe\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<label>TÊN PHÒNG:</label>\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Valid email is required: ex@abc.xyz\">\n");
      out.write("                                            <input class=\"input100\" type=\"text\" name=\"tenphong\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.tenphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"ID\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"symbol-input100\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-home\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                               \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<label>GIÁ TIỀN</label>\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Valid email is required: ex@abc.xyz\">\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"giadien\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.giatien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"GIÁ ĐIỆN\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"symbol-input100\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-eraser\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t  <label>TRẠNG THÁI</label>\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Valid email is required: ex@abc.xyz\">\n");
      out.write("\t\t\t\t\t\t<!--<input class=\"input100\" type=\"text\" name=\"trangtahi\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.trangthai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  placeholder=\"TRẠNG THÁI \">-->\n");
      out.write("                                                 <select class=\"input100\" type=\"text\" name=\"trangthai\"  >\n");
      out.write("\t\t\t\t\t\t\t\t<option value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.trangthai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.trangthai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </option>\n");
      out.write("                                                                <option value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.trangthai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.trangthai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t  </select>\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"symbol-input100\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-eraser\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        \n");
      out.write("                                        <label>SỐ LƯỢNG SINH VIÊN</label>\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input\" data-validate = \"Valid email is required: ex@abc.xyz\">\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"number\" name=\"soluong\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.soluong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  placeholder=\"SỐ LƯỢNG\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"symbol-input100\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-eraser\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t<div class=\"container-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t<button class=\"login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t\tEdit\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"text-center p-t-12\">\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1\">\n");
      out.write("\t\t\t\t\t\t\tForgot\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t<a class=\"txt2\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\tUsername / Password?\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"text-center p-t-136\">\n");
      out.write("\t\t\t\t\t\t<a class=\"txt2\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\tCreate your Account\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-long-arrow-right m-l-5\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/popper.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/tilt.jquery.min.js\"></script>\n");
      out.write("\t<script >\n");
      out.write("\t\t$('.js-tilt').tilt({\n");
      out.write("\t\t\tscale: 1.1\n");
      out.write("\t\t})\n");
      out.write("\t</script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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

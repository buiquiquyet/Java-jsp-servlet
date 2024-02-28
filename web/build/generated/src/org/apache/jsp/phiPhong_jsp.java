package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class phiPhong_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\n");
      out.write("         <div class=\"right_col\" role=\"main\">\n");
      out.write("          <div class=\"\">\n");
      out.write("            <div class=\"page-title\">      \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12\">\n");
      out.write("                <div class=\"\">\n");
      out.write("                  <div class=\"x_content\">\n");
      out.write("                      \n");
      out.write("                   \n");
      out.write("                       \n");
      out.write("                     \n");
      out.write("                      <form method =\"post\" action=\"phiPhong\" enctype=\"multipart/form-data\">\n");
      out.write("              <div class=\"title_left\">\n");
      out.write("                 <h3>Tiền Phí  </h3>\n");
      out.write("              </div>\n");
      out.write("                          <p>Tên phòng: <input class=\"input100\" type=\"text\" name=\"tenphong\"   value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tenphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"\" readonly></p>\n");
      out.write("                          <p>Tháng : <input class=\"input100\" type=\"text\" name=\"thang\"   value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thang}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"\"></p>\n");
      out.write("           \n");
      out.write("\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12 col-sm-12 \">\n");
      out.write("                <div class=\"x_panel\">\n");
      out.write("                  <div class=\"x_title\">\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"x_content\">\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                          <div class=\"col-sm-12\">\n");
      out.write("                            <div class=\"card-box table-responsive\">\n");
      out.write("                         \n");
      out.write("                              <p class =\"text-danger\"><font color =\"red\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font> </p>\n");
      out.write("                    <table id=\"datatable\" class=\"table table-striped table-bordered\" style=\"width:100%\">\n");
      out.write("                                          \n");
      out.write("                           <tr>\n");
      out.write("                               <th></th>\n");
      out.write("                               <th>GIÁ </th>\n");
      out.write("                               <th>SỐ LƯỢNG</th>\n");
      out.write("                               <th>TỔNG</th>\n");
      out.write("                           </tr>\n");
      out.write("                           <tr>\n");
      out.write("                               <td>GIÁ ĐIỆN</td>\n");
      out.write("                               <td><input class=\"input100\" type=\"\" name=\"giadien1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.sodien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"\" readonly></td>\n");
      out.write("                               <td><input class=\"input100\" type=\"number\" name=\"giadien\"   value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"\"></td>\n");
      out.write("                               <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tong1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                           </tr>\n");
      out.write("                           <tr>\n");
      out.write("                           <td>GIÁ NƯỚC</td>\n");
      out.write("                               <td><input class=\"input100\" type=\"\" name=\"gianuoc1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.sonuoc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"\" readonly></td>\n");
      out.write("                               <td><input class=\"input100\" type=\"number\" name=\"gianuoc\"   value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${y}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"\"></td>\n");
      out.write("                               <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tong2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                           </tr>\n");
      out.write("                           <tr>\n");
      out.write("                               <td>TIỀN PHÒNG</td>\n");
      out.write("                               <td><input class=\"input100\" type=\"\" name=\"tienphong1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.tienphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"\" readonly></td>\n");
      out.write("                               <td ><input class=\"input100\" type=\"number\" name=\"tienphong\"  value =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${z}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"\"></td>\n");
      out.write("                               <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tong3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                           </tr>\n");
      out.write("                            <tr>\n");
      out.write("                               <td></td>\n");
      out.write("                               <td></td>\n");
      out.write("                               <td></td>\n");
      out.write("                               <td>TỔNG PHÍ : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tongto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("                          \n");
      out.write("                           \n");
      out.write("                     \n");
      out.write("                    </table\n");
      out.write("                                     <div class=\"container-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t<button class=\"login100-form-btn\" class=\"btn btn-dark\"  >\n");
      out.write("\t\t\t\t\t\t\tTÍNH TỔNG\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                   \n");
      out.write("                                  <div style=\"padding-left:1050px\">\n");
      out.write("                                <a href=\"luufile\" class=\"btn btn-info\" > Lưu file </a>\n");
      out.write("                                  </div>\n");
      out.write("\t\t\t </form>\t\t\n");
      out.write("                     <th> <a href=\"phongControl\" class=\"btn btn-info\" ><i class=\"fa fa-share\"></i> Back </a></th>\n");
      out.write("\n");
      out.write("                  </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                 \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"pagination\">\n");
      out.write("  <a href=\"#\">&laquo;</a>\n");
      out.write("  <a href=\"#\">1</a>\n");
      out.write("  <a href=\"#\" class=\"active\">2</a>\n");
      out.write("\n");
      out.write("  <a href=\"#\">&raquo;</a>\n");
      out.write("</div>\n");
      out.write("                     \n");
      out.write("                    </div>\n");
      out.write("           \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        </div>                       \n");
      out.write("\n");
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("       \n");
      out.write("\n");
      out.write(" \n");
      out.write("          \n");
      out.write("        ");
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

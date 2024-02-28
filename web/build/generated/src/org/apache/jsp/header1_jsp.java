package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("       \n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>Trang chủ  </title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"http://localhost:8081/cuoiki1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link href=\"http://localhost:8081/cuoiki1/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <link href=\"http://localhost:8081/cuoiki1/css/nprogress.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- iCheck -->\n");
      out.write("   <link href=\"http://localhost:8081/cuoiki1/css/green.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Style -->\n");
      out.write("    <link href=\"http://localhost:8081/cuoiki1/css/custom.min.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"nav-md\">\n");
      out.write("    <div class=\"container body\">\n");
      out.write("      <div class=\"main_container\">\n");
      out.write("        <div class=\"col-md-3 left_col\">\n");
      out.write("          <div class=\"left_col scroll-view\">\n");
      out.write("            <div class=\"navbar nav_title\" style=\"border: 0;\">\n");
      out.write("                  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\n");
      out.write("              <a href=\"index.html\" class=\"site_title\"><i class=\"fa fa-home\"></i> <span>Trang chủ</span></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("            <!-- menu profile quick info -->\n");
      out.write("            <div class=\"profile clearfix\">\n");
      out.write("              <div class=\"profile_pic\">\n");
      out.write("                <img src=\"image/img1.jpg\" alt=\"...\" class=\"img-circle profile_img\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"profile_info\">\n");
      out.write("                <span>Chào mừng</span>\n");
      out.write("                <h2>Bùi Qúi Quyết</h2>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /menu profile quick info -->\n");
      out.write("\n");
      out.write("            <br />\n");
      out.write("\n");
      out.write("            <!-- sidebar menu -->\n");
      out.write("            <div id=\"sidebar-menu\" class=\"main_menu_side hidden-print main_menu\">\n");
      out.write("              <div class=\"menu_section\">\n");
      out.write("                <h3>Quản lí</h3>\n");
      out.write("                <ul class=\"nav side-menu\">\n");
      out.write("                  <li><a><i class=\"fa fa-home\"></i> Home <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("                    <ul class=\"nav child_menu\">\n");
      out.write("                      <li><a href=\"home\">Danh sách sinh viên</a></li>\n");
      out.write("                      <li><a href=\"phongControl\">Chỉ số điện</a></li>\n");
      out.write("                      <li><a href=\"#\">Dịch vụ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                 \n");
      out.write("                          \n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /sidebar menu -->\n");
      out.write("\n");
      out.write("            <!-- /menu footer buttons -->\n");
      out.write("            <div class=\"sidebar-footer hidden-small\">\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Settings\">\n");
      out.write("                <span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"FullScreen\">\n");
      out.write("                <span class=\"glyphicon glyphicon-fullscreen\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Lock\">\n");
      out.write("                <span class=\"glyphicon glyphicon-eye-close\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("              <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Logout\" href=\"login.html\">\n");
      out.write("                <span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /menu footer buttons -->\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- top navigation -->\n");
      out.write("        <div class=\"top_nav\">\n");
      out.write("            <div class=\"nav_menu\">\n");
      out.write("                <div class=\"nav toggle\">\n");
      out.write("                  <a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"nav navbar-nav\">\n");
      out.write("                <ul class=\" navbar-right\">\n");
      out.write("                  <li class=\"nav-item dropdown open\" style=\"padding-left: 15px;\">\n");
      out.write("                    <a href=\"javascript:;\" class=\"user-profile dropdown-toggle\" aria-haspopup=\"true\" id=\"navbarDropdown\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                      <img src=\"image/img1.jpg\" alt=\"\">Quyết\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-usermenu pull-right\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                      <a class=\"dropdown-item\"  href=\"javascript:;\"> Profile</a>\n");
      out.write("                        <a class=\"dropdown-item\"  href=\"javascript:;\">\n");
      out.write("                          <span class=\"badge bg-red pull-right\">50%</span>\n");
      out.write("                          <span>Settings</span>\n");
      out.write("                        </a>\n");
      out.write("                    <a class=\"dropdown-item\"  href=\"javascript:;\">Help</a>\n");
      out.write("                      <a class=\"dropdown-item\"  href=\"index1.jsp\"><i class=\"fa fa-sign-out pull-right\"></i> Log Out</a>\n");
      out.write("                    </div>\n");
      out.write("                  </li>\n");
      out.write("  \n");
      out.write("                  <li role=\"presentation\" class=\"nav-item dropdown open\">\n");
      out.write("                    <a href=\"javascript:;\" class=\"dropdown-toggle info-number\" id=\"navbarDropdown1\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                      <i class=\"fa fa-envelope-o\"></i>\n");
      out.write("                      <span class=\"badge bg-green\">6</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu list-unstyled msg_list\" role=\"menu\" aria-labelledby=\"navbarDropdown1\">\n");
      out.write("                      <li class=\"nav-item\">\n");
      out.write("                        <a class=\"dropdown-item\">\n");
      out.write("                          <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                          <span>\n");
      out.write("                            <span>John Smith</span>\n");
      out.write("                            <span class=\"time\">3 mins ago</span>\n");
      out.write("                          </span>\n");
      out.write("                          <span class=\"message\">\n");
      out.write("                            Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                          </span>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"nav-item\">\n");
      out.write("                        <a class=\"dropdown-item\">\n");
      out.write("                          <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                          <span>\n");
      out.write("                            <span>John Smith</span>\n");
      out.write("                            <span class=\"time\">3 mins ago</span>\n");
      out.write("                          </span>\n");
      out.write("                          <span class=\"message\">\n");
      out.write("                            Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                          </span>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"nav-item\">\n");
      out.write("                        <a class=\"dropdown-item\">\n");
      out.write("                          <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                          <span>\n");
      out.write("                            <span>John Smith</span>\n");
      out.write("                            <span class=\"time\">3 mins ago</span>\n");
      out.write("                          </span>\n");
      out.write("                          <span class=\"message\">\n");
      out.write("                            Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                          </span>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"nav-item\">\n");
      out.write("                        <a class=\"dropdown-item\">\n");
      out.write("                          <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\n");
      out.write("                          <span>\n");
      out.write("                            <span>John Smith</span>\n");
      out.write("                            <span class=\"time\">3 mins ago</span>\n");
      out.write("                          </span>\n");
      out.write("                          <span class=\"message\">\n");
      out.write("                            Film festivals used to be do-or-die moments for movie makers. They were where...\n");
      out.write("                          </span>\n");
      out.write("                        </a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"nav-item\">\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                          <a class=\"dropdown-item\">\n");
      out.write("                            <strong>See All Alerts</strong>\n");
      out.write("                            <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                          </a>\n");
      out.write("                        </div>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </nav>\n");
      out.write("            </div>\n");
      out.write("          </div>");
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

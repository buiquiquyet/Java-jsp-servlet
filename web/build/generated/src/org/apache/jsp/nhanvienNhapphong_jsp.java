package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nhanvienNhapphong_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\n");
      out.write("   \n");
      out.write("        <!-- /top navigation -->\n");
      out.write("\n");
      out.write("        <!-- page content -->\n");
      out.write("        <div class=\"right_col\" role=\"main\">\n");
      out.write("          <div class=\"\">\n");
      out.write("            <div class=\"page-title\">\n");
      out.write("              <div class=\"title_left\">\n");
      out.write("                <h3>Danh sách nhập phòng</h3>\n");
      out.write("                 <div class=\"pull-right\">\n");
      out.write("                              <th> <a href=\"phongControl\" class=\"btn btn-info\" ><i class=\"fa fa-share\"></i> Load </a></th>\n");
      out.write("                               </div>\n");
      out.write("                          \n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("                <div class=\"title_right\">\n");
      out.write("                <div class=\"col-md-5 col-sm-5   form-group pull-right top_search\">\n");
      out.write("                     <form action=\"timFull\"  method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                  <div class=\"input-group\">\n");
      out.write("                    \n");
      out.write("                      \n");
      out.write("                \n");
      out.write("                       <input name=\"trangthai\"  type=\"text\"class=\"form-control\" class=\"input100\" id=\"pet-select\" placeholder=\"--Trạng thái phòng--\">\n");
      out.write("                         \n");
      out.write("                    \n");
      out.write("                    <span class=\"input-group-btn\">\n");
      out.write("                      <button class=\"btn btn-default\" type=\"submit\">Go!</button>\n");
      out.write("                      \n");
      out.write("                    </span>\n");
      out.write("                       \n");
      out.write("                  </div>  \n");
      out.write("                     </form>\n");
      out.write("                </div>\n");
      out.write("              </div> \n");
      out.write("          \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("              \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12\">\n");
      out.write("                <div class=\"\">\n");
      out.write("                  <div class=\"x_content\">\n");
      out.write("                      \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                       \n");
      out.write("                          ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            \n");
      out.write("                    </div>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                      \n");
      out.write("                      <hr>\n");
      out.write("                      <div class=\"x_content\">\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                          <div class=\"col-sm-12\">\n");
      out.write("                            <div class=\"card-box table-responsive\">\n");
      out.write("                    <p class=\"text-muted font-13 m-b-30\">\n");
      out.write("                    <h1><font color=\"#ff9966\"> Danh sách sinh viên chưa nhập phòng</font></h1>\n");
      out.write("                    </p>\n");
      out.write("                    <table id=\"datatable\" class=\"table table-striped table-bordered\" style=\"width:100%\">\n");
      out.write("                      <thead>\n");
      out.write("                        <tr>\n");
      out.write("                          <th>Mã SINH VIÊN</th>\n");
      out.write("                          <th>TÊN SINH VIÊN</th>\n");
      out.write("                          <th>NĂM SINH</th>\n");
      out.write("                          <th>ĐỊA CHỈ</th>\n");
      out.write("                          <th>TÊN PHÒNG</th>\n");
      out.write("                          <th>CHỨC NĂNG</th>\n");
      out.write("                        </tr>\n");
      out.write("                      </thead>\n");
      out.write("\n");
      out.write("\n");
      out.write("                      <tbody>\n");
      out.write("                         ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \n");
      out.write("                      </tbody>\n");
      out.write("                    </table>\n");
      out.write("                  </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                    \n");
      out.write("             \n");
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
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write(" \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        </div>                       \n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("                  \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"http://localhost:8081/cuoiki1/js/jquery.min.js\"></script>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("   <script src=\"http://localhost:8081/cuoiki1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <!-- FastClick -->\n");
      out.write("    <script src=\"http://localhost:8081/cuoiki1/js/fastclick.js\"></script>\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <script src=\"http://localhost:8081/cuoiki1/js/nprogress.js\"></script>\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <script src=\"http://localhost:8081/cuoiki1/js/icheck.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Scripts -->\n");
      out.write("    <script src=\"http://localhost:8081/cuoiki1/js/custom.min.js\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <!-- FastClick -->\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <!-- Chart.js -->\n");
      out.write("    <script src=\"http://localhost:8081/cuoiki1/js/Chart.min.js\"></script>\n");
      out.write("    <!-- jQuery Sparklines -->\n");
      out.write("    <script src=\"http://localhost:8081/cuoiki1/js/jquery.sparkline.min.js\"></script>\n");
      out.write("    <!-- easy-pie-chart -->\n");
      out.write("    <script src=\"http://localhost:8081/cuoiki1/js/jquery.easypiechart.min.js\"></script>\n");
      out.write("    <!-- bootstrap-progressbar -->\n");
      out.write("    <script src=\"http://localhost:8081/cuoiki1/js/bootstrap-progressbar.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Scripts -->\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                      <div class=\"animated flipInY col-lg-3 col-md-3 col-sm-6  \">\n");
          out.write("                        <div class=\"tile-stats\">\n");
          out.write("                          <div class=\"icon\"><i class=\"fa fa-caret-square-o-right\"></i>\n");
          out.write("                          </div>\n");
          out.write("                            <div class=\"count\"><font color=\"#ff9966\">Phòng ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tenphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</font></div>\n");
          out.write("                           <!-- <button type=\"button\" class=\"btn btn-success\">\n");
          out.write("                                <a href=\"svPhong1?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tenphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \" style=\"color:white; text-decoration:none;\"><i class=\"fa fa-user-plus\"></i> Thêm SV</a> \n");
          out.write("                                \n");
          out.write("\t\t\t  </button>-->\n");
          out.write("                                      <button type=\"button\" class=\"btn btn-success\">\n");
          out.write("                                <a href=\"dsSvPhong?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tenphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \" style=\"color:white; text-decoration:none;\"> Xem SV</a> \n");
          out.write("                               \n");
          out.write("\n");
          out.write("                                \n");
          out.write("\t\t\t  </button>                \n");
          out.write("                                <br>\n");
          out.write("                                   \n");
          out.write("                                <b>\n");
          out.write("                                <p><i class=\"fa fa-money\"></i>GIÁ TIỀN: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.giatien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                         <p>SỐ LƯỢNG: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.soluong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                         <p>TRẠNG THÁI: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.trangthai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></b>\n");
          out.write("                         <br>\n");
          out.write("                        <!-- <a href=\"editPhong?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tenphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-warning\" ><i class=\"fa fa-pen\"></i> SỬA </a>\n");
          out.write("\t\t\t\t\n");
          out.write("                        <a  onclick=\"return confirm('Bạn có muốn xóa sinh viên này không');\" href=\"#\" class=\"btn btn-danger\"><i class=\"fa fa-trash\"></i> XÓA </a>-->\n");
          out.write("                         \n");
          out.write("                         <button type=\"button\" class=\"btn btn-danger\">\n");
          out.write("                                <a href=\"phiPhong?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tenphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \" style=\"color:white; text-decoration:none;\"> Phí Phòng</a> \n");
          out.write("                               \n");
          out.write("\n");
          out.write("                                \n");
          out.write("\t\t\t  </button>        \n");
          out.write("                        </div>\n");
          out.write("                      </div>\n");
          out.write("                                        \n");
          out.write("                         ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lists}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            \n");
          out.write("                                        <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.diachi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                                        <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tenphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                                        <th><a href =\"themsvPhong?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button   class=\"btn btn-warning\" type=\"submit\" ><i class=\"fa fa-address-book\"></i> Thêm vào phòng ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.tenphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("  </button></a>\n");
          out.write("                                            </th>\n");
          out.write("                        </tr>\n");
          out.write("                         ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}

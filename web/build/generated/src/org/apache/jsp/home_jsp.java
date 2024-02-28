package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\r\n");
      out.write("        <div class=\"container mt-3\" >\r\n");
      out.write("\t\t<div class=\"right_col\" role=\"main\" >\r\n");
      out.write("          <div class=\"\">\r\n");
      out.write("            <div class=\"page-title\">\r\n");
      out.write("               \r\n");
      out.write("\t\t\t  <h1>Quản lí sinh viên </h1>\r\n");
      out.write("                          <br>\r\n");
      out.write("                          <div class=\"wrap\">\r\n");
      out.write("                              <div class=\"pull-right\">\r\n");
      out.write("                            <form action=\"find\" class=\"search\" method=\"post\">\r\n");
      out.write("                               <input type=\"text\" class=\"searchTerm\" name =\"name\" placeholder=\"Nhập sinh viên tìm kiếm?\">\r\n");
      out.write("                               <button type=\"submit\"   class=\"searchButton\">\r\n");
      out.write("                               <i class=\"fa fa-search\"></i> Tìm kiếm\r\n");
      out.write("                              </button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <br>\r\n");
      out.write("                             \r\n");
      out.write("                               \r\n");
      out.write("                              <div class=\"pull-right\">\r\n");
      out.write("                              <th> <a href=\"home\" class=\"btn btn-info\" ><i class=\"fa fa-share\"></i> Load </a></th>\r\n");
      out.write("                               </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("\t\t\t\t<table class=\"table table-striped table table-bordered \" >\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<thead class=\"thead-dark\">\r\n");
      out.write("\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t\t\t<th>NAME</th>\r\n");
      out.write("\t\t\t\t\t<th>AGE</th>\r\n");
      out.write("\t\t\t\t\t<th>ĐỊA CHỈ</th>\r\n");
      out.write("                                        <th>TÊN PHÒNG</th>\r\n");
      out.write("                                        <th>TIỀN PHÒNG</th>\r\n");
      out.write("\t\t\t\t\t<th>Chức năng</th>\r\n");
      out.write("                                       \r\n");
      out.write("\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t  </table>\r\n");
      out.write("                          \r\n");
      out.write("\t\t\t  <button type=\"button\" class=\"btn btn-success\">\r\n");
      out.write("\t\t\t\t<a href=\"add.jsp\" style=\"color:white; text-decoration:none;\"><i class=\"fa fa-user-plus\"></i> Thêm</a> \r\n");
      out.write("\t\t\t  </button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("       \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("          \r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lists}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                        <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.diachi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                                        <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tenphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                                        <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tienphong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\r\n");
          out.write("                                        \r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t<th><a href=\"edit?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-warning\" ><i class=\"fa fa-pen\"></i> SỬA </a>\r\n");
          out.write("\t\t\t\t\t<a  onclick=\"return confirm('Bạn có muốn xóa sinh viên này không');\" href=\"delete?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-danger\"><i class=\"fa fa-trash\"></i> XÓA </a>\r\n");
          out.write("                                       \r\n");
          out.write("                                            </th>\r\n");
          out.write("\r\n");
          out.write("                            </tr>\r\n");
          out.write("                                ");
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
}

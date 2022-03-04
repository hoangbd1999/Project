package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel = \"stylesheet\" href=\"css/default.css\" type=\"text/css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("        function find() {\n");
      out.write("            var from = document.getElementById(\"from\").value;\n");
      out.write("            var to = document.getElementById(\"to\").value;\n");
      out.write("            var roomnum = document.getElementById(\"roomnum\").value;\n");
      out.write("            var user = document.getElementById(\"user\").value;\n");
      out.write("            if (from > to) {\n");
      out.write("                alert(\"Lựa chọn lại Date To\");\n");
      out.write("            }\n");
      out.write("            else if (from == null || to == null || roomnum == null || user == null || from == \"\" || to == \"\" || roomnum == \"\" || user == \"\")\n");
      out.write("                alert(\"Not null\")\n");
      out.write("            else\n");
      out.write("                document.getElementById(\"find\").submit();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adheader.jsp", out, false);
      out.write("\n");
      out.write("          <div class=\"row\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"d-block w-100\" src=\"images/cover.jpg\" height=\"500px\" alt=\"First slide\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          <section>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row \">\n");
      out.write("                        <div class=\"col-sm-2\" style=\"margin-left: 470px; text-align: center;padding-top: 50px;\">\n");
      out.write("                            <h3 style=\"color: #955851\" >Hủy Phòng</h3>\n");
      out.write("                            <img src=\"images/icon.png\" alt=\"Chào mừng đến với Typn Typn Hotel\" style=\"width: 100%\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div><br/><br/>\n");
      out.write("                    <div class=\"d-flex justify-content-center\">\n");
      out.write("                        <div class=\"col-md-6\" >\n");
      out.write("                            <div class=\"panel panel-info col-md-12\" style=\"border: 1px solid #bce8f1;\">\n");
      out.write("\n");
      out.write("                                <form action=\"checkout\" id=\"find\" method=\"post\" class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"fromf01\">Ng&#224;y đến<span class=\"required\">*</span></label>\n");
      out.write("                                            <input class=\"form-control\" type=\"date\" name=\"from\" id=\"from\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.from}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"tof01\">Số Phòng<span class=\"required\">*</span></label>\n");
      out.write("                                            <input class=\"form-control\" type=\"text\" id=\"roomnum\" name=\"roomnum\" id=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.roomnum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"tof01\">Ng&#224;y đi<span class=\"required\">*</span></label>\n");
      out.write("                                        <input class=\"form-control\" type=\"date\" name=\"to\" id=\"to\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.to}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"tof01\">Username<span class=\"required\">*</span></label>\n");
      out.write("                                        <input class=\"form-control\" type=\"text\" id=\"user\" name=\"user\" id=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"hidden\" name=\"fid\" value=\"F02\"></input>\n");
      out.write("                                <div style=\"padding: 15px 15px\">\n");
      out.write("                                    <input type=\"button\" value=\"Tìm thông tin\" onclick=\"find()\" class=\"btn btn-primary\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                            </form>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.name!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                    <label >Tên khách hàng</label>\n");
        out.write("                                    <input class=\"form-control\" type=\"text\" readonly=\"\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" />\n");
        out.write("                                    <form action=\"delete\" method=\"post\">\n");
        out.write("                                        <input type=\"hidden\" name=\"user\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                        <input type=\"hidden\" name=\"rid\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.rid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                        <input type=\"hidden\" name=\"from\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.from}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                        <input type=\"hidden\" name=\"to\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.to}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                        <div style=\"padding: 15px 15px\">\n");
        out.write("                                            <input type=\"submit\" value=\"Check Out\" class=\"btn btn-primary\"/>\n");
        out.write("                                        </div>\n");
        out.write("                                    </form>\n");
        out.write("                                </div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}

package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Account;
import java.util.ArrayList;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>signup Page</title>\n");
      out.write("        <link rel = \"stylesheet\" href=\"../css/default.css\" type=\"text/css\"> \n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function haha() {\n");
      out.write("                var user = document.getElementById(\"username\").value;\n");
      out.write("                var pass = document.getElementById(\"password\").value;\n");
      out.write("                var name = document.getElementById(\"name\").value;\n");
      out.write("                var cmnd = document.getElementById(\"cmnd\").value;\n");
      out.write("                var phone = document.getElementById(\"phone\").value;\n");
      out.write("                var nick = document.getElementById(\"nick\").value;\n");
      out.write("                var repass = document.getElementById(\"repassword\").value;\n");
      out.write("                var date = document.getElementById(\"date\").value;\n");
      out.write("                var address = document.getElementById(\"address\").value;\n");
      out.write("                var money = document.getElementById(\"money\").value;\n");
      out.write("                if (user == null || pass == null || name == null || cmnd == null || phone == null || nick == null || repass == null || date == null || address == null || address == null || money == null || date == \"\") {\n");
      out.write("                    alert(\"Not null\");\n");
      out.write("                } else if (pass !== repass) {\n");
      out.write("                    alert(\"Re-Pass giống pass\");\n");
      out.write("                } else\n");
      out.write("                    document.getElementById(\"signup\").submit();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("\n");
      out.write("            background: url(images/gold.jpg) no-repeat center center fixed;\n");
      out.write("            background-size: 1600px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div>          \n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\" style=\"padding-top: 180px\"> \n");
      out.write("\n");
      out.write("                <div class=\"container\" >\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-md-10\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-header\">Đăng Ký</div>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <form action=\"signup\" method=\"post\" id=\"signup\">\n");
      out.write("                                        <div class=\"container\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <div class=\"form-group row\">\n");
      out.write("                                                        <label for=\"username\" class=\"col-md-4 col-form-label text-md-right\">Tên đăng nhập</label>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <input type=\"text\" id=\"username\" class=\"form-control\" name=\"username\" required autofocus>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"form-group row\">\n");
      out.write("                                                    <label for=\"password\" class=\"col-md-4 col-form-label text-md-right\">Mật khẩu</label>\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <input type=\"text\" id=\"password\" class=\"form-control\" name=\"password\" required>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group row\">\n");
      out.write("                                                    <label for=\"name\" class=\"col-md-4 col-form-label text-md-right\">Họ và tên</label>\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <input type=\"text\" id=\"name\" class=\"form-control\" name=\"name\" required>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group row\">\n");
      out.write("                                                    <label for=\"cmnd\" class=\"col-md-4 col-form-label text-md-right\">CMND</label>\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <input type=\"number\" id=\"cmnd\" class=\"form-control\" name=\"cmnd\" required>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group row\">\n");
      out.write("                                                    <label for=\"phone\" class=\"col-md-4 col-form-label text-md-right\">Số điện thoại</label>\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <input type=\"number\" id=\"phone\" class=\"form-control\" name=\"phone\" required>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group row\">\n");
      out.write("                                                    <label for=\"gender\" class=\"col-md-4 col-form-label text-md-right\">Giới tính</label>\n");
      out.write("\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        Nam <input type=\"radio\" name=\"gender\" value=\"nam\" checked=\"checked\" />\n");
      out.write("                                                        Nữ <input type=\"radio\" name=\"gender\" value=\"nữ\" checked=\"checked\" />\n");
      out.write("                                                        <!--                                                <input type=\"checkbox\" id=\"repassword\" class=\"form-control\" name=\"nick\" required>-->\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-6\">\n");
      out.write("                                                <div class=\"form-group row\">\n");
      out.write("                                                    <label for=\"nick\" class=\"col-md-4 col-form-label text-md-right\">Nick Name</label>\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <input type=\"text\" id=\"nick\" class=\"form-control\" name=\"nick\" required autofocus>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group row\">\n");
      out.write("                                                    <label for=\"repassword\" class=\"col-md-4 col-form-label text-md-right\">Re - mật khẩu</label>\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <input type=\"text\" id=\"repassword\" class=\"form-control\" name=\"repassword\" required>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group row\">\n");
      out.write("                                                    <label for=\"date\" class=\"col-md-4 col-form-label text-md-right\">Ngày </label>\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <input type=\"text\" id=\"date\" class=\"form-control\" name=\"date\" required>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"form-group row\">\n");
      out.write("                                                    <label for=\"address\" class=\"col-md-4 col-form-label text-md-right\">Địa chỉ</label>\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <input type=\"text\" id=\"address\" class=\"form-control\" name=\"address\" required>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                              \n");
      out.write("                                                <div class=\"form-group row\">\n");
      out.write("                                                    <label for=\"money\" class=\"col-md-4 col-form-label text-md-right\">Số tiền</label>\n");
      out.write("                                                    <div class=\"col-md-6\">\n");
      out.write("                                                        <input type=\"number\" id=\"money\" class=\"form-control\" name=\"money\" required>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-md-6 offset-md-4\">\n");
      out.write("                                                <!--                                                <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                                                                                    Register\n");
      out.write("                                                                                                </button>-->\n");
      out.write("                                                <!--                                                <input type=\"submit\" value=\"Register\"  class=\"btn btn-primary\"/>-->\n");
      out.write("                                                <input type=\"button\" value=\"Đăng Ký\" onclick=\"haha()\" class=\"btn btn-primary\"/>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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

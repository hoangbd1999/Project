package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("\n");
      out.write("            background: url(images/gold.jpg) no-repeat center center fixed;\n");
      out.write("            background-size: 1600px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("          <div>          \n");
      out.write("              \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write("            <div class=\"container\" style=\"padding-top: 250px;\"> \n");
      out.write("\n");
      out.write("                <div class=\"cotainer\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-md-10\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-header\">Đăng Ký</div>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <form action=\"login\" method=\"POST\" id=\"login\">\n");
      out.write("                                        <div class=\"container\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-12\">\n");
      out.write("                                                    <div class=\"form-group row\">\n");
      out.write("                                                        <label for=\"username\" class=\"col-md-4 col-form-label text-md-right\">Tên đăng nhập</label>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <input type=\"text\" id=\"username\" class=\"form-control\" name=\"username\" required autofocus>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-group row\">\n");
      out.write("                                                        <label for=\"password\" class=\"col-md-4 col-form-label text-md-right\">Mật khẩu</label>\n");
      out.write("                                                        <div class=\"col-md-6\">\n");
      out.write("                                                            <input type=\"text\" id=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-12\">\n");
      out.write("                                                    <div class=\"form-group row justify-content-center\">\n");
      out.write("                                                        <div class=\"col-md-6 offset-md-4\">\n");
      out.write("                                                            <div class=\"checkbox\">\n");
      out.write("                                                                <label>\n");
      out.write("                                                                    <input type=\"checkbox\" name=\"remember\"> Remember Me\n");
      out.write("                                                                </label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <div class=\"col-md-6 offset-md-4\">\n");
      out.write("                                                            <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                                                Đăng nhập\n");
      out.write("                                                            </button>\n");
      out.write("                                                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/signup.jsp\" class=\"btn btn-primary\">\n");
      out.write("                                                            Đăng ký\n");
      out.write("                                                        </a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
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

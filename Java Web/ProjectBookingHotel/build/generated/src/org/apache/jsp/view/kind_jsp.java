package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KindOfRoom;

public final class kind_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .Accomodation-container ul li {\n");
      out.write("            list-style: none;\n");
      out.write("            clear: both;\n");
      out.write("            display: -webkit-box;\n");
      out.write("            padding-top: 60px;\n");
      out.write("            padding-bottom: 60px;\n");
      out.write("        }\n");
      out.write("        .Accomodation-container ul li:nth-child(odd) .Left-row {\n");
      out.write("            width: 46%;\n");
      out.write("            float: left;\n");
      out.write("            padding: 0 2%;\n");
      out.write("            height: 230px;\n");
      out.write("        }\n");
      out.write("        .Accomodation-container ul li:nth-child(odd) .Right-row {\n");
      out.write("            width: 46%;\n");
      out.write("            float: left;\n");
      out.write("            padding: 0 2%;\n");
      out.write("            padding-top: 20px;\n");
      out.write("        }\n");
      out.write("        .Accomodation-container ul li:nth-child(even) .Left-row {\n");
      out.write("            width: 46%;\n");
      out.write("            float: right;\n");
      out.write("            padding: 0 2%;\n");
      out.write("            height: 230px;\n");
      out.write("        }\n");
      out.write("        .Accomodation-container ul li:nth-child(even) .Right-row {\n");
      out.write("            width: 46%;\n");
      out.write("            float: right;\n");
      out.write("            padding: 0 2%;\n");
      out.write("            padding-top: 20px;\n");
      out.write("        }\n");
      out.write("        .Accomodation-container ul li:nth-child(odd) .Right-row a {\n");
      out.write("            color: #955851;\n");
      out.write("            font-style: initial;\n");
      out.write("            text-align: right;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("        .Accomodation-container ul li:nth-child(even) .Left-row a {\n");
      out.write("            color: #955851;\n");
      out.write("            font-style: initial;\n");
      out.write("            text-align: right;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"carousel-item active\">\n");
      out.write("                <img class=\"d-block w-100\" src=\"../images/cover.jpg\" height=\"500px\" alt=\"First slide\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row \">\n");
      out.write("            <div class=\"col-sm-2\" style=\"margin-left: 700px; text-align: center;padding-top: 100px;\">\n");
      out.write("                <h3 style=\"color: #955851\">LOẠI PHÒNG </h3>\n");
      out.write("                <img src=\"../images/icon.png\" alt=\"Chào mừng đến với Typn Typn Hotel\" style=\"width: 100%\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <section class=\"section-room bg-white\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"wpb_wrapper\">\n");
      out.write("                    <div class=\"Accomodation-container\">\n");
      out.write("                        <ul>\n");
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"Accomodation-inner-container\">\n");
      out.write("                                    <div class=\"Left-row\">\n");
      out.write("                                        <img width=\"100%\" src=\"../images/K01.jpg\"  />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"Right-row\">\n");
      out.write("                                        <h2>Phòng đơn</h2>\n");
      out.write("\n");
      out.write("                                        Phòng đơn với thiết kế hài hòa, nội thất sang trọng với đầy đủ tiện nghi hiện đại. Diện tích khoảng 13m<sub>2</sub> mỗi phòng được trang trí cửa sổ mang đến không gian thoải mái nhất cho bạn.\n");
      out.write("                                       <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/book\">Book long term<span aria-hidden=\"true\" class=\"arrow_carrot-2right\"></span></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"Accomodation-inner-container\">\n");
      out.write("                                    <div class=\"Right-row\">\n");
      out.write("                                        <img width=\"100%\" src=\"../images/K02.jpg\"  />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"Left-row\">\n");
      out.write("                                        <h2>Phòng đôi </h2>\n");
      out.write("                                        Phòng đôi có tầm nhìn bao quát có diện tích khoảng 16m<sub>2</sub> mỗi phòng có một phòng đơn và một phòng đôi không gian rộng lớn thoải mái \n");
      out.write("                                       <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/book\">Book long term<span aria-hidden=\"true\" class=\"arrow_carrot-2right\"></span></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"Accomodation-inner-container\">\n");
      out.write("                                    <div class=\"Left-row\">\n");
      out.write("                                        <img width=\"100%\" src=\"../images/K03.jpg\"  />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"Right-row\">\n");
      out.write("                                        <h2>Phòng VIP</h2>\n");
      out.write("                                        Phòng VIP có tiện ích sang trọng với diện tích khoảng 27m<sub>2</sub> phù hợp với cả gia đình với 2 giường cỡ lớn và có tầm nhìn đẹp ra ngoài.\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/book\">Book long term<span aria-hidden=\"true\" class=\"arrow_carrot-2right\"></span></a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
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
}

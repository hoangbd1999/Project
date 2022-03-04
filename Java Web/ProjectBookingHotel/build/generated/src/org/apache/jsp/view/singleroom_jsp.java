package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class singleroom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        #carouselExampleIndicators{\n");
      out.write("            width: 50%;\n");
      out.write("            margin-left: 28%;          \n");
      out.write("            border:solid 5px #ffe8e0;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("        .wpb_wrapper{\n");
      out.write("            width: 50%;\n");
      out.write("            margin-left: 28%;\n");
      out.write("            padding-top: 40px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .left{\n");
      out.write("            padding-top: 30px;\n");
      out.write("            color:#955851; \n");
      out.write("            background-color: #ffefea;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div>          \n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"d-block w-100\" src=\"images/cover.jpg\" height=\"500px\" alt=\"First slide\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row \">\n");
      out.write("                <div class=\"col-sm-2\" style=\"margin-left: 700px; text-align: center;padding-top: 100px;\">\n");
      out.write("                    <h3 style=\"color: #955851\">Phòng Đơn </h3>\n");
      out.write("                    <img src=\"images/icon.png\" alt=\"Chào mừng đến với Typn Typn Hotel\" style=\"width: 100%\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"carouselExampleIndicators\" class=\"carousel slide mt-4\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"images/401.jpg\" alt=\"First slide\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"images/402.jpg\" alt=\"Second slide\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"images/403.jpg\" alt=\"Third slide\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"wpb_wrapper\">\n");
      out.write("                Ph&ograve;ng Đơn c&oacute; tầm nh&igrave;n bao qu&aacute;t, c&oacute; diện t&iacute;ch khoảng 60m<sup>2</sup> được chia th&agrave;nh 1 ph&ograve;ng ngủ v&agrave; 1 ph&ograve;ng kh&aacute;ch ri&ecirc;ng biệt c&ugrave;ng với 1 ban c&ocirc;ng nhỏ c&oacute; đặt b&agrave;n tr&agrave; ở ph&iacute;a ngo&agrave;i để qu&yacute; kh&aacute;ch c&oacute; thể vừa thưởng thức tr&agrave; vừa ngắm b&igrave;nh minh hay ho&agrave;ng h&ocirc;n.<br />\n");
      out.write("                Ph&ograve;ng Suite của ch&uacute;ng t&ocirc;i với lối kiến tr&uacute;c độc đ&aacute;o v&agrave; nội thất sang trọng sẽ mang đến cho bạn cảm gi&aacute;c thoải m&aacute;i, lạc v&agrave;o 1 kh&ocirc;ng gian sang trọng, đẳng cấp.<br />\n");
      out.write("                <br />\n");
      out.write("                <strong>Tiện &iacute;ch trong ph&ograve;ng:</strong>\n");
      out.write("                <table border=\"0\" cellpadding=\"8\" cellspacing=\"0\" style=\"width:100%\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"width:50%\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>Diện t&iacute;ch: 60-65m<sup>2</sup></li>\n");
      out.write("                                    <li>Điều hòa 2 chiều</li>\n");
      out.write("                                    <li>Điện thoại</li>\n");
      out.write("                                    <li>Mini bar và đồ uống</li>\n");
      out.write("                                    <li>Kết nối wifi và internet</li>\n");
      out.write("                                    <li>Dịch vụ phục vụ tại phòng</li>\n");
      out.write("                                </ul>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>1 giường kingsize </li>\n");
      out.write("                                    <li>Phòng tắm với bồn tắm đứng và vòi hoa sen</li>\n");
      out.write("                                    <li>Ti vi LCD SONY 32 inch</li>\n");
      out.write("                                    <li>Bàn trà với trà và café miễn phí</li>\n");
      out.write("                                    <li>Miễn phí chỗ gửi xe tại khách sạn</li>                                   \n");
      out.write("                                </ul>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <a style=\"color:white;background: #e8a88c; padding: 10px 20px; border-radius: 20px; margin-left: 320px ;width:120px;\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/book\">Book long term<span aria-hidden=\"true\" class=\"arrow_carrot-2right\"></span></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"left mt-4\">\n");
      out.write("\n");
      out.write("            <div style=\"margin-left: 300px; padding-top: 15px;\"><h2>Do You Have Any Question?</h2></div>\n");
      out.write("            <div><a style=\" margin-left: 65%; color:white;background: #e8a88c; padding: 10px 30px; border-radius: 20px;width:100px;\" href=\"lien-he1\">Contact Us</a></div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
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

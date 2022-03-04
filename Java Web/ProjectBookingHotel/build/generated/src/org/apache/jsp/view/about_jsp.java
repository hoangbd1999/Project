package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("         hr{               \n");
      out.write("                padding-top: 10px;\n");
      out.write("                width: 1100px;\n");
      out.write("                height: 500px;           \n");
      out.write("                border-radius: 47px;\n");
      out.write("                background-color:  #ffe9e1;\n");
      out.write("    \n");
      out.write("            }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("    <body>\n");
      out.write("         <div>          \n");
      out.write("              \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write("        <div id=\"carouselId\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carouselId\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#carouselId\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#carouselId\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"images/K01.jpg\" alt=\"First slide\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"images/K02.jpg\" alt=\"Second slide\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"images/K03.jpg\" alt=\"Third slide\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"images/K04.jpg\" alt=\"four slide\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselId\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselId\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("         <div class=\"container posts\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("            <hr>\n");
      out.write("            <h1 id=\"H1Title\" class=\"main-header text-center\" style=\"padding-top: 30px\">Welcom to TypnTypn Hotel</h1>\n");
      out.write("            <p style=\"text-align:justify\"><p style=\"margin-left:auto; margin-right:auto; text-align:justify\">Đến với TypnTypn Hotel, bạn sẽ được hòa mình vào với thiên nhiên trong lành, được tham gia các hoạt động vui chơi giải trí, thư giãn nghỉ ngơi để trút bỏ hết những ưu phiền và bộn bề của cuộc sống. Khu khách sạn sang trọng với đầy đủ các hạng mục tiện nghi gồm nhiều loại phòng và bungalow hiện đại kết hợp phong cách truyền thống, hệ thống bể bơi bể sục đa năng cùng hệ thống nhà hàng, phòng hội nghị, khu vui chơi, nhà hàng…<br />\n");
      out.write("<br />\n");
      out.write("TypnTypn Hotel với các phòng biệt thự và bungalow được trang bị đầy đủ tiện nghi, không gian bên trong được bài trí theo phong cách sang trọng pha trộn những nét truyền thống của người Việt và những nét hiện đại của phương Tây. Chúng tôi có đội ngũ nhân viên được đào tạo bài bản, chuyên nghiệp và tác phong chuyên nghiệp, phục vụ tận tình.<br />\n");
      out.write("<br />\n");
      out.write("TypnTypn Hotel cung cấp đầy đủ những dịch vụ tiện ích, có thủ tục kiểm tra nhanh chóng, wi-fi công cộng miễn phí phủ sóng toàn bộ khách sạn… Điểm nổi bật của Lake Hotel là nhà hàng cung cấp được cả ẩm thực phương Đông và phương Tây được xây dựng và phục vụ trên tầng cao nhất. Quý khách có thể vừa thưởng thức bữa tối ngon miệng vừa ngắm bầu trời đầy sao và thành phố khi về đêm. Ngoài ra, du khách có thể tận hưởng những dịch vụ khác như spa, phòng gym ngay trong khu vực khách sạn. Thật tuyệt vời khi mà, những thới quen rèn luyện sức khỏe, chăm sóc bản thân của bạn vẫn được duy trì đều đặn trong những kỳ nghỉ dài ngày.<br />\n");
      out.write("<br/>\n");
      out.write("TypnTypn Hotel tự tin mang đến cho bạn sự thăng hoa về cảm xúc, những trải nghiệm tốt nhất, tuyệt vời nhất trong kỳ nghỉ dưỡng của bạn. Hãy đến với chúng tôi, chúng tôi đảm bảo rằng bạn sẽ không hối tiếc.<br/>\n");
      out.write("<br/>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>    \n");
      out.write("            \n");
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

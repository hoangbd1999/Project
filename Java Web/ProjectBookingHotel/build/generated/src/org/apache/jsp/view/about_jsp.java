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
      out.write("            <p style=\"text-align:justify\"><p style=\"margin-left:auto; margin-right:auto; text-align:justify\">?????n v???i TypnTypn Hotel, b???n s??? ???????c h??a m??nh v??o v???i thi??n nhi??n trong l??nh, ???????c tham gia c??c ho???t ?????ng vui ch??i gi???i tr??, th?? gi??n ngh??? ng??i ????? tr??t b??? h???t nh???ng ??u phi???n v?? b???n b??? c???a cu???c s???ng. Khu kh??ch s???n sang tr???ng v???i ?????y ????? c??c h???ng m???c ti???n nghi g???m nhi???u lo???i ph??ng v?? bungalow hi???n ?????i k???t h???p phong c??ch truy???n th???ng, h??? th???ng b??? b??i b??? s???c ??a n??ng c??ng h??? th???ng nh?? h??ng, ph??ng h???i ngh???, khu vui ch??i, nh?? h??ng???<br />\n");
      out.write("<br />\n");
      out.write("TypnTypn Hotel v???i c??c ph??ng bi???t th??? v?? bungalow ???????c trang b??? ?????y ????? ti???n nghi, kh??ng gian b??n trong ???????c b??i tr?? theo phong c??ch sang tr???ng pha tr???n nh???ng n??t truy???n th???ng c???a ng?????i Vi???t v?? nh???ng n??t hi???n ?????i c???a ph????ng T??y. Ch??ng t??i c?? ?????i ng?? nh??n vi??n ???????c ????o t???o b??i b???n, chuy??n nghi???p v?? t??c phong chuy??n nghi???p, ph???c v??? t???n t??nh.<br />\n");
      out.write("<br />\n");
      out.write("TypnTypn Hotel cung c???p ?????y ????? nh???ng d???ch v??? ti???n ??ch, c?? th??? t???c ki???m tra nhanh ch??ng, wi-fi c??ng c???ng mi???n ph?? ph??? s??ng to??n b??? kh??ch s???n??? ??i???m n???i b???t c???a Lake Hotel l?? nh?? h??ng cung c???p ???????c c??? ???m th???c ph????ng ????ng v?? ph????ng T??y ???????c x??y d???ng v?? ph???c v??? tr??n t???ng cao nh???t. Qu?? kh??ch c?? th??? v???a th?????ng th???c b???a t???i ngon mi???ng v???a ng???m b???u tr???i ?????y sao v?? th??nh ph??? khi v??? ????m. Ngo??i ra, du kh??ch c?? th??? t???n h?????ng nh???ng d???ch v??? kh??c nh?? spa, ph??ng gym ngay trong khu v???c kh??ch s???n. Th???t tuy???t v???i khi m??, nh???ng th???i quen r??n luy???n s???c kh???e, ch??m s??c b???n th??n c???a b???n v???n ???????c duy tr?? ?????u ?????n trong nh???ng k??? ngh??? d??i ng??y.<br />\n");
      out.write("<br/>\n");
      out.write("TypnTypn Hotel t??? tin mang ?????n cho b???n s??? th??ng hoa v??? c???m x??c, nh???ng tr???i nghi???m t???t nh???t, tuy???t v???i nh???t trong k??? ngh??? d?????ng c???a b???n. H??y ?????n v???i ch??ng t??i, ch??ng t??i ?????m b???o r???ng b???n s??? kh??ng h???i ti???c.<br/>\n");
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

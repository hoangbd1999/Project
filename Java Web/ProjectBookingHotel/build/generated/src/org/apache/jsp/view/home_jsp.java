package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KindOfRoom;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel = \"stylesheet\" href=\"../css/default.css\" type=\"text/css\">   \n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("\n");
      out.write("            background-image: url(images/patern.png);\n");
      out.write("        }\n");
      out.write("        .rooms-section {\n");
      out.write("            position: relative;\n");
      out.write("            background-attachment: fixed;\n");
      out.write("            background-position: center center;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size: cover;\n");
      out.write("            padding-bottom: 40px;\n");
      out.write("        }\n");
      out.write("        .bgr-acomom {\n");
      out.write("            background-image: url(images/502_1.jpg);\n");
      out.write("        }\n");
      out.write("        #section-2 .title {\n");
      out.write("            padding-top: 40px;\n");
      out.write("            color: #fff;\n");
      out.write("            text-align: center;\n");
      out.write("            line-height: 40px;\n");
      out.write("            position: relative;\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("        }\n");
      out.write("        .Accomodation-container ul li {\n");
      out.write("            list-style: none;\n");
      out.write("            clear: both;\n");
      out.write("            display: -webkit-box;\n");
      out.write("            padding-top: 60px;\n");
      out.write("            padding-bottom: 60px;\n");
      out.write("        }\n");
      out.write("        .Accomodation-container ul li .Left-row {\n");
      out.write("            width: 46%;\n");
      out.write("            float: left;\n");
      out.write("            padding: 0 2%;\n");
      out.write("            height: 100px;\n");
      out.write("        }\n");
      out.write("        .Accomodation-container ul li .Right-row {\n");
      out.write("            width: 46%;\n");
      out.write("            float: left;\n");
      out.write("            padding: 0 2%;\n");
      out.write("        }\n");
      out.write("        .left{\n");
      out.write("            padding-top: 30px;\n");
      out.write("            color:#955851; \n");
      out.write("            background-color: #ffefea;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write(" <script>\n");
      out.write("       \n");
      out.write("        function available() {\n");
      out.write("            var from = document.getElementById(\"datefrom\").value;\n");
      out.write("            var to = document.getElementById(\"dateto\").value;\n");
      out.write("            if (from > to) {\n");
      out.write("                alert(\"Lựa chọn lại Date To\");\n");
      out.write("            }\n");
      out.write("            else if (from == null || to == null || from == \"\" || to == \"\")\n");
      out.write("                alert(\"date not null\")\n");
      out.write("            else\n");
      out.write("                document.getElementById(\"available\").submit();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"carouselId\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#carouselId\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#carouselId\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#carouselId\" data-slide-to=\"2\"></li>\n");
      out.write("                    <li data-target=\"#carouselId\" data-slide-to=\"3\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <img src=\"images/K01.jpg\" alt=\"First slide\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"images/K02.jpg\" alt=\"Second slide\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"images/K03.jpg\" alt=\"Third slide\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"images/K04.jpg\" alt=\"four slide\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselId\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselId\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form action=\"available\" id=\"available\" method=\"post\" style=\"font-size: 14px;line-height: 1.42857143;color: #333;\">\n");
      out.write("                <div class=\"datepickerebe\" style=\"text-align: center;color: #000;position: relative;\n");
      out.write("                     /*margin-top: -88px;*/\n");
      out.write("                     background-color: #e8a88c;\n");
      out.write("                     margin-bottom: 60px;\">\n");
      out.write("                    <div class=\"datepickerebe-on\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-2 block-left\" style=\"height: 90px;position: relative;\n");
      out.write("                                 min-height: 1px;\n");
      out.write("                                 padding:20px 15px 15px 15px;background-color: black\">\n");
      out.write("                                <h4><div class=\"booking-form-title\" style=\"color: white\">Đặt phòng ngay</div></h4>\n");
      out.write("                                <div class=\"text-light text-white\">\n");
      out.write("                                    Ưu đãi giá tốt nhất\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <span class=\"fa-stack fa-lg\">\n");
      out.write("                                    <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("                                    <i class=\"fa fa-angle-right fa-stack-1x fa-inverse\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-2\" style=\"width: 100%;padding-top: 20px\">\n");
      out.write("                                <div class=\"awe-calendar-wrapper\">\n");
      out.write("                                    <select class=\"form-control\" id=\"kind\" name=\"kid\" style=\"height:40px;\">\n");
      out.write("                                        <option value=\"\">Loại phòng</option>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-2\" style=\"padding-top: 20px\">\n");
      out.write("                            <div class=\"awe-calendar-wrapper \" class=\"datepicker-on\">\n");
      out.write("                                <input type=\"date\" name=\"from\" value=\"\" id=\"datefrom\" class=\"form-control\" class=\"awe-calendar datepicker-12\" placeholder=\"Arrival Date\" id=\"\">\n");
      out.write("                                <i class=\"fa fa-calendar\" aria-hidden=\"true\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-2 \" style=\"padding-top: 20px\">\n");
      out.write("                            <div class=\"awe-calendar-wrapper\">\n");
      out.write("                                <input type=\"date\" name=\"to\" value=\"\" id=\"dateto\" class=\"form-control\" class=\"awe-calendar datepicker-12\" placeholder=\"Departure Date\" id=\"\">\n");
      out.write("                                <i class=\"fa fa-calendar\" aria-hidden=\"true\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-2 mg2\" style=\"padding-top: 20px\">\n");
      out.write("                            <div class=\"awe-calendar-wrapper\">\n");
      out.write("                                <select class=\"form-control\" id=\"form\" name=\"fid\" style=\"height:40px\">\n");
      out.write("                                    <option value=\"\">Hình thức</option>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"avalability-column col-md-2 \" style=\"padding-top: 20px\">                          \n");
      out.write("                            <input type=\"button\" value=\"Kiểm tra phòng\" onclick=\"available()\" class=\"btn btn-primary\"/>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <h1 style=\"color: #955851\">Về Chúng Tôi </h1>\n");
      out.write("                        <div>\n");
      out.write("                            <p><div style=\"text-align:justify\">Khách sạn TypnTypn tọa lạc tại Quận Hai Bà Trưng, Hà Nội. Nhà hát Lớn Hà Nội và Nhà hát Múa rối Nước Thăng Long là điểm đến văn hóa nổi tiếng; ngoài ra không thể quên kể đến những địa danh được nhiều người biết đến như Văn Miếu cùng Lăng Bác. Sắp có sự kiện hay trận thi đấu nào không? Đừng quên kiểm tra thử lịch chương trình tại Sân vận động Quốc gia Mỹ Đình hay Cung Thể thao dưới nước Mỹ Đình.<br />\n");
      out.write("                                <br/>\n");
      out.write("                            </div>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"btn-a\">\n");
      out.write("                            <a class=\"learn-more theme-btn btn-style-two\" style=\"color:white;background: #e8a88c; padding: 10px 30px; border-radius: 20px; margin: 0 auto;width:100px; \" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/about\">Xem thêm</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"images-column col-md-6 \">\n");
      out.write("                        <div class=\"inner-box\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <h3 style=\"color: #955851\">Chào mừng đến với Typn Typn Hotel </h3>\n");
      out.write("                                    <img src=\"images/dep.jpg\" alt=\"Chào mừng đến với Typn Typn Hotel\" style=\"width: 100%\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bgr-acomom rooms-section\" id=\"section-2\" style=\"margin-top: 100px\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <h3 class=\"title uppercase magin\" style=\"color: #f8f9fa;\">WHERE DO YOU WANT TO STAY?</h3>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"row col-md-12 \" style=\"position:relative;\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><br/><br/><br/>\n");
      out.write("\n");
      out.write("            <div class=\"services-section\" id=\"section-3\" style='background-color: #f4f4f4;'>\n");
      out.write("                <div class=\"container\" style=\"position: relative;z-index: 9;\">\n");
      out.write("                    <section>\n");
      out.write("                        <div class=\"container col-sm-12\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <h2 class=\"main-header text-center\" style=\"padding-top: 30px;color: #955851\">THE BEST SERVICES</h2>\n");
      out.write("                                <div class=\"text-desc\" style=\"text-align: center;\">Hãy đến với chúng tôi bạn sẽ nhận được những dịch vụ và ưu đãi tốt nhất</div>\n");
      out.write("\n");
      out.write("                                <div class=\"wpb_wrapper\">\n");
      out.write("                                    <div class=\"Accomodation-container\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li>\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"Accomodation-inner-container\">\n");
      out.write("                                                        <div class=\"Left-row\">\n");
      out.write("                                                            <img width=\"100%\" src=\"images/S01.jpg\" class=\"rounded-circle\" alt=\"\"/>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"Right-row\">\n");
      out.write("                                                            <h5 style='border: solid 1px #dedede;display: block;border-left: none;border-right: none;'>Giặt là</h5>                                                       \n");
      out.write("                                                            Dịch vụ giặt là của chúng tôi có thể làm sạch tất cả đồ đạc của bạn từ quần áo, váy, phù hợp với ...<br/>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"Accomodation-inner-container\">\n");
      out.write("                                                        <div class=\"Left-row\">\n");
      out.write("                                                            <img width=\"100%\" src=\"images/S02.jpg\" class=\"rounded-circle\" alt=\"\"/>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"Right-row\">\n");
      out.write("                                                            <h5 style='border: solid 1px #dedede;display: block;border-left: none;border-right: none;'>Đồ ăn</h5> \n");
      out.write("\n");
      out.write("                                                            Quần áo của bạn sẽ sạch sẽ ngay khi bạn sử dụng dịch vụ<br/>\n");
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"Accomodation-inner-container\">\n");
      out.write("                                                        <div class=\"Left-row\">\n");
      out.write("                                                            <img width=\"100%\" src=\"images/S03.jpg\" class=\"rounded-circle\" alt=\"\" height=\"150px;\"/>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"Right-row\">\n");
      out.write("                                                            <h5 style='border: solid 1px #dedede;display: block;border-left: none;border-right: none;'>Phòng Thể Dục</h5>                                        \n");
      out.write("                                                            Thức ăn ngon miệng luôn luôn chờ để phục vụ bạn<br/>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"Accomodation-inner-container\">\n");
      out.write("                                                        <div class=\"Left-row\">\n");
      out.write("                                                            <img width=\"100%\" src=\"images/S04.jpg\" class=\"rounded-circle\" alt=\"\"/>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"Right-row\">\n");
      out.write("                                                            <h5 style='border: solid 1px #dedede;display: block;border-left: none;border-right: none;'>Đặt TOUR</h5>                                  \n");
      out.write("                                                            Khu vực an toàn cho phương tiện di chuyển của bạn<br/>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li> \n");
      out.write("\n");
      out.write("                                            <div>\n");
      out.write("                                                <a style=\"margin-left: 40%; color:white;background: #e8a88c; padding: 5px 30px; border-radius: 20px;width:100px;\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/service\">Xem thêm</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section><br/><br/>\n");
      out.write("        <div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"images/502_1.jpg\" alt=\"Lights\" style=\"width:487px;height:500px;\">           \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                        <h2 style=\"text-align: center;font-family: 'GothamRnd-Medium';color: #965851;line-height: 38px;margin-top: 120px;\">GALLERY</h2><br/><br/>\n");
      out.write("                         <div>\n");
      out.write("                          <a style=\"margin-left: 36%; color:white;background: #e8a88c; padding: 7px 30px; border-radius: 20px;width:100px;\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/kind\">Xem thêm</a>\n");
      out.write("                         </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"images/601.jpg\" alt=\"Fjords\" style=\"width:500px;height:500px;\">             \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div >\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"images/502_2.jpg\" alt=\"Lights\" style=\"width:501px;\">           \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div >\n");
      out.write("                    <div class=\"thumbnail\">     \n");
      out.write("                        <img src=\"images/K04.jpg\" alt=\"Nature\" style=\"width:546px;height:500px;\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div >\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <img src=\"images/502_3.jpg\" alt=\"Fjords\" style=\"width:489px;height:500px;\">             \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div><br/><br/>\n");
      out.write("         <div class=\"left mt-4\">\n");
      out.write("\n");
      out.write("            <div style=\"margin-left: 300px; padding-top: 10px;\"><h2>Do You Have Any Question?</h2></div>\n");
      out.write("            <div><a style=\"margin-left: 65%; color:white;background: #e8a88c; padding: 1px 30px; border-radius: 20px;width:100px;\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/kind\">Contact Us</a></div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("        <div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.kindroom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("k");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(k.kid == requestScope.kid)?\"selected=\\\"selected\\\"\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kind}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.formroom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("f");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(f.fid == requestScope.fid)?\"selected=\\\"selected\\\"\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.fid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.form}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.kindroom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("k");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col-md-4\">\n");
          out.write("                                    <div class=\"thumbnail item container-img\" style=\"background-color: #fff\">\n");
          out.write("                                        <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/kind\" title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kind}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <img class=\"img image\" src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kind}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 100%\"/>\n");
          out.write("                                        </a>\n");
          out.write("                                        <div class=\"caption cap-img \" style=\"padding: 20px 20px\">\n");
          out.write("                                            <div class=\"item-description\">\n");
          out.write("\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                            </div>\n");
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kid == 'K01'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/single\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        <h3 class=\"item-title\" style=\"color: #ae8545;\n");
        out.write("                                                            font-size: 18px;\n");
        out.write("                                                            margin-bottom: 10px;\n");
        out.write("                                                            margin-top: 5px;\n");
        out.write("                                                            text-transform: uppercase;\n");
        out.write("                                                            font-weight: bold;\n");
        out.write("                                                            text-align: center;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kind}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                                                    </a>\n");
        out.write("                                                    <div style=\"text-align: justify;\">Phòng đơn với thiết kế hài hòa. Diện tích khoảng 13m<sub>2</sub> mỗi phòng được trang trí cửa sổ mang đến không gian thoải mái nhất cho bạn.</div>\n");
        out.write("\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kid == 'K02'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/double\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        <h3 class=\"item-title\" style=\"color: #ae8545;\n");
        out.write("                                                            font-size: 18px;\n");
        out.write("                                                            margin-bottom: 10px;\n");
        out.write("                                                            margin-top: 5px;\n");
        out.write("                                                            text-transform: uppercase;\n");
        out.write("                                                            font-weight: bold;\n");
        out.write("                                                            text-align: center;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kind}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                                                    </a>\n");
        out.write("                                                    <div style=\"text-align: justify;\">Phòng đôi có tầm nhìn bao quát có diện tích khoảng 16m<sub>2</sub> mỗi phòng có một phòng đơn và một phòng đôi không gian rộng lớn thoải mái </div>\n");
        out.write("\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kid == 'K03'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/vip\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        <h3 class=\"item-title\" style=\"color: #ae8545;\n");
        out.write("                                                            font-size: 18px;\n");
        out.write("                                                            margin-bottom: 10px;\n");
        out.write("                                                            margin-top: 5px;\n");
        out.write("                                                            text-transform: uppercase;\n");
        out.write("                                                            font-weight: bold;\n");
        out.write("                                                            text-align: center;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${k.kind}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                                                    </a>\n");
        out.write("                                                    <div style=\"text-align: justify;\">Phòng VIP có tiện ích sang trọng với diện tích khoảng 27m<sub>2</sub> phù hợp với cả gia đình với 2 giường cỡ lớn và có tầm nhìn đẹp ra ngoài. </div>\n");
        out.write("\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}

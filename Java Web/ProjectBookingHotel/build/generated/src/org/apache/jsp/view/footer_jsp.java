package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        @import url('https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css');\n");
      out.write("        section {\n");
      out.write("    padding: 60px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("section .section-title {\n");
      out.write("    text-align: center;\n");
      out.write("    color: #007b5e;\n");
      out.write("    margin-bottom: 50px;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("}\n");
      out.write("#footer {\n");
      out.write("    background: #007b5e !important;\n");
      out.write("}\n");
      out.write("#footer h5{\n");
      out.write("\tpadding-left: 10px;\n");
      out.write("    border-left: 3px solid #eeeeee;\n");
      out.write("    padding-bottom: 6px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    color:#ffffff;\n");
      out.write("}\n");
      out.write("#footer a {\n");
      out.write("    color: #ffffff;\n");
      out.write("    text-decoration: none !important;\n");
      out.write("    background-color: transparent;\n");
      out.write("    -webkit-text-decoration-skip: objects;\n");
      out.write("}\n");
      out.write("#footer ul.social li{\n");
      out.write("\tpadding: 3px 0;\n");
      out.write("}\n");
      out.write("#footer ul.social li a i {\n");
      out.write("    margin-right: 5px;\n");
      out.write("\tfont-size:25px;\n");
      out.write("\t-webkit-transition: .5s all ease;\n");
      out.write("\t-moz-transition: .5s all ease;\n");
      out.write("\ttransition: .5s all ease;\n");
      out.write("}\n");
      out.write("#footer ul.social li:hover a i {\n");
      out.write("\tfont-size:30px;\n");
      out.write("\tmargin-top:-10px;\n");
      out.write("}\n");
      out.write("#footer ul.social li a,\n");
      out.write("#footer ul.quick-links li a{\n");
      out.write("\tcolor:#ffffff;\n");
      out.write("}\n");
      out.write("#footer ul.social li a:hover{\n");
      out.write("\tcolor:#eeeeee;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li{\n");
      out.write("\tpadding: 3px 0;\n");
      out.write("\t-webkit-transition: .5s all ease;\n");
      out.write("\t-moz-transition: .5s all ease;\n");
      out.write("\ttransition: .5s all ease;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li:hover{\n");
      out.write("\tpadding: 3px 0;\n");
      out.write("\tmargin-left:5px;\n");
      out.write("\tfont-weight:700;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li a i{\n");
      out.write("\tmargin-right: 5px;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li:hover a i {\n");
      out.write("    font-weight: 700;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (max-width:767px){\n");
      out.write("\t#footer h5 {\n");
      out.write("    padding-left: 0;\n");
      out.write("    border-left: transparent;\n");
      out.write("    padding-bottom: 0px;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("       <section id=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row text-center text-xs-center text-sm-left text-md-left\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-4 col-md-4\">\n");
      out.write("\t\t\t\t\t<h5>Quick links</h5>\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled quick-links\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>About</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>FAQ</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>Get Started</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>Videos</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-4 col-md-4\">\n");
      out.write("\t\t\t\t\t<h5>Quick links</h5>\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled quick-links\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>About</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>FAQ</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>Get Started</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>Videos</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-4 col-md-4\">\n");
      out.write("\t\t\t\t\t<h5>Quick links</h5>\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled quick-links\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>About</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>FAQ</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-angle-double-right\"></i>Get Started</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://wwwe.sunlimetech.com\" title=\"Design and developed by\"><i class=\"fa fa-angle-double-right\"></i>Imprint</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-5\">\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled list-inline social text-center\">\n");
      out.write("\t\t\t\t\t\t<li class=\"list-inline-item\"><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"list-inline-item\"><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"list-inline-item\"><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"list-inline-item\"><a href=\"https://www.fiverr.com/share/qb8D02\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"list-inline-item\"><a href=\"https://www.fiverr.com/share/qb8D02\" target=\"_blank\"><i class=\"fa fa-envelope\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-center text-white\">\n");
      out.write("\t\t\t\t\t<p><u><a href=\"https://www.nationaltransaction.com/\">National Transaction Corporation</a></u> is a Registered MSP/ISO of Elavon, Inc. Georgia [a wholly owned subsidiary of U.S. Bancorp, Minneapolis, MN]</p>\n");
      out.write("\t\t\t\t\t<p class=\"h6\">© All right Reversed.<a class=\"text-green ml-2\" href=\"https://www.sunlimetech.com\" target=\"_blank\">Sunlimetech</a></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
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

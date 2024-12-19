package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class area_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Selangor-SIF (School Intelligent Finder) System</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/style.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/displayData.css\" type=\"text/css\">\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <a href=\"#\" class=\"logo\"> Selangor-SIF System </a>\n");
      out.write("            \n");
      out.write("            <input type=\"checkbox\" id=\"check\">\n");
      out.write("            <label for=\"check\" class=\"icons\">\n");
      out.write("                <i class='bx bx-menu' id=\"menu-icon\"></i>\n");
      out.write("                <i class='bx bx-x' id=\"close-icon\"></i>\n");
      out.write("            </label>\n");
      out.write("            \n");
      out.write("            <nav class=\"navbar\">\n");
      out.write("                <a href=\"index.html\" style=\"--i:0;\" >Home</a>\n");
      out.write("                <a href=\"about.html\" style=\"--i:1;\" >About</a>\n");
      out.write("                <a href=\"#\" style=\"--i:2;\" >Dashboard</a>\n");
      out.write("                <a href=\"Login.jsp\" style=\"--i:3;\" >Admin</a>\n");
      out.write("                <a href=\"Contact Us.jsp\" style=\"--i:4;\" >Contact Us</a>\n");
      out.write("            </nav>\n");
      out.write("         </header>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("         <section>\n");
      out.write("            <div class=\"layout-container\">\n");
      out.write("            <div class=\"inner-container\">\n");
      out.write("                <h2>Select School Area</h2>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"enter-options-options\">\n");
      out.write("                    <a href=\"Petaling Jaya Level.jsp\" class=\"btn\">Petaling Jaya</a>\n");
      out.write("                    <a href=\"Klang Level.jsp\" class=\"btn\">Klang</a>\n");
      out.write("                    <a href=\"Sabak Bernam Level.jsp\" class=\"btn\">Sabak Bernam</a>\n");
      out.write("                    <a href=\"Kuala Langat Level.jsp\" class=\"btn\">Kuala Langat</a>\n");
      out.write("                    <a href=\"Kuala Selangor Level.jsp\" class=\"btn\">Kuala Selangor</a>\n");
      out.write("                    <a href=\"Hulu Selangor Level.jsp\" class=\"btn\">Hulu Selangor</a>\n");
      out.write("                    <a href=\"Hulu Langat Level.jsp\" class=\"btn\">Hulu Langat</a>\n");
      out.write("                    <a href=\"Gombak Level.jsp\" class=\"btn\">Gombak</a>\n");
      out.write("                    <a href=\"Sepang Level.jsp\" class=\"btn\">Sepang</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("           </section>\n");
      out.write("        </body>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("       <footer>\n");
      out.write("         <p>&copy; 2024 Selangor-SIF (School Intelligent Finder) System. All rights reserved.</p>\n");
      out.write("       </footer>\n");
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

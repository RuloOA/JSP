package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Formulario de avances</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"UserController\" method=\"post\">\r\n");
      out.write("            <fieldset>\r\n");
      out.write("                <legend>Registro de users</legend>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"dbUserId\">Id sser</label>\r\n");
      out.write("                    <input type=\"text\" name=\"dbUserId\"\r\n");
      out.write("                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.dbUserId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                           placeholder=\"Id de users\"\r\n");
      out.write("                           readonly=\"readonly\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"name\">Nombre:</label>\r\n");
      out.write("                    <input type=\"text\" name=\"fechaInicio\"\r\n");
      out.write("                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                           placeholder=\"Nombre de usuario\"\r\n");
      out.write("                           />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                  <label for=\"creationDate\">Creation date</label>\r\n");
      out.write("                    <input type=\"text\" name=\"creationDate\"\r\n");
      out.write("                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.creationDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                           placeholder=\"Fecha creacion\"\r\n");
      out.write("                           />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"modificationDate\">Modification date</label>\r\n");
      out.write("                    <input type=\"text\" name=\"modificationDate\"\r\n");
      out.write("                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.modificationDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                           placeholder=\"Fecha modificacion\"\r\n");
      out.write("                           />\r\n");
      out.write("                </div> \r\n");
      out.write("                           <div>\r\n");
      out.write("                    <label for=\"userName\">User name</label>\r\n");
      out.write("                    <input type=\"text\" name=\"userName\"\r\n");
      out.write("                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                           placeholder=\"Nombre de usuario\"\r\n");
      out.write("                           />\r\n");
      out.write("                </div> \r\n");
      out.write("                 <div>\r\n");
      out.write("                     <input type=\"submit\" value=\"Guardar\" />\r\n");
      out.write("                 </div>           \r\n");
      out.write("            </fieldset>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"./css/EstilosPg.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Menu Principal</title>\n");
      out.write("    </head>\n");
      out.write("    <body class='bg2'>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg\"  style=\"background-color: #0c0404\">\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                  <li class=\"nav-item\" active>\n");
      out.write("                      <a style=\"margin-left: 10px;\" class=\"btn btn-outline-light\"  href=\"Controlador?menu=Home\" target=\"myFrame\">Home</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                      <a style=\"margin-left: 30px;\" class=\"btn btn-outline-light\"  href=\"Controlador?menu=Accesorios\" target=\"myFrame\">Accesorios</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                    <a style=\"margin-left: 30px;\" class=\"btn btn-outline-light\"  href=\"Controlador?menu=Factura\" target=\"myFrame\">Factura</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                    <a style=\"margin-left: 30px;\" class=\"btn btn-outline-light\"  href=\"Controlador?menu=Autos\" target=\"myFrame\">Autos</a> <br>\n");
      out.write("                  </li> \n");
      out.write("                  <li>\n");
      out.write("                <a class=\"btn btn-danger\" style=\"margin-left: 30px;\" href=\"view/add.jsp\">Agregar Nuevo Auto</a>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                </ul>\n");
      out.write("             </div>\n");
      out.write("            \n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("\n");
      out.write("                  <button style=\"margin-left: 125px;\"   class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspoput=\"true\" aria-expanded=\"false\">\n");
      out.write("                   Perfil \n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getNombreUsuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \n");
      out.write("                  </button>\n");
      out.write("                   <div class=\"dropdown-menu text-center\" aria-labellebdy=\"dropdownMenuButton\">\n");
      out.write("                   <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                      <img src=\"Image/perfil-del-usuario (1).png\" alt=\"50\" height=\" 100\" width=\"100\"/>\n");
      out.write("                    </a>  \n");
      out.write("                       <li class=\"nav-item\"></a>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getNombreUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">usuario@gmail.com</a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <form action=\"Validar\" method=\"POST\">                          \n");
      out.write("                            <button name=\"accion\" name=\"salir\" class=\"dropdown-item\" href=\"#\">Salir</button>             \n");
      out.write("                        </form>\n");
      out.write("                     </div>                        \n");
      out.write("                </div>                    \n");
      out.write("        </nav><br>\n");
      out.write("        <div class=\"bgDiv\">\n");
      out.write("                    <div class=\"container2\">\n");
      out.write("                        <h1 class=\"textP text-center\">Pagina Principal</h1>                                                                             \n");
      out.write("                    </div><br><br>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h2 class=\"text text-center\">Bienvenidos</h2><br>\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <a href=\"Principal.jsp\">\n");
      out.write("                                   <img src=\"Image/casa.png\" class=\"img2\"/>\n");
      out.write("                                </a><br>\n");
      out.write("                                <a href=\"Empleado.jsp\">\n");
      out.write("                                    <img src=\"Image/factura.png\" class=\"img2\"/>\n");
      out.write("                                </a><br>\n");
      out.write("                                <a href=\"asesor.jsp\">\n");
      out.write("                                    <img src=\"Image/asesor1.png\" class=\"img2\"/>\n");
      out.write("                                </a><br>\n");
      out.write("                                \n");
      out.write("                             </div>\n");
      out.write("                    </div>\n");
      out.write("        </div>\n");
      out.write("                                              \n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
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

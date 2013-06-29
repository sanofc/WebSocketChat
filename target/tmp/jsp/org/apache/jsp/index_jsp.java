package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Hello WebSocket</title>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tvar ws = new WebSocket(\"ws://localhost:8080/WebSocketServlet\");\n");
      out.write("\t\t\tws.onopen = function(e) {\n");
      out.write("\t\t\t\tconsole.log(\"onopen()\");\n");
      out.write("\t\t\t\tws.send(\"Hello\");\n");
      out.write("\t\t\t};\n");
      out.write("\n");
      out.write("\t\t\tws.onmessage = function(msg) {\n");
      out.write("\t\t\t\tconsole.log(\"msg received\" + msg.data);\n");
      out.write("\t\t\t\tvar log = document.getElementById(\"log\");\n");
      out.write("\t\t\t\tlog.innerHTML += msg.data;\n");
      out.write("\t\t\t};\n");
      out.write("\t\t\tfunction send(){\n");
      out.write("\t\t\t\tvar msg = document.getElementById(\"msg\");\n");
      out.write("\t\t\t\tws.send(msg.value + \"<br>\");\n");
      out.write("\t\t\t\tmsg.value = \"\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<h1>WebSocket</h1>\n");
      out.write("\t\t<div id=\"log\"></div>\n");
      out.write("\t\t<input id=\"msg\" type=\"text\"/>\n");
      out.write("\t\t<button id=\"send\" onclick=\"send();\">send</button>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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

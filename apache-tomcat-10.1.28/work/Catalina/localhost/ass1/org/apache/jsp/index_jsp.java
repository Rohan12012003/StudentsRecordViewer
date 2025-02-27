/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-08-19 08:38:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Student Records</title>\n");
      out.write("    <style>\n");
      out.write("        /* Basic CSS for styling */\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            height: 100vh;\n");
      out.write("            background-color: #fff8f8;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            margin: 20px 0;\n");
      out.write("            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, 'Verdana', sans-serif;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            margin-left: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            width: 95%;\n");
      out.write("            padding: 20px;\n");
      out.write("            margin: 20px;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0 0 10px  #2669c2;\n");
      out.write("            background-color: #fff;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        label {\n");
      out.write("            margin: 10px 0;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"],\n");
      out.write("        input[type=\"email\"],\n");
      out.write("        input[type=\"date\"],\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            width: 90%;\n");
      out.write("            padding: 10px;\n");
      out.write("\n");
      out.write("            margin: 5px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            box-shadow: inset 0 2px 4px rgba(10, 170, 23, 0.26); /* Inner shadow */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            background-color: #2669c2;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #2669c2;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            width: 97.5%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin: 20px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            box-shadow: 10px 4px 8px rgba(0, 0, 0, 0.5), 10px 8px 16px rgba(0, 0, 0, 0.1); /* Gradually decreasing shadow */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table, th, td {\n");
      out.write("            border: 1px solid#2669c2;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f2f2f2; /* Light gray for even rows */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(odd) {\n");
      out.write("            background-color: #ffffff; /* White for odd rows */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color:#2669c2;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1{\n");
      out.write("            margin-left: 20px;\n");
      out.write("            align-self: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .error-message {\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2> Insert new Student</h2>\n");
      out.write("    <form action=\"addStudent.jsp\" method=\"post\">\n");
      out.write("        <label for=\"first_name\">First Name:</label>\n");
      out.write("        <input type=\"text\" id=\"first_name\" name=\"first_name\" required>\n");
      out.write("\n");
      out.write("        <label for=\"last_name\">Last Name:</label>\n");
      out.write("        <input type=\"text\" id=\"last_name\" name=\"last_name\" required>\n");
      out.write("\n");
      out.write("        <label for=\"email\">Email:</label>\n");
      out.write("        <input type=\"email\" id=\"email\" name=\"email\" required>\n");
      out.write("\n");
      out.write("        <label for=\"enrollment_date\">Enrollment Date:</label>\n");
      out.write("        <input type=\"date\" id=\"enrollment_date\" name=\"enrollment_date\" required>\n");
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"Add Student\">\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <h2>Existing Students</h2>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>First Name</th>\n");
      out.write("            <th>Last Name</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Enrollment Date</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
 
           Connection con = null;
           Statement stmt = null;
           ResultSet rs = null;
           try {
               // Load MySQL JDBC driver
               Class.forName("com.mysql.cj.jdbc.Driver");
               // Connect to the database
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentRecords", "root", "29012018");
               // Create a statement which return ResultSet object after execution
               stmt = con.createStatement();
               // Execute a query
               rs = stmt.executeQuery("SELECT * FROM students");
               
               while (rs.next()) {
                   out.print("<tr><td>" + rs.getInt("id") + "</td>");
                   out.print("<td>" + rs.getString("first_name") + "</td>");
                   out.print("<td>" + rs.getString("last_name") + "</td>");
                   out.print("<td>" + rs.getString("email") + "</td>");
                   out.print("<td>" + rs.getDate("enrollment_date") + "</td></tr>");
               }
           } catch(Exception e) {
               out.println("<tr><td colspan='5' class='error-message'>Error: " + e.getMessage() + "</td></tr>");
               e.printStackTrace(); // Prints the stack trace to the server log for debugging
           } finally {
               // Close resources
               try {
                   if (rs != null) rs.close();
                   if (stmt != null) stmt.close();
                   if (con != null) con.close();
               } catch (SQLException e) {
                   out.println("<tr><td colspan='5' class='error-message'>Error closing resources: " + e.getMessage() + "</td></tr>");
               }
           }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

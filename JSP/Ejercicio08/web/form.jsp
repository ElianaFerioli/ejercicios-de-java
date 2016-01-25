<%-- 
    Document   : form
    Created on : 22-ene-2016, 12:39:50
    Author     : eliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div id="form">
            <%
                int num = Integer.parseInt(request.getParameter("num"));
                out.print("<table>");
                for(int x = 0; x <= 10; x++) {
                    out.print("<tr>");
                    out.print("<td>" + num + "</td><td>" + x + "</td><td>" + x * num + "</td>");
                    out.print("</tr>");
                }
                out.print("</table>");
            %>
        </div>
    </body>
</html>

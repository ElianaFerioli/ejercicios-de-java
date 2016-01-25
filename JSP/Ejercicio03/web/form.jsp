<%-- 
    Document   : form
    Created on : 21-ene-2016, 9:39:21
    Author     : eliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        Hola
        <% out.print(request.getParameter("nombre")); %>
        , mucho gusto!
    </body>
</html>

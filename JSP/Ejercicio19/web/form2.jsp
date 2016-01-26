<%-- 
    Document   : form2
    Created on : 26-ene-2016, 19:19:52
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
        <div>
            <h3>Te vas con:</h3>
            <%
                double dinero = Double.parseDouble(request.getParameter("dinero"));
                out.print("<h3>" + dinero + " euros.</h3>");
            %>
            <br>
            <h3>Adios!</h3>
            <img alt="gallina" src="./img/gallina.jpg" width="300">
        </div>
    </body>
</html>

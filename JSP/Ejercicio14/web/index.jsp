<%-- 
    Document   : index
    Created on : 25-ene-2016, 18:42:29
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
        <div id="index">
            Por favor, introduce un número y se mostrarán los términos correspondientes a la serie Fibonacci
            <br>
            <form action="form.jsp" method="post">
                <input type="number" name="num" autocomplete="off" min="0" required>
                <input type="submit" name="ok" value="Calcular serie Fibonacci">
            </form>
        </div>
    </body>
</html>

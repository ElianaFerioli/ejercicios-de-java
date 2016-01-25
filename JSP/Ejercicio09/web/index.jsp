<%-- 
    Document   : index
    Created on : 23-ene-2016, 11:26:47
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
            Por favor, introduce la altura de la pirámide 
            <form action="form.jsp" method="post">
                <input type="number" name="num" autocomplete="off" min="0" required>
                <input type="submit" name="ok" value="OK">
            </form>
        </div>
    </body>
    </body>
</html>

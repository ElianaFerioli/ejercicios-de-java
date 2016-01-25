<%-- 
    Realiza una aplicación que pida un número y que luego muestre la tabla de multiplicar de
    ese número. El resultado se debe mostrar en una tabla ( <table> en HTML).
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
            Por favor, introduce un número 
            <form action="form.jsp" method="post">
                <input type="number" name="num" autocomplete="off" min="0" required>
                <input type="submit" name="ok" value="OK">
            </form>
        </div>
    </body>
</html>

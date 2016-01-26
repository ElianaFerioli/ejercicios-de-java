<%-- 
    Escribe una aplicación que genere el calendario de un mes. Se pedirá el nombre del mes,
    el año, el texto que queremos que aparezca sobre el calendario, el día de la semana en que
    cae el día 1 y el número de días que tiene el mes.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Crea tu calendario!</h1>
        <form action="form.jsp" method="post" validate>
            Indica el nombre del mes:
            <br>
            <input type="text" name="mes" placeholder="Nombre del mes">
            <br>
            Indica el año:
            <br>
            <input type="number" name="ano" placeholder="Año">
            <br>
            Indica el día de la semana que quieres que sea día "1":
            <br>
            <input type="text" name="dia" placeholder="Dia de la semana">
            <br>
            Indica el texto que quieres que aparezca en el calendario:
            <br>
            <textarea cols="70" rows="5" name="frase"></textarea>
            <br>
            <input type="submit" name="ok" value="Generar calendario">
        </form>
    </body>
</html>

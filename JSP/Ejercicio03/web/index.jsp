<%-- 
Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola” seguido del
nombre introducido. El nombre se deberá recoger mediante un formulario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="form.jsp" method="post" >
            <table>
                <tr>
                    <td>Introduzca su nombre:</td>
                    <td><input type="text" name="nombre" autocomplete="off"></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input type="submit" value="OK"></td>
                </tr>
            </table>
        </form>
    </body>
</html>

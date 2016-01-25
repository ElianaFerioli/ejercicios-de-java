<%-- 
Realiza una aplicación que calcule la media de tres notas.
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
                    <td>Introduzca la 1º nota:</td>
                    <td><input type="number" name="notaUno" autocomplete="off" min="0" max="10" required></td>
                </tr>
                <tr>
                    <td>Introduzca la 2º nota:</td>
                    <td><input type="number" name="notaDos" autocomplete="off" min="0" max="10" required></td>
                </tr>
                <tr>
                    <td>Introduzca la 3º nota:</td>
                    <td><input type="number" name="notaTres" autocomplete="off" min="0" max="10" required></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input type="submit" value="OK"></td>
                </tr>
            </table>
        </form>
    </body>
</html>

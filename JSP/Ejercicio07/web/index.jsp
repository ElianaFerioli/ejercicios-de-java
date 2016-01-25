<%-- 
    Combina las dos aplicaciones anteriores en una sola de tal forma que en la página principal
    se pueda elegir pasar de euros a pesetas o de pesetas a euros. Adorna la página con alguna
    foto o dibujo.
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
        <div id="img">
            <img src="img/euro.png" width="256" height="256" alt="euro">
        </div>
        <div id="form">
            <form action="form.jsp" method="post">
                <table>
                    <tr>
                        <td>Introduzca una cantidad: </td>
                        <td><input type="number" name="cantidad" autocomplete="off" min="0" required></td>
                    </tr>
                    <tr>
                        <td style="text-align: center" colspan="2">¿Qué desea hacer?</td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="radio" name="conversor" value="pesetaEuros"> Pasar de Pesetas a Euros</td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="radio" name="conversor" value="eurosPesetas"> Pasar de Euros a Pesetas</td>
                    </tr>
                    <tr>
                        <td style="text-align: center" colspan="2"><input type="submit" value="OK"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>

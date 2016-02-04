<%-- 
    Realiza un programa que vaya tirando tres dados de forma aleatoria. Cada tirada va en una línea
diferente. El programa parará cuando al menos dos de los dados sean iguales.
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
            <%
                int dadoUno = 0;
                int dadoDos = 0;
                int dadoTres = 0;
                do {
                    dadoUno = (int)(Math.random()*6) + 1;
                    dadoDos = (int)(Math.random()*6) + 1;
                    dadoTres = (int)(Math.random()*6) + 1;
                    out.print("<img width=\"153\" height=\"149\" src=\"./img/dado" + dadoUno + ".png\">");
                    out.print("<img width=\"153\" height=\"149\" src=\"./img/dado" + dadoDos + ".png\">");
                    out.print("<img width=\"153\" height=\"149\" src=\"./img/dado" + dadoTres + ".png\">");
                    out.print("<br>");
                } while((dadoUno != dadoDos)&&(dadoUno != dadoTres)&&(dadoDos != dadoTres));

            %>
    </body>
</html>

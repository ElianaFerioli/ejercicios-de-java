<%-- 
    Document   : form
    Created on : 25-ene-2016, 19:40:47
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
        <form action="form.jsp" method="post" validate>
            <input type="submit" name="ok" value="Tira tres dados de póker">
        </form>
        <br>
        <br>
        <br>
        <div id="form">
            <%
                for (int x = 1; x <= 3; x++) {
                    int dado = (int)(Math.random()*6) + 1;
                    if(dado == 1) {
                        out.print("<img alt=\"caraUno\" width=\"153\" height=\"149\" src=\"./img/uno.jpg\">");
                    }
                    if(dado == 2) {
                        out.print("<img alt=\"caraDos\" width=\"153\" height=\"149\" src=\"./img/dos.jpg\">");
                    }
                    if(dado == 3) {
                        out.print("<img alt=\"caraTres\" width=\"153\" height=\"149\" src=\"./img/tres.jpg\">");
                    }
                    if(dado == 4) {
                        out.print("<img alt=\"caraCuatro\" width=\"153\" height=\"149\" src=\"./img/cuatro.jpg\">");
                    }
                    if(dado == 5) {
                        out.print("<img alt=\"caraCinco\" width=\"153\" height=\"149\" src=\"./img/cinco.jpg\">");
                    }
                    if(dado == 6) {
                        out.print("<img alt=\"caraSeis\" width=\"153\" height=\"149\" src=\"./img/seis.jpg\">");
                    }
                }

            %>
        </div>
    </body>
</html>


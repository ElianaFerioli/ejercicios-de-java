<%-- 
    Document   : form
    Created on : 26-ene-2016, 18:21:47
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
        <h1>La bolita está en...</h1>
        <%
            int bolita = (int)(Math.random()*3) + 1;
            int vasoSeleccionado = Integer.parseInt(request.getParameter("vaso"));
            for(int x = 1; x <= 3; x++){
                if(x==bolita) {
                    out.print("<img src=\"./img/vasobolita.jpg\" alt=\"vaso\">");
                } else {
                    out.print("<img src=\"./img/vasovacio.jpg\" alt=\"vaso\">");
                }
            }
            out.print("<br>");
            out.print("<br>");
            out.print("<br>");
            if(vasoSeleccionado == bolita) {
                out.print("Enhorabuena! has encontrado la bolita!");
            } else {
                out.print("Lo siento, no has acertado");
            }
            
        %>
        
        <br>
        <br>
        <form action="index.jsp" method="post">
            <input type="submit" value="Volver a intentarlo">
        </form>
        </div>
    </body>
</html>

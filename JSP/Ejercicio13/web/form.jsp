<%-- 
    Document   : form
    Created on : 25-ene-2016, 18:27:07
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
        <div id="puntuacion">
            <h1>El veredicto es:</h1>        
            <%
                int puntuacion = 0;
                String resUsuario = " ";
                String[] preg = new String [10];
                preg[0] = "pregUno";
                preg[1] = "pregDos";
                preg[2] = "pregTres";
                preg[3] = "pregCuatro";
                preg[4] = "pregCinco";
                preg[5] = "pregSeis";
                preg[6] = "pregSiete";
                preg[7] = "pregOcho";
                preg[8] = "pregNueve";
                preg[9] = "pregDiez";

                for(int x = 0; x < 10; x++){
                    resUsuario = request.getParameter(preg[x]);
                    if(resUsuario.equals("v")) {
                        puntuacion = puntuacion + 3;
                    }                
                }
                if ((puntuacion > 0)&&(puntuacion <= 10)) {
                    out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
                } else if ((puntuacion > 10)&&(puntuacion <= 22)){
                    out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
                } else if (puntuacion > 22) {
                    out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
                }
            %>
        </div>
    </body>
</html>

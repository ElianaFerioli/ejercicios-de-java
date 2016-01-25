<%-- 
    Document   : form
    Created on : 23-ene-2016, 13:14:51
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
            <h1>Tu puntuación es:</h1>        
            <%
                int puntuacion = 0;
                String[] resUsuario = new String [10];
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
                String[] resCorrecta = new String [10];
                resCorrecta[0] = "a";
                resCorrecta[1] = "b";
                resCorrecta[2] = "c";
                resCorrecta[3] = "c";
                resCorrecta[4] = "b";
                resCorrecta[5] = "b";
                resCorrecta[6] = "c";
                resCorrecta[7] = "b";
                resCorrecta[8] = "a";
                resCorrecta[9] = "c";

                for(int x = 0; x < 10; x++){
                    resUsuario[x] = request.getParameter(preg[x]);
                    if(resUsuario[x].equals(resCorrecta[x])) {
                        puntuacion++;
                    }                
                }
                out.print(puntuacion);
            %>
        </div>
    </body>
</html>

<%-- 
    Document   : index
    Created on : 12-may-2016, 8:40:04
    Author     : eliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>gestesImperio</title>
        <link rel="icon" href="">
	<link rel="stylesheet"  href="../estilo/estilo.css" title="style" />
    </head>
    <body>
            <header>
                <h1>gestesimperio</h1>
                <h3>Elige tu bando y que la fuerza te acompañe</h3>
            </header>
            <main>      
                <form action="controlacceso.jsp" method="post">
                    <input type="hidden" name="nomejer" value="REBELDES">
                    <input type="submit" name="ok" value="Alianza Rebelde" id="rebeldes">
                </form>
                <form action="controlacceso.jsp" method="post">
                    <input type="hidden" name="nomejer" value="IMPERIO">
                    <input type="submit" name="ok" value="Ejercito imperial" id="imperio">
                </form>
                <form action="controlacceso.jsp" method="post">
                    <input type="hidden" name="nomejer" value="CLONES">
                    <input type="submit" name="ok" value="Ejercito de clones" id="clones">
                </form>
                <form action="controlacceso.jsp" method="post">
                    <input type="hidden" name="nomejer" value="JEDIS">
                    <input type="submit" name="ok" value="orden jedi" id="jedi">
                </form>          
                <form action="ejercito.jsp" method="post" id="controlacceso">
                    <%
                        //Imprime el formulario de acceso (contraseña del ejercito)
                        String nomejer = request.getParameter("nomejer");
                        String nombre = "";
                        if(nomejer.equals("REBELDES")){
                            nombre = "Alianza Rebelde";
                        }
                        if(nomejer.equals("IMPERIO")){
                            nombre = "Ejercito imperial";
                        }
                        if(nomejer.equals("CLONES")){
                            nombre = "Ejercito de clones";
                        }
                        if(nomejer.equals("JEDIS")){
                            nombre = "orden jedi";
                        }
                        out.println("<h1>" + nombre + "</h1>");
                        out.print("<img src=\"../imagenes/" + nomejer + ".png\" width=\"200\">");
                        out.println("<input type=\"password\" name=\"pass\""
                                + "autocomplete=\"off\" placeholder=\"  introduce la contraseña\""
                                + "required id=\"pass\">");
                        out.println("<input type=\"hidden\" name=\"nomejer\" value=\""+ nomejer + "\">");
                        out.print("<br>");
                        out.println("<input type=\"submit\" name=\"in\" value=\"que la fuerza me acompañe\" id=\"pass\">");
                    %>
                </form>
            </main>
            <footer>
                <h6>E.F Megasupercorporation</h6>
            </footer>
            <img src="../imagenes/halcon.png" width="250px" id="halcon">
    </body>
</html>

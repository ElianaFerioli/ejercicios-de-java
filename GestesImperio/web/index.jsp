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
	<link rel="stylesheet"  href="./estilo/estilo.css" title="style" />
    </head>
    <body>
            <header>
                <h1>gestesimperio</h1>
                <h3>Elige tu bando y que la fuerza te acompañe</h3>
            </header>
            <main>
                <form action="./acceso/controlacceso.jsp" method="post">
                    <input type="hidden" name="nomejer" value="REBELDES">
                    <input type="submit" name="ok" value="Alianza Rebelde" id="rebeldes">
                </form>
                <form action="./acceso/controlacceso.jsp" method="post">
                    <input type="hidden" name="nomejer" value="IMPERIO">
                    <input type="submit" name="ok" value="Ejercito imperial" id="imperio">
                </form>
                <form action="./acceso/controlacceso.jsp" method="post">
                    <input type="hidden" name="nomejer" value="CLONES">
                    <input type="submit" name="ok" value="Ejercito de clones" id="clones">
                </form>
                <form action="./acceso/controlacceso.jsp" method="post">
                    <input type="hidden" name="nomejer" value="JEDIS">
                    <input type="submit" name="ok" value="orden jedi" id="jedi">
                </form>
            </main>
            <footer>
                <h6>E.F Megasupercorporation</h6>
            </footer>
            <img src="./imagenes/halcon.png" width="250px" id="halcon">
    </body>
</html>

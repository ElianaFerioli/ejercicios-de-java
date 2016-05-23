<%-- 
    Document   : altasoldado
    Created on : 19-may-2016, 9:30:03
    Author     : eliana
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="../estilo/estilo.css" title="style" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Alta soldado</h1>
        <%
            String nomejer = request.getParameter("nomejer");
            if(nomejer.equals("REBELDES")){
                out.print("<img src=\"../imagenes/REBELDES.png\" width=\"100px\" id=\"ejer\">");
            }
            if(nomejer.equals("CLONES")){
                out.print("<img src=\"../imagenes/CLONES.png\" width=\"100px\" id=\"ejer\">");
            }
            if(nomejer.equals("IMPERIO")){
                out.print("<img src=\"../imagenes/IMPERIO.png\" width=\"100px\" id=\"ejer\">");
            }
            if(nomejer.equals("JEDIS")){
                out.print("<img src=\"../imagenes/JEDIS.png\" width=\"100px\" id=\"ejer\">");
            }
        %>
        <div id="ejercito">
            <%
                request.setCharacterEncoding("UTF-8");
                //Recoge la contraseña del formulario
                String pass = request.getParameter("pass");
            %>
            <h3>Bienvenido a la guerra</h3>
            <form action="altasoldado.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <input type="submit" name="ok" value="Añadir un soldado" id="agrega">
            </form>
            <form action="../baja/bajasoldado.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <input type="submit" name="ok" value="Borrar un soldado" id="borra">
            </form>
            <form action="../modifica/modifica.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <input type="submit" name="ok" value="Modificar" id="modifica">
            </form>
            <form action="../listado/listado.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <input type="submit" name="ok" value="ver listado" id="lista">
            </form>
            <form action="../duelo/duelo.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <input type="submit" name="ok" value="Duelo" id="duelo">
            </form>
        </div>
        <aside id="alta">
            <form action="altaexitosa.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <h3>Nombre</h3>
                <input type="text" name="nomsold" placeholder="Nombre del soldado" required>
                <h3>Rango</h3>
                <select name="rango" required>
                <option selected disabled required>--- Elige el rango ---</option>
                <option value="APRENDIZ">Aprendiz</option>
                <option value="SOLDADO RASO">Soldado raso</option>
                <option value="PADAWAN">Joven Padawan</option>
                <option value="COMANDANTE">Comandante</option>
                <option value="MAESTRO JEDI">Maestro jedi</option>
                </select>
                <br>
                <input type="submit" name="ok" value="Añadir soldado">
            </form>
        </aside>
        <footer>
                <h6>E.F Megasupercorporation</h6>
                <a id="volver" href="../index.jsp">cambia de ejército</a>
        </footer>
        <img src="../imagenes/halcon.png" width="250px" id="halcon">
    </body>
</html>

<%-- 
    Document   : bajaexitosa
    Created on : 20-may-2016, 20:10:47
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
        <link rel="stylesheet"  href="../estilo/estilo.css" title="style"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Soldado dado de baja<h1>
        <h3 id="altaexitosa">uno menos para la lucha</h3>
        <div id="ejercito">
            <%
                request.setCharacterEncoding("UTF-8");
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
            
                //Quita al soldado de la base de datos
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestesImperio", "root", "root");
                Statement s = conexion.createStatement();
                request.setCharacterEncoding("UTF-8");
                String delete = "DELETE FROM SOLDADOS WHERE CODSOLDADO='" 
                                   + request.getParameter("codsold")
                                   + "'";
                s.execute(delete);         
                conexion.close();
            %>            
            <form action="../alta/altasoldado.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <input type="submit" name="ok" value="Añadir un soldado" id="agrega">
            </form>
            <form action="bajasoldado.jsp" method="post">
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
        <footer>
                <h6>E.F Megasupercorporation</h6>
                <a id="volver" href="../index.jsp">cambia de ejército</a>
        </footer>
        <img src="../imagenes/halcon.png" width="250px" id="halcon">
    </body>
</html>

<%-- 
    Document   : rebeldes
    Created on : 12-may-2016, 9:32:02
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
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestesImperio", "root", "root");
                Statement s = conexion.createStatement();

                request.setCharacterEncoding("UTF-8");
                //Recoge la contraseña del formulario
                String pass = request.getParameter("pass");
                //Selecciona la contraseña correcta de la base de datos
                ResultSet listado = s.executeQuery ("SELECT PASSEJER FROM EJERCITO WHERE NOMEJER='" + nomejer + "'");
                listado.next();
                String correcta = listado.getString("passejer");
                //Coteja la contraseña correcta con la contraseña introducida
                if(correcta.equals(pass)){
                    out.print("<h1>Soldado autenticado<h1>");
                    out.print("<h3>Bienvenido a la guerra</h3>");
                    out.print("<form action=\"../alta/altasoldado.jsp\" method=\"post\">"
                            + "<input type=\"hidden\" name=\"nomejer\" value=\"" + nomejer + "\">"
                            + "<input type=\"submit\" name=\"ok\" value=\"Añadir un soldado\" id=\"agrega\">"
                            + "</form>"); 
                    out.print("<form action=\"../baja/bajasoldado.jsp\" method=\"post\">"
                            + "<input type=\"hidden\" name=\"nomejer\" value=\"" + nomejer +"\">"
                            + "<input type=\"submit\" name=\"ok\" value=\"Borrar un soldado\" id=\"borra\">"
                            + "</form>");
                    out.print("<form action=\"../modifica/modifica.jsp\" method=\"post\">"
                            + "<input type=\"hidden\" name=\"nomejer\" value=\"" + nomejer +"\">"
                            + "<input type=\"submit\" name=\"ok\" value=\"Modificar\" id=\"modifica\">"
                            + "</form>");
                    out.print("<form action=\"../listado/listado.jsp\" method=\"post\">"
                            + "<input type=\"hidden\" name=\"nomejer\" value=\"" + nomejer +"\">"
                            + "<input type=\"submit\" name=\"ok\" value=\"ver listado\" id=\"lista\">"
                            + "</form>");
                    out.print("<form action=\"../duelo/duelo.jsp\" method=\"post\">"
                            + "<input type=\"hidden\" name=\"nomejer\" value=\"" + nomejer +"\">"
                            + "<input type=\"submit\" name=\"ok\" value=\"Duelo\" id=\"duelo\">"
                            + "</form>");
                } else {
                    out.print("<h1>Acceso denegado<h1>");
                    out.print("<h3>No eres parte del ejército</h3>");
                }
            %>
        </div>
        <footer>
                <h6>E.F Megasupercorporation</h6>
                <a id="volver" href="../index.jsp">cambia de ejército</a>
        </footer>
        <img src="../imagenes/halcon.png" width="250px" id="halcon">        
    </body>
</html>

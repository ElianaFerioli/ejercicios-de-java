<%-- 
    Document   : listado
    Created on : 19-may-2016, 9:37:28
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
        <h1>Listado de soldados<h1>
        <h3 id="listado">que la fuerza te acompañe</h3>
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
            %>
            <form action="../alta/altasoldado.jsp" method="post">
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
            <form action="listado.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <input type="submit" name="ok" value="ver listado" id="lista">
            </form>
            <form action="../duelo/duelo.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <input type="submit" name="ok" value="Duelo" id="duelo">
            </form>
        </div>
            <div id="listado">
                    <table>
                        <tr id="cabecera">
                            <th>codigo</th>
                            <th>Nombre</th>
                            <th>rango</th>
                            <th>experiencia</th>
                            <th>ver ficha completa</th>
                        </tr>
                        <%
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestesImperio", "root", "root");
                            Statement s = conexion.createStatement();
                            ResultSet listado = s.executeQuery ("SELECT CODSOLDADO, NOMSOLD, RANGO, EXPERSOLD"
                                    + " FROM SOLDADOS WHERE NOMEJER=\"" + request.getParameter("nomejer") + "\"");
                            while (listado.next()) {
                                String nomsold = listado.getString("NOMSOLD");
                                out.print("<tr>");
                                out.print("<td>" + listado.getString("CODSOLDADO").toLowerCase() + "</td>"
                                        + "<td>" + listado.getString ("NOMSOLD").toLowerCase() + "</td>"
                                        + "<td>" + listado.getString ("RANGO").toLowerCase() + "</td>"
                                        + "<td>" + listado.getString ("EXPERSOLD").toLowerCase() + "</td>"
                                        + "<td>"
                                        + "<form action=\"fichacompleta.jsp\" method=\"post\">"
                                        + "<input type=\"hidden\" name=\"nomejer\" value=\""
                                        + nomejer + "\">"
                                        + "<input type=\"hidden\" name=\"nomsold\" value=\""
                                        + nomsold + "\">"
                                        + "<input type=\"submit\" name=\"ok\" value=\"+\" id=\"verficha\">"
                                        + "</form>"
                                        + "</td>");
                                out.print("</tr>");
                            }

                                conexion.close();
                        %>
                    </table>
            </div>
        <footer>
            <h6>E.F Megasupercorporation</h6>
            <a id="volver" href="../index.jsp">cambia de ejército</a>
        </footer>
        <img src="../imagenes/halcon.png" width="250px" id="halcon">
    </body>
</html>

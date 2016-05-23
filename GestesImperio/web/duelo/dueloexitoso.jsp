<%-- 
    Document   : dueloexitoso
    Created on : 23-may-2016, 12:36:37
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
         <h1>Modificacion de soldado<h1>
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
            <form action="../listado/listado.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <input type="submit" name="ok" value="ver listado" id="lista">
            </form>
            <form action="duelo.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <input type="submit" name="ok" value="Duelo" id="duelo">
            </form>
        </div>
            <aside id="dueloexitoso">
                <%
                    String codsoldado = request.getParameter("codsoldado");
                    String contrario = request.getParameter("contrario");
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestesImperio", "root", "root");
                    Statement s = conexion.createStatement();
                    ResultSet listado = s.executeQuery ("SELECT NOMSOLD, NOMEJER, EXPERSOLD FROM SOLDADOS WHERE CODSOLDADO=\"" + contrario + "\"");
                    String nomsoldcontrario = listado.getString("NOMSOLD");
                    String nomejercontrario = listado.getString("NOMEJER");
                    int expersoldcontrario = Integer.parseInt(listado.getString("EXPERSOLD"));
                    listado = s.executeQuery ("SELECT NOMSOLD, NOMEJER, EXPERSOLD FROM SOLDADOS WHERE CODSOLDADO=\"" + codsoldado + "\"");
                    String nomsoldmio = listado.getString("NOMSOLD");
                    String nomejermio = listado.getString("NOMEJER");
                    int expersoldmio = Integer.parseInt(listado.getString("EXPERSOLD"));
                    
                    out.println("<table>");
                        out.println("<tr>");
                            out.println("<th>");
                            out.print("daño");
                            out.println("</th>");
                            out.println("<th>");
                            out.print("asalto");
                            out.println("</th>");
                            out.println("<th>");
                            out.print("daño");
                            out.println("</th>");
                        out.println("</tr>");
                        out.println("<tr>");
                            out.println("<td>");
                            out.print("daño");
                            out.println("</td>");
                            out.println("<td>");
                            out.print("asalto");
                            out.println("</td>");
                            out.println("<td>");
                            out.print("daño");
                            out.println("</td>");
                        out.println("</tr>");
                    out.println("</table>");  
                    conexion.close();
                %>
        </aside>
            <footer>
            <h6>E.F Megasupercorporation</h6>
            </footer>
            <img src="../imagenes/halcon.png" width="250px" id="halcon">
    </body>

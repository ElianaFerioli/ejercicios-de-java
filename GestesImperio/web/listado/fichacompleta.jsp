<%-- 
    Document   : fichacompleta
    Created on : 22-may-2016, 16:41:11
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
        <h1>Ficha completa<h1>
        <%
            request.setCharacterEncoding("UTF-8");
            String nomejer = request.getParameter("nomejer");
            String nomsold = request.getParameter("nomsold");
        %>
        <h3 id="listado">
            <%
                out.print(nomsold.toLowerCase());
            %>
        </h3>
        <div id="ejercito">
            <%
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
                <div id="ficha">
                    <table>
                        <tr>
                            <th>codigo</th>
                            <td>
                        <%
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestesImperio", "root", "root");
                            Statement s = conexion.createStatement();
                            ResultSet listado = s.executeQuery ("SELECT * FROM SOLDADOS WHERE NOMEJER='" + nomejer + "' AND NOMSOLD='" + nomsold + "'");
                            listado.next();
                            out.print(listado.getString("CODSOLDADO"));
                        %>
                            </td>
                        </tr>
                        <tr>
                            <th>nombre</th>
                            <td>
                        <%
                            out.print(listado.getString("NOMSOLD").toLowerCase());
                        %>
                            </td>
                        </tr>
                        </tr>
                        <tr>
                            <th>experiencia</th>
                            <td>
                        <%
                            out.print(listado.getString("EXPERSOLD"));
                        %>
                            </td>
                        </tr>
                        <tr>
                            <th>rango</th>
                            <td>
                        <%
                            out.print(listado.getString("RANGO").toLowerCase());
                        %>
                            </td>
                        </tr>
                        <tr>
                            <th>percepción</th>
                            <td>
                        <%
                            out.print(listado.getString("PERCEPCION"));
                        %>
                            </td>
                        </tr>
                        <tr>
                            <th>técnica</th>
                            <td>
                        <%
                            out.print(listado.getString("TECNICA"));
                        %>
                            </td>
                        </tr>
                        <tr>
                            <th>mecánica</th>
                            <td>
                        <%
                            out.print(listado.getString("MECANICA"));
                        %>
                            </td>
                        </tr>
                        <tr>
                            <th>fortaleza</th>
                            <td>
                        <%
                            out.print(listado.getString("FORTALEZA"));
                        %>
                            </td>
                        </tr>
                        <tr>
                            <th>destreza</th>
                            <td>
                        <%
                            out.print(listado.getString("DESTREZA"));
                        %>
                            </td>
                        </tr>
                        <tr>
                            <th>conocimiento</th>
                            <td>
                        <%
                            out.print(listado.getString("CONOCIMIENTO"));
                        %>
                            </td>
                        </tr>
                        <tr>
                            <th>monedas</th>
                            <td>
                        <%
                            out.print(listado.getString("MONEDAS"));
                            conexion.close();
                        %>
                            </td>
                        </tr>
                    </table>
            </div>
            <footer>
            <h6>E.F Megasupercorporation</h6>
            </footer>
            <img src="../imagenes/halcon.png" width="250px" id="halcon">
    </body>
</html>

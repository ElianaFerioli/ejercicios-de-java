<%-- 
    Document   : modificaexitosa
    Created on : 22-may-2016, 19:04:27
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
            <form action="modifica.jsp" method="post">
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
        <form action="modificacionexitosa.jsp" method="post">
            <div id="modificacion">
                    <table>
                        <tr>
                            <th>codigo</th>
                            <td>
                        <%
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestesImperio", "root", "root");
                            Statement s = conexion.createStatement();
                            String nomsold = request.getParameter("nomsold");
                            ResultSet listado = s.executeQuery ("SELECT * FROM SOLDADOS WHERE NOMEJER='" + nomejer + "' AND NOMSOLD='" + nomsold + "'");
                            listado.next();
                        %>
                            <input type="number" name="CODSOLDADO" value="<% out.print(listado.getString("CODSOLDADO").toLowerCase()); %>"/>
                            </td>
                        </tr>
                        <tr>
                            <th>nombre</th>
                            <td>
                                <input type="text" name="NOMSOLD" value="<% out.print(listado.getString("NOMSOLD").toLowerCase()); %>"/>
                            </td>
                        </tr>
                        <tr>
                            <th>experiencia</th>
                            <td>
                                <input type="number" name="EXPERSOLD" value="<% out.print(listado.getString("EXPERSOLD").toLowerCase()); %>"/>
                            </td>
                        </tr>
                        <tr>
                            <th>rango</th>
                            <td>
                                <select name="RANGO">
                                    <%
                                        String rangosold = listado.getString("RANGO");
                                        out.print(rangosold);
                                        if(rangosold.equals("APRENDIZ")){
                                            out.print("<option value=\"APRENDIZ\" selected>Aprendiz</option>"
                                                    + "<option value=\"SOLDADO RASO\">Soldado raso</option>"
                                                    + "<option value=\"PADAWAN\">Joven Padawan</option>"
                                                    +"<option value=\"COMANDANTE\">Comandante</option>"
                                                    +"<option value=\"MAESTRO JEDI\">Maestro jedi</option>");
                                        }
                                        if(rangosold.equals("SOLDADO RASO")){
                                            out.print("<option value=\"SOLDADO RASO\" selected>Soldado raso</option>"
                                                    +"<option value=\"APRENDIZ\">Aprendiz</option>"
                                                    + "<option value=\"PADAWAN\">Joven Padawan</option>"
                                                    +"<option value=\"COMANDANTE\">Comandante</option>"
                                                    +"<option value=\"MAESTRO JEDI\">Maestro jedi</option>");
                                        }
                                        if(rangosold.equals("PADAWAN")){
                                            out.print("<option value=\"PADAWAN\" selected>Padawan</option>"
                                                    +"<option value=\"APRENDIZ\">Aprendiz</option>"
                                                    + "<option value=\"SOLDADO RASO\">Soldado raso</option>"
                                                    +"<option value=\"COMANDANTE\">Comandante</option>"
                                                    +"<option value=\"MAESTRO JEDI\">Maestro jedi</option>");
                                        }
                                        if(rangosold.equals("COMANDANTE")){
                                            out.print("<option value=\"COMANDANTE\" selected>Comandante</option>"
                                                    +"<option value=\"APRENDIZ\">Aprendiz</option>"
                                                    + "<option value=\"SOLDADO RASO\">Soldado raso</option>"
                                                    + "<option value=\"PADAWAN\">Joven Padawan</option>"
                                                    +"<option value=\"MAESTRO JEDI\">Maestro jedi</option>");
                                        }
                                        if(rangosold.equals("MAESTRO JEDI")){
                                            out.print("<option value=\"MAESTRO JEDI\" selected>Maestro Jedi</option>"
                                                    +"<option value=\"APRENDIZ\">Aprendiz</option>"
                                                    + "<option value=\"SOLDADO RASO\">Soldado raso</option>"
                                                    + "<option value=\"PADAWAN\">Joven Padawan</option>"
                                                    + "<option value=\"COMANDANTE\">Comandante</option>");
                                        }
                                    %>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <th>percepción</th>
                            <td>
                                <input type="number" name="PERCEPCION" value="<% out.print(listado.getString("PERCEPCION").toLowerCase()); %>"/>
                            </td>
                        </tr>
                        <tr>
                            <th>técnica</th>
                            <td>
                                <input type="number" name="TECNICA" value="<% out.print(listado.getString("TECNICA").toLowerCase()); %>"/>
                            </td>
                        </tr>
                        <tr>
                            <th>mecánica</th>
                            <td>
                                <input type="number" name="MECANICA" value="<% out.print(listado.getString("MECANICA").toLowerCase()); %>"/>
                            </td>
                        </tr>
                        <tr>
                            <th>fortaleza</th>
                            <td>
                                <input type="number" name="FORTALEZA" value="<% out.print(listado.getString("FORTALEZA").toLowerCase()); %>"/>
                            </td>
                        </tr>
                        <tr>
                            <th>destreza</th>
                            <td>
                                <input type="number" name="DESTREZA" value="<% out.print(listado.getString("DESTREZA").toLowerCase()); %>"/>
                            </td>
                        </tr>
                        <tr>
                            <th>conocimiento</th>
                            <td>
                                <input type="number" name="CONOCIMIENTO" value="<% out.print(listado.getString("CONOCIMIENTO").toLowerCase()); %>"/>
                            </td>
                        </tr>
                        <tr>
                            <th>monedas</th>
                            <td>
                                <input type="number" name="MONEDAS" value="<% out.print(listado.getString("MONEDAS").toLowerCase()); %>"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>"/>
                                <input type="hidden" name="codsoldado" value="<% out.print(listado.getString("CODSOLDADO")); %>"/>
                                <input type="hidden" name="nomsold" value="<% out.print(listado.getString("NOMSOLD")); %>"/>
                                <input type="submit" name="ok" value="Modificar"/>
                            </td>
                        </tr>
                    </table>
            </div>
        </form>
        <footer>
            <h6>E.F Megasupercorporation</h6>
            <a id="volver" href="../index.jsp">cambia de ejército</a>
        </footer>
        <img src="../imagenes/halcon.png" width="250px" id="halcon">
</html>

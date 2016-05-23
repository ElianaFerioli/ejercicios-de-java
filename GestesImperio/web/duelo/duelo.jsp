<%-- 
    Document   : duelo
    Created on : 23-may-2016, 12:09:45
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
            <aside id="duelo">
            <form action="dueloexitoso.jsp" method="post">
                <input type="hidden" name="nomejer" value="<% out.print(nomejer); %>">
                <h3>¿qué soldado va a luchar?</h3>
                <select name="codsoldado">
                <option selected disabled required>--- Elige el soldado ---</option>
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestesImperio", "root", "root");
                    Statement s = conexion.createStatement();
                    ResultSet listado = s.executeQuery ("SELECT NOMSOLD, CODSOLDADO FROM SOLDADOS WHERE NOMEJER=\"" + nomejer + "\"");
                    while (listado.next()) {
                        String nomsold = listado.getString("NOMSOLD");
                        String codsoldado = listado.getString("CODSOLDADO");
                        out.print("<option value=\"" + codsoldado +"\">");
                        out.print(nomsold);
                        out.print("</option>");
                    }
                %>
                </select>
                <h3>¿contra quien?</h3>
                <select name="contrario">
                <option selected disabled required>--- Elige el soldado ---</option>
                <%
                    String contrariosUno = "";
                    String contrariosDos = "";
                    if((nomejer.equals("REBELDES"))||(nomejer.equals("JEDIS"))){
                        contrariosUno = "IMPERIO";
                        contrariosDos = "CLONES";
                    }
                    if((nomejer.equals("IMPERIO"))||(nomejer.equals("CLONES"))){
                        contrariosUno = "REBELDES";
                        contrariosDos = "JEDIS";
                    }
                    listado = s.executeQuery ("SELECT NOMSOLD, CODSOLDADO FROM SOLDADOS WHERE NOMEJER=\"" + contrariosUno + "\"");
                    while (listado.next()) {
                        String nomsold = listado.getString("NOMSOLD");
                        String codsoldado = listado.getString("CODSOLDADO");
                        out.print("<option value=\"" + codsoldado +"\">");
                        out.print(nomsold);
                        out.print("</option>");
                    }
                    listado = s.executeQuery ("SELECT NOMSOLD, CODSOLDADO FROM SOLDADOS WHERE NOMEJER=\"" + contrariosDos + "\"");
                    while (listado.next()) {
                        String nomsold = listado.getString("NOMSOLD");
                        String codsoldado = listado.getString("CODSOLDADO");
                        out.print("<option value=\"" + codsoldado +"\">");
                        out.print(nomsold);
                        out.print("</option>");
                    }
                    conexion.close();
                %>
                </select>
                <br>
                <input type="submit" name="ok" value="que comience el duelo">
            </form>
        </aside>
            <footer>
            <h6>E.F Megasupercorporation</h6>
            <a id="volver" href="../index.jsp">cambia de ejército</a>
            </footer>
            <img src="../imagenes/halcon.png" width="250px" id="halcon">
    </body>
</html>
</html>

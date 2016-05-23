<%-- 
    Document   : altaexitosa
    Created on : 20-may-2016, 17:22:53
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
        <h1>Soldado dado de alta<h1>
        <h3 id="altaexitosa">uno más para la lucha</h3>
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
                    //Recoge el nombre y el rango
                    String rango = request.getParameter("rango");
                    //Determina aleatoriamente las habilidades y con ellas genera la experiencia
                    int destreza = (int)(Math.random()*11);
                    int tecnica = (int)(Math.random()*11);
                    int mecanica = (int)(Math.random()*11);
                    int fortaleza = (int)(Math.random()*11);
                    int percepcion = (int)(Math.random()*11);
                    int conocimiento = (int)(Math.random()*11);
                    //Le da un valor al rango para calcular la experiencia
                    int r = 0;
                    if(rango.equals("APRENDIZ")){
                        r = 10;
                    }
                    if(rango.equals("PADAWAN")){
                        r = 12;
                    }
                    if(rango.equals("SOLDADO RASO")){
                        r = 12;
                    }
                    if(rango.equals("COMANDANTE")){
                        r = 15;
                    }
                    if(rango.equals("MAESTRO JEDI")){
                        r = 20;
                    }
                    int experiencia = (destreza + tecnica + mecanica + fortaleza + percepcion + conocimiento) * r;            
                    //Añade el soldado a la base de datos
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestesImperio", "root", "root");
                    Statement s = conexion.createStatement();
                    request.setCharacterEncoding("UTF-8");
                    String insercion = "INSERT INTO SOLDADOS (NOMEJER, NOMSOLD, EXPERSOLD, DESTREZA, TECNICA, MECANICA, FORTALEZA, PERCEPCION, CONOCIMIENTO, RANGO) VALUES ('" 
                                       + request.getParameter("nomejer")
                                       + "', '" + request.getParameter("nomsold")
                                       + "', " + experiencia
                                       + ", " + destreza
                                       + ", " + tecnica
                                       + ", " + mecanica
                                       + ", " + fortaleza
                                       + ", " + percepcion 
                                       + ", " + conocimiento
                                       + ", '" + rango + "')";
                    s.execute(insercion);         
                    conexion.close();
                %>            
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
        <footer>
                <h6>E.F Megasupercorporation</h6>
                <a id="volver" href="../index.jsp">cambia de ejército</a>
        </footer>
        <img src="../imagenes/halcon.png" width="250px" id="halcon">
    </body>
</html>

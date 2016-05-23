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
            <aside id="dueloexitoso">
                <%
                    int codsoldado = Integer.parseInt(request.getParameter("codsoldado"));
                    int contrario = Integer.parseInt(request.getParameter("contrario"));
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestesImperio", "root", "root");
                    Statement s = conexion.createStatement();
                    ResultSet listado = s.executeQuery ("SELECT NOMSOLD, NOMEJER, EXPERSOLD FROM SOLDADOS WHERE CODSOLDADO=\"" + contrario + "\"");
                    listado.next();
                    String nomsoldcontrario = listado.getString("NOMSOLD");
                    String nomejercontrario = listado.getString("NOMEJER");
                    int expersoldcontrario = Integer.parseInt(listado.getString("EXPERSOLD"));
                    listado = s.executeQuery ("SELECT NOMSOLD, NOMEJER, EXPERSOLD FROM SOLDADOS WHERE CODSOLDADO=\"" + codsoldado + "\"");
                    listado.next();
                    String nomsoldmio = listado.getString("NOMSOLD");
                    String nomejermio = listado.getString("NOMEJER");
                    int expersoldmio = Integer.parseInt(listado.getString("EXPERSOLD"));
                    //Elige el modificador del que tenga más experiencia
                    int modificadorContrario = 0;
                    int modificadorMio= 0;
                    if(expersoldcontrario>expersoldmio){
                        modificadorContrario = (expersoldcontrario-expersoldmio)/100;
                    } else {
                        modificadorMio = (expersoldmio-expersoldcontrario)/100;
                    }
                    //crea los dados en base  a la experiencia
                    int dadoContrario = (expersoldcontrario/100) + modificadorContrario;
                    int dadoMio = (expersoldmio/100) + modificadorMio;
                    
                %>
                <table>
                    <tr>
                        <th>daño<br><% out.print(nomsoldmio);%></th>
                        <th>asalto</th>
                        <th>daño<br><% out.print(nomsoldcontrario);%></th>
                    </tr>
                    <%
                        //realiza las tiradas aleatorias y calcula el total
                        int totalMio = 0;
                        int totalContrario = 0;
                        for(int x = 1; x <= 5; x++){
                            out.print("<tr>");
                                for(int i = 0; i < 3; i++){
                                    int tiradaMia = (int)(Math.random()*dadoMio);
                                    int tiradaContraria = (int)(Math.random()*dadoContrario);
                                    if( i == 0){
                                        out.print("<td>");
                                        out.print(tiradaMia);
                                        out.print("</td>");
                                    } else if (i == 1) {
                                        out.print("<td class=\"asalto\">");
                                        out.print(x);
                                        out.print("</td>");
                                    } else if (i == 2){
                                        out.print("<td>");
                                        out.print(tiradaContraria);
                                        out.print("</td>");
                                    }
                                    if(tiradaMia>tiradaContraria) {
                                        totalMio++;
                                    } else {
                                        totalContrario++;
                                    }
                                }
                            out.print("</tr>");
                        }
                        String ganador = " ";
                        int codganador = 0;
                            if(totalContrario>totalMio){
                                ganador = nomsoldcontrario;
                                codganador = contrario;
                            } else {
                                ganador = nomsoldmio;
                                codganador = codsoldado;
                            }
                    %>
                </table>
                <div id="ganadorduelo">
                    <h4>El ganador es: <% out.print(ganador); %></h4>
                    <h5><% out.print(ganador); %> se lleva 100 monedas galácticas</h5>
                </div>
                    <%
                        String update = "UPDATE SOLDADOS SET "
                                   + " MONEDAS= MONEDAS +" + 100
                                   + " WHERE CODSOLDADO=" + codsoldado;
                        s.execute(update);
                    %>
        </aside>
            <footer>
            <h6>E.F Megasupercorporation</h6>
            <a id="volver" href="../index.jsp">cambia de ejército</a>
            </footer>
            <img src="../imagenes/halcon.png" width="250px" id="halcon">
    </body>

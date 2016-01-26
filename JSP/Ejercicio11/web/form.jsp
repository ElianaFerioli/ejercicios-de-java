<%-- 
    Document   : form
    Created on : 25-ene-2016, 11:17:15
    Author     : eliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <%
                String mes = request.getParameter("mes").toLowerCase();
                String dia = request.getParameter("dia").toLowerCase();
                String frase = request.getParameter("frase").toLowerCase();
                int ano = Integer.parseInt(request.getParameter("ano"));
                int numDia = 0;
                int contador = 1;

                if(dia.equals("lunes")) {
                    numDia = 1;
                }
                if(dia.equals("martes")) {
                    numDia = 2;
                }
                if(dia.equals("miercoles")) {
                    numDia = 3;
                }
                if(dia.equals("jueves")) {
                    numDia = 4;
                }
                if(dia.equals("viernes")) {
                    numDia = 5;
                }
                if(dia.equals("sabado")) {
                    numDia = 6;
                }
                if(dia.equals("domingo")) {
                    numDia = 7;
                }


                int diasMes = 0;
                if ((mes.equals("enero"))||(mes.equals("marzo"))||(mes.equals("mayo"))||(mes.equals("julio"))||(mes.equals("agosto"))||(mes.equals("octubre"))||(mes.equals("diciembre"))) {
                    diasMes = 31;
                }
                if ((mes.equals("abril"))||(mes.equals("junio"))||(mes.equals("septiembre"))||(mes.equals("noviembre"))) {
                    diasMes = 30;
                }
                if((mes.equals("febrero"))) {
                    diasMes = 28;
                }

                out.print("<h1>" + frase + "</h1>");
                out.print("<table>");
                        out.print("<tr>");
                            out.print("<th>");
                            out.print("Lunes");
                            out.print("</th>");
                            out.print("<th>");
                            out.print("Martes");
                            out.print("</th>");
                            out.print("<th>");
                            out.print("Miercoles");
                            out.print("</th>");
                            out.print("<th>");
                            out.print("Jueves");
                            out.print("</th>");
                            out.print("<th>");
                            out.print("Viernes");
                            out.print("</th>");
                            out.print("<th>");
                            out.print("Sábado");
                            out.print("</th>");
                            out.print("<th>");
                            out.print("Domingo");
                            out.print("</th>");
                        out.print("</tr>");
                        for(int x = 1; x <= 5; x++) {
                            out.print("<tr>");
                            for(int i = 1; i <= 7; i++) {
                                out.print("<td>");
                                if ((x==1)&&(i==numDia)){
                                    out.print(contador);
                                    contador++;
                                } else if ((contador > 1 )&&(contador <= diasMes)){
                                    out.print(contador);
                                    contador++;
                                }
                                out.print("</td>");

                            }
                            out.print("</tr>");
                                                        
                        }
                        if(contador <= diasMes) {
                                out.print("<tr>");
                            for(int i = 1; i <= 7; i++) {
                                out.print("<td>");
                                if(contador <= diasMes) {
                                    out.print(contador);
                                }
                                contador++;
                                out.print("</td>");                                
                            }
                            out.print("</tr>");
                        }                            
                out.print("</table>");
            %>
        </div>

    </body>
</html>

<%-- 
    Document   : form
    Created on : 21-ene-2016, 10:14:06
    Author     : eliana
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div id="jsp">
            <%
                DecimalFormat formato = new DecimalFormat("0.00");
                String accion = request.getParameter("conversor");
                double resultado = 0;
                boolean esPesetas = false;
                boolean esEuros = false;

                if(accion.equals("pesetaEuros")) {
                    double pesetas = Double.parseDouble(request.getParameter("cantidad"));
                    resultado = pesetas / 166.386;
                    esEuros = true;

                } else if (accion.equals("eurosPesetas")) {
                    double euros = Double.parseDouble(request.getParameter("cantidad"));
                    resultado = euros * 166.386;
                    esPesetas = true;
                }
                if(esEuros) {
                    out.print("La cantidad de euros es: ");
                    out.print(formato.format(resultado));
                } else {
                    out.print("La cantidad de pesetas es: ");
                    out.print(formato.format(resultado));
                }
            %>
        <div>
    </body>
</html>

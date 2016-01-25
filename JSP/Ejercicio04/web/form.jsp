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
        <title>JSP Page</title>
    </head>
    <body>
        La nota media es:
        <%
            double notaUno = Double.parseDouble(request.getParameter("notaUno"));
            double notaDos = Double.parseDouble(request.getParameter("notaDos"));
            double notaTres = Double.parseDouble((request.getParameter("notaTres")));
            double resultado = (notaUno + notaDos + notaTres) / 3;
            DecimalFormat formato = new DecimalFormat("0.00");
            out.print(formato.format(resultado)); 
        %>
    </body>
</html>

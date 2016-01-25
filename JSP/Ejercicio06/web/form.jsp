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
        La cantidad de euros es:
        <%
            double pesetas = Double.parseDouble(request.getParameter("pesetas"));
            double resultado = pesetas / 166.386;
            DecimalFormat formato = new DecimalFormat("0.00");
            out.print(formato.format(resultado)); 
        %>
    </body>
</html>



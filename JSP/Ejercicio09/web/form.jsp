<%-- 
    Document   : form
    Created on : 23-ene-2016, 11:29:53
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
        <div id="form">
            <%
                int altura = Integer.parseInt(request.getParameter("num"));
                int espacios = altura - 1;
                int caracteres = 1;

                for (int i = 1; i <= altura; i++) {    
                    //Pinta espacios
                    for(int x = 0; x <= espacios; x++) {
                        out.print(" ");
                    }
                    espacios--;
                    //Pinta caracteres
                    for(int x = 1; x <= caracteres; x++) {
                        out.print("<img src=\"./img/ladrillo.jpg\">");
                    }
                    caracteres = caracteres + 2;
                    out.println("<br>");
                }
            %>
        </div>
    </body>
</html>

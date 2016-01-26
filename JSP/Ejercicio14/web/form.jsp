<%-- 
    Document   : form
    Created on : 25-ene-2016, 19:01:01
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
                int x = Integer.parseInt(request.getParameter("num"));
                int num = 0;
                int serie1 = 1;
                int serie2 = 0;
                int serie3 = serie1 + serie2;
                int cardinal = 3;

                if (x > 0) {
                    do {
                        if (num == 0) {
                            out.println("Este es el 1º término: " + num);
                            out.print("<br>");
                            serie2 = num;
                            num++;
                        }
                        if (num == 1) {
                            out.println("Este es el 2º término: " + num);
                            out.print("<br>");
                            serie1 = num;
                            num++;
                        }
                        if (num >= 2) {
                            out.println("Este es el " + cardinal + "º término: " + serie3);
                            out.print("<br>");
                            serie2 = serie1;
                            serie1 = serie3;
                            serie3 = serie1 + serie2;
                            num++;
                            cardinal++;
                        }
                    } while ((num < x) && (num >= 0));
                } else {
                    out.println("No es posible mostrar el término de la serie Fibonacci \npara el número introducido");
                    out.print("<br>");
                }
            %>
        </div>
    </body>
</html>

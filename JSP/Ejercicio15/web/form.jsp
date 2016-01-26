<%-- 
    Document   : form
    Created on : 25-ene-2016, 19:25:21
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
        <form action="form.jsp" method="post" validate>
            <input type="submit" name="ok" value="Generar números aleatorios">
        </form>
        <br>
        <br>
        <br>
        <div>
            <%

                for(int x = 1; x <= 100; x++) {
                    int num = (int)(Math.random()* 201);
                    int contador = 0;
                    for(int i = 1; i <= num; i++) {
                        int resto = num % i;
                        if (resto == 0) {
                            contador++;
                        }
                    }
                    if(contador <= 2) {
                        out.print("<span>");
                        out.print(num);
                        out.print("</span>, ");
                    } else {
                        if(x == 100) {
                            out.print(num + ".");
                        } else {
                        out.print(num + ", ");
                        }
                    }
                }
            %>
        </div>
    </body>
</html>

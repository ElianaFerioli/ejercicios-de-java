<%-- 
    Document   : form
    Created on : 26-ene-2016, 18:52:51
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
        <h1>Tu suerte es...</h1>
        <%
            int imagen = (int)(Math.random()*3) + 1;
            double dinero = Double.parseDouble(request.getParameter("dinero"));
            if(imagen==1) {
                out.print("<img src=\"./img/calavera.jpg\" alt=\"calavera\" width=\"300\">");
                dinero = 0;
                out.print("<br>Lo siento, lo has perdido todo.");
            }
            if(imagen==2) {
                out.print("<img src=\"./img/limon.jpg\" alt=\"limno\" width=\"300\">");
                dinero = dinero / 2.0;
                out.print("<br>Te quedas con la mitad de tu dinero.");
            }
            if(imagen==3) {
                out.print("<img src=\"./img/gato.jpg\" alt=\"gato\" width=\"300\">");
                dinero = dinero * 2.0;
                out.print("<br>Enhorabuena! Has conseguido el doble!");
            }
            
             out.print("Tienes " + dinero + " euros.");
             out.print("<br>¿Qué quieres hacer ahora?");
            
        %>
        <%
        if (dinero != 0) { 
        %>
        <form action="form.jsp" method="post">
                <input type="hidden" name="dinero" value="<%= dinero %>">
                <input type="submit" name="ok" value="Volver a apostar!">
        </form>
        <form method="post" action="form2.jsp">
                <br>
                <input type="hidden" name="dinero" value="<%= dinero %>">
                <input type="submit" name="ok" value="Retirarme">
        </form>
        <%
            } else {
        %>
          <form method="post" action="index.jsp">
            <input type="submit" value="Volver a jugar">
          </form>
        <%
            }     
        %>
        </div>
    </body>
</html>

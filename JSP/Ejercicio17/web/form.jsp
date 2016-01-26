<%-- 
    Document   : index
    Created on : 25-ene-2016, 20:23:30
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
            <h1 style="text-align:center">Configura tu Vespa</h1>
            <form action="form.jsp" method="post" validate>
                Elige el color de la vespa
                <br>
                <select name="color">
                    <option value="verde">Verde manzana</option>
                    <option value="marfil">Marfil</option>
                    <option value="blanco">Blanco</option>
                    <option value="amarillo">Amarillo</option>
                </select>
                <br>
                <br>
                <br>
                Elige el color de la tapicería
                <br>
                <select name="tapiceria">
                    <option value="negro">Negro</option>
                    <option value="marron">Marrón</option>
                </select>
                <br>
                <br>
                <br>
                <input type="submit" name="ok" value="Ver resultado">                
            </form>
            <br>
            <br>
            <%
                String color = request.getParameter("color");
                String tapiceria = request.getParameter("tapiceria");
                if((color.equals("verde"))&&(tapiceria.equals("negro"))) {
                    out.print("<img alt=\"verdeynegro\" src=\"./img/image1.jpg\">");
                }
                if((color.equals("amarillo"))&&(tapiceria.equals("negro"))) {
                    out.print("<img alt=\"amarilloynegro\" src=\"./img/image2.jpg\">");
                }
                if((color.equals("marfil"))&&(tapiceria.equals("negro"))) {
                    out.print("<img alt=\"marfilynegro\" src=\"./img/image3.jpg\">");
                }
                if((color.equals("blanco"))&&(tapiceria.equals("negro"))) {
                    out.print("<img alt=\"blancoynegro\" src=\"./img/image8.jpg\">");
                }
                if((color.equals("verde"))&&(tapiceria.equals("marron"))) {
                    out.print("<img alt=\"verdeymarron\" src=\"./img/image4.jpg\">");
                }
                if((color.equals("amarillo"))&&(tapiceria.equals("marron"))) {
                    out.print("<img alt=\"amarilloymarron\" src=\"./img/image5.jpg\">");
                }
                if((color.equals("marfil"))&&(tapiceria.equals("marron"))) {
                    out.print("<img alt=\"marfilymarron\" src=\"./img/image6.jpg\">");
                }
                if((color.equals("blanco"))&&(tapiceria.equals("marron"))) {
                    out.print("<img alt=\"blancoymarron\" src=\"./img/image7.jpg\">");
                }  
            %>
        </div>
    </body>
</html>

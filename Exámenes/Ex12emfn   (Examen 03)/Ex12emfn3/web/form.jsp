<%-- 
    Document   : form
    Created on : 02-feb-2016, 9:56:44
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
            <h1 style="text-align:center">Configura tu cocina</h1>
            <form action="form.jsp" method="post" validate>
                Elige el acabado de la cocina
                <br>
                <select name="acabado">
                    <option value="none" disabled selected>Acabado...</option>
                    <option value="madera">Madera</option>
                    <option value="naranja">Naranja</option>
                    <option value="verde">Verde lima</option>
                </select>
                <br>
                Elige el tipo de asa
                <br>
                <select name="asa">
                    <option value="none" disabled selected>Tipo de asa...</option>
                    <option value="larga">Larga</option>
                    <option value="corta">Corta</option>
                </select>
                <br>
                <br>
                <select name="electrodomesticos">
                    <option value="none" disabled selected>Electrodomésticos...</option>
                    <option value="comprar">Comprar</option>
                    <option value="nocomprar">No comprar</option>
                </select>
                <br>
                <br>
                <input type="submit" name="ok" value="Ver resultado">
                <br>
                <br>
            </form>
            <%
                String acabado = request.getParameter("acabado");
                String asa = request.getParameter("asa");
                String electrodomesticos = request.getParameter("electrodomesticos");
                if((acabado.equals("madera"))&&(asa.equals("larga"))) {
                    out.print("<img alt=\"verdeynegro\" src=\"./img/maderalargo.jpg\">");
                }
                if((acabado.equals("naranja"))&&(asa.equals("larga"))) {
                    out.print("<img alt=\"verdeynegro\" src=\"./img/naranjalargo.jpg\">");
                }
                if((acabado.equals("verde"))&&(asa.equals("larga"))) {
                    out.print("<img alt=\"verdeynegro\" src=\"./img/verdelargo.jpg\">");
                }
                if((acabado.equals("madera"))&&(asa.equals("corta"))) {
                    out.print("<img alt=\"verdeynegro\" src=\"./img/maderacorto.jpg\">");
                }
                if((acabado.equals("naranja"))&&(asa.equals("corta"))) {
                    out.print("<img alt=\"verdeynegro\" src=\"./img/naranjacorto.jpg\">");
                }
                if((acabado.equals("verde"))&&(asa.equals("corta"))) {
                    out.print("<img alt=\"verdeynegro\" src=\"./img/verdecorto.jpg\">");
                }
                
                int precioBase = 0;
                int precioElectrodomesticos = 0;
                if(acabado.equals("madera")) {
                    precioBase = 9000;
                } else {
                    precioBase = 8000;
                }
                if(electrodomesticos.equals("comprar")) {
                    precioElectrodomesticos = 4500;
                }
            %>
            <br>
            <br>
            <table>
                <tr>
                    <td>Precio Base</td>
                    <td><%=precioBase %></td>
                </tr>
                <tr>
                    <td>Precio Electrodomésticos</td>
                    <td><%=precioElectrodomesticos %></td>
                </tr>
                <tr>
                    <td>IVA</td>
                    <td><%=((precioElectrodomesticos + precioBase)*0.21)  %></td>
                </tr>
                <tr>
                    <td>Total</td>
                    <td><%=((precioElectrodomesticos + precioBase)*0.21) + (precioElectrodomesticos + precioBase)  %></td>
                </tr>
            </table>
        </div>
    </body>
</html>

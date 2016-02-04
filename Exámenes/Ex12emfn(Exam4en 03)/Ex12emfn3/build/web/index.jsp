<%-- 
    Un fabricante de cocinas nos ha pedido hacer un configurador. El usuario podrá elegir el acabado:
madera, naranja o verde lima; así como el tipo de asa que pondrá a los muebles: larga o corta. El
usuario también podrá marcar una casilla (por ej. un checkbox, una lista desplegable o un radio-
button) en la que indicará si quiere comprar también los electrodomésticos. Según los datos
introducidos, el programa mostrará la imagen de la cocina (en la imagen siempre salen los
electrodomésticos aunque no se hayan pedido) y el precio bien desglosado. Los muebles de madera
cuestan 9000 euros, los muebles con acabado naranja o verde lima cuestan 8000 y los
electrodomésticos cuestan 4500 euros (recuerda que el usuario puede elegir si quiere o no quiere
electrodomésticos). Al precio de la cocina hay que sumarle el 21% de IVA.
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
        </div>
    </body>
</html>

<%-- 
    Document   : index
    Created on : 23-ene-2016, 12:53:13
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
        <h1>¿Cómo llevas el curso?</h1>
        <div id="index">
            <form action="form.jsp" method="post" validate>
                <h3>¿Qué es MV3?</h3>
                <input type="radio" name="pregUno" value="a">Una metodología<br>
                <input type="radio" name="pregUno" value="b">Un modelo<br>
                <input type="radio" name="pregUno" value="c">Es una metodología y un modelo<br>
                <h3>¿Es lo mismo "print" que "println"?</h3>
                <input type="radio" name="pregDos" value="a">Si<br>
                <input type="radio" name="pregDos" value="b">No<br>
                <input type="radio" name="pregDos" value="c">Depende del programa<br>
                <h3>¿Con qué tipo de relaciones NO se trabaja en DED?</h3>
                <input type="radio" name="pregTres" value="a">Binarias<br>
                <input type="radio" name="pregTres" value="b">Arias<br>
                <input type="radio" name="pregTres" value="c">N-arias<br>
                <h3>¿Cuál es la parte más importante de un ordenador?</h3>
                <input type="radio" name="pregCuatro" value="a">La carcasa<br>
                <input type="radio" name="pregCuatro" value="b">El disco duro<br>
                <input type="radio" name="pregCuatro" value="c">El procesador<br>
                <h3>¿Cuántas generaciones de ordenadores existen?</h3>
                <input type="radio" name="pregCinco" value="a">Cuatro<br>
                <input type="radio" name="pregCinco" value="b">Depende del autor del libro<br>
                <input type="radio" name="pregCinco" value="c">Cinco<br>
                <h3>¿Son las entrevistas un tipo de sesión de trabajo?</h3>
                <input type="radio" name="pregSeis" value="a">Si, pero solo las JAD y las JRP<br>
                <input type="radio" name="pregSeis" value="b">Si, todas ellas<br>
                <input type="radio" name="pregSeis" value="c">No<br>
                <h3>¿Qué tipo de herramienta es el MSVISIO?</h3>
                <input type="radio" name="pregSiete" value="a">Es un entorno de desarrollo<br>
                <input type="radio" name="pregSiete" value="b">Es un gestor de bases de datos<br>
                <input type="radio" name="pregSiete" value="c">Es una herramienta CASE<br>
                <h3>¿Puede existir una enferemedad profesional que no esté reconocida en el CEP?</h3>
                <input type="radio" name="pregOcho" value="a">Si, siempre que se demuestre que fue contraida en el trabajo<br>
                <input type="radio" name="pregOcho" value="b">No<br>
                <input type="radio" name="pregOcho" value="c">Depende del juez<br>
                <h3>¿Qué es HTML?</h3>
                <input type="radio" name="pregNueve" value="a">Un lenguaje de marcas<br>
                <input type="radio" name="pregNueve" value="b">Un lenguaje de programación<br>
                <input type="radio" name="pregNueve" value="c">Ambos<br>
                <h3>¿Qué se necesita para traducir un código HTML?</h3>
                <input type="radio" name="pregDiez" value="a">El validator<br>
                <input type="radio" name="pregDiez" value="b">Comprobarlo en el W3S<br>
                <input type="radio" name="pregDiez" value="c">Un explorador<br>
                <br><br><br>
                <input type="submit" name="OK" value="Comprobar resultados" id="boton">
            </form>
        </div>
    </body>
</html>

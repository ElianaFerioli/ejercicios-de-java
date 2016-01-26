<%-- 
    Transforma el test de infidelidad realizado anteriormente para consola en una aplicación
    web.
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
        <h1>Test de infidelidad</h1>
        <div id="index">
            <form action="form.jsp" method="post" validate>
                <h3>Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.</h3>
                <input type="radio" name="pregUno" value="v">Verdadero<br>
                <input type="radio" name="pregUno" value="f">Falso<br>
                <h3>Ha aumentado sus gastos de vestuario</h3>
                <input type="radio" name="pregDos" value="v">Verdadero<br>
                <input type="radio" name="pregDos" value="f">Falso<br>
                <h3>Ha perdido el interés que mostraba anteriormente por ti</h3>
                <input type="radio" name="pregTres" value="v">Verdadero<br>
                <input type="radio" name="pregTres" value="f">Falso<br>
                <h3>Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)</h3>
                <input type="radio" name="pregCuatro" value="v">Verdadero<br>
                <input type="radio" name="pregCuatro" value="f">Falso<br>
                <h3>No te deja que mires la agenda de su teléfono móvil</h3>
                <input type="radio" name="pregCinco" value="v">Verdadero<br>
                <input type="radio" name="pregCinco" value="f">Falso<br>
                <h3>A veces tiene llamadas que dice no querer contestar cuando estás tú delante</h3>
                <input type="radio" name="pregSeis" value="v">Verdadero<br>
                <input type="radio" name="pregSeis" value="f">Falso<br>
                <h3>Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a</h3>
                <input type="radio" name="pregSiete" value="v">Verdadero<br>
                <input type="radio" name="pregSiete" value="f">Falso<br>
                <h3>Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo</h3>
                <input type="radio" name="pregOcho" value="v">Verdadero<br>
                <input type="radio" name="pregOcho" value="f">Falso<br>
                <h3>Has notado que últimamente se perfuma más</h3>
                <input type="radio" name="pregNueve" value="v">Verdadero<br>
                <input type="radio" name="pregNueve" value="f">Falso<br>
                <h3>Se confunde y te dice que ha estado en sitios donde no ha ido contigo</h3>
                <input type="radio" name="pregDiez" value="v">Verdadero<br>
                <input type="radio" name="pregDiez" value="f">Falso<br>
                <br>
                <input type="submit" name="OK" value="Comprobar resultados" id="boton">
            </form>
        </div>
    </body>
</html>

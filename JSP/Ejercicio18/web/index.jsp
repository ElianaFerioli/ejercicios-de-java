<%-- 
    Crea la aplicación “El Trile”. Deben aparecer tres cubiletes por pantalla y el usuario deberá
    seleccionar uno de ellos. Para dicha selección se puede usar un formulario con radio-button,
    una lista desplegable, hacer clic en el cubilete o lo que resulte más fácil. Se levantarán
    los tres cubiletes y se verá si estaba o no la bolita dentro del que el usuario indicó, así
    mismo, se mostrará un mensaje diciendo “Lo siento, no has acertado” o “¡Enhorabuena!,
    has encontrado la bolita”. La probabilidad de encontrar la bolita es de 1/3.
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
        <h1>Descubre dónde está la bolita</h1>
        <img src="./img/vaso.jpg" alt="vaso">
        <img src="./img/vaso.jpg" alt="vaso">
        <img src="./img/vaso.jpg" alt="vaso">
        <br>
        <form action="form.jsp" method="post" validate>
            ¿Dónde crees que está?
            <br>
            <input type="radio" name="vaso" value="1">En el 1º vaso.<br>
            <input type="radio" name="vaso" value="2">En el 2º vaso.<br>
            <input type="radio" name="vaso" value="3">En el 3º vaso.<br>
            <br>
            <input type="submit" name="ok" value="Comprobar">            
        </form>
        </div>
    </body>
</html>

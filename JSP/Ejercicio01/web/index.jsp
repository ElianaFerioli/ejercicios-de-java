<!--
Crea una aplicación web en Java que muestre tu nombre y tus datos personales por pantalla.
La página principal debe ser un archivo con la extensión jsp . Comprueba que se lanzan
bien el servidor y el navegador web. Observa los mensajes que da el servidor. Fíjate en la
dirección que aparece en la barra de direcciones del navegador.
-->
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div id="text">
            <% 
               out.println("<h1>Eliana Mariel Ferioli N��ez</h1>");
               out.println("<h3>Avenida de Gandhi n�3</h3>");
               out.println("<h3>656337783</h3>");
               out.println("<h3>Desarrollo de aplicaciones WEB</h3>");
            %>
        </div>
    </body>
</html>

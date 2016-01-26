<%-- 
    Crea una aplicación que dibuje un tablero de ajedrez mediante una tabla HTML generada
con bucles usando JSP y que sitúe dentro del tablero un alfil y un caballo en posiciones
aleatorias. Las dos figuras no pueden estar colocadas en la misma casilla. Las filas y las
columnas del tablero deben estar etiquetadas correctamente.
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
            <%
                String [] letras = new String[8];
                letras[0] = "a";
                letras[1] = "b";
                letras[2] = "c";
                letras[3] = "d";
                letras[4] = "e";
                letras[5] = "f";
                letras[6] = "g";
                letras[7] = "h";
                //Genera las posiciones aleatorias del alfil y el caballo
                boolean esIgual = false;
                int icaballo = 0;
                int xcaballo = 0;
                int ialfil = 0;
                int xalfil = 0;
                do {
                    icaballo = (int)(Math.random() * 8) + + 2;
                    xcaballo = (int)(Math.random() * 8) + + 2;
                    ialfil = (int)(Math.random() * 8) + + 2;
                    xalfil = (int)(Math.random() * 8) + + 2;
                    if ((xalfil == xcaballo)&&(ialfil==icaballo)) {
                        esIgual = true;
                    }
                } while(esIgual);


                out.print("<table>");
                //Imprime la cabecera de las columnas
                for(int i = 1; i<= 9; i++) {
                    out.print("<tr>");
                    if(i==1) {
                        for(int x = 1; x <= 9; x++) {
                            if(x == 1) {
                               out.print("<th></th>"); 
                            } else {
                                out.print("<th>" + letras[x - 2] + "</th>");
                            }
                        } 
                    } else {
                        //IMprime la cabecera de las filas
                        for(int x = 1; x <= 9; x++) {
                            if (x == 1) {
                                out.print("<th>" + (i-1) + "</th>");
                            } else { //Si columna es par imprime las imagenes en blanco-negro
                                if((i == icaballo) && (x == xcaballo)) { //Se fija si coincide con alfil o caballo
                                    out.print("<td><img src=\"./img/caballo.jpg\" width=\"50\"></td>");
                                } else if ((i == ialfil) && (x == xalfil)) {
                                    out.print("<td><img src=\"./img/alfil.png\" width=\"50\"></td>");
                                } else {    //Pinta el tablero                     
                                    if((i%2)==0) {
                                        if((x%2)==0) {
                                            out.print("<td><img src=\"./img/blanco.jpg\" width=\"50\"></td>");
                                        } else {
                                            out.print("<td><img src=\"./img/negro.jpg\" width=\"50\"></td>");
                                        }
                                    } else { //Si columna es impar imprime las imagenes en negro-blanco
                                        if((x%2)==0) {
                                            out.print("<td><img src=\"./img/negro.jpg\" width=\"50\"></td>");
                                        } else {
                                            out.print("<td><img src=\"./img/blanco.jpg\" width=\"50\"></td>");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    out.print("</tr>");
                }
                out.print("</table>");
            %>
        </div>
    </body>
</html>

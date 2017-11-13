<%-- 
    Document   : eliminarCarga
    Created on : 02-11-2017, 19:03:26
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Asistente de Eliminacion de Carga</h1>
        <form action="servlet_eliminarCarga" method="post">
            <table border="1"> 

                <td>Ingrese Rut de la Carga:</td>               
                <td><input type="text" name="rut"/></td> 

                <td><input type="submit" value="Eliminar"></td>  
            </table>
        </form>
    </body>
</html>

<%-- 
    Document   : listarCargas
    Created on : 02-11-2017, 20:03:39
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
         <h1>Asistente de Cargas</h1>
        <form action="servlet_listarCarga" method="post">
            <table border="1"> 

                <td>Ingrese Rut del Empleado:</td>               
                <td><input type="text" name="rut"/></td> 

                <td><input type="submit" value="Listar"></td>  
            </table>
        </form>    </body>
</html>

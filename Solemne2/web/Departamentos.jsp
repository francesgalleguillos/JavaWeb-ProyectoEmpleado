<%-- 
    Document   : Departamentos
    Created on : 03-11-2017, 0:41:44
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
        <form action="servlet_Departamento" method="post">
        <h1>Seleccione el Departamento</h1>
        <td><select name="dpto"/>
            <option>Gerencia</option>
            <option>Recursos Humanos</option>
            </select></td>
         <td><input type="submit" value="Seleccionar"></td>  
        </form>
    </body>
</html>

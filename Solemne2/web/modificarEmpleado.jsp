<%-- 
    Document   : modificarEmpleado
    Created on : 01-11-2017, 18:53:23
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingrese datos a Modificar del Empleado</title>
    </head>
    <body>
        <h1>Asistente de Modificacion de Empleados</h1>
        <form action="servlet_modificarEmpleado" method="post">
            <table border="1"> 
                <tr>
                    <td>Ingrese Rut:</td>               
                    <td><input type="text" name="rut"/></td> 
                </tr>
                <tr>
                    <td>Ingrese Nombre :</td>                
                    <td><input type="text" name="nombre"/></td>
                </tr>
                <tr>
                    <td>Ingrese Cargo:</td>                
                    <td><select name="cargo"/>
                    <option>Operador</option>
                    <option>Supervisor</option>
                    </select></td>
                </tr>  
                <tr>
                    <td>Ingrese Direccion:</td>                
                    <td><input type="text" name="direccion"/></td>
                </tr>
                <tr>
                    <td>Ingrese Departamento:</td>                
                    <td><select name="dpto"/>
                    <option>Recursos Humanos</option>
                    <option>Gerencia</option>
                    </select></td>
                </tr>
                <tr>
                    <td>Ingrese Sueldo Base:</td>                
                    <td><input type="text" name="sbase"/></td>
                </tr> 
                <td><input type="submit" value="Modificar"></td>  
            </table>
        </form>
    </body>
</html>

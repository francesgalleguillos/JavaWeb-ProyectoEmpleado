<%-- 
    Document   : crearEmpleado
    Created on : 29-oct-2017, 20:19:03
    Author     : frances
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Asistente de Creación de Empleados</h1>
        <form action="servlet_crearEmpleado" method="post">
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
                <td><input type="submit" value="Guardar"></td>  
            </table>
        </form>
    </body>
</html>

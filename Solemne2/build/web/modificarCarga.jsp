<%-- 
    Document   : modificarCarga
    Created on : 02-11-2017, 19:16:33
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
        <h1>Asistente de Modificacion de Carga</h1>
        <form action="servlet_modificarCarga" method="post">
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
                    <td>Ingrese fecha de nacimiento:</td>                
                    <td><input type="text" name="fechanac"/></td>
                </tr>  
                <tr>
                    <td>Ingrese Genero:</td>                
                    <td><select name="genero"/>
                    <option>Femenino</option>
                    <option>Masculino</option>
                    </select></td>
                </tr>
                <tr>
                    <td>Ingrese Rut de Empleado:</td>                
                    <td><input type="text" name="rempleado"/></td>
                </tr>
                <tr>
                    <td>Ingrese Bono Escolar:</td>                
                    <td><select name="bescolar"/>
                    <option>Enseñanza Básica</option>
                    <option>Enseñanza Media</option>
                    <option>Enseñanza Superior</option>
                    </select></td>
                </tr> 
                <tr>
                    <td>Ingrese Bono de Navidad:</td>                
                    <td><select name="bnavidad"/>
                    <option>Si</option>
                    <option>No</option>
                    </select></td>
                </tr>
                <tr>
                    <td>Concentracion de Notas superior a 6,0:</td>                
                    <td><select name="nota"/>
                    <option>Si</option>
                    <option>No</option>
                    </select></td>
                </tr> 
                <td><input type="submit" value="Modificar"></td>  
            </table>
        </form>
    </body>
</html>

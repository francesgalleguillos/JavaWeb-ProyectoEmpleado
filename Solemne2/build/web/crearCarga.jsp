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
        <h1>Asistente de Creación de Carga</h1>
        <form action="Servlet_crearCarga" method="post">
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
                    <td>Ingrese Bono escolar:</td>                
                    <td><select name="bescolar"/>
                    <option>Basica</option>
                    <option>Media</option>
                    <option>Superior</option>
                    </select></td>
                </tr>
                <tr>
                    <td>Ingrese Bono navidad:</td>                
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
                 <tr>
                    <td>Ingrese rut empleado:</td>                
                    <td><input type="text" name="rempleado"/></td>
                </tr> 
                <td><input type="submit" value="Guardar"></td>  
            </table>
        </form>
    </body>
</html>

<%-- 
    Document   : Empleado
    Created on : 29-oct-2017, 20:12:40
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
        <table border="1" align="center"> 
            <tr>
                <h1>ELIJA UNA OPCION</h1>         
                
            </tr>
        </table> 
        <form  action ="crearEmpleado.jsp" method="post">            
            <td><input type="submit" value="Crear"></td>            
        </form> 
        <form  action ="eliminarEmpleado.jsp" method="post">            
            <td><input type="submit" value="Eliminar"></td>            
        </form> 
        <form  action ="modificarEmpleado.jsp" method="post">            
            <td><input type="submit" value="Modificar"></td>            
        </form> 
        <form  action ="servlet_listarEmpleado" method="post">            
            <td><input type="submit" value="Listar"></td>            
        </form> 
        


    </body>
</html>

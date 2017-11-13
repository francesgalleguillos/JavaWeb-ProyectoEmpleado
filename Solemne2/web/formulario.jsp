<%-- 
    Document   : formulario
    Created on : 29-oct-2017, 20:21:50
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
        <h1>Menú Principal</h1>
        <table border="1"> 
            <form  action ="Empleado.jsp" method="post">            
                <td><input type="submit" value="Mantencion Empleados"></td>            
            </form>  
            <form  action ="Carga.jsp" method="post">            
                <td><input type="submit" value="Mantencion Cargas"></td>            
            </form>
            <form  action ="Informes.jsp" method="post">            
                <td><input type="submit" value="Generacion de Informes"></td>            
            </form>            
        </table> 
    </body>
</html>

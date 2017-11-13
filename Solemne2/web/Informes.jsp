<%-- 
    Document   : Informes
    Created on : 02-11-2017, 23:27:16
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
        <h1>Menú de Informes</h1>
        <table border="1"> 
            <form  action ="servlet_Bonos" method="post">            
                <td><input type="submit" value="Informe General de Bonos"></td>            
            </form>  
            <form  action ="Departamentos.jsp" method="post">            
                <td><input type="submit" value="Bonos por Departamento"></td>            
            </form>                      
        </table> 
    </body>
</html>

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import modelo.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "servlet_eliminarEmpleado", urlPatterns = {"/servlet_eliminarEmpleado"})
public class servlet_eliminarEmpleado extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //MARCO TRABAJO
        String rut = request.getParameter("rut");
        

        Empleado empleado = new Empleado();
        empleado.setRutEmpleado(rut);
        try {
            empleado.eliminar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servlet_eliminarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        response.sendRedirect ("Empleado.jsp");
        //MARCO TRABAJO
        
        response.setContentType("text/html;charset=UTF-8");
        
        try(PrintWriter out=response.getWriter()){
            out.println("<table width='311' border='1'><tr><td colspan='2' bgcolor='#000099' "
        + "style='color:#FFFFFF'>Formulario</td></tr> "
        + "<tr><td width='165'>Rut</td><td width='130'>"+"12345"+"</td></tr>");  
            
            
        }
    }

   
   

}

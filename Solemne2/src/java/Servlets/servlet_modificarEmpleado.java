/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import modelo.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Empleado;


@WebServlet(name = "servlet_modificarEmpleado", urlPatterns = {"/servlet_modificarEmpleado"})
public class servlet_modificarEmpleado extends HttpServlet {

    
    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         //MARCO TRABAJO
        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String cargo = request.getParameter("cargo");
        String direccion = request.getParameter("direccion");
        String dpto = request.getParameter("dpto");
        float sbase = Float.parseFloat(request.getParameter("sbase"));

        Empleado empleado = new Empleado(rut, nombre, direccion, dpto, cargo, sbase);

        try {
            empleado.modificar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servlet_modificarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
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

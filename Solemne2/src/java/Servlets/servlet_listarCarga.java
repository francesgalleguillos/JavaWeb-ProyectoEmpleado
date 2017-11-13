/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Carga;
import modelo.Empleado;

@WebServlet(name = "servlet_listarCarga", urlPatterns = {"/servlet_listarCarga"})
public class servlet_listarCarga extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //MARCOTRABAJO
        String rut=request.getParameter("rut");
        Carga carga=new Carga();
        carga.setRutEmpleado(rut);
        ArrayList<Carga> listaCargas;
        try {
            listaCargas = carga.Listar();

            response.setContentType("text/html;charset=UTF-8");

            try (PrintWriter out = response.getWriter()) {

                out.println("<table width='311' border='1'><tr><td colspan='2' bgcolor='#000099' "
                        + "style='color:#FFFFFF'>Listado de Cargas por Empleado</td></tr> "
                        + "<tr><td width='300'>RUT CARGA</td><td width='130'>NOMBRE</td><td>FECHA DE NACIMIENTO</td><td>GENERO</td><td>RUT EMPLEADO</td><td>BONO ESCOLAR</td><td>BONO NAVIDAD</td></tr>");

                for (Carga m : listaCargas) {
                    System.out.println(m.getRutEmpleado());

                    out.println("<tr align='center'>");
                    out.println("<td>" + m.getRutCarga() + "</td>");
                    out.println("<td>" + m.getNombre() + "</td> ");
                    out.println("<td>" + m.getFechaNac() + "</td> ");
                    out.println("<td>" + m.getGenero() + "</td> ");
                    out.println("<td>" + m.getRutEmpleado() + "</td> ");
                    out.println("<td>" + m.getBonoescolar()+ "</td>");
                    out.println("<td>" + m.getBonoNavidad()+ "</td></tr> ");
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servlet_listarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.setContentType("text/html;charset=UTF-8");
        //MARCOTRABAJO
        
    }

   
    

}

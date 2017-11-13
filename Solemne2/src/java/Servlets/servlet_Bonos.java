/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;
import modelo.Informe;
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



@WebServlet(name = "servlet_Bonos", urlPatterns = {"/servlet_Bonos"})
public class servlet_Bonos extends HttpServlet {

    
     
   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //MARCOTRABAJO
        Informe inf = new Informe();
        ArrayList<Informe> listaInformes;
        try {
            listaInformes = inf.listaBonos();

            response.setContentType("text/html;charset=UTF-8");
            float acumbonoescolar=0;
            float acumbononavidad=0;
            try (PrintWriter out = response.getWriter()) {

                out.println("<table width='311' border='1'><tr><td colspan='2' bgcolor='#000099' "
                        + "style='color:#FFFFFF'>Listado de Bonos</td></tr> "
                        + "<tr><td width='300'>RUT</td><td width='130'>NOMBRE</td><td>RUT CARGA</td><td>NOMBRE CARGA</td><td>BONO ESCOLAR</td><td>BONO NAVIDAD</td></tr>");

                for (Informe m : listaInformes) {

                    out.println("<tr align='center'>");
                    out.println("<td>" + m.getRut_empleado() + "</td>");
                    out.println("<td>" + m.getNombre() + "</td> ");
                    out.println("<td>" + m.getRut_carga() + "</td> ");
                    out.println("<td>" + m.getNombrecarga() + "</td> ");
                    out.println("<td>" + m.getBono_escolar() + "</td> ");
                    out.println("<td>" + m.getBono_navidad() + "</td></tr> ");
                    
                    acumbonoescolar=acumbonoescolar+m.getBono_escolar();
                    acumbononavidad=acumbononavidad+m.getBono_navidad();
                }

               
                out.println("<table width='311' border='1'><tr><td colspan='2' bgcolor='#000099' "
                        + "style='color:#FFFFFF'>TOTAL DE BONOS</td></tr> "
                        + "<tr><td width='300'>BONO ESCOLAR</td><td width='130'>BONO NAVIDAD</td></tr>");
                out.println("<td>" + acumbonoescolar+ "</td> ");
                out.println("<td>" + acumbononavidad+ "</td></tr> ");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servlet_Bonos.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.setContentType("text/html;charset=UTF-8");
        //MARCOTRABAJO
        
        
    }

   
}

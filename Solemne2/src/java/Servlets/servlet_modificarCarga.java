/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Carga;


@WebServlet(name = "servlet_modificarCarga", urlPatterns = {"/servlet_modificarCarga"})
public class servlet_modificarCarga extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                    //MARCO TRABAJO
        //MARCO TRABAJO
        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String fechanac = request.getParameter("fechanac");
        String genero = request.getParameter("genero");
        String bonoescolar = request.getParameter("bescolar");
        String bononavidad = request.getParameter("bnavidad");
        String rempleado = request.getParameter("rempleado");
        String nota=request.getParameter("nota");
        
        float bescolar=0;
        float bnavidad=0;
        
        if(bonoescolar.equals("Basica")){
            bescolar=20000;
        }
        if(bonoescolar.equals("Media")){
            bescolar=40000;
        }
        if(bonoescolar.equals("Superior")){
            bescolar=80000;
        }
        if(bononavidad.equals("Si")){
            bnavidad=20000;
        }else{
            bnavidad=0;
        }
        if(nota.equals("Si")){
            bescolar=(float)(bescolar+bescolar*0.5);
        }

        Carga carga = new Carga (rut, nombre, fechanac, genero,bescolar, bnavidad,rempleado);

        try {
            carga.modificar();
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Servlet_crearCarga.class.getName()).log(Level.SEVERE, null, e);
        }
       
        
        response.sendRedirect ("Carga.jsp");
        //MARCO TRABAJO
        
        response.setContentType("text/html;charset=UTF-8");
        
        try(PrintWriter out=response.getWriter()){
            out.println("<table width='311' border='1'><tr><td colspan='2' bgcolor='#000099' "
        + "style='color:#FFFFFF'>Formulario</td></tr> "
        + "<tr><td width='165'>Rut</td><td width='130'>"+"12345"+"</td></tr>");  
            
            
        }
        
    }

    
 

}

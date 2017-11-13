package Servlets;

import modelo.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "servlet_listarEmpleado", urlPatterns = {"/servlet_listarEmpleado"})
public class servlet_listarEmpleado extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //MARCOTRABAJO
        Empleado emp = new Empleado();
        ArrayList<Empleado> listaEmpleados;
        try {
            listaEmpleados = emp.Listar();

            response.setContentType("text/html;charset=UTF-8");

            try (PrintWriter out = response.getWriter()) {

                out.println("<table width='311' border='1'><tr><td colspan='2' bgcolor='#000099' "
                        + "style='color:#FFFFFF'>Listado de empleados</td></tr> "
                        + "<tr><td width='300'>RUT</td><td width='130'>NOMBRE</td><td>DIRECCION</td><td>DEPARTAMENTO</td><td>CARGO</td><td>SUELDO BASE</td></tr>");

                for (Empleado m : listaEmpleados) {
                    System.out.println(m.getRutEmpleado());

                    out.println("<tr align='center'>");
                    out.println("<td>" + m.getRutEmpleado() + "</td>");
                    out.println("<td>" + m.getNombre() + "</td> ");
                    out.println("<td>" + m.getDireccion() + "</td> ");
                    out.println("<td>" + m.getDpto() + "</td> ");
                    out.println("<td>" + m.getCargo() + "</td> ");
                    out.println("<td>" + m.getSbase() + "</td></tr> ");

                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servlet_listarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.setContentType("text/html;charset=UTF-8");
        //MARCOTRABAJO

    }

}

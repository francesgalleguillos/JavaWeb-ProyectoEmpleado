/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author frances
 */
@Entity
@Table(name = "empleado")
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "rut_empleado")
    private String rutEmpleado;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 45)
    @Column(name = "dpto")
    private String dpto;
    @Size(max = 45)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 45)
    @Column(name = "sbase")
    private float sbase;

    public Empleado() {
    }

    public Empleado(String rutEmpleado, String nombre, String direccion, String dpto, String cargo, float sbase) {
        this.rutEmpleado = rutEmpleado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.dpto = dpto;
        this.cargo = cargo;
        this.sbase = sbase;
    }
    
    

    public Empleado(String rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }

    public Empleado(int rut, String nombre, String cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRutEmpleado() {
        return rutEmpleado;
    }

    public void setRutEmpleado(String rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSbase() {
        return sbase;
    }

    public void setSbase(float sbase) {
        this.sbase = sbase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rutEmpleado != null ? rutEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.rutEmpleado == null && other.rutEmpleado != null) || (this.rutEmpleado != null && !this.rutEmpleado.equals(other.rutEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Empleado[ rutEmpleado=" + rutEmpleado + " ]";
    }
    
    public void crear() throws ClassNotFoundException{
        String sql = "insert into empleado (rut_empleado,nombre,Direccion,dpto,cargo,sbase)"
                + " values('" + rutEmpleado + "','" + nombre + "','"+ direccion + "','"+ dpto + "','"+ cargo + "','" + sbase + "')";
        
        Statement ps=null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            System.out.println("Conectado.");
            ps = conect.createStatement();
            ps.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error." + ex);
        }
    }

    public void eliminar() throws ClassNotFoundException {
        
        String sql = "delete from empleado \n"
                 + "where \n"
                + "rut_empleado ="+rutEmpleado ;
        

        Statement ps = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            System.out.println("Conectado.");
            ps = conect.createStatement();
            ps.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error." + ex);
        }
    }
    
    public void modificar() throws ClassNotFoundException {
        
        String sql = "UPDATE empleado \n"
                + "SET \n"
                + "nombre='"+ nombre +"',\n"
                + "Direccion='"+ direccion+"',\n"
                + "dpto='"+ dpto+"',\n"
                + "cargo='"+ cargo+"',\n"
                + "sbase='"+ sbase+"'\n"
                + "where rut_empleado ="+rutEmpleado; 
        

        Statement ps = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            System.out.println("Conectado.");
            ps = conect.createStatement();
            ps.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error." + ex);
        }
    }
    public ArrayList <Empleado> Listar() throws ClassNotFoundException{
        
        ArrayList <Empleado> listaEmpleados=new ArrayList <Empleado>(); 
        
        String sql ="select * from empleado";        

        Statement ps = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            System.out.println("Conectado.");
            ps = conect.createStatement();
            
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()){
                Empleado empleado=new Empleado();
                empleado.setRutEmpleado(rs.getString("rut_Empleado"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setDireccion(rs.getString("Direccion"));
                empleado.setDpto(rs.getString("dpto"));
                empleado.setCargo(rs.getString("cargo"));
                empleado.setSbase(rs.getFloat("sbase"));
                listaEmpleados.add(empleado);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error." + ex);
        }
        return listaEmpleados;
    }
}

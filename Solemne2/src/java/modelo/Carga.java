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
@Table(name = "carga")
@NamedQueries({
    @NamedQuery(name = "Carga.findAll", query = "SELECT c FROM Carga c")})
public class Carga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "rut_carga")
    private String rutCarga;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "fecha_nac")
    private String fechaNac;
    @Size(max = 45)
    @Column(name = "genero")
    private String genero;
    @Size(max = 45)
    @Column(name = "bonoescolar")
    private float bonoescolar;
    @Size(max = 45)
    @Column(name = "bono_navidad")
    private float bonoNavidad;
     @Column(name = "rut_empleado")
    private String rutEmpleado;

    public Carga() {
    }

    public Carga(String rutCarga, String nombre, String fechaNac, String genero, float bonoescolar, float bnavidad, String rutEmpleado) {
        this.rutCarga = rutCarga;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.bonoescolar = bonoescolar;
        this.bonoNavidad=bnavidad;
        this.rutEmpleado = rutEmpleado;
        
    }
    
    

    public Carga(String rutCarga) {
        this.rutCarga = rutCarga;
    }

  

    public String getRutCarga() {
        return rutCarga;
    }

    public void setRutCarga(String rutCarga) {
        this.rutCarga = rutCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getBonoescolar() {
        return bonoescolar;
    }

    public void setBonoescolar(float bonoescolar) {
        this.bonoescolar = bonoescolar;
    }

    public float getBonoNavidad() {
        return bonoNavidad;
    }

    public void setBonoNavidad(float bonoNavidad) {
        this.bonoNavidad = bonoNavidad;
    }
     public String getRutEmpleado() {
        return rutEmpleado;
    }

    public void setRutEmpleado(String rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rutCarga != null ? rutCarga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carga)) {
            return false;
        }
        Carga other = (Carga) object;
        if ((this.rutCarga == null && other.rutCarga != null) || (this.rutCarga != null && !this.rutCarga.equals(other.rutCarga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Carga[ rutCarga=" + rutCarga + " ]";
    }

    
    
    public void crear() throws ClassNotFoundException{
        String sql = 
                 "insert into carga (rut_carga, nombre, fecha_nac, genero, rut_empleado, bono_escolar, bono_navidad)"
                + " values('" + rutCarga + "','" + nombre + "','"+ fechaNac + "','"+ genero + "','"+ rutEmpleado + "','" + bonoescolar + "','"+ bonoNavidad+"')";
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
        
        String sql = "delete from carga \n"
                 + "where \n"
                + "rut_carga ="+rutCarga ;
        

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
       
        String sql = "UPDATE carga \n"
                + "SET \n"                
                + "nombre='"+ nombre+"',\n"
                + "fecha_nac='"+fechaNac+"',\n"
                + "genero='"+genero+"',\n"
                + "rut_empleado='"+rutEmpleado+"',\n"
                + "bono_escolar='"+bonoescolar+"',\n"
                + "bono_navidad='"+bonoNavidad+"'\n"
                + "where rut_carga ="+rutCarga; 
        

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
    public ArrayList <Carga> Listar() throws ClassNotFoundException{
        
        ArrayList <Carga> listaCargas=new ArrayList <Carga>(); 
        
        String sql ="select * from carga where rut_empleado="+rutEmpleado;        

        Statement ps = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            System.out.println("Conectado.");
            ps = conect.createStatement();
            
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()){
                Carga carga=new Carga();
                carga.setRutCarga(rs.getString("rut_carga"));
                carga.setNombre(rs.getString("nombre"));
                carga.setFechaNac(rs.getString("fecha_nac"));
                carga.setGenero(rs.getString("genero"));
                carga.setRutEmpleado(rs.getString("rut_empleado"));
                carga.setBonoescolar(rs.getFloat("bono_escolar"));
                carga.setBonoNavidad(rs.getFloat("bono_navidad"));
                listaCargas.add(carga);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error." + ex);
        }
        return listaCargas;
    }
}



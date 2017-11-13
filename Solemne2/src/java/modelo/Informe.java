package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class Informe {

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    
    
    public Informe(){
    
    }

    public String getRut_empleado() {
        return rut_empleado;
    }

    public void setRut_empleado(String rut_empleado) {
        this.rut_empleado = rut_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut_carga() {
        return rut_carga;
    }

    public void setRut_carga(String rut_carga) {
        this.rut_carga = rut_carga;
    }

    public String getNombrecarga() {
        return nombrecarga;
    }

    public void setNombrecarga(String nombrecarga) {
        this.nombrecarga = nombrecarga;
    }

    public float getBono_escolar() {
        return bono_escolar;
    }

    public void setBono_escolar(float bono_escolar) {
        this.bono_escolar = bono_escolar;
    }

    public float getBono_navidad() {
        return bono_navidad;
    }

    public void setBono_navidad(float bono_navidad) {
        this.bono_navidad = bono_navidad;
    }

    public Informe(String rut_empleado, String nombre, String rut_carga, String nombrecarga, float bono_escolar, float bono_navidad) {
        this.rut_empleado = rut_empleado;
        this.nombre = nombre;
        this.rut_carga = rut_carga;
        this.nombrecarga = nombrecarga;
        this.bono_escolar = bono_escolar;
        this.bono_navidad = bono_navidad;
    }
    
    private String rut_empleado;
    private String nombre;
    private String rut_carga;
    private String nombrecarga;
    private float bono_escolar;
    private float bono_navidad;
    private String dpto;

    
     public ArrayList <Informe> listaBonos() throws ClassNotFoundException{
        
        ArrayList <Informe> listaBonos=new ArrayList <Informe>(); 
        
        String sql ="Select empleado.rut_empleado, empleado.nombre, carga.rut_carga, carga.nombre, carga.bono_escolar, carga.bono_navidad\n" +
                    "From empleado join carga \n" +
                    "on empleado.rut_empleado=carga.rut_empleado";        

        Statement ps = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            System.out.println("Conectado.");
            ps = conect.createStatement();
            
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()){
                Informe inf=new Informe();                
                inf.setRut_empleado(rs.getString("empleado.rut_empleado"));
                inf.setNombre(rs.getString("empleado.nombre"));
                inf.setRut_carga(rs.getString("carga.rut_carga"));
                inf.setNombrecarga(rs.getString("carga.nombre"));
                inf.setBono_escolar(rs.getFloat("carga.bono_escolar"));
                inf.setBono_navidad(rs.getFloat("carga.bono_navidad"));                
                listaBonos.add(inf);
            }

        } catch (SQLException ex) {
            System.out.println("Error." + ex);
        }
        return listaBonos;

    }

    public ArrayList <Informe> listaDepartamentos(String dpto) throws ClassNotFoundException{
        
        ArrayList <Informe> listaBonos=new ArrayList <Informe>(); 
        
        String sql ="Select empleado.dpto, carga.rut_carga, carga.nombre, carga.bono_escolar, carga.bono_navidad\n" +
                    "From empleado join carga \n"+ 
                    "ON empleado.rut_empleado=carga.rut_empleado " +
                    "Where empleado.dpto=\""+dpto+"\"";       

        Statement ps = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            System.out.println("Conectado.");
            ps = conect.createStatement();
            
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()){
                Informe inf=new Informe();                
                inf.setDpto(rs.getString("empleado.dpto"));
                inf.setRut_carga(rs.getString("carga.rut_carga"));
                inf.setNombrecarga(rs.getString("carga.nombre"));
                inf.setBono_escolar(rs.getFloat("carga.bono_escolar"));
                inf.setBono_navidad(rs.getFloat("carga.bono_navidad"));                
                listaBonos.add(inf);
            }

        } catch (SQLException ex) {
            System.out.println("Error." + ex);
        }
        return listaBonos;

    }
    
}

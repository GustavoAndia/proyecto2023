/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.*;

/**
 *
 * @author Gustavo
 */
public class JavaApplication2 {


    
    public static void main(String[] args) {
        
        ArrayList <Empleado> listaEmpleado=new ArrayList<Empleado>();
        
        listaEmpleado.add(new Empleado("Andia","Juarez","Gustavo"));
        
        listaEmpleado.add(new Empleado("Borja","Pardo","Carolina"));
        
        listaEmpleado.add(new Empleado("Andia","Rojas","Rodolfo"));
        
        listaEmpleado.add(new Empleado("Juarez","Palacios","Natividad"));
        
        listaEmpleado.add(new Empleado("Andia","Juarez","Gustavo"));
        
        listaEmpleado.set(0, new Empleado("Andia","Borja","Gael"));
        
        System.out.println(listaEmpleado.get(0).DameDatos());
        
//        for (Empleado e : listaEmpleado) {
//           
//            System.out.println(e.DameDatos());
//        }

        Iterator <Empleado> mi_iterador=listaEmpleado.iterator();
        
        while(mi_iterador.hasNext()){
        
            System.out.println(mi_iterador.next().DameDatos());
        }
    }
}

class Empleado {

    public Empleado() {
    }

    public Empleado(String apellidoPaterno, String apellidoMaterno, String nombre) {
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombre = nombre;
    }

    public Empleado(String apellidoPaterno, String apellidoMaterno, String nombre, String nroDocumento, String direccion, String correo, String telefono) {
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombre = nombre;
        this.nroDocumento = nroDocumento;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    private String apellidoPaterno;
    
    private String apellidoMaterno;

    private String nombre;

    private String nroDocumento;

    private String direccion;
    
    private String correo;

    private String telefono;

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String DameDatos(){
        
    return getNombre()+" "+getApellidoPaterno()+" "+getApellidoMaterno();
    }
}
    


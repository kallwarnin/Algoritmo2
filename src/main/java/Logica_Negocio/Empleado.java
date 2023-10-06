/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1062076461
 */
public class Empleado {
    //Atributos
    public String Nombre;
    public String Codigo;
    public int Año_ingreso;
    
    //constructor no parametrizado

    public Empleado() {
    }
    
    //constrctor no parametrizado

    public Empleado(String Nombre, String Codigo, int Año_ingreso) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Año_ingreso = Año_ingreso;
    }
    
    //setters

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setAño_ingreso(int Año_ingreso) {
        this.Año_ingreso = Año_ingreso;
    }
    
    
    //getters

    public String getNombre() {
        return Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public int getAño_ingreso() {
        return Año_ingreso;
    }
    
}

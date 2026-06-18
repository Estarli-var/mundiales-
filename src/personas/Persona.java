/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;
import java.time.LocalDate;
/**
 *
 * @author emalv
 */
public class Persona {
    private String nombre;
    private String nacionalidad;
    private  LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Persona(String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    public String toSrting(){
        return "Nombre:"+nombre+"\nNacionalidad"+nacionalidad+
                "\nFecha Nacimiento"+fechaNacimiento;
    }
    
}

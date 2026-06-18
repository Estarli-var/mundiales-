/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenadores;
import java.time.LocalDate;
import personas.Persona;

/**
 *
 * @author Student
 */
public class Entrenador extends Persona {
    
    private int añosExperiencia;
    
    public Entrenador(String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        super(nombre, nacionalidad, fechaNacimiento);
    }
    
    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    
    @Override
    public String toString() {
        return "\nNombre"+getNombre() + "\nNacionalidad"+getNacionalidad() +
                "\nFechaNacimiento"+getFechaNacimiento()+"\nAñosExperiencia=" + añosExperiencia;
    }
    
    
}

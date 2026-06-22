/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundiales;

import java.time.LocalDate;
import selecciones.Seleccion;
/**
 *
 * @author Student
 */
public class Mundial {
   private String nombre;
   private LocalDate año;
   private String pais; 
   private String seleccion; 
   private String partidos; 

    public String getNombre() {
        return nombre;
    }

    public LocalDate getAño() {
        return año;
    }

    public String getPais() {
        return pais;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public String getPartidos() {
        return partidos;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    public Mundial(String nombre, LocalDate año, String pais, Seleccion Nseleccion, String partidos) {
        this.nombre = nombre;
        this.año = año;
        this.pais = pais;
        this.seleccion = Nseleccion.getNombre();
        this.partidos = partidos;
    }

    

    @Override
    public String toString() {
        return "Mundial{" + "nombre=" + nombre + ", año=" + año + ", pais=" + pais + ", seleccion=" + seleccion+ ", partidos=" + partidos + '}';
    }
    
    
   
   
}

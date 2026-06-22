/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundiales;

import java.time.LocalDate;
import selecciones.Seleccion;
import partidos.Partido;
/**
 *
 * @author Student
 */
public class Mundial {
   private String nombre;
   private LocalDate año;
   private String pais; 
   private String seleccion; 
   private Partido partidos; 
   private Partido partidosr; 
   

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

    public Partido getPartidos() {
        return partidos;
    }
    public Partido getPartidosr() {
        return partidosr;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }
    
    public Mundial(String nombre, LocalDate año, String pais, Seleccion Nseleccion, Partido partidos, Partido partidosr) {
    this.nombre = nombre;
    this.año = año;
    this.pais = pais;
    this.seleccion = Nseleccion.getNombre();
    this.partidos = partidos; 
    this.partidosr = partidosr;       
}

    

    @Override
    public String toString() {
        return "Mundial{" + "nombre=" + nombre + ", año=" + año + ", pais=" + pais + ", seleccion=" + seleccion+ ", equipo A=" + partidos + "equipo B= "+partidosr ;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;

import arbitros.Arbitro;
import java.time.LocalDate;
import java.time.LocalTime;
import resultados.Resultado;
import selecciones.Seleccion;

/**
 *
 * @author Student
 */
public class Partido {
    private Seleccion seleccionLocal;
    private Seleccion seleccionVisitante;
    private String estadio;
    private LocalDate fecha;
    private LocalTime hora;
    protected Arbitro arbitro[];
    private Resultado resultado;
    private int contador;

    public Seleccion getSeleccionLocal() {
        return seleccionLocal;
    }

    public Seleccion getSeleccionVisitante() {
        return seleccionVisitante;
    }

    public String getEstadio() {
        return estadio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public Partido(Seleccion seleccionLocal, Seleccion seleccionVisitante, String estadio, LocalDate fecha, LocalTime hora, Arbitro arbitro[]) {
        this.seleccionLocal = seleccionLocal;
        this.seleccionVisitante = seleccionVisitante;
        this.estadio = estadio;
        this.fecha = fecha;
        this.hora = hora;
        this.arbitro = arbitro;
        this.resultado = new Resultado();
    }
    
    
    public void agregarArbitro(String nombre){
        if (contador < arbitro.length) {
            contador++;
        }
    }
    
       public void eliminarArbitro(String nombre) {
        for (int i = 0; i < contador; i++) {

            if (arbitro[i].getNombre().equals(nombre)) {

                for (int j = i; j < contador - 1; j++) {
                    arbitro[j] = arbitro[j + 1];
                }

                arbitro[contador - 1] = null;
                contador--;
                break;
            }
        }
    }
       
       public Arbitro buscarArbitro(String nombre) {
    for (int i = 0; i < contador; i++) {
        if (arbitro[i].getNombre().equals(nombre)) {
            return arbitro[i]; 
        }
    }

    return null; 
}
       
       public int contadorArbitros(){
           return contador;
       }
       
       public boolean existeArbitro(String nombre) {
    for (int i = 0; i < contador; i++) {
        if (arbitro[i].getNombre().equals(nombre)) {
            return true; 
        }
    }
    return false; 
}
       
}
    
    
    


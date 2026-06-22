/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resultados;

import selecciones.Seleccion;

/**
 *
 * @author Student
 */
public class Resultado {
    private Seleccion seleccion;
    private String marcador;

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }
    
   public Resultado (){
       this.seleccion=null;
       this.marcador="0-0";
   }
}

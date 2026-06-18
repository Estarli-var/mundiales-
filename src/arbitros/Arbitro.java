/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitros;

/**
 *
 * @author Student
 */
public class Arbitro {
        private int categoria;
        
    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    public Arbitro(int categoria) {
        this.categoria = categoria;
    }
   @Override
    public String toString(){
    public String categoria1 = categoria==1? "Principal":"Asistente";
    return "\n Arbitro: "+ categoria1+
    }
}

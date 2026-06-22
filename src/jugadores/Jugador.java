/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;
import java.time.LocalDate;
import personas.Persona;
/**
 *
 * @author emalv
 */
public class Jugador extends Persona{
    
    private int numero;
    private String posicion;

    public int getNumero() {
        return numero;
    }
    
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Jugador(int numero, String posicion, String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        super(nombre, nacionalidad, fechaNacimiento);
        this.numero = numero;
        this.posicion = posicion;
    }
    
}

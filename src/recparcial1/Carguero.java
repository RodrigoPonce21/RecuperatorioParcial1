/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recparcial1;

/**
 *
 * @author rober
 */
public class Carguero extends Nave {
    private int capacidadCarga;

    public Carguero(String nombre, int capacidadTripulacion, int anioLanzamiento, int capacidadCarga) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void explorar() {
        System.out.println("Iniciando misión de carga para el carguero: " + getNombre());
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad de Carga: " + capacidadCarga + " toneladas";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recparcial1;

/**
 *
 * @author rober
 */
public class CruceroEstelar extends Nave {
    private int cantidadPasajeros;

    public CruceroEstelar(String nombre, int capacidadTripulacion, int anioLanzamiento, int cantidadPasajeros) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public void explorar() {
        System.out.println("Los cruceros estelares no pueden iniciar una misión de exploración.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Cantidad de Pasajeros: " + cantidadPasajeros;
    }
}

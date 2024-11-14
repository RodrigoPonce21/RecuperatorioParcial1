/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recparcial1;

/**
 *
 * @author rober
 */
public abstract class Nave {
    private String nombre;
    private int capacidadTripulacion;
    private int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public abstract void explorar();

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Capacidad de Tripulación: " + capacidadTripulacion +
               ", Año de Lanzamiento: " + anioLanzamiento;
    }
}

enum TipoMision {
    CARTOGRAFIA, INVESTIGACION, CONTACTO;
}

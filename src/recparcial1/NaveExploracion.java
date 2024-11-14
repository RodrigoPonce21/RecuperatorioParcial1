/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recparcial1;

/**
 *
 * @author rober
 */
public class NaveExploracion extends Nave {
    private TipoMision tipoMision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, TipoMision tipoMision) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    @Override
    public void explorar() {
        System.out.println("Iniciando misión de exploración para la nave: " + getNombre());
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Misión: " + tipoMision;
    }
}

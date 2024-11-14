/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recparcial1;

/**
 *
 * @author rober
 */
import java.util.ArrayList;
import java.util.List;

public class AgenciaEspacial {
    private List<Nave> naves;

    public AgenciaEspacial() {
        naves = new ArrayList<>();
    }

    public void agregarNave(Nave nave) throws NaveDuplicadaException {
        for (Nave n : naves) {
            if (n.getNombre().equals(nave.getNombre()) && n.getAnioLanzamiento() == nave.getAnioLanzamiento()) {
                throw new NaveDuplicadaException("La nave ya existe: " + nave.getNombre());
            }
        }
        naves.add(nave);
    }

    public void mostrarNaves() {
        System.out.println("Lista de Naves en la Agencia Espacial:");
        for (Nave n : naves) {
            System.out.println(n.toString());
        }
    }

    public void iniciarExploracion() {
        for (Nave n : naves) {
            if (n instanceof NaveExploracion || n instanceof Carguero) {
                n.explorar();
            } else {
                System.out.println("La nave " + n.getNombre() + " no puede iniciar una misión de exploración.");
            }
        }
    }
}

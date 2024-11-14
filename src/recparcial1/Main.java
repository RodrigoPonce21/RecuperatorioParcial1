/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recparcial1;

/**
 *
 * @author rober
 */
public class Main {
    public static void main(String[] args) {
        AgenciaEspacial agencia = new AgenciaEspacial();

        try {
            // Agregar algunas naves
            agencia.agregarNave(new NaveExploracion("Explorer-1", 10, 2022, TipoMision.CARTOGRAFIA));
            agencia.agregarNave(new Carguero("Galactica", 5, 2023, 300));
            agencia.agregarNave(new CruceroEstelar("StarCruiser", 50, 2024, 200));

            // Intentar agregar una nave duplicada
            agencia.agregarNave(new Carguero("Galactica", 5, 2023, 300));
        } catch (NaveDuplicadaException e) {
            System.out.println(e.getMessage());
        }

        // Mostrar todas las naves
        agencia.mostrarNaves();

        // Iniciar exploración
        agencia.iniciarExploracion();
    }
}

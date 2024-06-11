/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author jaime.escoto
 */
public class Bicicleta extends Vehiculo {
    private String tipo; // Montaña, carretera, etc.

    public Bicicleta(int numLlantas, String tipo) {
        super(numLlantas);
        this.tipo = tipo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de bicicleta: " + tipo);
    }
}

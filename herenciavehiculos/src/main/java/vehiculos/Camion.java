/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author jaime.escoto
 */
public class Camion extends Vehiculo {
    private int capacidadCarga;

    // Constructor de la clase Camion
    public Camion(int numLlantas, int capacidadCarga) {
        super(numLlantas);
        this.capacidadCarga = capacidadCarga;
    }

    // Sobreescribimos el método mostrarInfo para agregar información específica del camión
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }
}

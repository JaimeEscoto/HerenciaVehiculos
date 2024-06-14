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
    public Camion(int numLlantas, int capacidadC) {
        super(numLlantas);
        if(capacidadC>=0){
            capacidadCarga = capacidadC;    
        }
        else{
            capacidadCarga = -1;
        }
    }

    // Sobreescribimos el método mostrarInfo para agregar información específica del camión
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        if(capacidadCarga==-1){
            System.out.println("Camion con problema de capacidad de carga"); 
        }
        else{
            System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas"); 
        }
            
    }
}

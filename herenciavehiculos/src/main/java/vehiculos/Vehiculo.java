/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author jaime.escoto
 */
public class Vehiculo {
    protected int numLlantas; // Atributo protegido, accesible desde las clases hijas
    
    // Constructor de la clase Vehiculo
    public Vehiculo() {
        this.numLlantas = -1;
    }
    
    // Constructor de la clase Vehiculo
    public Vehiculo(int numLlantas) {
        if(numLlantas<0){
            this.numLlantas = -1;
        }
        else{
            this.numLlantas = numLlantas;
        }
    }

    // Método para mostrar información del vehículo
    public void mostrarInfo() {
        if(numLlantas<0){
           System.out.println("Vehiculo con problema de llantas"); 
        }
        else{
            System.out.println("Número de llantas: " + numLlantas);
        }
    }
}

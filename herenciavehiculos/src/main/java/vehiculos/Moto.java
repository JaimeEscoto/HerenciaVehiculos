/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author jaime.escoto
 */
public class Moto extends Vehiculo {
    private int cilindrada;

    // Constructor de la clase Moto
    public Moto(int numLlantas, int cilindrada) {
        super(numLlantas); // Llama al constructor de la clase padre (Vehiculo)
        if(cilindrada>1000 && cilindrada <5000)
        {
        }
        this.cilindrada = cilindrada;
        
        //Validar que la cilindrada este entre 1000 - 5000, de lo contrario, asignar -1.
    }

    // Sobreescribimos el método mostrarInfo para agregar información específica de la moto
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamamos al método mostrarInfo de la clase padre
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}

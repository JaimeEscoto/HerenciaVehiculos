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
    public Moto(int numLlantas, int c) {
        super(numLlantas); // Llama al constructor de la clase padre (Vehiculo)
        if(c>=1000 && c <=5000)
        {
            cilindrada = c;
        }
        else{
            cilindrada=-1;
        //Validar que la cilindrada este entre 1000 - 5000, de lo contrario, asignar -1.
        }
    }

    // Sobreescribimos el método mostrarInfo para agregar información específica de la moto
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamamos al método mostrarInfo de la clase padre
        if(cilindrada==-1){
            System.out.println("Moto con problema de cilindrada"); 
        }
        else{
           System.out.println("Cilindrada: " + cilindrada + "cc"); 
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author jaime.escoto
 */
public class Avion extends Vehiculo {
    
    int potenciaTurbinas;
    int capacidadPasajeros;
    
    public Avion(int nl, int pt, int cp)
    {
        super(nl);
        if(pt>5000){
            potenciaTurbinas=pt;
        }
        else
        {
            potenciaTurbinas=-1;
        }
        if(cp>100)
        {
            capacidadPasajeros=cp;
        }
        else{
            capacidadPasajeros=-1;
        }
            
        
        
        
    }
    
}

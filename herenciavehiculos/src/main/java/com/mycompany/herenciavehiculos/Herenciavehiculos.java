/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciavehiculos;

import vehiculos.*;

/**
 *
 * @author jaime.escoto
 */
public class Herenciavehiculos {

    public static void main(String[] args) {
        Moto v = new Moto(2,3000);
        //v.mostrarInfo();
        
        Camion c = new Camion(-5,3000);
        c.mostrarInfo();
       
    }
    public static void mostrarInfo(Vehiculo v)
    {
        v.mostrarInfo();
    }
}

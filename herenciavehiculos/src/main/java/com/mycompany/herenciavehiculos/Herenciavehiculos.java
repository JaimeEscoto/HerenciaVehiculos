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
        
        Vehiculo mivehiculo = new Vehiculo(-100);
        
        Moto miMoto = new Moto(2, 1000);
        Camion miCamion = new Camion(18, 20);
        Bicicleta miBici = new Bicicleta(2, "Montaña");

        mostrarInfo(miMoto);
        miCamion.mostrarInfo();
        miBici.mostrarInfo();
    }
    public static void mostrarInfo(Vehiculo v)
    {
        v.mostrarInfo();
    }
}

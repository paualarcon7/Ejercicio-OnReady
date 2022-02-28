package Main;

import Vehiculos.Auto;
import Vehiculos.LetraIdentificada;
import Vehiculos.Moto;
import Vehiculos.Ordenamiento;
import Vehiculos.Vehiculos;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    
    public static ArrayList<Vehiculos> items = new ArrayList<Vehiculos>();
    public static void main(String[] args) {

        Vehiculos auto = new Auto("Peugeot","206",4,200000);
        Vehiculos moto = new Moto("Honda","Titan","125c",60000);
        Vehiculos auto2 = new Auto("Peugeot","208",5,250000);
        Vehiculos moto2 = new Moto("Yamaha","YBR","160c",80500.50);
        
        items.add(auto);
        items.add(moto);
        items.add(auto2);
        items.add(moto2);
        
        for (Vehiculos items : items) {
             System.out.println(items.toString());
        }
        
        Ordenamiento ordenamiento = new Ordenamiento(items);
        ArrayList<Vehiculos> vehiculosOrdenados = ordenamiento.getVehiculosPorPrecio();
        
        System.out.println("==================================");
        
        System.out.println("Vehículo más caro: "+vehiculosOrdenados.get(vehiculosOrdenados.size()-1).getMarca()+" "+vehiculosOrdenados.get(vehiculosOrdenados.size()-1).getModelo()+"\n"
                            + "Vehículo más barato: "+vehiculosOrdenados.get(0).getMarca()+" "+vehiculosOrdenados.get(0).getModelo());
   
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+ LetraIdentificada.indexOf("y"));
    }
    
   
    
    
}
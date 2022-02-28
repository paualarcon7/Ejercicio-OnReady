package Vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenamiento {
    
    ArrayList<Vehiculos> vehiculos = new ArrayList<>();
    
    public Ordenamiento (ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
        
    }
    
    public ArrayList<Vehiculos> getVehiculosPorPrecio() {
        Collections.sort(vehiculos);
        return vehiculos;
        
    }
    
}

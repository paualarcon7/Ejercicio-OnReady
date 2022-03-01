package Vehiculos;

public class Auto extends Vehiculos {
    
    int puertas;
    public Auto(){
        super();
    }
    
    public Auto(String marca, String modelo, int puertas, double precio){
        super(marca,modelo,precio);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca: " +marca+ " // Modelo: " +modelo+ " // Puertas: " +puertas+ " // Precio: $" +precio;
    }
    
    
}

package Vehiculos;

public class Moto extends Vehiculos{

    String cilindrada;
    
    public Moto(){
        super();
    }
    
    public Moto(String marca, String modelo, String cilindrada, double precio) {
        super(marca,modelo,precio);
        this.cilindrada = cilindrada;
    }

  
        
    

    @Override
    public String toString() {
        return "Marca: " +marca+ " // Modelo: " +modelo+ " // Cilindrada: " +cilindrada+ " // Precio: $" +precio;
        
    }
    
    
}

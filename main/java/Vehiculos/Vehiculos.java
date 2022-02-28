package Vehiculos;

public class Vehiculos implements Comparable<Vehiculos> {
    
    protected String marca;
    protected String modelo;
    protected double precio;
    
    public Vehiculos(){
        
    }

    public Vehiculos(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    @Override
    public int compareTo(Vehiculos vehiculos) {
        return this.getPrecio() < vehiculos.getPrecio() ? -1 :
                (this.getPrecio() == vehiculos.getPrecio() ? 0 : 1);
    }



}
    
    
    
 

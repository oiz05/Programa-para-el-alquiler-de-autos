
package Clases;


public class Tarifa {
    private int precioAlquiler;

    public Tarifa(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public Tarifa() {
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        return "Tarifa{" + "precioAlquiler=" + precioAlquiler + '}';
    }

    
    
    
}

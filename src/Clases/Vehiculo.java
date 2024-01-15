
package Clases;


public class Vehiculo {
    private int CodV;
    private String marca;
    private String modelo;
    private String color;
    private int AnoFabricacion;
    private String tipoMotor;
    private int kilometraje;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnoFabricacion() {
        return AnoFabricacion;
    }

    public void setAnoFabricacion(int AnoFabricacion) {
        this.AnoFabricacion = AnoFabricacion;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getCodV() {
        return CodV;
    }

    public void setCodV(int CodV) {
        this.CodV = CodV;
    }
    

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, int AnoFabricacion, String tipoMotor, int kilometraje, int CodV) {
        this.CodV=CodV;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.AnoFabricacion = AnoFabricacion;
        this.tipoMotor = tipoMotor;
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "CodV=" + CodV + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", AnoFabricacion=" + AnoFabricacion + ", tipoMotor=" + tipoMotor + ", kilometraje=" + kilometraje + '}';
    }

    
    
}

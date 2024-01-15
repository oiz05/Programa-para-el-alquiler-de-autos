
package Clases;

public class Cliente {
    private int DocumentoIdentidad;
    private String nombre;
    private String genero;
    private int AnoNacimiento;
    private String nacionalidad;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoNacimiento() {
        return AnoNacimiento;
    }

    public void setAnoNacimiento(int AnoNacimiento) {
        this.AnoNacimiento = AnoNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getDocumentoIdentidad() {
        return DocumentoIdentidad;
    }

    public void setDocumentoIdentidad(int DocumentoIdentidad) {
        this.DocumentoIdentidad = DocumentoIdentidad;
    }
    

    public Cliente() {
    }

    public Cliente(String nombre, String genero, int AnoNacimiento, String nacionalidad, int DocumentoIdentidad) {
        this.nombre = nombre;
        this.genero = genero;
        this.AnoNacimiento = AnoNacimiento;
        this.nacionalidad = nacionalidad;
        this.DocumentoIdentidad=DocumentoIdentidad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "DocumentoIdentidad=" + DocumentoIdentidad + ", nombre=" + nombre + ", genero=" + genero + ", AnoNacimiento=" + AnoNacimiento + ", nacionalidad=" + nacionalidad + '}';
    }

    

   
    
    
    
    
}

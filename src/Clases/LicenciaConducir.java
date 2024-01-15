
package Clases;


public class LicenciaConducir {
    private int CodLC;
    private String categoriaLicenciaConducir;
    private int AnoVencimiento;
    

    public String getCategoriaLicenciaConducir() {
        return categoriaLicenciaConducir;
    }

    public void setCategoriaLicenciaConducir(String categoriaLicenciaConducir) {
        this.categoriaLicenciaConducir = categoriaLicenciaConducir;
    }

    public int getAnoVencimiento() {
        return AnoVencimiento;
    }

    public void setAnoVencimiento(int fechaVencimiento) {
        this.AnoVencimiento = fechaVencimiento;
    }

    public int getCodLC() {
        return CodLC;
    }

    public void setCodLC(int CodLC) {
        this.CodLC = CodLC;
    }
    

    public LicenciaConducir() {
    }

    public LicenciaConducir(String categoriaLicenciaConducir, int AnoVencimiento, int CodLC) {
        this.categoriaLicenciaConducir = categoriaLicenciaConducir;
        this.AnoVencimiento = AnoVencimiento;
        this.CodLC=CodLC;
    }

    @Override
    public String toString() {
        return "LicenciaConducir{" + "CodLC=" + CodLC + ", categoriaLicenciaConducir=" + categoriaLicenciaConducir + ", AnoVencimiento=" + AnoVencimiento + '}';
    }

    
}

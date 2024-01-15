
package Clases;


public class MetodoPago {
    private int codMP;
    private String Acreedor;
    private String Deudor;

    public MetodoPago() {
    }

    public MetodoPago(String Acreedor, String Deudor, int codMP) {
        this.Acreedor = Acreedor;
        this.Deudor = Deudor;
        this.codMP=codMP;
    }

    public String getAcreedor() {
        return Acreedor;
    }

    public void setAcreedor(String Acreedor) {
        this.Acreedor = Acreedor;
    }

    public String getDeudor() {
        return Deudor;
    }

    public void setDeudor(String Deudor) {
        this.Deudor = Deudor;
    }

    public int getCodMP() {
        return codMP;
    }

    public void setCodMP(int codMP) {
        this.codMP = codMP;
    }
    

    @Override
    public String toString() {
        return "MetodoPago{" + "codMP=" + codMP + ", Acreedor=" + Acreedor + ", Deudor=" + Deudor + '}';
    }

    

    
    
}

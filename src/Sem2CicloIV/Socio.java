
package Sem2CicloIV;


public class Socio {
    private int Codigo;
    private String Apellido1;
    private String Apellido2;
    private String Nombre1;
    private String Nombre2;
    private boolean Exclusivo;
    private boolean Ordinario;
    private boolean Mora;
    private int CuotaMensual;
    
    public int getCodigo(){
        return Codigo;
    }
    public void setCodigo(int Codigo){
        this.Codigo=Codigo;
    }
    public String getApellido1() {
        return Apellido1;
    }
    public void setApellido1(String Apellido1) {
        this.Apellido1=Apellido1;
    }
    public String getApellido2(){
        return Apellido2;
    }
    public void setApellido2(String Apellido2){
        this.Apellido2=Apellido2;
    }
    public String getNombre1(){
        return Nombre1;
    }
    public void setNombre1(String Nombre1){
        this.Nombre1=Nombre1;
    }
    public String getNombre2(){
        return Nombre2;
    }
    public void setNombre2(String Nombre2){
        this.Nombre2=Nombre2;
    }
    public boolean getExclusivo(){
        return Exclusivo;
    }
    public void setExclusivo(boolean Exclusivo){
        this.Exclusivo=Exclusivo;
    }
    public boolean getOrdinario(){
        return Ordinario;
    }
    public void setOrdinario(boolean Ordinario){
        this.Ordinario=Ordinario;
    }
    public boolean Mora(){
        return Mora;
    }
    public void setMora(boolean Mora){
        this.Mora=Mora;
    }
    public int getCuotaMensual(){
        return CuotaMensual;
    }
    public void setCuotaMensual(int CuotaMensual){
        this.CuotaMensual=CuotaMensual;
        
    }

    public Socio(int Codigo){
        this.Codigo=Codigo;
    }
    
    public Socio(){
        
    }
  
     
        
    
    
    
}

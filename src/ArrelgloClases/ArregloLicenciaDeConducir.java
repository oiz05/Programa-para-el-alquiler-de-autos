
package ArrelgloClases;

import Clases.LicenciaConducir;


public class ArregloLicenciaDeConducir {
    private LicenciaConducir LicenciasDeConducir[]=null;
    private int index;
    
    public ArregloLicenciaDeConducir(int tamanio){
        this.index=0;
        this.LicenciasDeConducir=new LicenciaConducir[tamanio];
    }
    public int getIndex(){
        return index;
    }
    //AGREGAR ELEMENTO
    public void AgregarLicenciaDeConducir(LicenciaConducir nuevaLicenciaDeConducir){
        this.LicenciasDeConducir[this.index]=nuevaLicenciaDeConducir;
        this.index++; //Incrementar indice
    }
    //Mostrar Elemento
    public String mostrarLicenciaConducir(int CodLC){
        String datos= "No existe ese codigo de licencia de conducir";
        for(int i=0; i<this.getIndex();i++){
            int AnoVencimiento=LicenciasDeConducir[i].getAnoVencimiento();
            String AnoVencimientoString=Integer.toString(AnoVencimiento);
            if(this.LicenciasDeConducir[i].getCodLC()==CodLC){
                datos ="--------Licencia de Conducir-----\n";
                datos+="Categoría de licencia de conducir".concat(this.LicenciasDeConducir[i].getCategoriaLicenciaConducir()).concat("\n");
                datos+="Año de vencimiento:".concat(AnoVencimientoString).concat("\n");
                break; //detener
                
            }
        }
        return datos;
    }
    
}

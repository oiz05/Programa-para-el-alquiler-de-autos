
package ArrelgloClases;

import Clases.Tarifa;

public class ArregloTarifa {
    private Tarifa tarifas[]=null;
    private int index;
    
    public ArregloTarifa(int tamanio){
        this.index=0;
        this.tarifas=new Tarifa[tamanio];
    }
    public int getIndex(){
        return index;
    }
    //AGREGAR ELEMENTO
    public void AgregarTarifa(Tarifa nuevaTarifa){
        this.tarifas[this.index]=nuevaTarifa;
        this.index++; //Incrementar indice
    }
    
    //Mostrar Elemento
    public String mostrarTarifa(int PrecioAlquiler){
        String datos="No existe ese precio de alquiler";
        
        for(int i=0;i<this.getIndex();i++){
            
            if(this.tarifas[i].getPrecioAlquiler()==PrecioAlquiler){
                int Alquiler=this.tarifas[i].getPrecioAlquiler();
                String AlquilerString=Integer.toString(Alquiler);
                datos ="----- Tarifas -----\n";
                datos+="Precio Alquiler".concat(AlquilerString).concat("\n");
                break; //detener
                
            }
        }
        return datos;
    }
}

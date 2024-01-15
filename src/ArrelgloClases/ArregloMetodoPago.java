
package ArrelgloClases;

import Clases.MetodoPago;
public class ArregloMetodoPago {
    private MetodoPago MetodosDePago[]=null;
    private int index;
    
    public ArregloMetodoPago(int tamanio){
        this.index=0;
        this.MetodosDePago=new MetodoPago[tamanio];
    }
    public int getIndex(){
        return index;
    }
    //AGREGAR ELEMENTO
    public void AgregarMetodoPago(MetodoPago nuevoMetodoDePago){
        this.MetodosDePago[this.index]=nuevoMetodoDePago;
        this.index++; //Incrementar indice
    }
    //Mostrar Elemento
    public String mostrarMetodoPago(int codMP){
        String datos="No existe ese código de Método de pago";
        for(int i=0;i<this.getIndex();i++)
        {
            if(this.MetodosDePago[i].getCodMP()==codMP){
                datos ="----- Metodo de Pago -----\n";
                datos+="Acreedor:".concat(this.MetodosDePago[i].getAcreedor()).concat("\n");
                datos+="Deudor:".concat(this.MetodosDePago[i].getDeudor()).concat("\n");
                break; //detener
            }
        }
            return datos;
        }
    
    }

        
    



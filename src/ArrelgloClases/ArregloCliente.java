
package ArrelgloClases;

import Clases.Cliente;
public class ArregloCliente {
    private Cliente clientes[]=null;
    private int index;
    
    public ArregloCliente(int tamanio){
        this.index=0;
        this.clientes=new Cliente[tamanio];
    }
    public int getIndex(){
        return index;
    }
    //AGREGAR ELEMENTO
    public void AgregarCliente(Cliente nuevoCliente){
        this.clientes[this.index]=nuevoCliente;
        this.index++; //Incrementar indice
    }
    //Mostrar Elemento
    public String mostrarCliente (int DocId){
        String datos="No existe documento de identidad";
        for(int i=0; i<this.getIndex();i++){
            int DocumentoIdentidad=clientes[i].getDocumentoIdentidad();
            String DocumentoIdentidadString=Integer.toString(DocumentoIdentidad);
            int AnoNacimiento=clientes[i].getAnoNacimiento();
            String AnoNacimientoString=Integer.toString(AnoNacimiento);
            if(this.clientes[i].getDocumentoIdentidad()==DocId){
                datos="-----Clientes------\n";
                datos+="Documento de identidad:".concat(DocumentoIdentidadString).concat("\n");
                datos+="Nombre:".concat(this.clientes[i].getNombre()).concat("\n");
                datos+="Género:".concat(this.clientes[i].getGenero()).concat("\n");
                datos+="Año de nacimiento".concat(AnoNacimientoString).concat("\n");
                datos+="Nacionalidad".concat(this.clientes[i].getNacionalidad()).concat("\n");
                break; //detener
            }
        }
           return datos; 
    }
    
}

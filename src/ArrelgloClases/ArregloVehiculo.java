
package ArrelgloClases;

import Clases.Vehiculo;
public class ArregloVehiculo {
    private Vehiculo vehiculos[]=null;
    private int index;
    
    public ArregloVehiculo(int tamanio){
        this.index=0;
        this.vehiculos=new Vehiculo[tamanio];
    }
    public int getIndex(){
        return index;
    }
    //AGREGAR ELEMENTO
    public void AgregarVehiculo(Vehiculo nuevoVehiculo){
        this.vehiculos[this.index]=nuevoVehiculo;
        this.index++; //Incrementar indice
    }
    //Mostrar elemento
    public String mostrarVehiculo(int CodV){
        String datos="No existe ese código de vehiculo";
        for(int i=0;i<this.getIndex();i++)
        {
            int AnoFabricacion=vehiculos[i].getAnoFabricacion();
            String AnoFabricacionString=Integer.toString(AnoFabricacion);
            int Kilometraje=vehiculos[i].getKilometraje();
            String KilometrajeString=Integer.toString(Kilometraje);
            if(this.vehiculos[i].getCodV()==CodV){
                datos ="----- Vehiculos -----\n";
                datos+="Marca:".concat(this.vehiculos[i].getMarca()).concat("\n");
                datos+="Modelo:".concat(this.vehiculos[i].getModelo()).concat("\n");
                datos+="Color:".concat(this.vehiculos[i].getColor()).concat("\n");
                datos+="Año de fabricacion:".concat(AnoFabricacionString).concat("\n");
                datos+="Tipo de motor:".concat(this.vehiculos[i].getTipoMotor()).concat("\n");
                datos+="Kilometraje:".concat(KilometrajeString).concat("\n");
                break; //detener
            }
        }
            return datos;
        }
    //Mostrar elementos
    
}

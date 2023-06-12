//By Diego Arturo Enriquez Mercado
public class CAdquirirDatos extends Thread{
    private CBufer muestras; // Objeto para almacenar los datos
    public  CAdquirirDatos(CBufer muestrasx,String nombre){
        setName(nombre);
        this.muestras=muestrasx;
    }
    public void run(){
        int i=0;
        do{
            i=muestras.adquirirDato(getName());//adquirir datos
        }while (muestras.index<muestras.longitud);
    }
}

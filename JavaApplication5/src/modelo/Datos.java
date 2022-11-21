
package modelo;


public class Datos {
    private String nombre ;
    private String apellido;
    private int codigo;
    private String institucion;
    
    
    public Datos(){
        nombre="";
        apellido="";
        codigo=0;
        institucion="";
        
    }
    public Datos(String pnombre,String papellido,int pcodigo,String pinstitucion){
        nombre=pnombre;
        apellido=papellido;
        codigo=pcodigo;
        institucion=pinstitucion;
    }
    public String Verdatos(){
        return nombre+"\t"+apellido+"\t"+codigo+"\t"+institucion;
    }
    
}


package projeto;

public class Voo {
    
     //Atributos
    private Aviao aeronave;
    private int nro;
    private String data;
    private String hora;
    
    //Método Construtor
    public Voo (Aviao aeronave, int nro, String data, String hora){
        this.aeronave = aeronave;
        this.nro = nro;
        this.data = data;
        this.hora = hora;
    }
    
    //Método Getter e Setter
    public int getNro(){
        return nro;
    }
    public void setNro(int nro){
        this.nro = nro;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getHora(){
        return hora;
    }
    public void setHora(String hora){
        this.hora = hora;
    }
    
    //Método toString
    @Override
    public String toString(){
        return "Voo {" + "aeronave = " + aeronave + ", nro = " + nro + ", data = " + data + ", hora = " + hora + "}";
    }
    
    
    
}

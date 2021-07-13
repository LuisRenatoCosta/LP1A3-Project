package projeto;

public class Aviao extends Aeronave {
    
    //Atributos
    private int fileiras;
    private int assentos;
    private Passageiro[][] lugares = new Passageiro[fileiras][assentos];
    
    //Método Construtor
    public Aviao (String modelo, int fileiras, int assentos){
        super(modelo);
        this.fileiras = fileiras;
        this.assentos = assentos;
        //lugares[fileiras][assentos] = ;
    }
            
    //Método Getter e Setter
    public Passageiro getPassageiro(int fileiras, int assentos){
        if (lugares[fileiras][assentos].getNome() != ""){
            return lugares[fileiras][assentos].getNome();
        }
        else{
            return ;
        }
    }
    public void setPassageiro (int fileiras, int assentos, Passageiro lugares){
        this.lugares[fileiras][assentos].setNome();
    }
    
    //Método complementar
    public boolean verificaLugarOcupado(int fileiras, int assentos){
        if()
        return true;
    }
    
}

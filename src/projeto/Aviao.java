package projeto;

public class Aviao extends Aeronave{
    
    //Atributos
    private Passageiro[][] lugares; //Declaração do objeto
    
    //Método Construtor
    public Aviao (String modelo, int fileiras, int assentos){
        super(modelo);
        lugares = new Passageiro[fileiras][assentos];
    }
            
    //Método Getter e Setter
    public Passageiro getPassageiro(int fileiras, int assentos){
        if (lugares[fileiras][assentos] != null){
            return lugares[fileiras][assentos];
        }
        else{
            return null;
        }
    }
    public void setPassageiro (int fileiras, int assentos, Passageiro lugares){
        this.lugares[fileiras][assentos] = lugares;
    }
    //Pedir as infos do passageiro (nome, cpf) e o lugar (fileira, assento)
    
    //Método complementar
    public boolean verificaLugarOcupado(int fileiras, int assentos){
        if (lugares[fileiras][assentos] == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Aviao{" + "lugares=" + lugares.toString() + '}';
    }
    

    
}

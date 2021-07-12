package projeto;

public class Passageiro {
    
    //Atributos
    private String nome;
    private String cpf;
    
    //Método Construtor
    public Passageiro(String nome, String cof){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    //Método Getter e Setter
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
}

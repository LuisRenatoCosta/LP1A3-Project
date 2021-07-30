package projeto;

public class Passageiro {
    
    //Atributos
    private String nome;
    private String cpf;
    
    //Método Construtor
    public Passageiro(String nome, String cpf){
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
    
    //Método toString
    @Override
    public String toString(){
        return "Passageiro {" + "nome = " + nome + ", cpf = " + cpf + "}";
    }
    
}

package Cachorro;

public class Proprietario {
    private String nome;
    private long telefone;


    public Proprietario(String nome, long telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String toString(){
        return "Nome do proprietário: " + nome + 
        " telefone: " + telefone;
        }
    
}

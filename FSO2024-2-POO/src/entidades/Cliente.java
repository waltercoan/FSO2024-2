package entidades;

public class Cliente {
    private String nome;
    private String endereco;
    private Cidade cidade;

    
    public Cliente(){
        System.out.println("Construtor sem parametro");
    }
    public Cliente(String nome) {
        System.out.println("Construtor com parametro");
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString(){
        return getNome();
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    

}

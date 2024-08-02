import entidades.Cliente;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        //cliente.nome = "zezinho";
        cliente.setNome("zezinho");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Mariazinha");
        //NullPointException - ausencia de valor em uma variavel
        float salario = 0;
        System.out.println(cliente.getNome());

        System.out.println("Hello, World!");
    }
}

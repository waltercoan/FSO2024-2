import entidades.Cidade;
import entidades.Cliente;
import entidades.ClienteRecord;
import entidades.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
    
        var cliRecord = new ClienteRecord("Maria", "Rua lulul");
        System.out.println(cliRecord.nome());
        

        Cliente cliente = new Cliente("Zezinho");
        //cliente.nome = "zezinho";
        //cliente.setNome("zezinho");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Mariazinha");
        //NullPointException - ausencia de valor em uma variavel
        float salario = 0;
        System.out.println(cliente.getNome());

        System.out.println("Hello, World!");

        System.out.println(cliente.toString());
        System.out.println(cliRecord);

        var joinville = new Cidade("Joinville");
        cliente.setCidade(joinville);
        System.out.println(cliente.getCidade().toString());

        var pikachu = new Pokemon("Pikachu");
        var charmander = new Pokemon("Charmander");
        var jiglipuff = new Pokemon("Jiglipuff");

        cliente.getListaPokemon().add(pikachu);
        cliente.getListaPokemon().add(charmander);
        cliente.getListaPokemon().add(jiglipuff);
        /*cliente.getListaPokemon().add("univille");
        cliente.getListaPokemon().add("banana");
        cliente.getListaPokemon().add(1234);
        cliente.getListaPokemon().add(true);*/
        System.out.println(cliente.getListaPokemon());

    }
}

//Classe Principal(Main)
public class Main {
    public static void main(String[] args) {
        // Testando os métodos
        Cachorros dog1 = new Cachorros("Bolt", "Pastor Branco Suíço", 5);
        dog1.emitirSom();
        dog1.mover();
        System.out.println(dog1.getNome());
        System.out.println(dog1.getIdade());
        dog1.abanarRabo();

        System.out.println(); //print vazio para melhor visibilidade

        Passaros bird1 = new Passaros("Piquirito", 4, "Azul");
        bird1.emitirSom();
        System.out.println(bird1.getIdade());
        System.out.println(bird1.getNome());
        bird1.voar();
        System.out.println(bird1.getCor());
        bird1.construirNinho();
    }
}

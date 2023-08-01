// Classe publica "Aves"
public class Aves {
    String name;
    int idad;

    //criador
    public Aves(String name, int idad) {
        this.nome = name;
        this.idade = idad;
    }

    //printa a ação de "emitir som" do animal
    public void emitirSom() {
        System.out.println("Fazendo som...");
    }

    //retorna a string "name"
    public String getName(){
        return name;
    }

    //retorna o inteiro "idad"
    public int getIdad(){
            return idad;
        }

    // printa a ação de "voar" do animal
    public void voar() {
        System.out.println("Voando...");
    }
}

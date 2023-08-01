// Subclasse da classe "Aves" chamada "Pássaros"
class Passaros extends Aves {
    String cor;//string "cor"

    // Criador
    public Passaros(String name, int idad, String cor) {
        super(name, idad);
        this.cor = cor;
    }

    //retorna a string "cor"
    public String getCor(){
        return cor;
    }

    //printa a ação de "construir ninho" do animal
    public void construirNinho() {
        System.out.println("Construindo ninho...");
    }

}

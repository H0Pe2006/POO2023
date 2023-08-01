//Subclasse publica da classe "Mamiferos" chamada "Cachorros"
public class Cachorros extends Mamiferos{
    private String raca; //string privada "raca"

    public Cachorros(String breed, String nom, int age){
        super(nom, age);
        this.raca = breed;
    }

    //retorna a string "raca"
    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String breed){
        this.raca = breed;
    }

    //printa a ação de "abanar o rabo" do animal
    public void abanarRabo(){
        System.out.println("Abanando o rabo...");
    }
}

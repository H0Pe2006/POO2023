public class Mamiferos{
  
    //string privada "nom"
    private String nom;

    //inteiro privado "age"
    private int age; 

    //criador
    public Mamiferos(String name, int idad){
        this.nom = name;
        this.age = idad;
    }

    public void setNome(String name){
        this.nom = name;
    }

    public void setAge(int idad){
        this.age = idad;
    }

    //retorna a string "nom"
    public String getNom(){
        return this.nom;
    }

    //retorna a string "age"
    public int getAge(){
        return this.age;
    }

    //printa a ação de "fazer som" do animal
    public void emitirSom(){
        System.out.println("Fazendo som...");
    }

    //printa a ação de "se mover" do animal
    public void mover(){
        System.out.println("Movendo...");
    }

    
}

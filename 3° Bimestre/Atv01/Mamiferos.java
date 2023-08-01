
public class Mamiferos{
  
    //string "nom"
    private String nom;

    //int "age"
    private int age; 

    //cria a classe
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

    public void emitirSom(){
        System.out.println("Fazendo som...");
    }

    public void mover(){
        System.out.println("Movendo...");
    }

    
}

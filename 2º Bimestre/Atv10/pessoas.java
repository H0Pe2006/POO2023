package Java.Atv010;

public class pessoas { // classe publica "pessoas"
    private String name;
    private int idade;
    private double alt;

    // pega o nome
    public String getNom(){
        return name;
    }

    // pega a idade
    public int getIdade(){
        return idade;
    }
    
    // pega a altura
    public String getAlt(){
        return String.format("%.2f", alt);
    }

    // define o nome
    public void setNom(String name){
        this.nome = nome;
    }
    
    // define a idade
    public void setIdad(int idade){
        this.idade = idade;
    }
    
    // define a altura
    public void setAlt(double alt){
        this.alt = alt;
    }
}

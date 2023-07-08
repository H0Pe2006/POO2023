package Java.Atv010;

public class pessoas {
    private String name;
    private int idade;
    private double alt;

    public String getNome(){
        return name;
    }

    public int getIdade(){
        return idade;
    }

    public String getAlt(){
        return String.format("%.2f", alt);
    }

    public void setNom(String name){
        this.nome = nome;
    }

    public void setIdad(int idade){
        this.idade = idade;
    }

    public void setAlt(double alt){
        this.alt = alt;
    }
}

package atv1;

import java.util.Scanner;

public class soma {

    static Scanner LER = new Scanner(System.in);

    public static void main(String[] args){

        float num1 = 0f;
        float num2 = 0f;
        float somaNum = 0f;

        num1 = lerNum1(num1);
        num2 = lerNum2(num1);

        somaNum = somaNum(num1, num2);
        imprimirSoma(somaNum);
    }

    public static Float lerNum1(float num1){
        System.out.print("Digite o primeiro número: "); Float lerNum1 = LER.nextFloat();
        return lerNum1;
    }

    public static Float lerNum2(float num2){
        System.out.print("Digite o segundo número: "); Float lerNum2 = LER.nextFloat();
        return lerNum2;
    }

    public static Float somaNum(float num1, float num2){
        Float somaNum = num1 +num2;
        return somaNum;
    }

    public static void imprimirSoma(Float somaNum){
        System.out.println("As soma dos números digitados é: "+somaNum);
    }
}
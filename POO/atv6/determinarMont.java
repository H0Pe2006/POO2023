package atv6;

import java.util.Scanner;

public class determinarMont {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        Double depositoFixo = 0d;;
        Double montante = 0d;
        Double taxaJuros = 0.05;

        depositoFixo = lerDeposito(depositoFixo);
        montante = lerMontante(montante);

        Double calcMeses = calcMeses(montante,depositoFixo,taxaJuros);
        imprimirMeses(calcMeses);

    }

    public static Double lerDeposito(Double depositoFixo) {
        System.out.println("Digite o valor do depósito mensal: ");
        depositoFixo = LER.nextDouble();
        return depositoFixo;
    }

    public static Double lerMontante(Double montante) {
        System.out.println("Digite o montante desejado: ");
        montante = LER.nextDouble();
        return montante;
    }

    public static Double calcMeses(Double montante, Double depositoFixo, Double taxaJuros){
        Double calcMeses = (montante - depositoFixo)/(depositoFixo * taxaJuros);
        return calcMeses;
    }

    public static void imprimirMeses(Double calcMeses){
        System.out.println("Levará "+calcMeses+" meses para acumular o montante desejado");
    }
}
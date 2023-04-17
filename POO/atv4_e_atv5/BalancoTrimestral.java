package atv4_e_atv5;

public class BalancoTrimestral{
    public static void main(String[] args){

       Double gastosJaneiro = 30000.00;
       Double gastosFevereiro = 33030.77;
       Double gastosMarco =  23899.01;
       Double gastosTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco;
       Double mediaMensal = gastosTrimestre / 3;

       imprimirGastos(gastosTrimestre, mediaMensal);
    }

    public static void imprimirGastos(Double gastosTrimestre, Double mediaMensal){
        System.out.println("\n");
        System.out.printf("O total de gastos trimestral foi de: R$ %.2f",gastosTrimestre);
        System.out.println("\n");
        System.out.printf("Valor da média mensal: R$ %.2f",mediaMensal);
        System.out.println("\n");
    }
}
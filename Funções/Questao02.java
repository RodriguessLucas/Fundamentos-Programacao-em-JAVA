import java.util.Scanner;

public class Questao02 {
    public static void main(String args[]){
        double usd = receberValorUSD();
        double brl = cambio(usd);
        printarConversao(usd, brl); 
    }

    public static double receberValorUSD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valr o em USD que deseja converter em reais:");
        double entradaEmBRL = scanner.nextDouble();
        scanner.close();
        return entradaEmBRL;
    }

    public static double cambio(double USD){
        final double cambio = 5.27;
        return USD*cambio;
    }

    public static void printarConversao(double USD, double BRL){
        System.out.println("USD " + USD + " em BRL é " + BRL);
    }

    
} 
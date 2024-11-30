import java.util.Scanner;

public class Questao01{

    public static void dobrar(int valor){
        System.out.println("O dobro de " + valor +" é " +valor*2); 
    }

    public static int receberEntrada(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro:");
        int valor = scanner.nextInt();
        scanner.close();
        return valor;
    }

    public static void main(String args[]){
        int valor = receberEntrada();
        dobrar(valor);
    }   
}
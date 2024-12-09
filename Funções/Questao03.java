import java.util.Scanner;
public class Questao03{
    
    public static int calcularArea(int base, int altura){
        return base*altura;
    }
    public static int calcularPerimetro(int base, int altura){
        return 2*base + 2*altura;
    }
    public static int[] receberRetangulo(){
        int base,altura;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um valor para a Base: ");
            base = sc.nextInt();
            
            System.out.print("Digite um valor para a Altura: ");
            altura = sc.nextInt();
        }
        return new int[]{base, altura};
    }
    public static void main(String[] args) {
        int[] retangulo = receberRetangulo();
        int base = retangulo[0];
        int altura = retangulo[1];

        System.out.print("Area do retangulo: " + calcularArea(base, altura) + "\n");
        System.out.print("Perimetro do retangulo: "+ calcularPerimetro(base, altura) + "\n");   

    }
}
import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        double resultado = numero1+numero2;


        System.out.println("O resultado da soma dos números escolhidos será: " + resultado);



    }
}

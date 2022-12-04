import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {

        //Simulação de cadastro em um site

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.next();
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite seu e-mail: ");
        String email = sc.next();
        System.out.println("Informe seu CPF: ");
        String cpf = sc.next();

        if (idade >= 18) {
            System.out.println("Cadastro realizado!");
        } else
            System.out.println("Não foi possível realizar o cadastro, a idade permitida é de 18 para cima.");
    }
}

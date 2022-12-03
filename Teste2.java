import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String nome = sc.next();
        System.out.println("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = sc.nextFloat();

        float media = (nota1+nota2+nota3)/3;

        System.out.println("A nota do(a) aluno(a) "+ nome + " é " + media);

        if (media < 7) {
            System.out.println("O(a) aluno(a) foi reprovado(a)");
        } else
            System.out.println("Aluno(a) aprovado(a)");
    }
}

import java.util.Scanner;

public class AtravessarRua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olhe para a direita");
        System.out.println("Olhe para a esquerda");
        System.out.println("O sinal está verde? ");
        String resposta = sc.next();
        String sim = resposta;
        String nao = resposta;

       if (resposta == sim) {
           System.out.println("pode atravessar");
       } else
           System.out.println("não pode atravessar");
}
}








import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float n = 0;
        float soma = 0;
        String frase = "";
        String numero = "";

        do{
            System.out.println("Digite um número qualquer ou 0 para parar o loop: ");
            n = Float.parseFloat(scanner.nextLine());

            soma += n;

            if (n != 0) {
                numero = n+" + ";
                frase = frase.concat(numero);
            } else {
                frase = frase.substring(0,frase.lastIndexOf(" +"));
            }

        } while (n != 0);

        System.out.println("A soma realizada foi: ");
        System.out.printf("%s = %.2f",frase, soma);
    }
}

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = Integer.parseInt(scanner.nextLine());

        int i = n;
        int fat = n;
        String numero = "";
        String frase = "";

        while (i > 2){
            i--;
            fat = fat * i;
            System.out.println(fat);

        }

        i = n;

        while (i > 0){
            if (i != 1) {
                numero = i + " * ";
                frase = frase.concat(numero);
            } else {
                frase = frase.substring(0,frase.lastIndexOf(" *"));
            }
            i--;
        }
        System.out.println("O fatorial realizado foi: ");
        System.out.printf("%s = %d",frase, fat);
    }
}

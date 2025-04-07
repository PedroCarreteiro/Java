import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        String texto = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        texto = (scanner.nextLine());

        System.out.println("O tamanho do texto é: ");
        System.out.println(texto.length());

        System.out.println("A primeira letra é: ");
        System.out.println(texto.charAt(0));

        System.out.println("A última letra é: ");
        System.out.println(texto.charAt(texto.length()-1));
    }
}

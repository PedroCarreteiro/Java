import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto = "";
        String palavra = "";

        System.out.println("Digite um texto: ");
        texto = (input.nextLine());

        System.out.println("Digite uma palavra: ");
        palavra = (input.nextLine());

        System.out.println("A palavra "+palavra+" é "+texto.contains(palavra)+" no texto "+texto);
    }
}

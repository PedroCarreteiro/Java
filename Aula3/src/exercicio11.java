import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = (input.nextLine());

        System.out.println("Digite a palavra que você quer: ");
        String palavra = (input.nextLine());

        String texto_transform = (texto.toLowerCase());
        String palavra_transform = (palavra.toLowerCase());

        int tamanho_texto = (texto.length());
        int posicao_palavra = texto_transform.indexOf(palavra_transform);

        String primeira_palavra = texto.substring(posicao_palavra);

        System.out.println(primeira_palavra);
    }
}

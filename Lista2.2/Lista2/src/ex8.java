import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a frase: ");
        String frase = scanner.nextLine();

        System.out.print("Digite a chave: ");
        int chave = Integer.parseInt(scanner.nextLine());

        String resultado = "";
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char)((c - 'a' + chave) % 26 + 'a');
            } else if (c >= 'A' && c <= 'Z') {
                c = (char)((c - 'A' + chave) % 26 + 'A');
            }

            resultado += c;
            i++;
        }

        System.out.println("Cifrado: " + resultado);

    }
}

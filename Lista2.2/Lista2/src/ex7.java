import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine().trim();

        String resultado = "";
        boolean novaPalavra = true;

        int i = 0;
        while (i < nome.length()) {
            char c = nome.charAt(i);

            if (c == ' ') {
                if (!resultado.endsWith(" ")) {
                    resultado += " ";
                    novaPalavra = true;
                }
            } else {
                if (novaPalavra) {
                    if (c >= 'a' && c <= 'z') {
                        c = (char)(c - 32);
                    }
                    novaPalavra = false;
                } else {
                    if (c >= 'A' && c <= 'Z') {
                        c = (char)(c + 32);
                    }
                }
                resultado += c;
            }
            i++;
        }

        System.out.println("Nome formatado: " + resultado);
    }
}

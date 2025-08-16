import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a variável: ");
        String variavel = scanner.nextLine();

        boolean underline = false;
        boolean maiuscula = false;
        char primeiro = variavel.charAt(0);

        int i = 0;
        while (i < variavel.length()) {
            char c = variavel.charAt(i);

            if (c == '_') {
                underline = true;
            }

            if (c >= 'A' && c <= 'Z') {
                maiuscula = true;
            }
            i++;
        }

        if (underline) {
            System.out.println("A variável está em snake_case");
        } else if (primeiro >= 'A' && primeiro <= 'Z') {
            System.out.println("A variável está em PascalCase");
        } else if (primeiro >= 'a' && primeiro <= 'z' && maiuscula) {
            System.out.println("A variável está em camelCase");
        } else {
            System.out.println("Não foi possível identificar o padrão.");
        }
    }
}

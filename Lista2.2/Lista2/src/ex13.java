import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string: ");
        String str = scanner.nextLine();

        int i = 0;
        boolean achou = false;

        while (i < str.length() && !achou) {
            char c = str.charAt(i);

            int j = 0;
            int cont = 0;
            while (j < str.length()) {
                if (str.charAt(j) == c) cont++;
                j++;
            }

            if (cont == 1) {
                System.out.println("Primeiro não repetido: " + c);
                achou = true;
            }

            i++;
        }

        if (!achou) {
            System.out.println("Nenhuma letra única encontrada.");
        }

    }
}

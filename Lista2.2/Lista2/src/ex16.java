import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira string: ");
        String s1 = scanner.nextLine();
        System.out.print("Digite a segunda string: ");
        String s2 = scanner.nextLine();

        String maior = "";

        int i = 0;
        while (i < s1.length()) {
            int j = i;
            String atual = "";

            while (j < s1.length()) {
                atual = atual + s1.charAt(j);

                // verificar se 'atual' está em s2
                int k = 0;
                boolean encontrado = false;
                while (k <= s2.length() - atual.length()) {
                    int l = 0;
                    boolean igual = true;
                    while (l < atual.length()) {
                        if (s2.charAt(k + l) != atual.charAt(l)) {
                            igual = false;
                            break;
                        }
                        l++;
                    }
                    if (igual) {
                        encontrado = true;
                        break;
                    }
                    k++;
                }

                if (encontrado && atual.length() > maior.length()) {
                    maior = atual;
                }

                j++;
            }

            i++;
        }

        System.out.println("Maior substring comum: " + maior);

    }
}

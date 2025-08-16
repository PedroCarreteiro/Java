import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String p1 = scanner.nextLine();
        System.out.print("Digite a segunda palavra: ");
        String p2 = scanner.nextLine();

        if (p1.length() != p2.length()) {
            System.out.println("Não são anagramas.");
        } else {
            boolean anagrama = true;

            int i = 0;
            while (i < p1.length()) {
                char c = p1.charAt(i);

                int cont1 = 0;
                int cont2 = 0;

                int j = 0;
                while (j < p1.length()) {
                    if (p1.charAt(j) == c){
                        cont1++;
                    }
                    j++;
                }

                j = 0;
                while (j < p2.length()) {
                    if (p2.charAt(j) == c){
                        cont2++;
                    }
                    j++;
                }

                if (cont1 != cont2) {
                    anagrama = false;
                    break;
                }
                i++;
            }

            if (anagrama) {
                System.out.println("São anagramas!");
            } else {
                System.out.println("Não são anagramas.");
            }
        }

    }
}

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o segundo número: ");
        int b = Integer.parseInt(scanner.nextLine());

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        System.out.println("MDC = " + a);

    }
}

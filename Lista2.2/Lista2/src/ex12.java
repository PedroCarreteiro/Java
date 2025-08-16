import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o início: ");
        int inicio = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o fim: ");
        int fim = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o dígito (0 a 9): ");
        int d = Integer.parseInt(scanner.nextLine());

        int contador = 0;

        int num = inicio;
        while (num <= fim) {
            int temp = num;
            if (temp == 0 && d == 0){
                contador++;
            }

            while (temp > 0) {
                if (temp % 10 == d){
                    contador++;
                }
                temp /= 10;
            }
            num++;
        }

        System.out.println("O dígito aparece " + contador + " vezes.");

    }
}

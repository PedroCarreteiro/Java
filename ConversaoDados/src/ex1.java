import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a parte inteira: ");
        String inteira = scanner.nextLine();

        System.out.println("Digite a parte decimal: ");
        String decimal = scanner.nextLine();

        decimal = "."+decimal;

        String numero = inteira+decimal;

        double num_final = Double.parseDouble(numero);

        System.out.println("O numero digitado é: "+num_final);
    }
}

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String numero = (input.nextLine());

        String transform = numero.replace(",",".");

        double numero_transformado = Double.parseDouble(transform);

        System.out.println("O número transformado é: "+numero_transformado);


    }
}

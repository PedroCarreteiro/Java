import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = Math.PI;

        System.out.println("Digite o raio do círculo: ");
        double raio = Double.parseDouble(input.nextLine());

        System.out.printf("A circunferência do círuculo é: %.2f\n",(2*pi*raio));
        System.out.printf("A área do círculo é: %.2f",pi*Math.pow(raio,2));
    }
}

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo: ");
        double lado1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o segundo lado do triângulo: ");
        double lado2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o terceiro lado do triângulo: ");
        double lado3 = Double.parseDouble(scanner.nextLine());

        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Triângulo equilátero!");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo isósceles!");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("Triânglulo escaleno!");
        }
    }
}

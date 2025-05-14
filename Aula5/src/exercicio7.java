import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a operação que você quer realizar\nSoma = +\nSubtração = -\nDivisão = /\nMultiplição = *");
        String operacao = input.nextLine();

        double n1 = 0;
        double n2 = 0;

        switch (operacao) {
            case("+"):
                System.out.println("Digite o primeiro número: ");
                n1 = Double.parseDouble(input.nextLine());
                System.out.println("Digite o segundo número: ");
                n2 = Double.parseDouble(input.nextLine());
                System.out.printf("A soma entre %.2f e %.2f é %.2f", n1, n2, (n1+n2));
                break;
            case("-"):
                System.out.println("Digite o primeiro número: ");
                n1 = Double.parseDouble(input.nextLine());
                System.out.println("Digite o segundo número: ");
                n2 = Double.parseDouble(input.nextLine());
                System.out.printf("A subtração entre %.2f e %.2f é %.2f",n1, n2, (n1-n2));
                break;
            case("/"):
                System.out.println("Digite o primeiro número: ");
                n1 = Double.parseDouble(input.nextLine());
                System.out.println("Digite o segundo número: ");
                n2 = Double.parseDouble(input.nextLine());
                if(n2 == 0) {
                    System.out.println("Divisão inválida!");
                } else {
                    System.out.printf("A divisão entre %.2f e %.2f é %.2f",n1, n2, (n1/n2));
                }
                break;
            case("*"):
                System.out.println("Digite o primeiro número: ");
                n1 = Double.parseDouble(input.nextLine());
                System.out.println("Digite o segundo número: ");
                n2 = Double.parseDouble(input.nextLine());
                System.out.printf("A multiplicação entre %.2f e %.2f é %.2f",n1, n2, (n1*n2));
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
    }
}

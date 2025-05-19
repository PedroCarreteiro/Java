import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 3 algarismos: ");
        String numero = scanner.nextLine();

        String n1 = numero.substring(0,1);
        String n2 = numero.substring(1,2);
        String n3 = numero.substring(2);

        int n1_conv = Integer.parseInt(n1);
        int n2_conv = Integer.parseInt(n2);
        int n3_conv = Integer.parseInt(n3);

        int soma = n1_conv + n2_conv + n3_conv;

        System.out.println("A soma dos três algarismos desse número é: "+soma);

    }
}

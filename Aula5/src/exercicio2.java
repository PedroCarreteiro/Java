import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite o segundo número: ");
        double n2 = Double.parseDouble(input.nextLine());

        if (n1 % n2 == 0){
            System.out.printf("%.2f é divisível por %.2f\n",n1,n2);
        } else {
            System.out.printf("%.2f não é divisível por %.2f\n",n1,n2);
        }

        if (n2 % n1 == 0){
            System.out.printf("%.2f é divisível por %.2f",n2,n1);
        } else {
            System.out.printf("%.2f não é divisível por %.2f",n2,n1);
        }
    }
}

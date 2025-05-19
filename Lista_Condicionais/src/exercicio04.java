import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o segundo número: ");
        double n2= Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o terceiro número: ");
        double n3 = Double.parseDouble(scanner.nextLine());

        if((n1 >= n2 && n1 >= n3) && (n2 >= n3)){
            System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f",n1,n2,n3);
        } else if((n1 >= n2 && n1 >= n3) && (n3 >= n2)){
            System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f",n1,n3,n2);
        } else if((n2 >= n1 && n2 >= n3) && (n1 >= n3)){
            System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f",n2,n1,n3);
        } else if((n2 >= n1 && n2 >= n3) && (n3 >= n1)){
            System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f",n2,n3,n1);
        } else if((n3 >= n1 && n3 >= n2) && (n1 >= n2)){
            System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f",n3,n1,n2);
        } else if((n3 >= n1 && n3 >= n2) && (n2 >= n1)){
            System.out.printf("Os números em ordem crescente são: %.2f, %.2f, %.2f",n3,n2,n1);
        }
    }

}

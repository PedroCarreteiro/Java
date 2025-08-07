import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo número: ");
        int n2 = Integer.parseInt(scanner.nextLine());

        int resto = 0;
        int auxiliar = 0;

        if (n1 > n2){
            if(n1%n2 == 0){
                System.out.println("O MDC é "+n2);
            } else {
                while (n1%n2 != 0){
                    resto = n1%n2;
                    auxiliar = n2;
                    n1 = auxiliar;
                    n2 = resto;
                }
                System.out.println("O MDC é "+n2);
            }
        } else if (n1 < n2){
            if(n2%n1 == 0){
                System.out.println("O MDC é "+n1);
            } else {
                while (n2%n1 != 0){
                    resto = n2%n1;
                    auxiliar = n1;
                    n2 = auxiliar;
                    n1 = resto;
                }
                System.out.println("O MDC é "+n1);
            }
        }
    }
}

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = -1;
        int soma = 0;

        while (n < 0){
            System.out.println("Digite um número positivo: ");
            n = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i <= n; i++){
            soma += i;
        }

        System.out.printf("A soma de todos os antecessores de %d é %d",n,soma);
    }
}

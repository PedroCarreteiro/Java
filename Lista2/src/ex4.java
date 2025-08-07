import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.printf("%d",i);
            }
            System.out.println();
        }
    }
}

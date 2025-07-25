import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da tabuada: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++){
            int mult = n * i;
            System.out.printf("%d x %d = %d\n",n, i, mult);
        }
    }
}

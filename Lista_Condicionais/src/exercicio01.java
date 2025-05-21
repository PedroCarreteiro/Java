import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = Double.parseDouble(scanner.nextLine());

        if (numero % 3 == 0){
            System.out.println("O número é divisível por 3!");
        } else{
            System.out.println("O número não é divisível por 3!");
        }
    }
}

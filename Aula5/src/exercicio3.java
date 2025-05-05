import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n = Double.parseDouble(input.nextLine());

        if (n > 0){
            System.out.println("O número é positivo!");
        } else if(n < 0){
            System.out.println("O número é negativo!");
        } else{
            System.out.println("O número é 0");
        }
    }
}

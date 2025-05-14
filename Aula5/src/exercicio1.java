import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(input.nextLine());

        if (idade > 17){
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

    }
}

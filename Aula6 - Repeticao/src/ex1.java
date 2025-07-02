import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        int idade = 0;
        float altura = 0;

        do{
            System.out.println("Digite sua idade: ");
            idade = Integer.parseInt(scanner.nextLine());

        } while ((idade < 0));

        do{
            System.out.println("Digite sua altura: ");
            altura = Float.parseFloat(scanner.nextLine());

        } while ((altura <= 0) || (altura >= 3));

        System.out.printf("Olá %s, os valores digitados foram: \n Idade: %d ano(s) \n Altura: %.2f metro(s)\n",nome, idade, altura);
    }
}

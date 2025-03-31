import java.util.Scanner;
import java.util.stream.Stream;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = (scanner.nextLine());

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite seu CPF: ");
        long cpf = Long.parseLong(scanner.nextLine());

        System.out.println("Digite sua altura: ");
        float altura = Float.parseFloat(scanner.nextLine());

        System.out.println("Digite seu peso: ");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.printf("Paciente %s, CPF: %d \n",nome, cpf);
        System.out.println("------------------------------------");
        System.out.println("Idade: "+idade+";");
        System.out.printf("Altura: %.2f;\n", altura);
        System.out.printf("Peso: %.2f;", peso);
    }
}

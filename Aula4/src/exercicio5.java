import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = (input.nextLine());

        System.out.println("Digite a quantidade de horas trabalhadas nesse mês: ");
        double horas = Double.parseDouble(input.nextLine());

        System.out.println("Digite a quantidade de anos de casa: ");
        int anos = Integer.parseInt(input.nextLine());

        System.out.println("Digite quanto você ganha por hora trabalhada: ");
        double valor_hora = Double.parseDouble(input.nextLine());

        int aumento = 0;
        int conta_aumento = (anos <= 5) ? aumento = 0 : (anos >= 6 && anos <= 10) ? aumento = 10 : aumento = 20;

    }
}

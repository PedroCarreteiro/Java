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

        double salario = horas*valor_hora;

        double aumento = (anos <= 5) ? 0 : (anos <= 10) ? salario * 0.1 : salario * 0.2;

        double salario_atualizado = salario + aumento;

        System.out.printf("Você teve R$%.2f de aumento, e seu salário final é R$%.2f",aumento,salario_atualizado);
    }
}

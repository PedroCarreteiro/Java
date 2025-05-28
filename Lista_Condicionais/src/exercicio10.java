import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = Double.parseDouble(scanner.nextLine());

        double reajuste = 0;

        if (salario < 3000){
            reajuste = salario * 0.35;
        } else {
            reajuste = salario * 0.15;
        }

        System.out.printf("O seu reajuste foi de R$%.2f, resultando em um salário final de R$%.2f",reajuste, salario+reajuste);

    }
}

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite outro número: ");
        double numero2 = Double.parseDouble(input.nextLine());

        double soma = numero1+numero2;
        double subtracao = numero1-numero2;
        double multiplicacao = numero1*numero2;
        double divisao = numero1/numero2;
        double elevar = Math.pow(numero1,numero2);
        double raiz = Math.sqrt(numero1);

        System.out.printf("%.2f + %.2f = %.2f\n",numero1,numero2,soma);
        System.out.printf("%.2f - %.2f = %.2f\n",numero1,numero2,subtracao);
        System.out.printf("%.2f * %.2f = %.2f\n",numero1,numero2,multiplicacao);
        System.out.printf("%.2f / %.2f = %.2f\n",numero1,numero2,divisao);
        System.out.printf("%.2f ^ %.2f = %.2f\n",numero1,numero2,elevar);
        System.out.printf("√%.2f = %.2f\n",numero1,raiz);
    }
}

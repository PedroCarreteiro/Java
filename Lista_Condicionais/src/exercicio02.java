import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite outro número: ");
        double n2 = Double.parseDouble(scanner.nextLine());

        double soma = n1 + n2;

        double resultado = 0;

        if(soma > 20){
            resultado = soma + 8;
        } else{
            resultado = soma - 5;
        }

        System.out.println("O resultado final é: "+resultado);
    }
}

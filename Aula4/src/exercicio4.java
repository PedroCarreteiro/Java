import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite o segundo número: ");
        double n2 = Double.parseDouble(input.nextLine());

        String saida = (n1>n2) ? "O número "+n1+" é maior que "+n2 : "O número "+n2+" é maior que "+n1;

        System.out.println(saida);
    }
}

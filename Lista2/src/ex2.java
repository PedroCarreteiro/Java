import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;

        do{
            System.out.println("Digite o primeiro número: ");
            double n1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite a operação (+,-,*,/): ");
            String operacao = scanner.nextLine();

            System.out.println("Digite o segundo número: ");
            double n2 = Double.parseDouble(scanner.nextLine());

            if(operacao.equals("+")){
                System.out.printf("O resultado da operacao é: %.2f\n",(n1+n2));
            } else if (operacao.equals("-")) {
                System.out.printf("O resultado da operacao é: %.2f\n",(n1-n2));
            } else if (operacao.equals("*")) {
                System.out.printf("O resultado da operacao é: %.2f\n",(n1*n2));
            } else if (operacao.equals("/")) {
                System.out.printf("O resultado da operacao é: %.2f\n",(n1/n2));
            } else {
                System.out.println("A operação digitada não corresponde a nenhuma das opções!");
            }

            System.out.println("Digite (sair) para sair do programa ou qualquer outro caracter para continuar: ");
            String decisao = scanner.nextLine();
            decisao = decisao.toLowerCase();
            if (decisao.equals("sair")){
                sair = true;
            }
        } while (!sair);

    }
}

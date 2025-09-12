import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        double saque = 0;
        double deposito = 0;
        String operacao = "";
        boolean inicio = true;
        boolean entrada = true;

        while (inicio){
            try {
                System.out.println("\nQual das operações você deseja realizar: \n" +
                        "1 - Verificar saldo\n" +
                        "2 - Realizar saque\n" +
                        "3 - Realizar depósito\n" +
                        "4 - Sair");
                operacao = scanner.nextLine();
                entrada = true;
                while (entrada){
                    try {
                        switch (operacao){
                            case "1" ->{
                                System.out.println("Seu saldo é: "+saldo);
                                entrada = false;
                            }
                            case "2" ->{
                                System.out.println("Quanto você deseja sacar?");
                                saque = Double.parseDouble(scanner.nextLine());
                                if (saque > saldo){
                                    throw new ArithmeticException("Saldo insuficiente!");
                                } else {
                                    saldo-=saque;
                                    System.out.printf("Você sacou %.2f, seu saldo agora é %.2f",saque,saldo);
                                }
                                entrada = false;
                            }
                            case "3" ->{
                                System.out.println("Quanto você deseja depositar?");
                                deposito = Double.parseDouble(scanner.nextLine());
                                saldo+=deposito;
                                System.out.printf("Você realizou um depósito de %.2f e seu saldo atual é %.2f", deposito, saldo);
                                entrada = false;
                            }
                            case "4" ->{
                                System.out.println("Você saiu do programa!");
                                entrada = false;
                                inicio = false;
                            }
                        }
                    } catch (NumberFormatException e){
                        System.out.println("Digite um número válido!");
                    }
                }
            } catch (IndexOutOfBoundsException e){
                System.out.println("Digite uma opção válida!");
            }
        }
    }
}

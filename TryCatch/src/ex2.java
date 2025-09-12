import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = 0;
        double n2 = 0;
        boolean entrada = true;
        boolean inicio = true;
        String operacao = "";
        double resultado = 0;

        while (inicio){
            try {
                System.out.println("Digite a operação: \n" +
                        "1 - Soma\n" +
                        "2 - Subtração\n" +
                        "3 - Multiplicação\n" +
                        "4 - Divisão\n" +
                        "5 - Potência\n" +
                        "6 - Raiz\n" +
                        "7 - Sair");
                operacao = scanner.nextLine();
                entrada = true;

                while (entrada){
                    try{
                        switch (operacao) {
                            case "1" -> {
                                System.out.println("Digite o primeiro número: ");
                                n1 = Double.parseDouble(scanner.nextLine());
                                System.out.println("Digite o segundo número: ");
                                n2 = Double.parseDouble(scanner.nextLine());
                                resultado = n1 + n2;
                                System.out.printf("O resultado da soma: %.2f\n\n",resultado);
                                entrada = false;
                            }
                            case "2" -> {
                                System.out.println("Digite o primeiro número: ");
                                n1 = Double.parseDouble(scanner.nextLine());
                                System.out.println("Digite o segundo número: ");
                                n2 = Double.parseDouble(scanner.nextLine());
                                resultado = n1 - n2;
                                System.out.printf("O resultado da subtração: %.2f\n\n",resultado);
                                entrada = false;
                            }
                            case "3" -> {
                                System.out.println("Digite o primeiro número: ");
                                n1 = Double.parseDouble(scanner.nextLine());
                                System.out.println("Digite o segundo número: ");
                                n2 = Double.parseDouble(scanner.nextLine());
                                resultado = n1 * n2;
                                System.out.printf("O resultado da multiplicação: %.2f\n\n",resultado);
                                entrada = false;
                            }
                            case "4" -> {
                                System.out.println("Digite o primeiro número: ");
                                n1 = Double.parseDouble(scanner.nextLine());
                                System.out.println("Digite o segundo número: ");
                                n2 = Double.parseDouble(scanner.nextLine());
                                System.out.printf("O resultado da divisão é: %.2f\n\n",resultado);
                                resultado = n1 / n2;
                                entrada = false;
                            }
                            case "5" -> {
                                System.out.println("Digite o número: ");
                                n1 = Double.parseDouble(scanner.nextLine());
                                System.out.println("Digite o número para realizar a potência: ");
                                n2 = Double.parseDouble(scanner.nextLine());
                                resultado = Math.pow(n1, n2);
                                System.out.printf("O resultado da potência é: %.2f\n\n",resultado);
                                entrada = false;
                            }
                            case "6" -> {
                                System.out.println("Digite o número: ");
                                n1 = Double.parseDouble(scanner.nextLine());
                                System.out.println("Digite o radical: ");
                                n2 = Double.parseDouble(scanner.nextLine());
                                resultado = Math.pow(n1,1/n2);
                                System.out.printf("O resultado da raiz é: %.2f\n\n",resultado);
                                entrada = false;
                            }
                            case "7" -> {
                                System.out.println("Você saiu do programa!");
                                entrada = false;
                                inicio = false;
                            }
                            default -> {
                                System.out.println("Digite uma operação válida!");
                                entrada = false;
                            }
                        }
                    } catch (NumberFormatException e){
                        System.out.println("Não é um número!");
                    }
                }
            } catch (IndexOutOfBoundsException e){
                System.out.println("Não é um número!");
            }
        }
    }
}

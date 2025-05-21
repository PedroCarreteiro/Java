import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a moeda que você tem: ");
        String moeda_atual = scanner.nextLine();

        System.out.println("Digite o valor que você quer converter: ");
        double valor = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a moeda que você deseja converter: ");
        String moeda_futura = scanner.nextLine();

        double valor_atualizado = 0;

        moeda_atual = moeda_atual.toLowerCase();
        moeda_futura = moeda_futura.toLowerCase();

        if (moeda_atual.equals("real")){
            if (moeda_futura.equals("dolar")){
                valor_atualizado = valor*0.18;
            } else if (moeda_futura.equals("euro")) {
                valor_atualizado = valor*0.16;
            }
        } else if (moeda_atual.equals("dolar")){
            if(moeda_futura.equals("real")){
                valor_atualizado = valor*5.67;
            } else if (moeda_futura.equals("euro")){
                valor_atualizado = valor*0.88;
            }
        } else if (moeda_atual.equals("euro")) {
            if(moeda_futura.equals("dolar")){
                valor_atualizado = valor*1.13;
            } else if (moeda_futura.equals("real")) {
                valor_atualizado = valor*6.40;
            }
        }

        System.out.printf("O valor de %.2f em %s é %.2f",valor,moeda_futura,valor_atualizado);
    }
}

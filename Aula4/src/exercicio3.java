import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua opção para conversão: \nFahrenheit = 1\nCelsius = 2");
        String opcao = (input.nextLine());

        if(opcao.equals("1")){

            try {
                System.out.println("Digite a temperatura em Celsius: ");
                double valor = Double.parseDouble(input.nextLine());

                double conta = (valor*9/5)+32;

                System.out.printf("A temperatura em Fahrenheit é: %.2f°F",conta);
            }

            catch (Exception e){
                System.out.println("Valor inválido!");
            }

        }

        else if(opcao.equals("2")){

            try{
                System.out.println("Digite a temperatura em Farenheit: ");
                double valor = Double.parseDouble(input.nextLine());

                double conta = (valor-32)*5/9;

                System.out.printf("A temperatura em Celsius é: %.2f°C",conta);
            }

            catch (Exception e){
                System.out.println("Valor inválido!");
            }
        }

        else{
            System.out.println("O valor digitado não está nos parâmetros!");
        }
    }
}


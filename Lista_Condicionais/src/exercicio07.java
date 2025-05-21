import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso em quilos: ");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a sua altura em metros: ");
        double altura = Double.parseDouble(scanner.nextLine());

        double imc = peso/(Math.pow(altura,2));

        String classe = "";

        if(imc < 18.5){
            classe = "Abaixo do peso";
            System.out.printf("O seu IMC é %.2f e sua classe é: %s",imc,classe);
        } else if (imc >= 18.5 && imc < 25){
            classe = "Saudável";
            System.out.printf("O seu IMC é %.2f e sua classe é: %s",imc,classe);
        } else if (imc >= 25 && imc < 30){
            classe = "Sobrepeso";
            System.out.printf("O seu IMC é %.2f e sua classe é: %s",imc,classe);
        } else if (imc >= 30 && imc < 35) {
            classe = "Obesidade grau I";
            System.out.printf("O seu IMC é %.2f e sua classe é: %s",imc,classe);
        } else if (imc >= 35 && imc < 40) {
            classe = "Obesidade grau II";
            System.out.printf("O seu IMC é %.2f e sua classe é: %s",imc,classe);
        } else if (imc >= 40){
            classe = "Obesidade grau III";
            System.out.printf("O seu IMC é %.2f e sua classe é: %s",imc,classe);
        }
    }
}

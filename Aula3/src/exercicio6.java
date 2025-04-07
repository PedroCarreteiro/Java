import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto = "Eu gosto de maçã, maçã é gostosa!";
        String caracter = "";

        System.out.println("Digite um caracter do texto: ");
        caracter = (input.nextLine());

        String caracter_atualizado = caracter.toLowerCase(); //Colocar caractere em minúsculo para não dar erro

        System.out.println("A última ocorrência desse caracter é: "+texto.lastIndexOf(caracter_atualizado));
    }
}

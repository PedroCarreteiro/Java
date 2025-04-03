import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto = "";
        String caracter = "";

        System.out.println("Digite um texto: ");
        texto = (input.nextLine());

        System.out.println("Digite um caracter do texto: ");
        caracter = (input.nextLine());

        String caracter_atualizado = caracter.toLowerCase(); //Colocar caractere em minúsculo para não dar erro

        System.out.println("A primeira ocorrência desse caracter é: "+texto.indexOf(caracter_atualizado));
    }
}

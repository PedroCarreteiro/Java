import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String abcdario = "abcdefghijklmnopqrstuvwxyz";
        int posicao = 0;

        System.out.println("Digite um número de 1 a 26: ");
        posicao = Integer.parseInt(input.nextLine());

        int posicao_atualizada = posicao-1; //Deixar a posição para começar a partir do 1

        System.out.println("A letra de acordo com o número "+posicao+" é "+abcdario.charAt(posicao_atualizada));
    }
}

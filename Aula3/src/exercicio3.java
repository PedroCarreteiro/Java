import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {

            String texto = "";
            int posicao = 0;

            System.out.println("Digite um texto: ");
            texto = (input.nextLine());

            System.out.println("Digite um número entre 1 e o tamanho do texto: ");
            posicao = Integer.parseInt(input.nextLine());

            int posicao_atualizada = posicao - 1; //Deixar a posição para começar a partir do 1

            System.out.println("A letra de acordo com o número " + posicao + " é " + texto.charAt(posicao_atualizada));
        } catch (Exception e){
            System.out.println("O número ultrapassa os limites da string!");
        }
    }
}

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean entrada = true;
        int qtd_notas = 0;
        int media = 0;
        int notas = 0;


        while (entrada){
            try {
                System.out.println("Digite a nota");
                int nota = Integer.parseInt(scanner.nextLine());
                if(nota > 0){
                    notas+=nota;
                    qtd_notas++;
                }
                else{
                    entrada = false;
                }
            } catch (Exception e){
                System.out.println("Número inválido!\nDigite novamente\n");
            }
        }

        media = notas/qtd_notas;

        System.out.println("A média é: "+media);
    }
}

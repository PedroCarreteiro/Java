import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean entrada = true;
        int qtd_notas = 0;
        double media = 0;
        double notas = 0;


        while (entrada){
            try {
                System.out.println("Digite a "+(qtd_notas + 1)+"° nota");
                double nota = Double.parseDouble(scanner.nextLine());
                if(nota >= 0){
                    notas+=nota;
                    qtd_notas++;
                }
                else{
                    entrada = false;
                }
            } catch (NumberFormatException e){
                System.out.println("Número inválido!\nDigite novamente\n");
            }
        }

        try{
            media = notas/qtd_notas;
            System.out.println("A média é: "+media);
        } catch (ArithmeticException e){
            System.out.println("Não foi inserido nenhuma nota!");
        }



    }
}

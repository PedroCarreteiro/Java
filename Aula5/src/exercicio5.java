import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = Integer.parseInt(input.nextLine());

//        if(ano % 4 == 0 && ano % 100 != 0){
//            System.out.println("O ano é bissexto!");
//        } else if (ano % 400 == 0){
//            System.out.println("O ano é bissexto!");
//        } else {
//            System.out.println("O ano não é bissexto!");
//        }

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("O ano é bissexto!");
        } else {
            System.out.println("O ano não é bissexto!");
        }
    }
}

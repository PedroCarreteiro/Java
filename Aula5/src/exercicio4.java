import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra1 = input.nextLine();

        System.out.println("Digite outra palavra: ");
        String palavra2 = input.nextLine();

//        if (palavra1.toLowerCase().equals(palavra2.toLowerCase())){
//            System.out.println("As palavras são iguais!");
//        } else {
//            System.out.println("As palavras são diferentes!");
//        }

        if (palavra1.equalsIgnoreCase(palavra2)){
            System.out.println("As palavras são iguais!");
        } else {
            System.out.println("As palavras são diferentes!");
       }
    }
}

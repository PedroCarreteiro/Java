import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        String classe = "";

        if(idade >= 5 && idade <= 7){
            classe = "Infatil A";
            System.out.println("Sua classe é: "+classe);
        } else if (idade >= 8 && idade <= 10){
            classe = "Infantil B";
            System.out.println("Sua classe é: "+classe);
        } else if (idade >= 11 && idade <= 13){
            classe = "Juvenil A";
            System.out.println("Sua classe é: "+classe);
        } else if (idade >= 14 && idade <= 17) {
            classe = "Juvenil B";
            System.out.println("Sua classe é: "+classe);
        } else if (idade >= 18) {
            classe = "Sênior";
            System.out.println("Sua classe é: "+classe);
        } else {
            System.out.println("Idade inválida!");
        }
    }
}

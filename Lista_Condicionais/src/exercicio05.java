import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        String classe = "";

        if(idade < 16){
           classe = "Não eleitor";
        } else if (idade >= 18 && idade <= 65){
            classe = "Eleitor obrigatório";
        } else{
            classe = "Eleitor facultativo";
        }

        System.out.println("Sua classe eleitoral é: "+classe);
    }
}

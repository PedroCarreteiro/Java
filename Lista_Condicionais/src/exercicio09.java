import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida em km: ");
        double distancia = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a quantidade de litros consumidos: ");
        double litros = Double.parseDouble(scanner.nextLine());

        if((distancia/litros) < 8){
            System.out.println("Venda o carro!");
        } else if ((distancia/litros) >= 8 && (distancia/litros) <= 12 ) {
            System.out.println("Econômico.");
        } else{
            System.out.println("Super econômico.");
        }
    }
}

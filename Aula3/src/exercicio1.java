import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        String nome = "";
        String cidade = "";
        String estado = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = (scanner.nextLine());

        System.out.println("Digite sua cidade: ");
        cidade = (scanner.nextLine());

        System.out.println("Digite seu estado: ");
        estado = (scanner.nextLine());

        System.out.println(nome.toUpperCase());
        System.out.println(cidade.toLowerCase());
        System.out.println(estado.toUpperCase());
    }
}

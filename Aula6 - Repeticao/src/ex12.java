import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = Integer.parseInt(scanner.nextLine());

        int n_passado = 1;
        int n_auxiliar = 0;

        int somado = 0;
        String lista = "";

        for(int i = 0; i < n; i++){
            somado = n_passado+n_auxiliar;
            lista = lista.concat(","+somado);
            n_passado = n_auxiliar;
            n_auxiliar = somado;
        }

        lista = lista.replaceFirst(",", "");

        System.out.println(lista);

    }
}

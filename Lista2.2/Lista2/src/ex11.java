import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a string comprimida: ");
        String entrada = sc.nextLine();

        String resultado = "";
        int i = 0;

        while (i < entrada.length()) {
            char letra = entrada.charAt(i);
            i++;
            int qtd = entrada.charAt(i) - '0';
            i++;

            int j = 0;
            while (j < qtd) {
                resultado += letra;
                j++;
            }
        }

        System.out.println("Expandida: " + resultado);

        sc.close();
    }
}

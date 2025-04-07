import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = (input.nextLine());

        int primeiro_espaco = (nome.indexOf(" "));
        int segundo_espaco = (nome.lastIndexOf(" "));
        int tamanho_texto = (nome.length());

        String primeiro_nome = nome.substring(0,primeiro_espaco);
        String segundo_nome = nome.substring(segundo_espaco, tamanho_texto);

        System.out.printf("%s%s",primeiro_nome,segundo_nome);

    }
}

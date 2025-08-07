import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero_palavras = 0;

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        while (frase.indexOf(" ") > 0){
            int espaco = frase.indexOf(" ");
            espaco++;
            String palavra = frase.substring(0, espaco);
            numero_palavras++;
            frase = frase.replace(palavra, "");
            palavra = palavra.replace(" ","");
        }

        numero_palavras++;
        System.out.println("Tem "+numero_palavras+" palavra(s) na frase");
    }
}

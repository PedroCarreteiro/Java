import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a frase: ");
        String frase = scanner.nextLine().trim();

        String resultado = "";
        String palavra = "";

        int i = frase.length() - 1;
        while (i >= 0) {
            char c = frase.charAt(i);

            if (c == ' ') {
                if (palavra != "") {
                    if (resultado != ""){
                        resultado += " ";
                    }
                    resultado += palavra;
                    palavra = "";
                }
            } else {
                palavra = c + palavra;
            }
            i--;
        }

        if (palavra != "") {
            if (resultado != ""){
                resultado += " ";
            }
            resultado += palavra;
        }

        System.out.println("Frase invertida: " + resultado);

    }
}

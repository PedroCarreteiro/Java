import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        String numeros = "";

        for (int i = 0; i < texto.length(); i++){
            for (int j = 0; j <= 10; j++){
                String numero_verify = String.valueOf(j);
                if (texto.substring(i, i + 1).equals(numero_verify)){
                    String numero = String.valueOf(j);
                    numeros = numeros.concat(numero);
                }
            }
        }

        if (numeros.equals("")){
            System.out.println("Não tem números");
        } else {
            int numeros_final = Integer.parseInt(numeros);

            System.out.println(numeros_final);
        }
    }
}

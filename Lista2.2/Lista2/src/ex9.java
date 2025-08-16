import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        boolean temMaiuscula = false, temMinuscula = false;
        boolean temNumero = false, temEspecial = false;

        int i = 0;
        while (i < senha.length()) {
            char c = senha.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                temMaiuscula = true;
            }
            else if (c >= 'a' && c <= 'z'){
                temMinuscula = true;
            }
            else if (c >= '0' && c <= '9'){
                temNumero = true;
            }
            else {
                temEspecial = true;
            }
            i++;
        }

        int tamanho = senha.length();
        if (tamanho < 8) {
            System.out.println("Senha Fraca");
        } else if (tamanho >= 12 && temMaiuscula && temMinuscula && temNumero && temEspecial) {
            System.out.println("Senha Muito Forte");
        } else if (temMaiuscula && temMinuscula && temNumero) {
            System.out.println("Senha Forte");
        } else {
            System.out.println("Senha Média");
        }
    }
}

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int inteiro = Integer.parseInt(scanner.nextLine());
        System.out.println("O número inteiro é: "+inteiro);

        System.out.println("Digite um número double: ");
        double db = Double.parseDouble(scanner.nextLine());
        System.out.println("O número double é: "+db);

        System.out.println("Digite um número float: ");
        float flutuante = Float.parseFloat(scanner.nextLine());
        System.out.println("O número float é: "+flutuante);

        System.out.println("Digite um true or false: ");
        boolean tf = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("O true or false é: "+tf);

        System.out.println("Digite um número longo: ");
        long longo = Long.parseLong(scanner.nextLine());
        System.out.println("O número longo é: "+longo);

        System.out.println("Digite um número curto: ");
        short curto = Short.parseShort(scanner.nextLine());
        System.out.println("O número curto é: "+curto);

        System.out.println("Digite um byte: ");
        byte bt = Byte.parseByte(scanner.nextLine());
        System.out.println("O byte é: "+bt);

        System.out.println("Digite uma string: ");
        String str = (scanner.nextLine());
        System.out.println("O número inteiro é: "+str);
    }
}

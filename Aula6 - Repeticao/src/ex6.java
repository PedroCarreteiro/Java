import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de Blobs: ");
        int blobs = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a quantiade de suprimentos: ");
        double suprimentos = Double.parseDouble(scanner.nextLine());

        int dias = 0;

        if (suprimentos < blobs){
            System.out.println("Dados inválidos! Tem menos suprimentos do que Blobs!");
        } else {
            while (suprimentos >= blobs){
                dias++;
                suprimentos*=0.75;
            }
            System.out.printf("%d dia para ficar inferior à %dkg",dias, blobs);
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int aleatorio = random.nextInt(100)+1;
        int tentativa = 0;
        int i = 0;

        //System.out.println(aleatorio);

        while (aleatorio != tentativa){
            System.out.println("Digite sua tentativa: ");
            tentativa = Integer.parseInt(scanner.nextLine());

            if(tentativa > aleatorio){
                System.out.println("Esta tentativa é maior que o número aleatório!");
            }
            else if (tentativa < aleatorio){
                System.out.println("Esta tentativa é menor que o número aleatório!");
            }
            i++;
        }
        System.out.printf("Parabéns, você acertou!\nO número certo é %d e você fez %d tentativas!",aleatorio, i);
    }
}

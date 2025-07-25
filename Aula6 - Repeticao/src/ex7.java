import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int menor = 0;
        int pares = 0;
        int impares = 0;
        int num = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite o "+(i+1)+"° número: ");
            num = Integer.parseInt(scanner.nextLine());
            if(i == 0){
                menor = num;
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
            else if (num > maior){
                maior = num;
            }
            if (num % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);
        System.out.println("A quantidade de números pares é: "+pares);
        System.out.println("A quantidade de números ímpares é: "+impares);
    }
}

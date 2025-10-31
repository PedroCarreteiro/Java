import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o "+(i+1)+"° número: ");
            int n = Integer.parseInt(scanner.nextLine());
            numeros[i] = n;
        }

        for(int j = 0; j < numeros.length; j++){
            for(int i = 0; i < numeros.length; i++){
                if(i >= 1){
                    if(numeros[i] < numeros[i-1]){
                        int auxiliar = numeros[i];
                        numeros[i] = numeros[i-1];
                        numeros[i-1] = auxiliar;
                    }
                }
            }
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}

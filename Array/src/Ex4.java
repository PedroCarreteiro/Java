import java.util.HashSet;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> numeros1Set = new HashSet<>();
        HashSet<Integer> numeros2Set = new HashSet<>();
        HashSet<Integer> intersecSet = new HashSet<>();

        boolean entrada1 = true;
        boolean entrada2 = false;

        while (entrada1){
            System.out.println("\nDigite um número para a primeira lista ou 0 para sair: ");
            int numero = Integer.parseInt(scanner.nextLine());
            if(numero != 0){
                numeros1Set.add(numero);
            } else {
                System.out.println("Iniciando preenchimento da lista 2... ");
                entrada1 = false;
                entrada2 = true;
            }
        }

        while (entrada2){
            System.out.println("\nDigite um número para a segunda lista ou 0 para sair: ");
            int numero = Integer.parseInt(scanner.nextLine());
            if(numero != 0){
                numeros2Set.add(numero);
            } else {
                System.out.println("Finalizado o preenchimento de listas!");
                entrada2 = false;
            }
        }

        for(Integer numero1 : numeros1Set){
            for(Integer numero2 : numeros2Set){
                if(numero1 == numero2){
                    intersecSet.add(numero1);
                }
            }
        }

        for(Integer numero: intersecSet){
            System.out.println(numero);
        }
    }
}

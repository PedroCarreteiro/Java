import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i <= numero; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }
}

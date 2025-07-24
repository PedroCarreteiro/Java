//import java.util.Scanner;
//
//public class ex5 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Digite um número: ");
//        int numero = Integer.parseInt(input.nextLine());
//
//        int i = 2;
//        boolean ehprimo = true;
//
//        while (i < numero){
//            if (numero % i == 0){
//                ehprimo = false;
//                //break;
//            }
//            i++;
//        }
//
//        if (ehprimo == false){
//            System.out.println("O número não é primo");
//        } else {
//            System.out.println("O número é primo");
//        }
//    }
//}

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = Integer.parseInt(input.nextLine());

        int i = 2;
        boolean ehprimo = true;

        if (numero == 1){
            ehprimo = false;
        } else {
            while (i < ((numero/2)+1)){
                if (numero % i == 0){
                    ehprimo = false;
                    //break;
                }
                i++;
            }
        }

        if (ehprimo == false){
            System.out.println("O número não é primo");
        } else {
            System.out.println("O número é primo");
        }
    }
}

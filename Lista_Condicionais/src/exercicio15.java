import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String numero = scanner.nextLine();

        String n1_str = "";
        String n2_str = "";

        if(numero.length() < 2){
            switch (numero){
                case("0"):
                    System.out.println("Zero");
                    break;
                case("1"):
                    System.out.println("Um");
                    break;
                case("2"):
                    System.out.println("Dois");
                    break;
                case("3"):
                    System.out.println("Três");
                    break;
                case("4"):
                    System.out.println("Quatro");
                    break;
                case("5"):
                    System.out.println("Cinco");
                    break;
                case("6"):
                    System.out.println("Seis");
                    break;
                case("7"):
                    System.out.println("Sete");
                    break;
                case("8"):
                    System.out.println("Oito");
                    break;
                case("9"):
                    System.out.println("Nove");
                    break;
            }
        } else if (numero.length() == 2) {
            String n1 = numero.substring(0,1);
            String n2 = numero.substring(1);
            switch (n1){
                case("0"):
                    switch (n2){
                        case ("0"):
                            System.out.println("Zero");
                            break;
                        case ("1"):
                            System.out.println("Um");
                            break;
                        case ("2"):
                            System.out.println("Dois");
                            break;
                        case ("3"):
                            System.out.println("Três");
                            break;
                        case ("4"):
                            System.out.println("Quatro");
                            break;
                        case ("5"):
                            System.out.println("Cinco");
                            break;
                        case ("6"):
                            System.out.println("Seis");
                            break;
                        case ("7"):
                            System.out.println("Sete");
                            break;
                        case ("8"):
                            System.out.println("Oito");
                            break;
                        case ("9"):
                            System.out.println("Nove");
                            break;
                    }
                    break;
                case("1"):
                    switch (n2){
                        case ("0"):
                            System.out.println("Dez");
                            break;
                        case ("1"):
                            System.out.println("Onze");
                            break;
                        case ("2"):
                            System.out.println("Doze");
                            break;
                        case ("3"):
                            System.out.println("Treze");
                            break;
                        case ("4"):
                            System.out.println("Quatorze");
                            break;
                        case ("5"):
                            System.out.println("Quinze");
                            break;
                        case ("6"):
                            System.out.println("Dezesseis");
                            break;
                        case ("7"):
                            System.out.println("Dezessete");
                            break;
                        case ("8"):
                            System.out.println("Dezoito");
                            break;
                        case ("9"):
                            System.out.println("Dezenove");
                            break;
                    }
                    break;
                case ("2"):
                    n1_str = "Vinte";
                    switch (n2) {
                        case ("0"):
                            n2_str = "";
                            break;
                        case ("1"):
                            n2_str = "e um";
                            break;
                        case ("2"):
                            n2_str = "e dois";
                            break;
                        case ("3"):
                            n2_str = "e três";
                            break;
                        case ("4"):
                            n2_str = "e quatro";
                            break;
                        case ("5"):
                            n2_str = "e cinco";
                            break;
                        case ("6"):
                            n2_str = "e seis";
                            break;
                        case ("7"):
                            n2_str = "e sete";
                            break;
                        case ("8"):
                            n2_str = "e oito";
                            break;
                        case ("9"):
                            n2_str = "e nove";
                            break;
                    }
                    break;
                case ("3"):
                    n1_str = "Trinta";
                    switch (n2) {
                        case ("0"):
                            n2_str = "";
                            break;
                        case ("1"):
                            n2_str = "e um";
                            break;
                        case ("2"):
                            n2_str = "e dois";
                            break;
                        case ("3"):
                            n2_str = "e três";
                            break;
                        case ("4"):
                            n2_str = "e quatro";
                            break;
                        case ("5"):
                            n2_str = "e cinco";
                            break;
                        case ("6"):
                            n2_str = "e seis";
                            break;
                        case ("7"):
                            n2_str = "e sete";
                            break;
                        case ("8"):
                            n2_str = "e oito";
                            break;
                        case ("9"):
                            n2_str = "e nove";
                            break;
                    }
                    break;
                case ("4"):
                    n1_str = "Quarenta";
                    switch (n2) {
                        case ("0"):
                            n2_str = "";
                            break;
                        case ("1"):
                            n2_str = "e um";
                            break;
                        case ("2"):
                            n2_str = "e dois";
                            break;
                        case ("3"):
                            n2_str = "e três";
                            break;
                        case ("4"):
                            n2_str = "e quatro";
                            break;
                        case ("5"):
                            n2_str = "e cinco";
                            break;
                        case ("6"):
                            n2_str = "e seis";
                            break;
                        case ("7"):
                            n2_str = "e sete";
                            break;
                        case ("8"):
                            n2_str = "e oito";
                            break;
                        case ("9"):
                            n2_str = "e nove";
                            break;
                    }
                    break;
                case ("5"):
                    n1_str = "Cinquenta";
                    switch (n2) {
                        case ("0"):
                            n2_str = "";
                            break;
                        case ("1"):
                            n2_str = "e um";
                            break;
                        case ("2"):
                            n2_str = "e dois";
                            break;
                        case ("3"):
                            n2_str = "e três";
                            break;
                        case ("4"):
                            n2_str = "e quatro";
                            break;
                        case ("5"):
                            n2_str = "e cinco";
                            break;
                        case ("6"):
                            n2_str = "e seis";
                            break;
                        case ("7"):
                            n2_str = "e sete";
                            break;
                        case ("8"):
                            n2_str = "e oito";
                            break;
                        case ("9"):
                            n2_str = "e nove";
                            break;
                    }
                    break;
                case ("6"):
                    n1_str = "Sessenta";
                    switch (n2) {
                        case ("0"):
                            n2_str = "";
                            break;
                        case ("1"):
                            n2_str = "e um";
                            break;
                        case ("2"):
                            n2_str = "e dois";
                            break;
                        case ("3"):
                            n2_str = "e três";
                            break;
                        case ("4"):
                            n2_str = "e quatro";
                            break;
                        case ("5"):
                            n2_str = "e cinco";
                            break;
                        case ("6"):
                            n2_str = "e seis";
                            break;
                        case ("7"):
                            n2_str = "e sete";
                            break;
                        case ("8"):
                            n2_str = "e oito";
                            break;
                        case ("9"):
                            n2_str = "e nove";
                            break;
                    }
                    break;
                case ("7"):
                    n1_str = "Setenta";
                    switch (n2) {
                        case ("0"):
                            n2_str = "";
                            break;
                        case ("1"):
                            n2_str = "e um";
                            break;
                        case ("2"):
                            n2_str = "e dois";
                            break;
                        case ("3"):
                            n2_str = "e três";
                            break;
                        case ("4"):
                            n2_str = "e quatro";
                            break;
                        case ("5"):
                            n2_str = "e cinco";
                            break;
                        case ("6"):
                            n2_str = "e seis";
                            break;
                        case ("7"):
                            n2_str = "e sete";
                            break;
                        case ("8"):
                            n2_str = "e oito";
                            break;
                        case ("9"):
                            n2_str = "e nove";
                            break;
                    }
                    break;
                case ("8"):
                    n1_str = "Oitenta";
                    switch (n2) {
                        case ("0"):
                            n2_str = "";
                            break;
                        case ("1"):
                            n2_str = "e um";
                            break;
                        case ("2"):
                            n2_str = "e dois";
                            break;
                        case ("3"):
                            n2_str = "e três";
                            break;
                        case ("4"):
                            n2_str = "e quatro";
                            break;
                        case ("5"):
                            n2_str = "e cinco";
                            break;
                        case ("6"):
                            n2_str = "e seis";
                            break;
                        case ("7"):
                            n2_str = "e sete";
                            break;
                        case ("8"):
                            n2_str = "e oito";
                            break;
                        case ("9"):
                            n2_str = "e nove";
                            break;
                    }
                    break;
                case ("9"):
                    n1_str = "Noventa";
                    switch (n2) {
                        case ("0"):
                            n2_str = "";
                            break;
                        case ("1"):
                            n2_str = "e um";
                            break;
                        case ("2"):
                            n2_str = "e dois";
                            break;
                        case ("3"):
                            n2_str = "e três";
                            break;
                        case ("4"):
                            n2_str = "e quatro";
                            break;
                        case ("5"):
                            n2_str = "e cinco";
                            break;
                        case ("6"):
                            n2_str = "e seis";
                            break;
                        case ("7"):
                            n2_str = "e sete";
                            break;
                        case ("8"):
                            n2_str = "e oito";
                            break;
                        case ("9"):
                            n2_str = "e nove";
                            break;
                    }
                    break;
            }

            System.out.println(n1_str+" "+n2_str);
        }
    }
}

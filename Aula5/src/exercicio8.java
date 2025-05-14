import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a data desta forma: DD/MM/AAAA");
        String data = input.nextLine();

        String dia = data.substring(0,2);
        String mes = data.substring(3,5);
        String ano = data.substring(6);


        switch (mes) {
            case ("01"):
                System.out.printf("%s de janeiro de %s", dia, ano);
                break;
            case ("02"):
                System.out.printf("%s de fevereiro de %s", dia, ano);
                break;
            case ("03"):
                System.out.printf("%s de março de %s", dia, ano);
                break;
            case ("04"):
                System.out.printf("%s de abril de %s", dia, ano);
                break;
            case ("05"):
                System.out.printf("%s de maio de %s", dia, ano);
                break;
            case ("06"):
                System.out.printf("%s de junho de %s", dia, ano);
                break;
            case ("07"):
                System.out.printf("%s de julho de %s", dia, ano);
                break;
            case ("08"):
                System.out.printf("%s de agosto de %s", dia, ano);
                break;
            case ("09"):
                System.out.printf("%s de setembro de %s", dia, ano);
                break;
            case ("10"):
                System.out.printf("%s de outubro de %s", dia, ano);
                break;
            case ("11"):
                System.out.printf("%s de novembro de %s", dia, ano);
                break;
            case ("12"):
                System.out.printf("%s de dezembro de %s", dia, ano);
                break;
            default:
                System.out.println("Data inválida");
                break;
        }
    }
}

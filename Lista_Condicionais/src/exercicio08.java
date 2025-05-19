import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas horas você ficou estacionado: ");
        int horas = Integer.parseInt(scanner.nextLine());

        double valor_hora = 0;
        double total = 0;

        if(horas <= 2){
            valor_hora = 2;
            double valor = horas * valor_hora;
        } else if (horas >= 3 && horas <= 4) {
            valor_hora = 1.40;
            double valor = horas * valor_hora;
        } else if (horas > 3){
            valor_hora = 1.40;
        }
    }
}

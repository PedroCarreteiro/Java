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
            total = horas * valor_hora;
        } else if (horas >= 3 && horas <= 4) {
            valor_hora = 1.40;
            total = horas * valor_hora;
        } else if (horas > 4){
            valor_hora = 1.40;
            total = (horas - 4) + (4 * valor_hora);
        }

        System.out.println("O total a se pagar é: "+total);
    }
}

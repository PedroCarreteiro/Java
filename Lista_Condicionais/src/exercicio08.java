import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas horas você ficou estacionado: ");
        int horas = Integer.parseInt(scanner.nextLine());


        double valor_hora = 2;
        double valor_hora2 = 1.40;
        double valor_hora3 = 1;
        double total = 0;

        int horas2 = 2;

        if(horas <= 2){
            total = horas * valor_hora;
        } else if (horas >= 3 && horas <= 4) {
            horas = horas - horas2;
            total = (horas * valor_hora2) + (valor_hora * horas2);
        } else if (horas > 4){
            total = ((horas-4) * valor_hora3) + (valor_hora2 * 2) + (valor_hora * 2);
        }

        System.out.println("O total a se pagar é: "+total);
    }
}
import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da venda: ");
        double venda = Double.parseDouble(scanner.nextLine());

        double bonus = 0;

        double total = 0;

        if(venda < 40000){
            bonus = 500;
            total = (venda*1.14)+bonus;
        } else if(venda >= 40000 && venda < 60000){
            bonus = 550;
            total = (venda*1.14)+bonus;
        } else if(venda >= 60000 && venda < 80000){
            bonus = 600;
            total = (venda*1.14)+bonus;
        } else if(venda >= 80000 && venda < 100000){
            bonus = 650;
            total = (venda*1.14)+bonus;
        } else if(venda > 100000){
            bonus = 700;
            total = (venda*1.16)+bonus;
        }
        System.out.printf("O total da venda com bônus foi de %.2f",total);
    }
}

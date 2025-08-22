import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo numero: ");
        int n2 = Integer.parseInt(scanner.nextLine());

        int mult = n1 * n2;

        String numero_str = String.valueOf(mult);

        int tamanho = numero_str.length();

        System.out.println("O resultado é: "+mult);

        System.out.println("Quantidade de digitos no resultado: "+tamanho);

        for(int i = 0; i <= 9; i++){
            int qtd = 0;
            for (int j = 0; j < tamanho; j++){
                if (numero_str.substring(j, j + 1).equals(String.valueOf(i))){
                    qtd++;
                    if(qtd > 0){
                        System.out.printf("O digito %d aparece %d vez(es) no resultado\n",i,qtd);
                    }
                }
            }
        }
    }
}

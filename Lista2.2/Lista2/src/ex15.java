import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número romano: ");
        String romano = scanner.nextLine().toUpperCase();

        int total = 0;
        int i = 0;

        while (i < romano.length()) {
            char atual = romano.charAt(i);

            int valorAtual = 0;
            if (atual == 'I'){
                valorAtual = 1;
            }
            else if (atual == 'V'){
                valorAtual = 5;
            }
            else if (atual == 'X'){
                valorAtual = 10;
            }
            else if (atual == 'L'){
                valorAtual = 50;
            }
            else if (atual == 'C'){
                valorAtual = 100;
            }
            else if (atual == 'D'){
                valorAtual = 500;
            }
            else if (atual == 'M'){
                valorAtual = 1000;
            }

            int valorProximo = 0;
            if (i + 1 < romano.length()) {
                char prox = romano.charAt(i + 1);
                if (prox == 'I'){
                    valorProximo = 1;
                }
                else if (prox == 'V'){
                    valorProximo = 5;
                }
                else if (prox == 'X'){
                    valorProximo = 10;
                }
                else if (prox == 'L'){
                    valorProximo = 50;
                }
                else if (prox == 'C'){
                    valorProximo = 100;
                }
                else if (prox == 'D'){
                    valorProximo = 500;
                }
                else if (prox == 'M'){
                    valorProximo = 1000;
                }
            }

            if (valorAtual < valorProximo) {
                total += valorProximo - valorAtual;
                i += 2; // pula os dois
            } else {
                total += valorAtual;
                i++;
            }
        }

        System.out.println("Valor inteiro: " + total);

    }
}

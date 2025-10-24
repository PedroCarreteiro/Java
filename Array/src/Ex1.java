import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] notas = new int[3];

        boolean run = true;

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Cadastre o " +(i+1)+ "° aluno");
            String nome = scanner.nextLine();
            nomes[i] = nome;
            System.out.println("Cadastre a nota do aluno "+nomes[i]);
            int nota = Integer.parseInt(scanner.nextLine());
            notas[i] = nota;
        }

        while (run) {
            System.out.println("\nVocê quer filtrar por qual tipo de filtro? " +
                    "\nNota acima - 1" +
                    "\nNota abaixo - 2" +
                    "\nNome - 3" +
                    "\nNão filtrar - 4");

            String filtro = scanner.nextLine();

            switch (filtro) {
                case "1" -> {
                    System.out.println("As notas devem estar acima de: ");
                    int notaFiltro = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < nomes.length; i++) {
                        if (notas[i] >= notaFiltro) {
                            System.out.println("\nNome: " + nomes[i] + "Nota: " + notas[i]);
                        }
                    }
                }
                case "2" -> {
                    System.out.println("As notas devem estar abaixo de: ");
                    int notaFiltro = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < nomes.length; i++) {
                        if (notas[i] <= notaFiltro) {
                            System.out.println("\nNome: " + nomes[i] + " - Nota: " + notas[i]);
                        }
                    }
                }
                case "3" -> {
                    System.out.println("Digite o filtro de nome: ");
                    String nomeFiltro = scanner.nextLine();
                    nomeFiltro = nomeFiltro.toLowerCase();
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i].toLowerCase().contains(nomeFiltro)) {
                            System.out.println("\nNome: " + nomes[i] + " - Nota: " + notas[i]);
                        }
                    }
                }
                case "4" -> {
                    System.out.println("\nVocê saiu do programa!");
                    run = false;
                }

                default -> {
                    System.out.println("\nOpção inválida!");
                }
            }
        }
    }
}

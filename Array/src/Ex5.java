import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Float> notas = new ArrayList<>();

        float soma = 0;
        float media;
        int menor = 0;

        boolean rodar = true;

        while (rodar){
            System.out.println("\n\nEscolha uma das opções: " +
                    "\n1 - Cadastrar novo aluno e nota" +
                    "\n2 - Sair");

            String opcao = scanner.nextLine();

            switch (opcao){
                case "1" -> {
                    System.out.println("\nDigite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.println("\nDigite a nota do aluno: ");
                    float nota = Float.parseFloat(scanner.nextLine());

                    nomes.add(nome);
                    notas.add(nota);
                }

                case "2" -> {
                    System.out.println("\nVocê saiu do sistema!");
                    rodar = false;
                }

                default -> {
                    System.out.println("Digite uma opção válida!");
                }
            }
        }

        for(int i = 0; i < notas.size(); i++){
            if(notas.get(i) < 5){
                menor++;
            }
            soma+=notas.get(i);
        }

        media = soma / nomes.size();

        System.out.println("A média da turma é: "+media);
        System.out.println("A quantidade de notas abaixo de 5 é: "+menor);

    }
}

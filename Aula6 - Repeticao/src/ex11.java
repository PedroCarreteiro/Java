import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos alunos tem na escola: ");
        int numero_alunos = Integer.parseInt(scanner.nextLine());

        int aprovados = 0;
        int reprovados = 0;
        String alunos_reprovados = "";

        for (int i = 1; i <= numero_alunos; i++){
            System.out.println("Digite o nome do "+i+"° aluno: ");
            String nome_aluno = scanner.nextLine();
            System.out.println("Digite a média no aluno: ");
            double media_aluno = Double.parseDouble(scanner.nextLine());

            String aluno_general = nome_aluno+" "+media_aluno;

            if (media_aluno < 5){
                reprovados++;
                if(i==1) {
                    alunos_reprovados = aluno_general.concat("\n");
                } else {
                    alunos_reprovados = alunos_reprovados.concat(aluno_general.concat("\n"));
                }
            } else {
                aprovados++;
            }

        }
        System.out.println("Quantidade de reprovados: "+reprovados);
        System.out.println(alunos_reprovados);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Digite seu nome: ");
//        String nome = scanner.nextLine();
//
//        System.out.println("Digite sua data de nascimento: (AAAA-MM-DD)");
//        String dataNascimento = scanner.nextLine();
//
//        System.out.println("Digite seu peso: ");
//        Double peso = Double.parseDouble(scanner.nextLine());
//
//        System.out.println("Digite sua altura: ");
//        Double altura = Double.parseDouble(scanner.nextLine());

        Pessoa pessoa1 = new Pessoa("Pedro",
                                    "2007-03-06",
                                    1.80,
                                    80.0,
                                    TipoSanguineo.A_NEGATIVO);

        Pessoa pessoa2 = new Pessoa("João",
                                    "2006-03-14",
                                    1.75,
                                    90.0,
                                    TipoSanguineo.A_POSITIVO);

        Pessoa.pessoaMaisVelha(pessoa1,pessoa2);
    }
}
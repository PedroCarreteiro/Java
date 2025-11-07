import java.util.HashSet;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> cpfs = new HashSet<>();
        String cpf = "";

        boolean rodar = true;

        while (rodar){
            System.out.println("\nSelecione uma opção: " +
                    "\n Digite 1 para adicionar CPF" +
                    "\n Digite 2 para remover CPF" +
                    "\n Digite 3 para ver CPFs" +
                    "\n Digite 4 para sair do sistema");
            String selecao = scanner.nextLine();

            switch (selecao){
                case "1" -> {
                    System.out.println("\nDigite um CPF para adicionar: ");
                    cpf = scanner.nextLine();
                    if(cpfs.contains(cpf)){
                        System.out.println("CPF já cadastrado!");
                    } else {
                        cpfs.add(cpf);
                        System.out.println("CPF "+cpf+" adicionado!");
                    }
                }

                case "2" -> {
                    System.out.println("\nDigite um CPF para remover: ");
                    cpf = scanner.nextLine();
                    if(cpfs.contains(cpf)){
                        cpfs.remove(cpf);
                        System.out.println("CPF "+cpf+" removido!");
                    } else {
                        System.out.println("Não existe o CPF "+cpf+" na lista de CPFs");
                    }
                }

                case "3" -> {
                    for(String cpfPrint : cpfs){
                        System.out.println(cpfPrint);
                    }
                }

                case "4" -> {
                    System.out.println("\nVocê saiu do programa!");
                    rodar = false;
                }

                default -> {
                    System.out.println("\nDigite uma opção válida!");
                }
            }

        }
    }
}

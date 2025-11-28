import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> senhasNorm = new ArrayList<>();
        ArrayList<Integer> senhasPref = new ArrayList<>();

        boolean rodar = true;
        boolean rodarTentativaFunc = true;
        boolean rodarFunc = true;
        boolean rodarUser = true;

        int senhaGenerator = 0;

        String senhaFunc = "123";

        while (rodar){

            rodarTentativaFunc = true;
            rodarUser = true;
            rodarFunc = true;

            System.out.println("\n\nVocê é um usuário ou funcionário?" +
                    "\n1 - Usuário" +
                    "\n2 - Funcionário" +
                    "\n3 - Sair");
            String escolha = scanner.nextLine();

            switch (escolha){
                case "1" -> {
                    while (rodarUser) {
                        System.out.println("\nEscolha uma opção: " +
                                "\n1 - Gerar senha comum" +
                                "\n2 - Gerar senha preferencial" +
                                "\n3 - Consultar quantas pessoas estão na minha frente" +
                                "\n4 - Sair");

                        String opcao = scanner.nextLine();

                        switch (opcao) {
                            case "1" -> {
                                int senha = (senhaGenerator += 1);
                                System.out.println("Sua senha é: " + senha);
                                senhasNorm.add(senha);
                            }

                            case "2" -> {
                                int senha = (senhaGenerator += 1);
                                System.out.println("Sua senha preferencial é: " + senha);
                                senhasPref.add(senha);
                            }

                            case "3" -> {
                                System.out.println("Tem " + (senhasPref.size() + senhasNorm.size()) + " senhas na sua frente");
                            }

                            case "4" -> {
                                System.out.println("Saiu do menu de user!");
                                rodarUser = false;
                            }

                            default -> {
                                System.out.println("Opção inválida!");
                            }
                        }
                    }
                }

                case "2" -> {
                    while (rodarTentativaFunc){
                        System.out.println("\n1 - Digitar a senha" +
                                "\n2 - Voltar");
                        String opcaoTentativaFunc = scanner.nextLine();

                        switch (opcaoTentativaFunc){
                            case "1" ->{
                                rodarFunc = true;
                                System.out.println("\nDigite a senha: ");
                                String tentativaSenha = scanner.nextLine();
                                if(tentativaSenha.equals(senhaFunc)){
                                    System.out.println("\nSistema acessado");
                                    while (rodarFunc){
                                        System.out.println("\n1 - Chamar senha" +
                                                "\n2 - Sair");
                                        String opcaoFunc = scanner.nextLine();

                                        switch (opcaoFunc){
                                            case "1" -> {
                                                if (!senhasPref.isEmpty()){
                                                    System.out.println("Senha preferencial chamada: "+senhasPref.getFirst());
                                                    senhasPref.removeFirst();
                                                } else if (!senhasNorm.isEmpty()) {
                                                    System.out.println("Senha normal chamada: "+senhasNorm.getFirst());
                                                    senhasNorm.removeFirst();
                                                } else {
                                                    System.out.println("Acabou as senhas!");
                                                }
                                            }

                                            case "2" -> {
                                                System.out.println("Você saiu do sistema de funcionário!");
                                                rodarFunc = false;
                                            }

                                            default -> {
                                                System.out.println("Opção incoreta!");
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("Senha incorreta!");
                                }
                            }

                            case "2" -> {
                                System.out.println("Você saiu do menu inicial de funcinário!");
                                rodarTentativaFunc = false;
                            }

                            default -> {
                                System.out.println("Opção incorreta!");
                            }
                        }
                    }
                }

                case "3" -> {
                    System.out.println("Você saiu do programa!");
                    rodar = false;
                }

                default -> {
                    System.out.println("Opção incorreta!");
                }
            }
        }

    }
}

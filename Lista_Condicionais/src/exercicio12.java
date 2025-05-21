import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        //ter ponto ok
        //ponto depois do @ ok
        //coisa depois do ponto ok
        //não começar com . ok
        //ter @ ok
        //ter coisa antes do @ ok
        //não comçar com @ ok
        //ter só um @ ok
        //ter coisa depois do @ ok

        if (email.contains("@")){
            if(email.indexOf("@") != 0 && email.indexOf("@") == email.lastIndexOf("@")){
                if(email.contains(".") && email.indexOf(".") != 0){
                    if(email.indexOf("@") < email.lastIndexOf(".")){
                        if(Character.isLetter(email.charAt(email.length()-1))){
                            System.out.println("Email válido!");
                        } else {
                            System.out.println(email.lastIndexOf(".")+" "+ email.length());
                            System.out.println("Email inválido! (Domínio faltando)!");
                        }
                    } else {
                        System.out.println("Email inválido! (Não tem domínio depois do @)!");
                    }
                } else{
                    System.out.println("Email inválido! (Não tem domínio ou começa com .)!");
                }
            } else {
                System.out.println("Email inválido! (Seu email começa com @ ou tem dois @)!");
            }
        } else{
            System.out.println("Email inválido (Está faltando o @)!");
        }
    }
}

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String telefone = "";
        boolean inicio = true;
        boolean valido = true;
        boolean valido_parenteses = true;
        boolean valido_caracteres = true;
        boolean valido_traco = true;
        int contador_i = 0;
        int contador_p1 = 0;
        int contador_p2 = 0;
        int qtd_numeros = 0;
        int contador_traco = 0;

        String caracteres_especiais = "!@#$%¨&*_+=§{[ª}]º^~`´?/°<>,.|";

        System.out.println("Digite o telefone: ");
        telefone = scanner.nextLine();


        telefone = telefone.strip();
        telefone = telefone.replace(" ","");

        //Verificar caracteres
        for (char cha = 'a'; cha <= 'z'; cha++){
            for (int j = 0; j <= telefone.length() - 1; j++)
                if (telefone.charAt(j) == cha){
                    valido = false;
                    valido_caracteres = false;
                }
        }



//        for (int j = 0; j <= telefone.length() - 1; j++) {
//            if (telefone.charAt(j) == '!' || telefone.charAt(j) == '@' || telefone.charAt(j) == '#' || telefone.charAt(j) == '$' || telefone.charAt(j) == '%' ||
//                    telefone.charAt(j) == '&' || telefone.charAt(j) == '*' || telefone.charAt(j) == '+' || telefone.charAt(j) == '°' || telefone.charAt(j) == '|' ||
//                    telefone.charAt(j) == '/' || telefone.charAt(j) == ';' || telefone.charAt(j) == ':' || telefone.charAt(j) == '"' || telefone.charAt(j) == '.' ||
//                    telefone.charAt(j) == '`' || telefone.charAt(j) == '´' || telefone.charAt(j) == '{' || telefone.charAt(j) == '}' || telefone.charAt(j) == '[' ||
//                    telefone.charAt(j) == ']' || telefone.charAt(j) == '^' || telefone.charAt(j) == '¨' || telefone.charAt(j) == '~' || telefone.charAt(j) == '?' ||
//                    telefone.charAt(j) == '§') {
//                valido = false;
//                valido_caracteres = false;
//            }
//        }

        for (int i = 0; i <= telefone.length()-1;i++){
            for(int j = 0; j <= caracteres_especiais.length()-1; j++){
                if(telefone.charAt(i) == caracteres_especiais.charAt(j)){
                    valido = false;
                    valido_caracteres = false;
                }
            }
        }

//        //Verificar -
//        for (int i = 0; i <= telefone.length(); i++){
//            if(telefone.charAt(i) == '-'){
//                contador_i++;
//            }
//        }
//        if(contador_i > 1 || telefone.indexOf('-') != telefone.charAt(telefone.length()-5)){
//            valido = false;
//        }

        //Verificar parenteses
        for (int i = 0; i <= telefone.length() - 1; i++){
            if(telefone.charAt(i) == '('){
                contador_p1++;
            }
        }
        for (int i = 0; i <= telefone.length() - 1; i++){
            if(telefone.charAt(i) == ')'){
                contador_p2++;
            }
        }

        if(contador_p1 > 0 || contador_p2 > 0) {

            if(contador_p1 != contador_p2){
                valido = false;
                valido_parenteses = false;
            }
            if (contador_p1 > 1 || contador_p2 > 1) {
                valido = false;
                valido_parenteses = false;
            }
            if (telefone.indexOf("(") > telefone.indexOf(")")) {
                valido = false;
                valido_parenteses = false;
            }
            if (telefone.indexOf("(") != 0) {
                valido = false;
                valido_parenteses = false;
            }
            if (telefone.indexOf(")") != 3) {
                valido = false;
                valido_parenteses = false;
            }
        }

        //Verificar quantidade de numeros
        for(int i = 0; i <= telefone.length() - 1; i++){
            for(int j = 0; j <= 9; j++){
                if(telefone.substring(i,i+1).equals(String.valueOf(j))){
                    qtd_numeros++;
                }
            }
        }

        if(qtd_numeros < 10){
            valido = false;
            valido_caracteres = false;
        }

        //Verificar - (traço)
        for(int i = 0; i <= telefone.length() - 1; i++){
            if(telefone.charAt(i) == '-'){
                contador_traco++;
            }
        }

        if (contador_traco > 1){
            valido = false;
            valido_traco = false;
        }

        if(contador_traco == 1){
            if (telefone.indexOf('-') != telefone.length()-5){
                valido = false;
                valido_caracteres = false;
            }
        }

        if(valido){
            System.out.println("Telefone válido!");
        } else if(!valido_parenteses){
            throw new Exception("Parenteses incorreto!");
        } else if(!valido_traco){
            throw new Exception("Traço incorreto!");
        } else if(!valido_caracteres) {
            throw new Exception("Há letras/caracteres especiais ou uma quantidade inválida de números no telefone!");
        }
    }
}

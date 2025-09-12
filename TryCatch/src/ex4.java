import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String telefone = "";
        boolean inicio = true;
        boolean valido = true;
        int contador_i = 0;
        int contador_p1 = 0;
        int contador_p2 = 0;
        int qtd_numeros = 0;

        System.out.println("Digite o telefone: ");
        telefone = scanner.nextLine();


        telefone.strip();
        telefone.replace(" ","");

        //Verificar caracteres
        for (char cha = 'a'; cha <= 'z'; cha++){
            for (int j = 0; j <= telefone.length(); j++)
                if (telefone.charAt(j) == cha){
                    valido = false;
                }
        }

        //Verificar -
        for (int i = 0; i <= telefone.length(); i++){
            if(telefone.charAt(i) == '-'){
                contador_i++;
            }
        }
        if(contador_i > 1 || telefone.indexOf('-') != telefone.charAt(telefone.length()-5)){
            valido = false;
        }

        //Verificar parenteses
        for (int i = 0; i <= telefone.length(); i++){
            if(telefone.charAt(i) == '('){
                contador_p1++;
            }
        }
        for (int i = 0; i <= telefone.length(); i++){
            if(telefone.charAt(i) == ')'){
                contador_p2++;
            }
        }
        if(contador_p1 > 1 || contador_p2 > 1){
            valido = false;
        }
        if(telefone.indexOf("(") < telefone.indexOf(")")){
            valido = false;
        }
        if(telefone.indexOf("(") != 0){
            valido = false;
        }
        if(telefone.indexOf(")") != 3){
            valido = false;
        }

        //Verificar quantidade de numeros
        for(int i = 0; i <= telefone.length(); i++){
            for(int j = 0; j <= 9; j++){
                if(telefone.substring(i,i+1) == ){
                    qtd_numeros++;
                }
            }
        }
    }
}

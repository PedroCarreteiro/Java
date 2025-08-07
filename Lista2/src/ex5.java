import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de sua variável: ");
        String var = scanner.nextLine();

        boolean varStatus = true;
        char letraMai;
        char letraMin;
        String stringMai = "";
        String stringMin = "";

        for (letraMai = 'A'; letraMai <= 'Z'; letraMai++)
            stringMai+=letraMai;

        for (letraMin = 'a'; letraMin <= 'z'; letraMin++)
            stringMin+=letraMin;

        String primeiro = var.substring(0,1);

        if (var.length() > 2){
            if(!stringMai.contains(primeiro) && !var.contains("_")){
                for(int i = 1; i<var.length(); i++){
                    if(stringMai.contains(var.substring(i,i+1))){
                        System.out.println("camelCase");
                    }
                }
            } else if ((stringMai.contains(primeiro)) && (stringMin.contains(var.substring(1,2))) && (!var.contains("_"))) {
                for(int i = 1; i<var.length(); i++){
                    if(stringMai.contains(var.substring(i,i+1))){
                        System.out.println("PascalCase");
                    }
                }
            } else if (!stringMai.contains(primeiro) && var.contains("_") && var.lastIndexOf("_") < var.length()-1 && var.indexOf("_") > 0) {
                for(int i = 1; i<var.length(); i++){
                    if(!stringMai.contains(var.substring(i,i+1))){
                        System.out.println("snake_case");
                        break;
                    }
                }
            } else {
                System.out.println("Varíavel inválida!");
            }
        } else {
            System.out.println("Variável inválida!");
        }
    }
}

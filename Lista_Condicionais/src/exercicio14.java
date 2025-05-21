import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data em DD/MM/AAAA");
        String data = scanner.nextLine();

        String dia = data.substring(0,2);
        String mes = data.substring(3,5);
        String ano = data.substring(6);

        int dia_int = Integer.parseInt(dia);
        int mes_int = Integer.parseInt(mes);
        int ano_int = Integer.parseInt(ano);

        int dias_mes_janeiro = 31;
        int dias_mes_fevereiro = 0; //atribuir depois
        int dias_mes_marco = 31;
        int dias_mes_abril = 30;
        int dias_mes_maio = 31;
        int dias_mes_junho = 30;
        int dias_mes_julho = 31;
        int dias_mes_agosto = 31;
        int dias_mes_setembro = 30;
        int dias_mes_outubro = 31;
        int dias_mes_novembro = 30;
        int dias_mes_dezembro = 31;

        int dias_total = 0;


        if((ano_int % 4 == 0 && ano_int % 100 != 0) || (ano_int % 400 == 0)){
            dias_mes_fevereiro = 29;
        } else {
            dias_mes_fevereiro = 28;
        }

            switch (mes) {
                case ("01"):
                    dias_total = (dias_mes_janeiro - dia_int) + (300 + dias_mes_fevereiro);
                    System.out.printf("Faltam %d dias para o natal!",dias_total);
                    break;
                case ("02"):
                    System.out.println("O mês é fevereiro");
                    dias_total = (dias_mes_fevereiro - dia_int) + (300 - dias_mes_fevereiro);
                    System.out.printf("Faltam %d dias para o natal!",dias_total);
                    break;
                case ("03"):
                    System.out.println("O mês é março");
                    dias_total = (dias_mes_marco - dia_int) + (269);
                    System.out.printf("Faltam %d dias para o natal!",dias_total);
                    break;
                case ("04"):
                    System.out.println("O mês é abril");
                    dias_total = (dias_mes_abril - dia_int) + (239);
                    System.out.printf("Faltam %d dias para o natal!",dias_total);
                    break;
                case ("05"):
                    System.out.println("O mês é maio");
                    dias_total = (dias_mes_maio - dia_int) + (208);
                    System.out.printf("Faltam %d dias para o natal!",dias_total);
                    break;
                case ("06"):
                    System.out.println("O mês é junho");
                    dias_total = (dias_mes_junho - dia_int) + (178);
                    System.out.printf("Faltam %d dias para o natal!",dias_total);
                    break;
                case ("07"):
                    System.out.println("O mês é julho");
                    dias_total = (dias_mes_julho - dia_int) + (147);
                    System.out.printf("Faltam %d dias para o natal!",dias_total);
                    break;
                case ("08"):
                    System.out.println("O mês é agosto");
                    dias_total = (dias_mes_agosto - dia_int) + (116);
                    System.out.printf("Faltam %d dias para o natal!",dias_total);
                    break;
                case ("09"):
                    System.out.println("O mês é setembro");
                    dias_total = (dias_mes_setembro - dia_int) + (86);
                    System.out.printf("Faltam %d dias para o natal!",dias_total);
                    break;
                case ("10"):
                    System.out.println("O mês é outubro");
                    dias_total = (dias_mes_outubro - dia_int) + (55);
                    System.out.printf("Faltam %d dias para o natal!",dias_total);
                    break;
                case ("11"):
                    System.out.println("O mês é novembro");
                    dias_total = (dias_mes_novembro - dia_int) + (25);
                    System.out.printf("Faltam %d dias para o natal!",dias_total);
                    break;
                case ("12"):
                    System.out.println("O mês é dezembro");
                    dias_total = (dias_mes_dezembro - 6 - dia_int);
                    if (dias_total > 0) {
                        System.out.printf("Faltam %d dias para o natal!", dias_total);
                    } else if (dias_total == 0) {
                        System.out.println("Hoje é natal!");
                    } else{
                        System.out.println("O natal já foi!");
                    }
                    break;
                default:
                    System.out.println("Mês inválido");
                    break;
            }
    }
}
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    String nome;
    LocalDate dataNascimento;
    Double altura;
    Double peso;
    TipoSanguineo tipoSanguineo;

    public Pessoa(String nome, String dataNascimento, Double altura, Double peso, TipoSanguineo tipoSanguineo){
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento);
        this.altura = altura;
        this.peso = peso;
        this.tipoSanguineo = tipoSanguineo;
    }

    public void calcularIdade(){
        LocalDate dataAtual = LocalDate.now();

        Period diferenca = Period.between(dataNascimento, dataAtual);

//        System.out.println("\nDiferença: \n"
//            +diferenca.getYears()+" anos\n"
//            +diferenca.getMonths()+" meses\n"
//            +diferenca.getDays()+" dias\n"
//        );

        System.out.println("Você tem "+diferenca.getYears()+" anos");
    }

    public static void pessoaMaisVelha(Pessoa pessoa1, Pessoa pessoa2){
        LocalDate dataAtual = LocalDate.now();
        Period diferencaPessoa1 = Period.between(pessoa1.dataNascimento, dataAtual);
        Period diferencaPessoa2 = Period.between(pessoa2.dataNascimento, dataAtual);

        if(diferencaPessoa1.getYears() > diferencaPessoa2.getYears()){
            System.out.println(pessoa1.nome+" é mais velho que "+pessoa2.nome);
        } else if (diferencaPessoa1.getYears() < diferencaPessoa2.getYears()) {
            System.out.println(pessoa2.nome+" é mais velho que "+pessoa1.nome);
        } else {
            System.out.println(pessoa1.nome+" e "+pessoa2.nome+"tem idades iguais!");
        }
    }
}

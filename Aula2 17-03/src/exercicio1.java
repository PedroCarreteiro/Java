public class exercicio1 {
    public static void main(String[] args) {
        String nome_produto = "Colchão";
        int quantidade_produto = 2;
        double preco_produto = 100.0;

        System.out.println("O nome é "+nome_produto);
        System.out.println("A quantidade é "+quantidade_produto);
        System.out.println("O preço é "+preco_produto);

        System.out.printf("O nome é %s\nQuantidade é %d \nPreco é %.2f", nome_produto, quantidade_produto, preco_produto);
    }
}

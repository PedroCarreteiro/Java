public class Ball {
    String color;
    String preenchimento;
    String material;
    TypeBall type;

    public Ball(String color, String preenchimento, String material, TypeBall type){
        this.color = color;
        this.preenchimento = preenchimento;
        this.material = material;
        this.type = type;
    }

    public void quick(){
        System.out.println("A bola de "+this.type+" quicou!");
    }

    public static void descricao(){
        System.out.println("Uma bola é um objeto de formato esférico, comumente usado em esportes.");
    }
}

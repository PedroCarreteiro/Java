public class Main {
    public static void main(String[] args) {
        Ball basketBall = new Ball("Laranja",
                                "Oca",
                                "Borracha",
                                TypeBall.BASQUETE);

//        basketBall.color = "Laranja";
//        basketBall.preenchimento = "Oca";
//        basketBall.material = "Borracha";

//        System.out.println("A bola é "+basketBall.color+
//                ", "+basketBall.preenchimento+
//                " e é feita de "+basketBall.material
//        );

        basketBall.quick();

        Ball.descricao();
    }
}

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                int mult = i * j;
                System.out.printf("%d x %d = %d\n",j, i, mult);
            }
            System.out.println();
        }
    }
}

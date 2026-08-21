import java.util.Scanner;

public class beecrowdExer5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int A = tec.nextInt();
        int B = tec.nextInt();
        int C = tec.nextInt();
        int D = tec.nextInt();

        int DIFERENCA = A * B - C * D;

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}

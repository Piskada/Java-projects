import java.util.Scanner;

public class beecrowd2UniExer1 {
    public static void main(String[] args) {
    double A, B, C, x1, x2;
    double raiz;
    Scanner sc = new Scanner(System.in);
    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();

    raiz = (B * B) - 4 * A * C;

    if (raiz >= 0 && A != 0){

        x1 = (-B + Math.sqrt(raiz)) / (2 * A);
        x2 = (-B - Math.sqrt(raiz)) / (2 * A);

        System.out.printf("R1 = " + "%.5f%n", x1);
        System.out.printf("R2 = " + "%.5f%n", x2);

    } else {
        System.out.println("Impossivel calcular");
    }
}
}

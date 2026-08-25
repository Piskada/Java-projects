import java.util.Scanner;

public class dwadaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        Double tr = A * C / 2;
        Double cir = 3.14159 * (C * C);
        Double tra = (A + B) * C / 2;
        Double qua = B * B;
        Double retan = A * B;

        System.out.printf("TRIANGULO: %.3f\n", tr);
        System.out.printf("CIRCULO: %.3f\n", cir);
        System.out.printf("TRAPEZIO: %.3f\n", tra);
        System.out.printf("QUADRADO: %.3f\n", qua);
        System.out.printf("RETANGULO: %.3f\n", retan);  

    }
}
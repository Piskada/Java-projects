import java.util.Scanner;

public class Uni5Exer04 {
public static void main(String[] args) {
    double soma = 0;
    double numerador = 1;
    Scanner tec = new Scanner(System.in); 
    for (double i = 1; i < 20; i++) {
        numerador += 2;
        soma += numerador / (i * (i + 1));
        System.out.printf("%.2f\n", soma);
    }
    System.out.println(soma);
}
}

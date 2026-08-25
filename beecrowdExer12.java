import java.util.Scanner;

public class beecrowdExer12 {
public static void main(String[] args) {

    int N, notas100, notas50, notas20, notas10, notas5, notas2, notas1;

    Scanner tec = new Scanner(System.in);
    N = tec.nextInt();

    notas100 = N / 100;
    notas50 = N % 100 / 50;
    notas20 = N % 100 % 50 / 20;
    notas10 = N % 100 % 50 % 20 / 10;
    notas5 = N % 100 % 50 % 20 % 10 / 5;
    notas2 = N % 100 % 50 % 20 % 10 % 5 / 2;
    notas1 = N % 100 % 50 % 20 % 10 % 5 % 2;

    System.out.println(N + "\n" + notas100 + " nota(s) de R$ 100,00" + 
        "\n" + notas50 + " nota(s) de R$ 50,00" + 
        "\n" + notas20 + " nota(s) de R$ 20,00" + 
        "\n" + notas10 + " nota(s) de R$ 10,00" + 
        "\n" + notas5 + " nota(s) de R$ 5,00" + 
        "\n" + notas2 + " nota(s) de R$ 2,00" + 
        "\n" + notas1 + " nota(s) de R$ 1,00"
    );
    }
}
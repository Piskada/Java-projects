import java.util.Scanner;

public class Uni2Exer14 {
public static void main(String[] args) {

    int valor, notas100, notas50, notas20, notas10, notas5, notas2, notas1;

    Scanner tec = new Scanner(System.in);

    System.out.println("Quanto você tem (em reais): ");
    valor = tec.nextInt();

    notas100 = valor / 100;
    notas50 = valor % 100 / 50;
    notas20 = valor % 100 % 50 / 20;
    notas10 = valor % 100 % 50 % 20 / 10;
    notas5 = valor % 100 % 50 % 20 % 10 / 5;
    notas2 = valor % 100 % 50 % 20 % 10 % 5 / 2;
    notas1 = valor % 100 % 50 % 20 % 10 % 5 % 2;

    System.out.println("notas de 100: " + notas100 + "\nnotas de 50: " + notas50 + "\nnotas de 20: " + notas20 + "\nnotas de 10: " + notas10 +
        "\nnotas de 5: " + notas5 + "\nnotas de 2: " + notas2 + "\nnotas de 1: " + notas1
    );
    }
}

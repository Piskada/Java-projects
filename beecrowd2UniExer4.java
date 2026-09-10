import java.util.Scanner;

public class beecrowd2UniExer4 {
public static void main(String[] args) {
    int cod, qt;
    Scanner sc = new Scanner(System.in);
    cod = sc.nextInt();
    qt = sc.nextInt();
    double preco = 0;
    switch (cod) {
        case 1: preco = 4; break;
        case 2: preco = 4.50f; break;
        case 3: preco = 5; break;
        case 4: preco = 2; break;
        case 5: preco = 1.50f; break;
    }
    double total = preco * qt;

    System.out.printf("Total: R$ " + "%.2f%n" , total);
}
}

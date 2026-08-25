import java.util.Scanner;

public class beecrowdExer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();

        int ano = dias / 365;
        int mes = dias % 365 / 30;
        int dia = dias % 365 % 30;

        System.out.println(ano + " ano(s)" + "\n" +
            mes + " mes(es)" + "\n" +
            dia + " dia(s)"
        );
    }
}

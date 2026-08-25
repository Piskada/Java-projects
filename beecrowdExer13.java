import java.util.Scanner;

public class beecrowdExer13 {
    public static void main(String[] args) {
        int N, horas, minutos, segundos;

        Scanner tec = new Scanner(System.in);

        N = tec.nextInt();

        horas = N / 3600;
        minutos = N % 3600 / 60;
        segundos = N % 3600 % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos + "" );
    }
}
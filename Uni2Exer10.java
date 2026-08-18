import java.util.Scanner;

public class Uni2Exer10 {
    public static void main(String[] args) {
        int duracao, horas, minutos, segundos;

        Scanner tec = new Scanner(System.in);

        System.out.println("Digite a duração(em segundos)");
        duracao = tec.nextInt();

        horas = duracao / 3600;
        minutos = duracao % 3600 / 60;
        segundos = duracao % 3600 % 60;

        System.out.println("A duração foi de " + horas + "h:" + minutos + "min:" + segundos + "seg" );
    }
}

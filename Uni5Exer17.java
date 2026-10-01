import java.util.Scanner;

public class Uni5Exer17 {
public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    int numIns;

    float maior = Float.MIN_VALUE;
    float menor = Float.MAX_VALUE;
    System.out.println("N° da inscrição: ");
        numIns = tec.nextInt();
    int contador = 0;
    float soma = 0;

    while (numIns != 0) {

        System.out.println("Altura do atleta: ");
        float Altura = tec.nextFloat();

        if (Altura < menor){
            menor = Altura;
        } else {
            if (Altura > maior) {
                maior = Altura;
            }
        }

        System.out.println("N° da inscrição: ");
        numIns = tec.nextInt();

        contador += 1;
        soma += Altura;
    } 

    float media = soma / contador;
    System.out.printf("A média de altura é de: %.2f\n" , media);
    System.out.println("A maior altura é de: " + maior);
    System.err.println("A menor altura é de: " + menor);
}
}

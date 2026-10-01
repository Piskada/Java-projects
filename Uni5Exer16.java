import java.util.Scanner;
public class Uni5Exer16 {
public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    float alt;
    System.out.println("Qual sua altura: ");
    alt = tec.nextFloat();
    String genero;
    float somaM = 0;
    float somaF = 0;
    int contador = 0;
    int contadorM = 0;
    int contadorF = 0;
    while (alt != 0) {
        System.out.println("Digite seu genero(M - masculino / F - feminino / O - outro)");
        genero = tec.next();
        
        if (genero.equals("M")) {
            somaM = somaM + alt;
            contadorM += 1;
        } else {
            if (genero.equals("F")) {
            somaF = somaF + alt;
            contadorF += 1;
            }
        }   
        System.out.println("Qual sua altura: ");
        alt = tec.nextFloat();
        contador += 1;

    }
    float mediaM = somaM / contadorM;
    float mediaF = somaF / contadorF;
    float media = (somaM + somaF) / contador;
    System.out.printf("Media masculina é: %.2f\n", mediaM );
    System.out.printf("Media feminina é: %.2f\n", mediaF );
    System.out.printf("Media de todos os grupos é de: %.2f\n", media);

}
}

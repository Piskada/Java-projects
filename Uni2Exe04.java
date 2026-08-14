import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        System.out.println("Meu primeiro programa em java");

        //declarar váriavel
        float A;
        float B;
        float media;
        
        //criar uma variavel para o teclado
        Scanner tec = new Scanner (System.in);
        
        //emtrada dos dados
        A = tec.nextFloat();
        B = tec.nextFloat();

        //calcular media - f indica que é float
        media = (A * 3.5f + B * 7.5f) / 11;
        System.out.println("media = " + media);

    }
}

import java.util.Scanner;


public class Uni3Exer01 {
public static void main(String[] args) {
        int lar, alt, area;

        Scanner tec = new Scanner(System.in);

        System.out.println("Largura do terreno: ");
        lar = tec.nextInt();
        
        Scanner sla = new Scanner(System.in);

        System.out.println("Altura do terreno: ");
        alt = sla.nextInt();
        

        
        

        area = alt * lar;

        System.out.println("A área do terreno é: " + area + "m²");

}
}

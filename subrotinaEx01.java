import java.util.Scanner;

public class subrotinaEx01 {
    
    private int soma(int A, int B) {
        int total = A + B;
        return total;
    }
    private int subtrai(int A, int B) {
        return A - B;
    }

    public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    subrotinaEx01 exe = new subrotinaEx01();
    int A, B;
    

    System.out.println("Digite o primeiro número: ");
    A = tec.nextInt();

    System.out.println("Digite o segundo número: ");
    B = tec.nextInt();

    int resultado = exe.soma (A, B);
    int resultado1 = exe.subtrai (A, B);
    System.out.println("Soma = " + resultado);
    System.out.println("Subtração = " + resultado1); 
}
}

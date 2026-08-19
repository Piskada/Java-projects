import java.util.Scanner;

public class Uni4Exer01 {
public static void main(String[] args) {
    int htrabalhadas, qtporhr;
    float horaextra, valortotal;

    Scanner tec = new Scanner(System.in);

    System.out.println("Quantas horas trabalhadas (min: 160 horas)");
    htrabalhadas = tec.nextInt();

    Scanner sla = new Scanner(System.in);

    System.out.println("Quanto por hora: ");
    qtporhr = sla.nextInt();
    
    horaextra = 0;

    if (htrabalhadas > 160) {
        horaextra = htrabalhadas - 160;
    }

    valortotal = ((htrabalhadas - horaextra) * qtporhr) + horaextra * qtporhr * 1.5f; 
    System.out.println("Salário total: " + valortotal);
}
}
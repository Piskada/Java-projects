import java.util.Scanner;

public class Uni4Exer10 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a idade dos seu irmãos: "); 
    int idade1 = sc.nextInt(); 
    int idade2 = sc.nextInt();
    int idade3 = sc.nextInt();

    if (idade1 > idade2 && idade1 > idade3) {
        System.out.println("Maior de idade é o Marquinhos com " + idade1);
        
    }
    
    if (idade2 > idade1 && idade2 > idade3) {
        System.out.println("Maior de idade é o Zezinho com " + idade2);
        
    }

    if (idade3 > idade1 && idade3 > idade2) {
        System.out.println("Maior de idade é o Lulu com " + idade3);
        
    }
}
}

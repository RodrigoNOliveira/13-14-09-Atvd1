import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int sucessor;
    int antecessor;
    int x;
        System.out.println();
        System.out.println("Antecessor e sucessor");
        System.out.println();
        System.out.print("Digite um número:");
        x = scanner.nextInt();
        
        sucessor = x + 1;
        antecessor = x - 1 ;

        System.out.println();
        System.out.println("O número digitado foi: " + x);
        System.out.println("O seu antecessor é: " + antecessor);
        System.out.println("O seu sucessor é: " + sucessor);



    scanner.close();
    }
}

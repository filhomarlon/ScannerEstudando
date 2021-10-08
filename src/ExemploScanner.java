import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bom dia, Qual é o seu nome?");

        String name = scanner.nextLine();

        System.out.println("Siga o coelho Branco "+ name);




    }
}

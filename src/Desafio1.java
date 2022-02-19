import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor");
        double n = scanner.nextDouble();

        if ( n == 1) {
            System.out.println("     *");
        }
        if ( n == 2) {
            System.out.println("     *");
            System.out.println("    **");
        }
        if ( n == 3) {
            System.out.println("     *");
            System.out.println("    **");
            System.out.println("   ***");
        }
        if ( n == 4) {
            System.out.println("     *");
            System.out.println("    **");
            System.out.println("   ***");
            System.out.println("  ****");
        }
        if ( n == 5) {
            System.out.println("     *");
            System.out.println("    **");
            System.out.println("   ***");
            System.out.println("  ****");
            System.out.println(" *****");
        }
        if ( n == 6) {
            System.out.println("     *");
            System.out.println("    **");
            System.out.println("   ***");
            System.out.println("  ****");
            System.out.println(" *****");
            System.out.println("******");
        }
        else {
            System.out.println("Número inválido");
        }
        scanner.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Nova {
    public static void main( String args[] ) {
        int x = 11;
        String nome;
        // esta linha é um comentário!
        Scanner scan = new Scanner(System.in);
        System.out.println(" Digite seu Nome: ");
        nome = scan.next();
        System.out.println(" Hello World! " + nome);
    }
}

import java.util.Scanner;

public class EX8 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu ora (0 - 23) : ");
        int ora = scanner.nextInt();

        if (ora >= 6 && ora < 12)
            System.out.println("Este diminiata.");

        else if (ora >= 12 && ora < 18)
            System.out.println("Este dupa-amiaza.");

        else if (ora  >= 18  && ora < 22)
            System.out.println("Este seara.");

        else if (ora >= 22 && ora <=23)
            System.out.println("Este noapte.");
        else
            System.out.println("Ora invalida ! Introdu din nou !");



    }
}

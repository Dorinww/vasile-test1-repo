import java.util.Scanner;

public class EX12 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu varsta: ");
        int varsta = scanner.nextInt();

        if (varsta <= 0 || varsta > 135)
            System.out.println("Eroare: Varsta introdusa nu este valida.");
        else if (varsta < 12)
            System.out.println("Esti copil.");
        else if (varsta < 18)
            System.out.println("Esti adolescent.");
        else
            System.out.println("Esti adult.");

    }
}

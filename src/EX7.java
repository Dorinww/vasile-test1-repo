import java.util.Scanner;

public class EX7 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu un numar : ");
        int num = scanner.nextInt();

            if ((num % 2) == 0 )
            System.out.println("Numarul este par ");
            else{
                System.out.println("Numarul este impar ");
            }
        }

    }


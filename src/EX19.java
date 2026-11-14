import java.util.Scanner;

public class EX19 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Apasa o litera (R , G , V): ");

        char litera = scanner.next().toUpperCase().charAt(0);

        switch(litera){
            case 'R':
                System.out.println("Rosu");
                        break;

            case 'G':
                System.out.println("Galben");
                break;

            case 'V':
                System.out.println("Verde");
                break;

            default:
                System.out.println("Litera invalida!!!");


        }


    }
}

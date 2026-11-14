import java.util.Scanner;
public class EX11 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrieti un String : ");
        String text = scanner.nextLine();

        int lungime = text.length();
        System.out.println("Cantitatea de caractere este: " + lungime);

        if(lungime > 0 ){
            int indiceMaxim = lungime - 1 ;
            System.out.println("Indicele maxim este: " + indiceMaxim);
        }else
            System.out.println("Sirul este gol , nu are indice maxim ");

    }

}

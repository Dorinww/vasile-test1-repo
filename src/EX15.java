import java.util.Arrays;

public class EX15 {
    static void main() {

        byte[] numere = {10, 20, 30, 40, 50, 60};

        System.out.println("Array inițial: " + Arrays.toString(numere));

        // Schimbăm valoarea elementului de la indicele 4
        numere[4] = 99;

        System.out.println("Array modificat: " + Arrays.toString(numere));

    }
}

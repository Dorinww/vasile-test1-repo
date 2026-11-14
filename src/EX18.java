public class EX18 {
    static void main() {

        int[]  numere = {56 , 87 , 13 , 94 , 42 , 60 };

        int minim = numere[0];

        for(int i = 1; i < numere.length; i++)

            if (numere[i] < minim)
                minim = numere[i];

        System.out.println("Elementul cu valoarea cea mai mare este:" + minim);


    }
}

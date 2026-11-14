public class EX17 {
    static void main() {

      int[]  numere = {24 , 87 , 13 , 94 , 42 , 60 };

      int maxim = numere[0];

      for(int i = 1; i < numere.length; i++)

          if (numere[i] > maxim)
              maxim = numere[i];

        System.out.println("Elementul cu valoarea cea mai mare este:" + maxim);


    }
}

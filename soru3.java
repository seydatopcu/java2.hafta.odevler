import java.util.Scanner;

public class soru3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();

        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        long permutation = calculatePermutation(n, r);

        System.out.println("P(" + n + ", " + r + ") = " + permutation);

        scanner.close();
    }

    public static long calculatePermutation(int n, int r) {
        if (n < 0 || r < 0) {
            System.out.println("Negatif sayılar için permutasyon hesaplanamaz.");
            System.exit(0);
        }

        return factorial(n) / factorial(n - r);
    }

    public static long factorial(int number) {
        return (number == 0 || number == 1) ? 1 : number * factorial(number - 1);
    }
}


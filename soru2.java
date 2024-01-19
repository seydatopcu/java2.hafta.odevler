import java.util.Scanner;

public class soru2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime ya da sayı girin: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " bir palindromdur.");
        } else {
            System.out.println(input + " bir palindrom değildir.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        String firstHalf = str.substring(0, length / 2);
        String reversedSecondHalf = reverse(str.substring((length + 1) / 2));
        return firstHalf.equals(reversedSecondHalf);
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

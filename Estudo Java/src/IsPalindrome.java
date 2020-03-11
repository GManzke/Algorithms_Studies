import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a integer to see if it's a palindrome");
        int input = sc.nextInt();

        System.out.println(isPalindrome(input) == true? "True" : "False");
    }

    public static boolean isPalindrome(int input) {
        int reverse = 0;
        int init = input;

        while (input > reverse) {
            reverse = reverse * 10 + input % 10;
            input /= 10;
        }

        if (reverse == init || reverse == init / 10) {
            return true;
        }

        return false;


    }

}

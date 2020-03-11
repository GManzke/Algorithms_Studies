import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Integer input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number to be reversed");
        input = sc.nextInt();

        System.out.println(reverseInteger(input));

        sc.close();
    }

    private static int reverseInteger(Integer input) {
        int output = 0;

        while (input != 0){
            output = output * 10 + input % 10;
            input = input / 10;
        }

        return output;
    }
}




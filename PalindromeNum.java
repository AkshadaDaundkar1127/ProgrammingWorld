import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        int temp = num;

        int rev = 0;
        while (num != 0) {
            /* */
            rev = rev * 10;
            rev = rev + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse Number is : " + rev);

        if (temp == rev) {
            System.out.println("Palindrome Number");

        } else {
            System.out.println(" NOT Palindrome Number");

        }

    }
}

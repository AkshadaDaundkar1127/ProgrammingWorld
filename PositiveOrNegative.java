import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive Number");

        } else {
            System.out.println("Neative Number");
        }
    }

}

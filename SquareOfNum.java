import java.util.Scanner;

public class SquareOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int a = sc.nextInt();

        int Square = a * a;
        System.out.println("Square is " + Square);
    }

}

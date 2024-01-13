
import java.util.Scanner;

public class swapTwoNum1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int swap = n1;
        n1 = n2;
        n2 = swap;
        System.out.println("After swapping values");
        System.out.println(n1);
        System.out.println(n2);

    }
}

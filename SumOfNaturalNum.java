import java.util.Scanner;

public class SumOfNaturalNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();

        int Sum = (n * (n + 1)) / 2;
        System.out.println("Sum Of First Natural Number is " + Sum);
    }

}

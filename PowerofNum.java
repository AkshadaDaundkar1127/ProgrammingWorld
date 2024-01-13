import java.util.Scanner;

public class PowerofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double Power = Math.pow(a, b);
        System.out.println("Power is " + Power);
    }

}

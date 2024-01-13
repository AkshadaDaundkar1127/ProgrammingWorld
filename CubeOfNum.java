import java.util.Scanner;

public class CubeOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int a = sc.nextInt();
        int Cube = a * a * a;
        System.out.println("Cube of Given Number is : " + Cube);
    }

}

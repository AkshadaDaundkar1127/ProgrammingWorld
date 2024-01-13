
import java.util.Scanner;
public class SwapTwoNum2 {
    



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
       n1=n1+n2;
       n2=n1-n2;
       n1=n1-n2;

        System.out.println("After swapping values");
        System.out.println(n1);
        System.out.println(n2);

    }
}

    
}

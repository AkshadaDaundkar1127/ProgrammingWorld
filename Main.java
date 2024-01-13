import java.util.*;

class Main {
    public static void main(String args[]) {
        int a[] = new int[5];// declaration and instantiation
        a[0] = 10;// initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        double myList[] = { 2, 3, 4, 5, 67, 7 };

        // traversing array
        for (int i = 0; i < a.length; i++)// length is the property of array
            System.out.println(a[i]);

        for (int j = 0; j < myList.length; j++)// length is the property of array
            System.out.println(myList[j]);

    }
}
/*
 * 10
 * 20
 * 30
 * 40
 * 50
 * 
 */
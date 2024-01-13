public class Star1 {
    public static void main(String[] args) {

        /*
         * System.out.println("#");
         * System.out.println("##");
         * System.out.println("###");
         * System.out.println("####");
         */

        int i, j;

        for (i = 1; i <= 5; i++) {

            for (int k = 1; k <= 5; k++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 1; i <= 5; i++)

        {
            for (j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= 5; i++) {

            for (int k = 1; k <= 5; k++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (i = 1; i <= 5; i++) {

            for (int k = 1; k <= 5; k++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (i = 1; i <= 5; i++) {

            for (int k = 1; k <= 5; k++) {
                System.out.print("  ");
            }
            for (j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
/*
 * 
 **
 ***
 ****
 *****
 *****
 ****
 ***
 **
 *
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 1
 * 22
 * 333
 * 4444
 * 55555
 *****
 *****
 *****
 *****
 *****
 */
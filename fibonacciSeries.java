public class fibonacciSeries {

    public static void main(String[] args) {
        int n = 10, n1 = 0, n2 = 1;
        System.out.println("Fibonacci Series till " + n + " terms: ");

        for (int i = 0; i < n; ++i) {
            System.out.println(n1 + ",");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

}

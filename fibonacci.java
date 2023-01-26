public class fibonacci {
    public static void main(String[] args) {
        // System.out.println(fibrec(4));
        fibdp(5);
    }

    // fibonacci using recursion
    public static int fibrec(int n) {
        if (n <= 1)
            return 1;
        else
            return fibrec(n - 1) + fibrec(n - 2);

    }

    // fibonacci using DP

    public static void fibdp(int n) {
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            // System.out.println();
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        for (int x : arr)
            System.out.print(x + " ");
    }

}

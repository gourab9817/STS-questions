import java.util.*;

public class MaxProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, -3, 4, 5, 6 };
        int n = arr.length;
        System.out.println(product(arr, n));

    }

    public static int product(int arr[], int n) {
        int maxpro = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int pro = 1;
            for (int j = i; j < n; j++) {
                pro = pro * arr[j];
                if (pro > maxpro) {
                    maxpro = pro;
                }

            }
        }
        return maxpro;
    }
}

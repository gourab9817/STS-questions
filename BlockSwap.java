public class BlockSwap {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 4;
        int n = arr.length;
        blockswap(arr, n, k);
    }

    public static void blockswap(int arr[], int n, int k) {
        int arr2[] = new int[n];
        k = k % n;

        for (int i = 0; i < (n - k); i++) {
            arr2[i] = arr[k + i];
        }

        for (int i = (n - k); i < n; i++) {
            arr2[i] = arr[i - (n - k)];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}

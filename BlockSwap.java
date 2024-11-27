public class BlockSwap {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 4; // Number of positions to rotate
        int n = arr.length; // Length of the array
        blockswap(arr, n, k);
    }

    public static void blockswap(int arr[], int n, int k) {
        int arr2[] = new int[n];
        k = k % n;

        // Copy the last n-k elements to the beginning of the new array
        for (int i = 0; i < (n - k); i++) {
            arr2[i] = arr[k + i];
        }

        // Copy the first k elements to the end of the new array
        for (int i = (n - k); i < n; i++) {
            arr2[i] = arr[i - (n - k)];
        }

        // Print the rotated array
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}

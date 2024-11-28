public class LeadersArray {
    public static void main(String[] args) {
        int arr[] = { 16, 17, 14, 3, 7, 2 };
        leader(arr);
    }

    public static void leader(int arr[]) {
        int n = arr.length;
        int a = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
            }

        }
        System.out.println(a);
    }
}

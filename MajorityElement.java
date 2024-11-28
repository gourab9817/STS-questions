public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 3, 2, 3, 2, 2, 3, 3, 2, 3, 3 };
        System.out.println(elem(arr));
    }

    public static int elem(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }
            }
            if (count > (n / 2))
                return arr[i];
        }
        return -1;
    }
}

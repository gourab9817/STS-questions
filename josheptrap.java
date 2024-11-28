public class josheptrap {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(joshpetrap(n, k));
    }

    public static int joshpetrap(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (joshpetrap(n - 1, k) + k - 1) % n + 1;
        }
    }
}

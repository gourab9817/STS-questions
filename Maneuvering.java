public class Maneuvering {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(man(m, n));
    }

    public static int man(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        } else {
            return man(m, n - 1) + man(m - 1, n);
        }
    }
}

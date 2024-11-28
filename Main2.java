public class Main2 {
    public static void main(String[] args) {

    }

    static int fact(int n) {
        int a = 1;
        if (n == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        return a;
    }
}

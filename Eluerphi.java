import java.util.*;

public class Eluerphi {
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return (gcd(b % a, a));
        }
    }

    static int phi(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (gcd(n, i) == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(phi(n));
    }
}

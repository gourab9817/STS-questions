import java.util.*;

public class SimpleSieve {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SimpleSieveSolution(n);

    }

    public static void SimpleSieveSolution(int n) {
        int prime[] = new int[n + 1];
        for (int i = 2; i < n; i++) {
            prime[i] = 1;
        }
        for (int i = 2; (i * i) <= n; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                System.out.println(i);
            }

        }
    }
}
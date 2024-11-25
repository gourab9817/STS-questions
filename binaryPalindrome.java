import java.util.*;

public class binaryPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isbinarypalindrome(n));
    }

    public static boolean isbinarypalindrome(int n) {
        int reversed = 0;
        int original = n;
        while (n > 0) {
            reversed = reversed << 1;
            int a = n & 1;
            reversed = reversed | a;
            n = n >> 1;
        }
        if (reversed == original) {
            return true;
        }
        return false;
    }
}

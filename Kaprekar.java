public class Kaprekar {
    public static void main(String[] args) {
        int n = 12;
        int m = 297;

        // Checking both numbers
        System.out.println(n + " is a Kaprekar number: " + isKaprekar(n));
        System.out.println(m + " is a Kaprekar number: " + isKaprekar(m));
    }

    static boolean isKaprekar(int n) {
        int len = (int) Math.log10(n) + 1;
        int square = n * n;

        // Split square into left and right parts
        int right = square % (int) Math.pow(10, len); // Right part is the last 'len' digits
        int left = square / (int) Math.pow(10, len); // Left part is the remaining digits

        // Kaprekar condition check
        if (left + right == n)
            return true;

        return false;
    }
}

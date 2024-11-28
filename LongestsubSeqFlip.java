import java.util.*;

public class LongestsubSeqFlip {
    private static int findMaxConsecutiveOnes(int a, int k) {
        String str = Integer.toBinaryString(a);
        int maxOnes = Integer.MIN_VALUE;
        int numReplacements = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            if (str.charAt(windowEnd) == '0') {
                numReplacements++;
            }
            while (numReplacements > k) {
                if (str.charAt(windowStart) == '0') {
                    numReplacements--;
                }
                windowStart++;
            }
            maxOnes = Math.max(maxOnes, windowEnd - windowStart + 1);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = findMaxConsecutiveOnes(n, 1);
        System.out.println(result);
    }

}

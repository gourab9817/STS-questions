import java.util.*;

public class weightedsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 7;
        String s = "aabcedbcd";
        substring(k, s);
    }

    public static void substring(int k, String s) {
        List<String> substr = new ArrayList<>();
        Map<Character, Integer> mp = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            mp.put(ch, ch - 'a' + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            int sum = 0;
            for (int j = i; j < s.length(); j++) {
                sum += mp.get(s.charAt(j));
                if (sum == k) {
                    substr.add(s.substring(i, j + 1));
                } else if (sum > k) {
                    break;
                }
            }
        }
        System.out.println(substr);
    }

}

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class weightedsubstring {
// static int[] values = new int[26]; // Array to hold custom values for 'A' to
// 'Z'

// public static void main(String[] args) {
// insertValues(); // Populate the values array using the custom formula
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the target sum (n): ");
// int n = scanner.nextInt();

// List<Character> result = new ArrayList<>();
// formedString(result, n);
// }

// static void insertValues() {
// values[0] = 1; // 'A' is assigned the value 1
// int prev = 1;

// for (int i = 1; i < 26; i++) {
// // Recursive formula to generate the next value
// values[i] = (i + 1) * prev + prev;
// prev = values[i];
// }
// }

// static void formedString(List<Character> result, int n) {
// int low = 0;
// int high = 25; // Values correspond to 'A' (0) through 'Z' (25)

// while (n != 0) {
// int index = findFloor(n, low, high);
// result.add((char) (index + 'A')); // Convert index to corresponding letter
// n -= values[index]; // Subtract the value from the target
// }

// // Print the characters in reverse order (because we built the string
// backwards)
// for (int i = result.size() - 1; i >= 0; i--) {
// System.out.print(result.get(i));
// }
// }

// static int findFloor(int n, int low, int high) {
// int ans = -1;

// while (low <= high) {
// int mid = (low + high) / 2;
// if (values[mid] <= n) {
// ans = mid;
// low = mid + 1;
// } else {
// high = mid - 1;
// }
// }
// return ans;
// }
// }

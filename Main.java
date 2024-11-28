import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 7, -7, 9, 4, 2 };
        int n = arr.length;
        // leader(arr, n);
        // int a = 3;
        // int b = 3;
        // System.out.println(man(a, b));

        // System.out.println(maxProduct(arr, n));

        // int x = 30;
        // sieve(x);

        // String s = "vit-ap-university";
        // hypen(s);

        // sort(arr, n);
        int c = 3;
        int d = 3;
        System.out.println(Maneuvering(c, d));
    }

    public static void leader(int arr[], int n) {
        int a = arr[n - 1];
        List<Integer> nl = new ArrayList<>();
        nl.add(a);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > a) {
                nl.add(arr[i]);
            }
            a = arr[i];
        }
        System.out.println(nl);
    }

    public static int man(int a, int b) {
        if (a == 1 || b == 1) {
            return 1;
        } else {
            return man(a, b - 1) + man(a - 1, b);
        }
    }

    static int maxProduct(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int pro = 1;
            for (int j = i; j < n; j++) {
                pro *= arr[j];
                if (pro > max) {
                    max = pro;
                }

            }
        }
        return max;
    }

    static void sieve(int x) {
        int arr[] = new int[x + 1];
        for (int i = 2; i < x; i++) {
            arr[i] = 1;
        }
        for (int i = 2; i * i < x; i++) {
            if (arr[i] == 1) {
                for (int j = i * i; j < x; j += i) {
                    arr[j] = 0;
                }

            }
        }
        for (int i = 2; i <= x; i++) {
            if (arr[i] == 1) {
                System.out.println(i);
            }
        }
    }

    static void hypen(String s) {
        StringBuilder ns = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                count++;
            } else {
                ns.append(s.charAt(i));
            }

        }
        for (int i = 0; i < count; i++) {
            ns.append('-');
        }
        System.out.println(ns);
    }

    static void sort(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    static int Maneuvering(int c, int d) {
        if (c == 1 || d == 1) {
            return 1;
        } else {
            return Maneuvering(c, d - 1) + Maneuvering(c - 1, d);
        }
    }
}

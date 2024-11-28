import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int n = sk.nextInt();
        System.out.println(stobo(n));
    }

    static int stobo(int n) {
        String s = Integer.toString(n);
        Map<Character, Character> set = new HashMap<>();
        set.put('0', '0');
        set.put('1', '1');
        set.put('9', '6');
        set.put('6', '9');
        set.put('8', '8');
        int i = 0;
        int j = s.length() - 1;
        for (i = 0; i < j + 1; i++) {
            if (!set.containsKey(s.charAt(i))) {
                return -1;
            }
        }
        while (i < j) {

            if (s.charAt(j) != s.charAt(i)) {
                return -1;
            }
        }
        return 1;
    }
}

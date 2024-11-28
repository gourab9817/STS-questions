import java.util.*;

public class Combination {
    public static void main(String[] args) {
        List<Integer> mp = new ArrayList<>();
        mp.add(2);
        mp.add(7);
        mp.add(8);
        mp.add(4);
        mp.add(3);
        mp.add(2);
        mp.add(0);
        mp.add(19);
        mp.add(13);
        int r = 2;
        int n = mp.size();
        int com = fact(n) / (fact(r) * fact(n - r));
        System.out.println(com);

    }

    public static int fact(int n) {
        int m = 1;
        if (n == 0) {
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                m *= i;
            }
            return m;
        }
    }
}

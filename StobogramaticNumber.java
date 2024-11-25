import java.util.*;

public class StobogramaticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stobogramaticCheck(n));
    }

    public static boolean stobogramaticCheck(int n) {
        String str = Integer.toString(n);
        Map<Character, Character> strmap = new HashMap<Character, Character>();
        strmap.put('0', '0');
        strmap.put('1', '1');
        strmap.put('6', '9');
        strmap.put('9', '6');
        strmap.put('8', '8');

        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {

            if (strmap.get(str.charAt(i)) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}

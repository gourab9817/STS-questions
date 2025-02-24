import java.util.*;

public class Sortedpermutation {
    public static void main(String[] args) {
        String s = "ABC";
        TreeSet<String> str = new TreeSet<>();
        per(s, "", str);
        // System.out.println(str);
        for (String i : str) {
            System.out.println(i);
        }
    }

    public static void per(String s, String prefix, TreeSet<String> str) {
        // StringBuilder sb = new StringBuilder();

        if (s.length() == 0) {
            str.add(prefix);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String res = s.substring(0, i) + s.substring(i + 1);
            per(res, ch + prefix, str);
        }

    }
}
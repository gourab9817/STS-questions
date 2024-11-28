import java.util.TreeSet;

public class Sortedpermutation {

    public static void generatePermutations(String input, String prefix, TreeSet<String> result) {
        if (input.length() == 0) {
            result.add(prefix); // Add to TreeSet to ensure uniqueness and sorted order
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String remaining = input.substring(0, i) + input.substring(i + 1);
            generatePermutations(remaining, prefix + ch, result);
        }
    }

    public static void main(String[] args) {
        String input = "ADCB";
        TreeSet<String> result = new TreeSet<>();
        // Generate permutations
        generatePermutations(input, "", result);
        // Print unique, sorted permutations
        System.out.println("Permutations of " + input + ":");
        for (String perm : result) {
            System.out.println(perm);
        }
    }
}

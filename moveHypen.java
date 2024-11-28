public class moveHypen {
    public static void main(String[] args) {
        String s = "vit-ap-university";
        move(s);
        movef(s);
    }

    public static void move(String s) {
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

    public static void movef(String s) {
        StringBuilder ns = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            ns.append('-');
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                ns.append(s.charAt(i));
            }
        }
        System.out.println(ns);
    }

}

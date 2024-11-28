public class EcludeGCD {
    public static void main(String[] args) {

        int a = 3;
        int b = 10;
        System.out.println(Ecludegcd(a, b));
    }

    public static int Ecludegcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return Ecludegcd(b % a, a);
    }
}

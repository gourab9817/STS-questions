public class SwapTwoNibbles {
    public static void main(String[] args) {
        int n = 255;
        swap(n);
    }

    public static void swap(int n) {
        int a = n;
        int b;
        b = a & 15;
        b = b << 4;
        int c;
        c = n >> 4;
        int d;
        d = b | c;
        System.out.println(d);

    }
}

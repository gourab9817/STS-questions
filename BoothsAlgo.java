import java.util.Scanner;

public class BoothsAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.println("Enter two integers to multiply:");
        int multiplicand = sc.nextInt(); // M
        int multiplier = sc.nextInt(); // Q

        // Perform Booth's Algorithm
        int result = boothsAlgorithm(multiplicand, multiplier);

        // Output the result
        System.out.println("Result: " + result);
    }

    public static int boothsAlgorithm(int m, int q) {
        int q_1 = 0; // Auxiliary bit Q-1
        int A = 0; // Accumulator
        int count = Integer.toBinaryString(Math.abs(q)).length(); // Number of bits to process

        System.out.println("Initial Values:");
        System.out.println("A: " + A + ", Q: " + q + ", Q-1: " + q_1 + ", Count: " + count);

        while (count > 0) {
            int q0 = q & 1; // Least significant bit of Q

            // Booth's Algorithm Rules
            if (q0 == 1 && q_1 == 0) {
                A = A - m; // Subtract multiplicand
            } else if (q0 == 0 && q_1 == 1) {
                A = A + m; // Add multiplicand
            }

            // Arithmetic right shift (A, Q, Q-1)
            int combined = (A << 32) | (q & 0xFFFFFFFF); // Combine A and Q
            combined = combined >> 1; // Perform arithmetic right shift

            A = combined >> 32; // Upper 32 bits are A
            q = combined & 0xFFFFFFFF; // Lower 32 bits are Q
            q_1 = q & 1; // Update Q-1

            count--;

            // Debug Output for Each Step
            System.out.println("Step " + (Integer.toBinaryString(q).length() - count) + ":");
            System.out.println("A: " + A + ", Q: " + q + ", Q-1: " + q_1);
        }

        // The result is stored in Q
        return q;
    }
}

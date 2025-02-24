// public class SimpleSieve {

//     public static void Sieve(int limit) {
//         boolean[] prime = new boolean[limit + 1];
//         for (int i = 2; i <= limit; i++) {
//             prime[i] = true;
//         }

//         // Mark all the multiples of the prime numbers
//         for (int p = 2; p * p <= limit; p++) {
//             // If prime[p] is not changed, then it is a prime
//             if (prime[p]) {
//                 // Update all multiples of p
//                 for (int i = p * p; i <= limit; i += p) {
//                     prime[i] = false;
//                 }
//             }
//         }

//         // Print all prime numbers
//         for (int p = 2; p <= limit; p++) {
//             if (prime[p]) {
//                 System.out.print(p + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Sieve(50);
//     }
// }

public class SimpleSieve {
    public static void sieve(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 50;
        sieve(n);
    }
}
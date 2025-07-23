public class prime{

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");

        for (int i = 2; i <= 100; i++) { // Start from 2 as 1 is not prime
            if (isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) { // 0, 1, and negative numbers are not prime
            return false;
        }
        // Check for divisibility from 2 up to the square root of the number
        // Any factor greater than the square root would have a corresponding factor
        // smaller than the square root, which would have already been found.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }
        return true; // Prime if no divisors found
    }
}
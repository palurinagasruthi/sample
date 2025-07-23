public class strong {

    // Precompute factorials of digits from 0 to 9 for efficiency
    private static int[] factorial = new int[10];

    static {
        factorial[0] = 1;
        for (int i = 1; i < 10; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
    }

    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial[digit];
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println("Strong numbers from 1 to 5000:");
        for (int i = 1; i <= 5000; i++) {
            if (isStrongNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
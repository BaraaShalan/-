public class HW5 {

        public static void main(String[] args) {
            int n = 5;
            System.out.println(sumPositiveIntegers(n));
        }

        public static int sumPositiveIntegers(int n) {
            if (n < 1) {
                throw new IllegalArgumentException("Input must be a positive integer.");
            }

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            return sum;
        }
    }


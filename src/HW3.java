public class HW3 {


        public static void main(String[] args) {
            long n = 15;
            long m = 3;
            System.out.println(isMultiple(n, m));
        }

        public static boolean isMultiple(long n, long m) {
            if (m != 0 && n % m == 0) {
                return true;
            } else {
                return false;
            }
        }
    }



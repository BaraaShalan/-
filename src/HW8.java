public class HW8 {

        public static void main(String[] args) {

            System.out.println(countVowels("Hello, World!"));
        }

        public static int countVowels(String str) {
            int count = 0;
            String lowerCase = str.toLowerCase();

            for (int i = 0; i < lowerCase.length(); i++) {
                char c = lowerCase.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        }
    }


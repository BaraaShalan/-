public class HW9 {

        public static void main(String[] args) {

            System.out.println(removePunctuation("Let’s try, Mike!"));
        }

        public static String removePunctuation(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }


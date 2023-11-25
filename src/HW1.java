import java.util.Scanner;
public class HW1 {



        public static void main(String[] args) {
            inputAllBaseTypes();
        }

        public static void inputAllBaseTypes() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a boolean value:");
            boolean booleanValue = scanner.nextBoolean();
            System.out.println("You entered: " + booleanValue);

            System.out.println("Enter a byte value:");
            byte byteValue = scanner.nextByte();
            System.out.println("You entered: " + byteValue);

            System.out.println("Enter a short value:");
            short shortValue = scanner.nextShort();
            System.out.println("You entered: " + shortValue);

            System.out.println("Enter a char value:");
            char charValue = scanner.next().charAt(0);
            System.out.println("You entered: " + charValue);

            System.out.println("Enter an int value:");
            int intValue = scanner.nextInt();
            System.out.println("You entered: " + intValue);

            System.out.println("Enter a long value:");
            long longValue = scanner.nextLong();
            System.out.println("You entered: " + longValue);

            System.out.println("Enter a float value:");
            float floatValue = scanner.nextFloat();
            System.out.println("You entered: " + floatValue);

            System.out.println("Enter a double value:");
            double doubleValue = scanner.nextDouble();
            System.out.println("You entered: " + doubleValue);
        }
    }


import java.util.Scanner;
public class Q6 {

        public static void main(String[] args) {
            int[] array = new int[5];
            inputArrayElements(array);
            System.out.println("Array elements:");
            for (int element : array) {
                System.out.println(element);
            }
        }
        public static void inputArrayElements(int[] array) {

            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter array elements:");

            for (int i = 0; i < array.length; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }
            scanner.close();
        }
    }


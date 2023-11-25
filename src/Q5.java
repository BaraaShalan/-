public class Q5 {


        public static void printArrayElements(int[] array, int size) {
            System.out.println("The elements of the array are:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int size = array.length;

            printArrayElements(array, size);
        }
    }


import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // Task 1
    public static int[] numberOfElementsArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }


        return array;
    }

    // 2. Task 2
    public static void arrayEvenOddCounting(int[] array) {
        int evenNumber = 0;
        int oddNumber = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }

        System.out.println("Number of even figures: " + evenNumber);
        System.out.println("Number of odd figures: " + oddNumber);
    }

    // 3. Task 3
    public static int[] addSizeToArray(int[] array) {
        int size = array.length;

        int[] newArray = Arrays.copyOf(array, size + 1);

        newArray[size] = size;

        return newArray;
    }

    public static void main(String[] args) {


        // task 1 output

        int[] userArray = numberOfElementsArray();

        int arraySize = userArray.length;
        System.out.println("The size of the array is: " + arraySize);

        // task 2 output
        arrayEvenOddCounting(userArray);

        // task 3 output
        int[] newArray = addSizeToArray(userArray);
        System.out.println("Array after adding has elements: " + Arrays.toString(newArray));
    }
}

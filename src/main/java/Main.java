import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task 1
//        int[] nums = {11, 22, 33, 524, 25, 236, 123, 12132, 234, 234};
//        int result = getMaxNum(nums);
//        System.out.println(result);


//        task 2
//        getSimpleNums(20);

    }

    public static int getMaxNum(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            int numberToCheck = nums[i];

            if (numberToCheck > max) {
                max = numberToCheck;
            }
        }

        return max;
    }

    public static void getSimpleNums(int limit) {
        for (int i = 2; i < limit; ++i) {
            if (isNumSimple(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isNumSimple(int num) {
        for (int i = 2; i < num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


    //        task 1

    public class CalculationOfArray {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Type in the number of elements in this array: ");
            int n = scanner.nextInt();

            int[] arrayElement = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arrayElement[i] = scanner.nextInt();
            }

            int arrayVolume = arrayElement.length;

            System.out.println("The size of the arrayElement is: " + arrayVolume);

            scanner.close();
        }
    }

    //        task 2

    public class CalculationOrderArray {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Type in the number of elements in this arrayElement: ");
            int n = scanner.nextInt();


            int[] arrayElement = new int[n];


            System.out.println("Enter " + n + " figures:");
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arrayElement[i] = scanner.nextInt();
            }


            int numberEven = 0;
            int numberOdd = 0;


            for (int num : arrayElement) {
                if (num % 2 == 0) {
                    numberEven++;
                } else {
                    numberOdd++;
                }
            }


            System.out.println("Number of even elements: " + numberEven);
            System.out.println("Number of odd elements: " + numberOdd);


            scanner.close();
        }
    }

    //        task 3

    public class SearchWithinArray {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();


            int[] arrayElement = new int[n];


            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }


            System.out.print("Enter the number to search for: ");
            int searchNumber = scanner.nextInt();


            boolean found = false;
            for (int num : array) {
                if (num == searchNumber) {
                    found = true;
                    break;
                }
            }


            if (found) {
                System.out.println("The number " + searchNumber + " is in the array.");
            } else {
                System.out.println("The number " + searchNumber + " is not in the array.");
            }


            scanner.close();
        }
    }




}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        int[] arr1 = {1, 2, 3, 5, 888, 10, 67, 99, 101, -3};
        int[] arr2 = {};

//        System.out.println(weHaveSomeNumber(arr, 3));
//        System.out.println(evenFind(arr));
//        System.out.println(arrayHelper(arr1, 10));
//        System.out.println(arrayHelper(arr, 5));
//        System.out.println(arrayHelper(arr2, 2));
//        System.out.println(complexArrayHelper(arr));
//        System.out.println(complexArrayHelper(arr1));
//        System.out.println(complexArrayHelper(arr2));
//        System.out.println(sumOfElements(arr));
//        System.out.println(sumOfElements(arr2));
//        System.out.println(maxElements(arr1));
//        System.out.println(maxElementsEven(arr1));
//        System.out.println(maxElementsIndex(arr1));
//        System.out.println(minElements(arr1));
        System.out.println(minMaxElements(arr1));


    }

    // we have a FLAG here - if our array "Good" or "Bad'
    public static boolean weHaveSomeNumber(int[] arr, int searchNumber) {
        boolean result = false;

        for (int i = 0; i < arr.length; i += 1) {
            int currentNumber = arr[i];
            if (currentNumber == searchNumber) {
                result = true;
            }
        }

        return result;
    }

    // we collect data about the array
    public static List<Integer> evenFind(int[] arr) {
        List<Integer> evenNumbers = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i += 1) {
            int currentNumber = arr[i];
            if (currentNumber % 2 == 0) {
                evenNumbers.add(currentNumber);
            }
        }

        return evenNumbers;

    }


    public static boolean arrayHelper(int[] arr1, int parameter) {
        boolean foundNumber = false;
        for (int i = 0; i < arr1.length; i++) {
            int currentArrayNumber = arr1[i];
            if (currentArrayNumber == parameter) {
                foundNumber = true;
                break;
            }
        }
        return foundNumber;
    }


    public static boolean complexArrayHelper(int[] arr2) {
        boolean isFiveExists = false;
        boolean isTenExists = false;
        for (int i = 0; i < arr2.length; i++) {
            int currentArrayNumber = arr2[i];


            if (currentArrayNumber == 5) {
                isFiveExists = true;
            }
            if (currentArrayNumber == 10) {
                isTenExists = true;
            }

            if (isTenExists && isFiveExists) {
                break;
            }

        }
        return isTenExists && isFiveExists;
    }

    public static int sumOfElements(int[] arr3) {
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            int currentNumber = arr3[i];
            sum += currentNumber;

        }
        return sum;
    }

    public static int maxElements(int[] arr4) {
        int maxNumber = 0;
        for (int i = 0; i < arr4.length; i++) {
            int currentNumber = arr4[i];
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        return maxNumber;
    }

    public static int maxElementsEven(int[] arr4) {
        int maxNumber = 0;

        for (int i = 0; i < arr4.length; i++) {
            int currentNumber = arr4[i];
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        if (maxNumber % 2 == 0) {
            return maxNumber;
        }
        return -1;
    }

    public static int maxElementsIndex(int[] arr4) {
        int maxNumber = 0;
        int index = 0;
        for (int i = 0; i < arr4.length; i++) {
            int currentNumber = arr4[i];
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
                index = i;
            }
        }
        return index;
    }

    public static int minElements(int[] arr4) {
        int minNumber = 0;
        for (int i = 0; i < arr4.length; i++) {
            int currentNumber = arr4[i];
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }
        return minNumber;
    }

    public static int[] minMaxElements(int[] arr4) {
        int maxNumber = 0;
        int minNumber = 0;
        int[] arrMinMax = {minNumber, maxNumber};

        for (int i = 0; i < arr4.length; i++) {
            int currentNumber = arr4[i];
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }


        for (int i = 0; i < arr4.length; i++) {
            int currentNumber = arr4[i];
            if (currentNumber > minNumber) {
                minNumber = currentNumber;
            }
        }

        return arrMinMax;

    }


}
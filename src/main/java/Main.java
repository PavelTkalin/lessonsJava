import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int[] arr1 = {1, 2, 3, 5, -888, -10, 67, 4, 4, 6, 8};
        int[] arr2 = {};
        String[] words = {"man", "hu", "beasteee"};

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
//        System.out.println(maxElements(arr2));
//        System.out.println(maxElementsEven(arr1));
//        System.out.println(maxElementsIndex(arr1));
//        System.out.println(minElements(arr1));
//        System.out.println(Arrays.toString(minMaxElements(arr1)));

//        System.out.println(stringHelper(words, 6));
//        System.out.println(stringHelper3(arr1, 3));
//        System.out.println(stringHelper2(arr1));
        System.out.println(stringHelper4(words));

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

        if (arr4.length == 0) {

            throw new RuntimeException("array should contain elements");
        }
        int maxNumber = arr4[0];
        for (int i = 1; i < arr4.length; i++) {
            int currentNumber = arr4[i];
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }

        }

        return maxNumber;


    }

    public static int maxElementsEven(int[] arr4) {
        int maxNumber = arr4[0];

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

        if (arr4.length < 2) {
            throw new RuntimeException("There should be at least 2 elements");
        }

        int maxNumber = arr4[0];
        int minNumber = arr4[1];

        if (arr4[0] < arr4[1]) {
            minNumber = arr4[0];
            maxNumber = arr4[1];
        }


        for (int i = 2; i < arr4.length; i++) {
            int currentNumber = arr4[i];
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        int[] arrMinMax = {minNumber, maxNumber};
        return arrMinMax;


    }

    public static boolean stringHelper(String[] words, int n) {

        for (int i = 0; i < words.length - 2; i++) {

            if (words[i].length() > n && words[i + 1].length() > n) {
                return true;
            }
        }

        return false;
    }

    public static boolean stringHelper2(String[] words, int n) {

        for (int i = 0; i < words.length - 1; i++) {

            if (words[i].length() > n && words[i + 1].length() > n) {
                return true;
            }
        }

        return false;
    }

    public static boolean stringHelper3(int[] nums, int k) {

        for (int i = 0; i < nums.length - 1; i++) {

            if (abs(nums[i] - nums[i + 1]) == k) {
                return true;
            }
        }

        return false;

    }

    public static boolean stringHelper2(int[] nums) {
        if (nums.length < 3) {

            throw new RuntimeException("array should contain more than 3 elements");
        }

        for (int i = 0; i < nums.length - 2; i++) {

            int firstNumber = nums[i];
            int secondNumber = nums[i + 1];
            int thirdNumber = nums[i + 2];

            if (firstNumber == secondNumber && secondNumber == thirdNumber) {
                return true;
            }
        }

        return false;

    }


    public static boolean stringHelper4(String[] words) {

        for (int i = 0; i < words.length - 1; i++) {

            int shortStringCounter = 0;
            int longStringCounter = 0;
            if (words[i].length() <= 3) {
                shortStringCounter = shortStringCounter + 1;
            }
            if (words[i].length() >= 6) {
                longStringCounter = longStringCounter + 1;
            }

            if (longStringCounter > shortStringCounter) {
                return true;
            }

            if (longStringCounter == shortStringCounter)
            {
                throw new RuntimeException("long String amount is equal to short string amount");
        }

        return false;
    }

}
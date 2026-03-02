import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int[] arr1 = {1, 2, 3, 5, -888, -10, 67, 4, 4, 6, 8};
        int[] arr2 = {};
        String[] words = {"a", "aa", "aaa", "aaa"};
        int[][] matrix = {
                {1, 2, 4},
                {3, 2, 1},
                {5, 3, 1},
                {2, 3, 4}
        };

        int[][] matrix2 = {
                {1, 2, 1},
                {2, 0, 0},
                {1, 1, 1},
                {1, 1, 1}
        };

        int[][] diagonal = {
                {2, 1, 1},
                {1, 2, 1},
                {-1, 1, 5}
        };


//        printMatrix(matrix);

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

//        System.out.println(stringHelper(words, 3));
//        System.out.println(stringHelper3(arr1, 3));
//        System.out.println(stringHelper2(arr1));
//        System.out.println(stringHelper4(words));
//        System.out.println(stringHelper5(arr1));

//        System.out.println(sumOfMatrix(matrix2));
//        System.out.println(maxElement(matrix));
//        System.out.println(nullCalculateInMatrix(matrix));
//        System.out.println(diagonalCalcaltionMatrix(diagonal));
//        System.out.println(ifNegativeInMatrixExist(diagonal));
        System.out.println(ifEvenNumbersPresentInMatrix(diagonal));

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

        for (int i = 0; i < words.length - 1; i++) {

            if (words[i].length() >= n && words[i + 1].length() >= n) {
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
                shortStringCounter += 1;
            }
            if (words[i].length() >= 6) {
                longStringCounter += 1;
            }

            if (longStringCounter > shortStringCounter) {
                return true;
            }
        }
        return false;
    }

    public static boolean stringHelper5(int[] nums) {
        if (nums.length < 3) {

            throw new RuntimeException("array should contain more than 3 elements");
        }

        for (int i = 1; i < nums.length - 1; i++) {

            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return true;
            }
        }

        return false;

    }

    public static boolean twoStringLengthCalculation(String[] strings) {

        for (int i = 0; i < strings.length; i++) {

            int String1Length = strings[i].length();

            for (int j = 0; j < strings.length; j++) {
                if (i == j) {
                    continue;
                }
                int String2Length = strings[j].length();
                if (String1Length == String2Length) {
                    return true;
                }
            }


        }
        return false;
    }

    public static void printMatrix(int[][] matrixVar) {
        for (int i = 0; i < matrixVar.length; i++) {
            Arrays.toString(matrixVar[i]);
            for (int j = 0; j < matrixVar[i].length; j++) {
                System.out.print(matrixVar[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix2(int[][] matrixVar) {
        for (int i = 0; i < matrixVar.length; i++) {
            for (int j = 0; j < matrixVar[i].length; j++) {
                System.out.print(matrixVar[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumOfMatrix(int[][] matrixSum) {
        int sum = 0;
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[i].length; j++) {
                sum = sum + matrixSum[i][j];
            }

        }
        return sum;
    }

    public static int maxElement(int[][] matrixMaxElement) {
        int maxElement = 0;
        for (int i = 0; i < matrixMaxElement.length; i++) {
            for (int j = 0; j < matrixMaxElement[i].length; j++) {
                if (matrixMaxElement[i][j] > maxElement) {
                    maxElement = matrixMaxElement[i][j];
                }

            }

        }
        return maxElement;
    }

    public static int nullCalculateInMatrix(int[][] nullMaxElement) {
        int nullElementCount = 0;
        for (int i = 0; i < nullMaxElement.length; i++) {
            for (int j = 0; j < nullMaxElement[i].length; j++) {
                if (nullMaxElement[i][j] == 0) {
                    nullElementCount = nullElementCount + 1;
                }

            }

        }
        return nullElementCount;
    }

    public static int diagonalCalcaltionMatrix(int[][] diagonalCalculationMatrix) {
        int diagonalCalcialtio = 0;
        for (int i = 0; i < diagonalCalculationMatrix.length; i++) {
            for (int j = 0; j < diagonalCalculationMatrix[i].length; j++) {
                if (i == j) {
                    diagonalCalcialtio = diagonalCalculationMatrix[i][j] + diagonalCalcialtio;
                }

            }

        }
        return diagonalCalcialtio;
    }

    public static boolean ifNegativeInMatrixExist(int[][] ifNegativeInMatrixExist) {
        boolean negativeValues = false;
        for (int i = 0; i < ifNegativeInMatrixExist.length; i++) {
            for (int j = 0; j < ifNegativeInMatrixExist[i].length; j++) {
                if (ifNegativeInMatrixExist[i][j] < 0) {
                    negativeValues = true;
                    break;
                }

            }

        }
        return negativeValues;
    }

    public static int ifEvenNumbersPresentInMatrix(int[][] ifEvenInMatrixExist) {
        int evenNumbers = 0;
        for (int i = 0; i < ifEvenInMatrixExist.length; i++) {
            for (int j = 0; j < ifEvenInMatrixExist[i].length; j++) {
                if (ifEvenInMatrixExist[i][j] % 2 == 0) {
                    evenNumbers = evenNumbers + 1;

                }

            }

        }
        return evenNumbers;
    }

    public static int indexRowMaxSumOfElements(int[][] matrixSumOfElements) {
        int indexMaxRow = 0;
        for (int i = 0; i < matrixSumOfElements.length; i++) {
            for (int j = 0; j < matrixSumOfElements[i].length; j++) {
                if (matrixSumOfElements[i][j] > indexMaxRow) {
                    return i;

                }

            }

        }
        return indexMaxRow;
    }

    public static boolean matrixSymmetry(int[][] matrixSymmetryTry) {
        boolean matrixSymmetryFlag = false;
        for (int i = 0; i < matrixSymmetryTry.length; i++) {
            for (int j = 0; j < matrixSymmetryTry.length; j++) {
                if (matrixSymmetryTry[i][j] == matrixSymmetryTry[j][i]) {
                    matrixSymmetryFlag = true;

                }

            }

        }
        return matrixSymmetryFlag;
    }

    public static int[][] matrixTranspond(int[][] matrixSymmetryTry) {

        int[][] matrixSymmetryTranspond;
        for (int i = 0; i < matrixSymmetryTry.length; i++) {
            for (int j = 0; j < matrixSymmetryTry.length; j++) {
                matrixSymmetryTry[i][j] = matrixSymmetryTranspond[j][i];

            }

        }
        return matrixSymmetryTranspond;
    }
}

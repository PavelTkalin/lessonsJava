import java.util.*;
import java.util.Objects;


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
//        System.out.println(ifEvenNumbersPresentInMatrix(diagonal));
//        System.out.println(matrixSymmetry(diagonal));

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
        if (matrixSumOfElements.length == 0) {
            throw new IllegalArgumentException("Matrix is empty");
        }

        int valueMaxSumRow = 0;
        int indexMaxRow = 0;

        for (int i = 0; i < matrixSumOfElements.length; i++) {
            int[] currentRow = matrixSumOfElements[i];

            int rowSum = 0;

            // суммируем
            for (int j = 0; j < currentRow.length; j++) {
                int currentNumber = currentRow[j];
                rowSum += currentNumber;
            }

            if ((i == 0) || (rowSum > valueMaxSumRow)) {
                valueMaxSumRow = rowSum;
                indexMaxRow = i;
            }

        }
        return indexMaxRow;
    }

    public static int[][] matrixTranspose(int[][] matrix) {
//        int[][] matrix = {
//            {1, 1, 1},
//            {2, 2, 2},
//        };

//        int[][] matrix = {
//            {1, 2},
//            {1, 2},
//            {1, 2},
//        };

        int rowSize = matrix[0].length;
        int[][] transposedMatrix = new int[rowSize][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; ++j) {
                int currentNum = matrix[i][j];
                transposedMatrix[j][i] = currentNum;
            }
        }

        return transposedMatrix;
    }

    /// HashMaps

    public static int sumOfNumbers(int n) {

        int[] numbers = new int[0];
        int sumOfNumbers = numbers[0];

        for (int i = 0; i < n; i++) {
            if (numbers[i] < n) {
                sumOfNumbers = numbers[i] + sumOfNumbers;
            }

        }
        return sumOfNumbers;
    }

    public static int evenCount(int[] numbersInput) {

        int evenNumber = numbersInput[0];

        for (int i = 0; i < numbersInput.length; i++) {
            if (numbersInput[i] % 2 == 0) {
                evenNumber++;
            }

        }
        return evenNumber;
    }

    public static int findMaxNumber(int[] numbers) {

        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }

        }
        return maxNumber;
    }

    public static String reversedString(String newString) {

        String reversedString = "";

        for (int i = newString.length() - 1; i >= 0; i--) {
            reversedString += newString.charAt(i);

        }
        return reversedString;
    }

    //можно решить по другому классически

    public static int[] multiplyTable(int number) {

        if (number == 0) {
            throw new RuntimeException("num should not more than zero");
        }

        int[] table = {0};

        //в фигурных мы подставляем значения
        int multiplier = 1;

        for (int i = 0; i < table.length; i++) {

            table[i] = multiplier * number;
            multiplier++;


        }
        return table;
    }

    public static int doubleMatrixCount(int[][] doubleMatrix) {

        int sum = 0;

        for (int i = 0; i < doubleMatrix.length; i++) {
            for (int j = 0; j < doubleMatrix[i].length; j++) {
                sum = sum + doubleMatrix[i][j];
            }
        }
        return sum;
    }

    //берем элемент строки и каждый элемент строки во внутреннем цикле

    public static Map<Integer, Integer> countNumbers(int[] arr) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int num : arr) {
            if (result.containsKey(num)) {
                result.put(num, result.get(num - 1));
            } else {

                result.put(num, 1);
            }
        }

        return result;
    }

    //Map это интерфейс, HashMap один из классов который интерфейс имплементирует Ключей может быть сколько угодно важно чтобы не повторялись

    public static Integer firstDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return null;
    }

    //HashSet это только ключи а значения null
    {
        // Пример использования Singleton
        SomeDB.getInstance().doQuery(); // long, with connection init
        SomeDB.getInstance(); // fast
        SomeDB.getInstance(); // fast
        SomeDB.getInstance(); // long - timeout connection

        // Пример задачи разработчика
        // 1. get user
        // 2. change user
        // 3. send to DB

        // от http-запроса данные от фронта
        int userId = 1238;
        String newName = "Oleg";

        User User = UserFactory.getUserByID(userId);
        String name = User.getName();

        // 2. set and validate
        User.setName(newName);

        // 3. send to DB
        IDB DB = DBFactory.getDBConnection();
        DB.recordData("");
    }

}

// Singleton
static class SomeDB {
    private static SomeDB instance;

    private SomeDB() {
        // connect
    }

    public static SomeDB getInstance() {
        if (!(instance instanceof SomeDB)) {
            instance = new SomeDB();
        }
        return instance;
    }

    public void doQuery() {
    }
}

// Feature department
static class User {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (this.validateName(name)) {
            this.name = name;
        }
        throw new IllegalArgumentException("Bad name");
    }

    private boolean validateName(String name) {
        if (name.isEmpty()) {
            return false;
        }
        return true;
    }
}

class UserFactory {
    public static User getUserByID(int id) {
        // поход в БД
        // select id, name, <...> from User where User.id=#id
        int userId = id;
        String userName = "Vitalii";

        return new User(userId, userName);
    }
}

// Infra department
class DBFactory {
    // читается из конфига
    private static int IP = 23123123;
    // private static String targetDB = "MySQL";
    private static String targetDB = "PostgreSQL";

    public static IDB getDBConnection() {
        if (Objects.equals(targetDB, "PostgreSQL")) {
            return new PostgreSQL(IP);
        } else {
            return new MySQL(IP);
        }
    }
}

static class MySQL implements IDB {
    int connectionIP;

    MySQL(int connectionIP) {
        this.connectionIP = connectionIP;
    }

    public String getData(String query) {
        // select id, name, <...> from User where User.id=#id
        return "Vitalii";
    }

    public void recordData(String query) {
        // insert into <....>
    }

    public void deleteData(String query) {
        // delete <....>
    }

    public void somethingOnlyForMySQL() {

    }
}

static class PostgreSQL implements IDB {
    int connectionIP;

    PostgreSQL(int connectionIP) {
        this.connectionIP = connectionIP;
        // create connection --> connect to DB
    }

    public String getData(String query) {
        // select id, name, <...> from User where User.id=#id
        return "Vitalii";
    }

    public void recordData(String query) {
        // insert into <....>
    }

    public void deleteData(String query) {
        // delete <....>
    }

    public void somethingOnlyForPostgreSQL() {

    }
}

interface IDB {
    public String getData(String query);

    public void recordData(String query);

    public void deleteData(String query);
}


class Input {
    int messageId;
    String messagePayload;

    Input(int messageId, String messagePayload) {
        this.messageId = messageId;
        this.messagePayload = messagePayload;
    }

    public String getMessagePayload() {
        return this.messagePayload;
    }


    public void SetMessagePayload(String messagePayload) {
        if (this.validateInput(messagePayload)) {

            this.messagePayload = messagePayload;
        }
        throw new IllegalArgumentException("input is not correct");
    }

    public boolean validateInput(String messagePayload) {
        if (messagePayload.isEmpty()) {
            return false;
        } else return true;
    }
}

public Input getUserByID(int id) {
    int userId = id;
    String name = "Vasily";

    return new Input(userId, name);
}

interface fieldInputMethods {
    public String getInput(String input);

    public void editInput(String input);

    public void deleteInput(String query);
}

class InputFactory implements fieldInputMethods {

    String input;

    InputFactory(String input) {
        this.input = input;
    }

    public String getInput(String input) {

        return "client_message";
    }

    public void editInput(String input) {

    }

    public void deleteInput(String input) {

    }
}

void main() {
}


















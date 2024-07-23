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
}

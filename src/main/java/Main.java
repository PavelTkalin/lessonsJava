public class Main {


    public static void main(String[] args) {
        String result = filterBadWords("cat");
        System.out.println(result);

    }


    public static String filterBadWords(String message) {

        String[] args = new String[]{"cat", "dog", "fish"};

        for (String arg : args) {
            if (message.contains(arg)) {
                System.out.println("Test failed");
                return " ";
            }

        }

        return message;

    }
}
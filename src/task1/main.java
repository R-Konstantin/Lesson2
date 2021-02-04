package task1;

public class main {

    public static void main(String[] args) {

        String resultNumber = "";

        for (int i = args[0].length(); i != 0; i--) {
            resultNumber = resultNumber + args[0].charAt(i - 1);
        }

        System.out.println(resultNumber);

    }
}
public class Factorial {

    static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {

        int number = 7;

        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}

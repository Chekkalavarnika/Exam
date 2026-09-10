public class TestFactorial {

    public static void main(String[] args) {

        if (Factorial.compute(5) == 120) {
            System.out.println("Test 5 passed");
        } else {
            System.out.println("Test 5 failed");
        }

        if (Factorial.compute(0) == 1) {
            System.out.println("Test 0 passed");
        } else {
            System.out.println("Test 0 failed");
        }

        System.out.println("All tests completed.");
    }
}

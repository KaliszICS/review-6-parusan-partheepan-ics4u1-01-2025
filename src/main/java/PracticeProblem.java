
public class PracticeProblem {

    public static void main(String args[]) {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
    }

    // 1. sum method
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void q1() {
        // You would call your sum method here to test it
        // For example: 
        // int result = sum(5, 3);
        // System.out.println("Sum: " + result);
    }

    // 2. difference method
    public static int difference(int a, int b) {
        return a - b;
    }
    public static void q2() {
        // Test the difference method here
    }

    // 3. product method
    public static double product(double a, double b) {
        return a * b;
    }
    public static void q3() {
        // Test the product method here
    }

    // 4. removeFirst method
    public static String removeFirst(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(1);
    }
    public static void q4() {
        // Test the removeFirst method here
    }

    // 5. combinedLength method
    public static int combinedLength(String str1, String str2) {
        if (str1 == null) str1 = "";
        if (str2 == null) str2 = "";
        return str1.length() + str2.length();
    }
    public static void q5() {
        // Test the combinedLength method here
    }

    // 6. isEven method
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void q6() {
        // Test the isEven method here
    }

    // 7. isOdd method
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    public static void q7() {
        // Test the isOdd method here
    }

    // 8. isPositive method
    public static boolean isPositive(int number) {
        return number > 0;
    }
    public static void q8() {
        // Test the isPositive method here
    }

    // 9. isNegative method
    public static boolean isNegative(int number) {
        return number < 0;
    }
    public static void q9() {
        // Test the isNegative method here
    }
}
public class Problem2 {
    public static void performDivision(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        System.out.println("Result: " + (numerator / denominator));
    }

    public static void calculate(int numerator, int denominator) {
        try {
            performDivision(numerator, denominator);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error in division operation: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            calculate(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

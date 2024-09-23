public class SimpleCalculator {

    public static void main(String[] args) {
        try {
            int result = calculate(10, 5, "*");
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int calculate(int num1, int num2, String operator) throws Exception {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0)
                    throw new ArithmeticException("Division by zero is not allowed.");
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator. Allowed operators are +, -, *, /.");
        }
    }
}

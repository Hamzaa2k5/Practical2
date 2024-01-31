public class GreatestCommonDenominator2 {
    // Wrapper method with input validation
    public static int findGCD(int a, int b) {
        if (b == 0) {
            if (a < 0) {
                throw new IllegalArgumentException("Input must be non-negative");
            }
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        try {
            int gcd = findGCD(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

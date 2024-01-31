public class DecimalToAnyBase2 {
    // Utility function to convert a digit to its character representation
    private static char reVal(int num) {
        if (num >= 0 && num <= 9) {
            return (char) (num + '0');
        } else {
            return (char) (num - 10 + 'A');
        }
    }

    // Wrapper method with input validation
    private static String convertToBase(int decimalNumber, int base) {
        if (decimalNumber < 0 || base < 2) {
            throw new IllegalArgumentException("Input must be non-negative for decimalNumber and base must be 2 or greater");
        }

        if (decimalNumber == 0) {
            return "";
        } else {
            return convertToBase(decimalNumber / base, base) + reVal(decimalNumber % base);
        }
    }

    public static void main(String[] args) {
        int decimalNumber = 233;
        int base = 16;

        try {
            String result = convertToBase(decimalNumber, base);
            System.out.println("Decimal " + decimalNumber + " in base " + base + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

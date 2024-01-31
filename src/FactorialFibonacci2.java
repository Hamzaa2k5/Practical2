public class FactorialFibonacci2 {

    // Wrapper method with input validation
    public static long calcNFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must not be negative");
        } else {
            return calcNFactorialRecursive(n);
        }
    }

    // Recursive solution for factorial
    private static long calcNFactorialRecursive(int n) {
        long factorial = 1;
        if (n == 0) {
            factorial = 1;
        } else {
            factorial = n * calcNFactorialRecursive(n - 1);
        }
        return factorial;
    }

    // Iterative solution for Fibonacci
    public static long calcNFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must not be negative");
        }

        if (n <= 1) {
            return n;
        }

        long fib1 = 0, fib2 = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }

    // Recursive solution for Fibonacci
    public static long calcNFibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must not be negative");
        }

        if (n <= 1) {
            return n;
        } else {
            return calcNFibonacciRecursive(n - 1) + calcNFibonacciRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        // Testing the performance with increasing values of n
        for (int n = 0; n <= 10; n++) {
            try {
                long factorialResult = calcNFactorial(n);
                long factorialRecursiveResult = calcNFactorialRecursive(n);
                long fibonacciResult = calcNFibonacci(n);
                long fibonacciRecursiveResult = calcNFibonacciRecursive(n);

                System.out.println("n = " + n + ":");
                System.out.println("Factorial Iterative: " + factorialResult);
                System.out.println("Factorial Recursive: " + factorialRecursiveResult);
                System.out.println("Fibonacci Iterative: " + fibonacciResult);
                System.out.println("Fibonacci Recursive: " + fibonacciRecursiveResult);
                System.out.println();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

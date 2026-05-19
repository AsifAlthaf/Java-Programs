// Create a functional interface MathOperation with a method int operate(int a, int b). 
// Use lambda expressions to implement addition, subtraction, and multiplication operations and execute them.

// Define the functional interface
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExpressions{
    public static void main(String[] args) {
        // Define numbers to operate on
        int num1 = 12;
        int num2 = 5;

        // 1. Lambda expression for Addition
        MathOperation addition = (a, b) -> a + b;

        // 2. Lambda expression for Subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // 3. Lambda expression for Multiplication
        MathOperation multiplication = (a, b) -> a * b;

        // Execute the operations and print results
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("Addition: " + addition.operate(num1, num2));
        System.out.println("Subtraction: " + subtraction.operate(num1, num2));
        System.out.println("Multiplication: " + multiplication.operate(num1, num2));
    }
}
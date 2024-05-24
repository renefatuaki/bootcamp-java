package elfa;

public class Addition {
    public static void main(String[] args) {
        System.out.println("add(10, 5): " + add(10, 5));
        System.out.println("add(10.1, 5.2): " + add(10.1, 5.2));

        System.out.println("subtract(10, 5): " + subtract(10, 5));

        System.out.println("makePositive(10): " + makePositive(10));
        System.out.println("makePositive(-10): " + makePositive(-10));
        System.out.println("makePositive(0): " + makePositive(0));
        
        System.out.println("surprise(10, 20): " + surprise(10, 20));
        System.out.println("surprise(20, 10): " + surprise(20, 10));

        System.out.println("isEven(2): " + isEven(2));
        System.out.println("isEven(3): " + isEven(3));

        System.out.println("isPalindrome('Test'): " + isPalindrome("Test"));
        System.out.println("isPalindrome('Kayak'): " + isPalindrome("Kayak"));
    }

    // Debug your program: go through each line of your program step by step.
    public static int add(int a, int b) {
        return a + b;
    }

    // Extend the 'add' method to also support floating-point numbers (double). (Research how a Java method can support different parameter/return types)
    public static double add(double a, double b) {
        return a + b;
    }

    // Write another method named 'subtract' that takes two int parameters and returns the difference of the two numbers.
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Write another method named 'makePositive' that simply returns positive numbers and converts negative numbers to positive numbers.
    // (For argument '5', '5' should be returned, but for argument '-28', '28' should be returned)
    public static int makePositive(int a) {
        if (a < 0) {
            return -a;
        }

        return a;
    }

    // BONUS

    // Create a conditional statement to call the 'subtract' method if the first number is greater than the second, otherwise call the 'add' method.
    public static int surprise(int a, int b) {
        if (a > b) {
            return subtract(a, b);
        } else {
            return add(a, b);
        }
    }

    // Write a method that checks if a number is even. Even numbers should be returned as is, while odd numbers should be doubled.
    public static int isEven(int a) {
        if (a % 2 == 0) {
            return a;
        } else {
            return a * a;
        }
    }

    //     Write a method that takes a string as a parameter and checks if it is a palindrome (i.e., reads the same forwards and backwards).
    //     Return true if it is a palindrome, otherwise return false.
    public static boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString().toLowerCase();

        return reversedWord.equals(word.toLowerCase());
    }
}

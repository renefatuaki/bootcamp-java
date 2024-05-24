package elfa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

//    Write a test for a method that calculates the sum of two integers.
    public static int sum(int a, int b) {
        return a + b;
    }

//    Write a test for a method that checks if a given number is even.
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

//    Write a test for a method that calculates the product of two integers.
    public static int multiple(int a, int b) {
        return a * b;
    }

//    Write a test for a method that converts a given string to uppercase.
    public static String toUppercase(String word) {
        return word.toUpperCase();
    }
//    Write a test for a method that checks if a given number is positive.
    public static boolean isPositive(int number) {
        return number >= 0;
    }
}
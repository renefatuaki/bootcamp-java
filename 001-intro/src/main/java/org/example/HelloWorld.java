package org.example;

public class HelloWorld {
    public static void main(String[] args) {
        String message = "Hello, Java!";
        System.out.println(message);
        message = "Java is cool!";
        System.out.println(message);

        int a = 100;
        int b = 50;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        boolean isGreater = a < b;
        System.out.println("Is greater: " + isGreater);

        float ab = 10.5f;
        float cd = 5.5f;
        boolean isEqual = ab == cd;
        System.out.println("Is equal: " + isEqual);

        double ef = 20.002;
        double gh = 20.001;
        boolean isSmaller = ef > gh;
        System.out.println("Is smaller: " + isSmaller);
    }
}

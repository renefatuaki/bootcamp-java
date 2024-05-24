package elfa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Step 1: Create an array with numbers from 1 to 10 and print it to the console.
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers1));

        //  Step 2: Calculate the sum of all numbers in the array and print the result to the console.
        int sum = 0;

        for (int number : numbers1) {
            sum += number;
        }
        System.out.println(sum);

        //  Step 3: Find the largest number in the array and print it to the console.
        int largestNumber = 0;

        for (int number : numbers1) {
            if (number > largestNumber) {
                largestNumber = number
                ;
            }
        }
        System.out.println(largestNumber);

        //  Step 4: Create a second array with numbers from 11 to 20.
        int[] numbers2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //  Step 5: Perform element-wise addition of both arrays and store the result in a third array. Print the result array to the console.
        int[] numbers3 = new int[10];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = numbers1[i] + numbers2[i];
        }
        System.out.println(Arrays.toString(numbers3));

        //  Please post the link to your GitHub repository here, where you have solved this task together.
        //  If you have already completed this task earlier, you may work on the bonus task on the next page.

        // BONUS

        // Implement a program that reads a text from the console and then outputs the letters individually.
        // Tip: Learn about the Scanner class.
        //        var console = System.console();
        //        if (console != null) {
        //            Scanner scanner = new Scanner(console.reader());
        //            int i = scanner.nextInt();
        //            System.out.println(i);
        //        }

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.next();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}
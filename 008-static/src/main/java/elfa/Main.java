package elfa;

// Step 1: Create a class with a static variable 'totalCount' and an instance variable 'instanceCount'. Initialize both variables with the value 0.
// Step 2: Write a static method 'incrementTotalCount' that increments the 'totalCount' by 1.
// Step 3: Write an instance method 'incrementInstanceCount' that increments the 'instanceCount' for the object by 1.
// Step 4: In the main method, create multiple objects of the class and call both the static and instance methods.
// Step 5: Override the ToString method to output the current values of 'totalCount' and 'instanceCount'.


// Bonus
// Create a new class 'Calculator' with a static method 'add' that takes two numbers as parameters and returns their sum.
// Write code in the main method to call the 'add' method and print the result.
// Optional: Implement additional static methods in the 'Calculator' class (subtraction, multiplication, division) and call them in the main method.

public class Main {
    public static void main(String[] args) {
        Counter.incrementTotalCount();

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        System.out.println(counter1);
        System.out.println(counter2);


        counter1.incrementInstanceCount();
        System.out.println(counter1);
        System.out.println(counter2);

        Counter.incrementTotalCount();
        Counter.incrementTotalCount();

        counter2.incrementInstanceCount();
        System.out.println(counter1);
        System.out.println(counter2);

        // BONUS

        System.out.println(Calculator.add(10, 10));
        System.out.println(Calculator.add(10.1, 10.1));
        System.out.println(Calculator.add(10.1, 10));
        System.out.println(Calculator.add(10, 10.1));

        System.out.println(Calculator.multiplyPi(10));
    }
}
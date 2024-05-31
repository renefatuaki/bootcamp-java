package elfa;

//Step 1: Create a class with a static variable 'totalCount' and an instance variable 'instanceCount'. Initialize both variables with the value 0.
//Step 2: Write a static method 'incrementTotalCount' that increments the 'totalCount' by 1.
//Step 3: Write an instance method 'incrementInstanceCount' that increments the 'instanceCount' for the object by 1.
//Step 4: In the main method, create multiple objects of the class and call both the static and instance methods.
//Step 5: Override the ToString method to output the current values of 'totalCount' and 'instanceCount'.

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
    }
}
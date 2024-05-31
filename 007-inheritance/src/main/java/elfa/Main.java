package elfa;

public class Main {
    public static void main(String[] args) {
        //Step 5: Create instances of the "Vehicle" and "Car" classes and call the methods to output the information.
        Vehicle vehicle = new Vehicle("BMW", "3", 2020);
        Car car = new Car(4, "BMW", "3", 2020);
        Motorcycle motorcycle = new Motorcycle(2, "Chopper", "BMW", "X", 2022);

        System.out.println(vehicle.getInfo());
        System.out.println(car.getInfo());
        System.out.println(motorcycle.getInfo());
    }
}

//Step 1: Create a base class "Vehicle" with properties like "Manufacturer", "Model", and "Year of Manufacture".
//Step 2: Create a derived class "Car" that inherits from "Vehicle" and has additional properties like "Number of Doors".
//Step 3: Implement a method in the "Vehicle" class that outputs information about the vehicle.
//Step 4: Override the method from step 3 in the "Car" class to also output the number of doors.
//Step 5: Create instances of the "Vehicle" and "Car" classes and call the methods to output the information.
//Please post the link to your GitHub repo here, where you have solved this task together.
//If you have already completed this task earlier, you may work on the bonus task on the next page.

// BONUS
//Create another derived class from "Vehicle" called "Motorcycle". Add appropriate properties to this class.
//Implement a method in the "Motorcycle" class that returns the type of motorcycle (e.g. Chopper, Sportbike, Cruiser).
//Create instances of both "Car" and "Motorcycle" and call the methods to output the information.
//Discuss together how inheritance was applied in this scenario and what advantages it offers.

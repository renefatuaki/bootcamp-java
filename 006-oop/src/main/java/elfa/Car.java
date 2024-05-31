package elfa;

public class Car {
    //    Step 1: Define the properties of a car, e.g. 'Brand', 'Model', 'Color', 'Year of Manufacture', etc.
    public String brand;
    public String model;
    public String color;
    public int currentSpeed;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    //    Step 2: Implement a method that "starts" the car and outputs a message.
    public void starts() {
        System.out.println(brand + " of model " + model + " is starting.");
    }

    //    Step 3: Create an object of the class 'Car' and call the method to start it.
    //    Step 4: Extend the class 'Car' with a property 'Speed' and a method that "accelerates" the car and changes the speed.
    public void accelerates(int speed) {
        currentSpeed = speed;
        System.out.println(brand + " of model " + model + " driving at " + currentSpeed + " km/h.");
    }
}

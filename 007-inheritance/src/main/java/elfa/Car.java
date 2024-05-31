package elfa;

//Step 2: Create a derived class "Car" that inherits from "Vehicle" and has additional properties like "Number of Doors".
public class Car extends Vehicle {
    int numDoors;

    public Car(int numDoors, String manufacturer, String model, int year) {
        super(manufacturer, model, year);
        this.numDoors = numDoors;
    }

    //Step 4: Override the method from step 3 in the "Car" class to also output the number of doors.
    @Override
    public String getInfo() {
        return "Car is of manufacture " + manufacturer + " of model " + model + " from year " + year + " with " + numDoors + " doors.";
    }
}

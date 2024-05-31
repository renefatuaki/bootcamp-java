package elfa;

//Create another derived class from "Vehicle" called "Motorcycle". Add appropriate properties to this class.
public class Motorcycle extends Vehicle {
    int numWheels;
    String type;

    public Motorcycle(int numWheels, String type, String manufacturer, String model, int year) {
        super(manufacturer, model, year);
        this.numWheels = numWheels;
        this.type = type;
    }

    @Override
    public String getInfo() {
        return "Motorcycle is of manufacture " + manufacturer + " of model " + model + " from year " + year + " of type " + type + ".";
    }

    //Implement a method in the "Motorcycle" class that returns the type of motorcycle (e.g. Chopper, Sportbike, Cruiser).
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

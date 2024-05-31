package elfa;

//Step 1: Create a base class "Vehicle" with properties like "Manufacturer", "Model", and "Year of Manufacture".
public class Vehicle {
    String manufacturer;
    String model;
    int year;

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    //Step 3: Implement a method in the "Vehicle" class that outputs information about the vehicle.
    public String getInfo() {
        return "Vehicle is of manufacture " + manufacturer + " of model " + model + " from year " + year + ".";
    }
}

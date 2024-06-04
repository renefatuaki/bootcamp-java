package pharmacy;

//Step 1: Create a class 'Medication' with the methods 'getName', 'getPrice', and 'getAvailability'.
//Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication name as the key and its information as the value.
//Step 3: Create a method 'int getCount()' in the class Pharmacy. This method should return the number of Medications in the pharmacy.
//Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy. This method should insert the Medication indexed by its name into the pharmacy.
//Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy. This method should return the requested Medication with this name. If no Medication with this name is found, the method should return null.
//Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy. This method should delete the Medication with this name.
//Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Medication a = new Medication("a", 10.99, true);
        Medication b = new Medication("b", 19.99, true);
        Medication c = new Medication("c", 29.99, false);

        Map<String, Medication> medications = new HashMap<>();

        medications.put("a", a);
        medications.put("b", b);
        medications.put("c", c);

        Pharmacy pharmacy = new Pharmacy(medications);

        pharmacy.printMedications();
    }
}

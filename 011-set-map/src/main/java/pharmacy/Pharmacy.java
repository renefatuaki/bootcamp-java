package pharmacy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pharmacy {
    //Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication name as the key and its information as the value.
    Map<String, Medication> medications = new HashMap<>();

    public Pharmacy(Map<String, Medication> medications) {
        this.medications = medications;
    }

    public Map<String, Medication> getMedications() {
        return medications;
    }

    public void setMedications(Map<String, Medication> medications) {
        this.medications = medications;
    }

    //Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication name as the key and its information as the value.
    public void storeMedication(String name, Medication information) {
        this.medications.put(name, information);
    }

    //Step 3: Create a method 'int getCount()' in the class Pharmacy. This method should return the number of Medications in the pharmacy.
    public int getCount() {
        return this.medications.size();
    }

    //Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy. This method should insert the Medication indexed by its name into the pharmacy.
    public void save(Medication medication) {
        this.medications.put(medication.name, medication);
    }

    //Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy. This method should return the requested Medication with this name. If no Medication with this name is found, the method should return null.
    public Medication find(String medicationName) {
        return this.medications.get(medicationName);
    }

    //Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy. This method should delete the Medication with this name.
    public void delete(String medicationName) {
        this.medications.remove(medicationName);
    }

    //Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.
    public void printMedications() {
        Set<String> keys = this.medications.keySet();

        for (String key : keys) {
            System.out.println(this.medications.get(key));
        }
    }
}

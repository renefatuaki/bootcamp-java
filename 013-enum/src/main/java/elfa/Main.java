package elfa;

//Step 1: Create an enum DaysOfWeek with the weekdays (Monday to Sunday).
//Step 2: Write a method that returns the passed weekday as a string if it is a weekday (Monday to Friday), otherwise return 'Weekend'.
//Step 3: Create a record 'Person' with the properties 'id', 'name', and 'favoriteDay', where 'favoriteDay' is of type DaysOfWeek.
//Step 4: Create a class PersonRepository with a list/map of persons.
//Step 5: Write a method in the class PersonRepository that searches for and returns a person based on their id from the list/map. The method should return an Optional.
//Step 6: In your main method, check if the person exists. If they do, print the name and favorite day of the week to the console.

public class Main {
    public static void main(String[] args) {
        DaysOfWeek monday = DaysOfWeek.MONDAY;
        System.out.println(monday.getDay());

        DaysOfWeek saturday = DaysOfWeek.SATURDAY;
        System.out.println(saturday.getDay());

        Person person1 = new Person("0001", "Hans", DaysOfWeek.FRIDAY);
        Person person2 = new Person("0002", "Peter", DaysOfWeek.MONDAY);

        PersonRepository personRepo = new PersonRepository();

        personRepo.addPerson(person1);
        personRepo.addPerson(person2);

        personRepo.searchPersonName("0001").ifPresent(person -> System.out.println(person.name() + " " + person.favoriteDay().getDay()));
        personRepo.searchPersonName("0002").ifPresent(person -> System.out.println(person.name() + " " + person.favoriteDay().getDay()));

        // No existing person
        personRepo.searchPersonName("0003").ifPresent(person -> System.out.println(person.name() + " " + person.favoriteDay().getDay()));
    }
}
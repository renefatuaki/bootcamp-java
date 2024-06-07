package elfa;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {
    private Map<String, Person> persons = new HashMap<>();

    public PersonRepository() {
    }

    public PersonRepository(Map<String, Person> persons) {
        this.persons = persons;
    }

    public Map<String, Person> getPersons() {
        return persons;
    }

    public void setPersons(Map<String, Person> persons) {
        this.persons = persons;
    }

    public Optional<Person> searchPersonName(String id) {
        return Optional.ofNullable(this.persons.get(id));
    }

    public void addPerson(Person person) {
        this.persons.put(person.id(), person);
    }
}

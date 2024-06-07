package elfa;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {
    private Map<Integer, Person> persons = new HashMap<>();

    public PersonRepository() {
    }

    public PersonRepository(Map<Integer, Person> persons) {
        this.persons = persons;
    }

    public Map<Integer, Person> getPersons() {
        return persons;
    }

    public void setPersons(Map<Integer, Person> persons) {
        this.persons = persons;
    }

    public Optional<Person> searchPersonName(int id) {
        return Optional.ofNullable(this.persons.get(id));
    }

    public addPerson
}

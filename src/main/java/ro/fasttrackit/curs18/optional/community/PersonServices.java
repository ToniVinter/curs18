package ro.fasttrackit.curs18.optional.community;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonServices {
    private final List<Person> community;

    public PersonServices(List<Person> community){
        this.community = new ArrayList<>(community);
    }

    public Optional<Person> getPersonByName(String name){
        Optional<Person> foundPerson = Optional.ofNullable(null);
        for (Person person: community){
            if(person.getName().equals(name)){
                foundPerson = Optional.of(person);
            }
        }
        if(foundPerson.isPresent()){
            return foundPerson;
        }else{
            return Optional.empty();
        }
    }

    public Optional<Person> getPersonByAge(int age){
        Optional<Person> foundPerson = Optional.ofNullable(null);
        for (Person person: community){
            if(person.getAge() == age){
                foundPerson = Optional.of(person);
            }
        }
        if(foundPerson.isPresent()){
            return foundPerson;
        }else{
            return Optional.empty();
        }
    }


}

package ro.fasttrackit.curs18.optional;

import ro.fasttrackit.curs18.optional.community.Person;
import ro.fasttrackit.curs18.optional.community.PersonServices;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        PersonServices personServices = new PersonServices(List.of(new Person("Adi",14)));

        System.out.println( personServices.getPersonByAge(10));
        Optional<String> salut = Optional.ofNullable("salut");
        System.out.println(salut.get());
        Optional<String> emptyOptional = Optional.ofNullable(null);
        if(emptyOptional.isPresent()){
            System.out.println(emptyOptional.get());
        }else{
            System.out.println("is empty");
        }

        Optional<String> result = find("nu");
        String message = result.orElse("nu am gasit");
        System.out.println(message);
    }

    public static Optional<String> find(String name){
        if("da".equalsIgnoreCase(name)){
            return Optional.of("gasit");
        }else{
            return Optional.empty();
        }
    }
}

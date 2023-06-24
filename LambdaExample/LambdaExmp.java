import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExmp {
    public static void main(String[] args) {
        
        List<Person> people = Arrays.asList(
           new Person("Athul", "Krishna", 25),
           new Person("Binu", "Bal", 23),
           new Person("Akshay", "Manu", 22),
           new Person("Amal", "Jith", 24) 
        );


        // Sort list by lastname

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Print all persons in people list

        performeConditionally(people, person -> true, System.out::println);

        // Print persons first name starts with A
        System.out.println("\nPrint persons first name starts with A\n");
        performeConditionally(people, person -> person.getFirstName().startsWith("A"), person -> System.out.println(person));

        // Print persons first name ends with L
        System.out.println("\nPrint persons first name ends with L\n");
        performeConditionally(people, person -> person.getFirstName().endsWith("l"), person -> System.out.println(person.getFirstName()));
    }

    private static void performeConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> perform) {

        for(Person person : people) if(condition.test(person)) perform.accept(person);

    }

}

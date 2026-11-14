package nivel3;

import java.util.Comparator;

public class PersonComparator {

    // Comparator to sort by surname (A-Z)
    public static Comparator<Person> sortBySurnameAsc() {
        return Comparator.comparing(Person::getSurname, String.CASE_INSENSITIVE_ORDER);
    }

    // Comparator to sort by surname (Z-A)
    public static Comparator<Person> sortBySurnameDesc() {
        return Comparator.comparing(Person::getSurname, String.CASE_INSENSITIVE_ORDER).reversed();
    }

    // Comparator to sort by name (A-Z)
    public static Comparator<Person> sortByNameAsc() {
        return Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER);
    }

    // Comparator to sort by name (Z-A)
    public static Comparator<Person> sortByNameDesc() {
        return Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER).reversed();
    }

    // Comparator to sort by DNI (A-Z)
    public static Comparator<Person> sortByDniAsc() {
        return Comparator.comparing(Person::getDni, String.CASE_INSENSITIVE_ORDER);
    }

    // Comparator to sort by DNI (Z-A)
    public static Comparator<Person> sortByDniDesc() {
        return Comparator.comparing(Person::getDni, String.CASE_INSENSITIVE_ORDER).reversed();
    }
}
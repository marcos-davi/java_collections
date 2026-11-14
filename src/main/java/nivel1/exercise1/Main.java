package nivel1.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // 1. Create the ArrayList and add 11 months (leaving out "August")
        ArrayList<Month> monthsList = new ArrayList<>();
        monthsList.add(new Month("January"));
        monthsList.add(new Month("February"));
        monthsList.add(new Month("March"));
        monthsList.add(new Month("April"));
        monthsList.add(new Month("May"));
        monthsList.add(new Month("June"));
        monthsList.add(new Month("July"));
        // August is missing
        monthsList.add(new Month("September"));
        monthsList.add(new Month("October"));
        monthsList.add(new Month("November"));
        monthsList.add(new Month("December"));

        System.out.println("=== List without August (Size: " + monthsList.size() + ") ===");
        System.out.println(monthsList);

        // 2. Insert "August" in the corresponding position (index 7)
        monthsList.add(7, new Month("August"));
        System.out.println("\n=== List with August inserted correctly ===");
        System.out.println(monthsList);

        // 3. Convert the ArrayList into a HashSet and check for duplicates
        HashSet<Month> monthsSet = new HashSet<>(monthsList);

        // Try to add a duplicate (for example, "January")
        boolean addedAgain = monthsSet.add(new Month("January"));
        System.out.println("\nWas it possible to add the duplicate 'January' to the HashSet?: " + addedAgain);
        System.out.println("Size of the HashSet (without duplicates): " + monthsSet.size());

        // 4. Iterate through the collection using a traditional for / for-each loop
        System.out.println("\n=== For-Each loop iteration (ArrayList) ===");
        for (Month m : monthsList) {
            System.out.println(m);
        }

        // 5. Iterate through the collection using an Iterator (HashSet)
        System.out.println("\n=== Iteration with an Iterator (HashSet) ===");
        Iterator<Month> iterator = monthsSet.iterator();
        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month);
        }
    }

}


package nivel1.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // 1. Create and populate the first integer list
        List<Integer> firstList = new ArrayList<>();
        firstList.add(10);
        firstList.add(20);
        firstList.add(30);
        firstList.add(40);
        firstList.add(50);

        System.out.println("=== First List ===");
        System.out.println(firstList);

        // 2. Create a second list to store elements in reverse order
        List<Integer> secondList = new ArrayList<>();

        // 3. Obtain a ListIterator positioned at the very end of the first list
        ListIterator<Integer> iterator = firstList.listIterator(firstList.size());

        // Traverse backwards and add each element to the second list
        while (iterator.hasPrevious()) {
            secondList.add(iterator.previous());
        }

        System.out.println("\n=== Second List (Reversed Order) ===");
        System.out.println(secondList);
    }
}
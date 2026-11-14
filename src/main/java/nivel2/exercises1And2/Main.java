package nivel2.exercises1And2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of restaurants
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Can Ros", 7));
        restaurants.add(new Restaurant("El Bulli", 10));
        restaurants.add(new Restaurant("Can Ros", 9)); // Same name, higher score
        restaurants.add(new Restaurant("Abac", 8));
        restaurants.add(new Restaurant("Can Ros", 8)); // Same name, middle score

        System.out.println("=== Unsorted Restaurants ===");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }

        // Use our custom comparator class to sort the restaurants
        RestaurantComparator comparator = new RestaurantComparator();
        Collections.sort(restaurants, comparator);

        System.out.println("\n=== Sorted Restaurants (Name A-Z, Score Descending) ===");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}
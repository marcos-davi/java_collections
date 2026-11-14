package nivel2.exercises1And2;

import java.util.Comparator;

// Custom comparator implementing multiple criteria sorting:
// 1. Alphabetically by name (A-Z)
// 2. By score in descending order if names are identical
public class RestaurantComparator implements Comparator<Restaurant> {

    @Override
    public int compare(Restaurant r1, Restaurant r2) {
        // First criterion: Compare names alphabetically
        int nameComparison = r1.getName().compareTo(r2.getName());

        // If names are different, return the result of the name comparison
        if (nameComparison != 0) {
            return nameComparison;
        }

        // Second criterion: If names are the same, compare scores in DESCENDING order
        // (passing r2 first and r1 second reverses the standard ascending order)
        return Integer.compare(r2.getScore(), r1.getScore());
    }
}
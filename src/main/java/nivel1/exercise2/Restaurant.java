package nivel1.exercise2;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    // Constructor to initialize restaurant attributes
    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Getter for the restaurant name
    public String getName() {
        return name;
    }

    // Getter for the restaurant score
    public int getScore() {
        return score;
    }

    // Overridden equals method to prevent exact duplicates (same name and same score)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return score == that.score && Objects.equals(name, that.name);
    }

    // Overridden hashCode method aligned with equals
    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    // String representation of the restaurant object
    @Override
    public String toString() {
        return "Restaurant: " + name + " | Score: " + score;
    }
}
package nivel1.exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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
    }
}

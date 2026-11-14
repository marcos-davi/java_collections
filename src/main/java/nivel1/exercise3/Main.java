package nivel1.exercise3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String countriesFile = "countries.txt";

        // 1. Load countries data
        Map<String, String> countriesMap = CountryLoader.loadCountries(countriesFile);

        // 2. Initialize and start the game
        CapitalGame game = new CapitalGame(countriesMap);
        game.start();
    }
}
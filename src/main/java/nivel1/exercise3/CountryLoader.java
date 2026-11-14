package nivel1.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountryLoader {

    //Reads country and capital pairs from a text file and maps them.

    public static Map<String, String> loadCountries(String filePath) {
        Map<String, String> countriesMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                if (parts.length >= 2) {
                    String country = parts[0];
                    StringBuilder capital = new StringBuilder();
                    for (int i = 1; i < parts.length; i++) {
                        capital.append(parts[i]);
                        if (i < parts.length - 1) capital.append(" ");
                    }
                    countriesMap.put(country, capital.toString());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the countries file: " + e.getMessage());
        }

        return countriesMap;
    }
}
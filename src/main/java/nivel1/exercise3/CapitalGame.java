package nivel1.exercise3;

import java.util.*;

public class CapitalGame {
    private final Map<String, String> countriesMap;
    private final Scanner input;
    private static final String scoreFile = "scoreFile.txt";

    public CapitalGame(Map<String, String> countriesMap) {
        this.countriesMap = countriesMap;
        this.input = new Scanner(System.in);
    }

    /**
     * Starts and runs the trivia game loop.
     */
    public void start() {
        if (countriesMap.isEmpty()) {
            System.out.println("No countries loaded. Please check the file.");
            return;
        }

        System.out.print("Enter your name: ");
        String userName = input.nextLine().trim();

        // Extract keys, shuffle randomly, and select up to 10 countries
        List<String> countryList = new ArrayList<>(countriesMap.keySet());
        Collections.shuffle(countryList);
        int totalQuestions = Math.min(10, countryList.size());
        int score = 0;

        System.out.println("\n=== Welcome to the Capital Game, " + userName + "! ===");
        System.out.println("You will be asked 10 capitals. Good luck!\n");

        for (int i = 0; i < totalQuestions; i++) {
            String country = countryList.get(i);
            String correctCapital = countriesMap.get(country);

            System.out.print("Question " + (i + 1) + ": What is the capital of " + country + "? ");
            String userAnswer = input.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(correctCapital)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct capital is " + correctCapital + ".\n");
            }
        }

        System.out.println("Game Over! Your final score is: " + score + "/" + totalQuestions);

        // Save result using the score manager
        ScoreManager.saveScore(scoreFile, userName, score, totalQuestions);

        input.close();
    }
}
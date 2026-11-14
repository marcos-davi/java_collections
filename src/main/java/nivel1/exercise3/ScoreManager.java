package nivel1.exercise3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScoreManager {

    //Saves the user's game score to an external text file.

    public static void saveScore(String filePath, String userName, int score, int totalQuestions) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write("User: " + userName + " - Score: " + score + "/" + totalQuestions);
            bw.newLine();
            System.out.println("Score successfully saved to " + filePath);
        } catch (IOException e) {
            System.out.println("Error saving the score: " + e.getMessage());
        }
    }
}
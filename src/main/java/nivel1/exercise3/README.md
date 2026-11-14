# Nivel 1 - Exercise 3: Capital Game

## Overview
An interactive trivia application that tests the user's knowledge of world capitals. The program reads country-capital data from a text file, maps it using a `HashMap`, runs a randomized 10-question trivia session, evaluates answers case-insensitively, and saves the final scores to an external persistence file.

## Architecture & Components
All classes are cleanly organized within the `nivel1.exercise3` package, following the **Single Responsibility Principle (SRP)**:
- **`Main.java`**: The executable entry point of the application that orchestrates data loading and initializes the game loop.
- **`CapitalGame.java`**: Manages the core game flow, user interaction via `Scanner`, random question selection via `Collections.shuffle()`, and scoring.
- **`CountryLoader.java`**: Handles file I/O operations to read `countries.txt` and map countries to their respective capitals.
- **`ScoreManager.java`**: Handles the persistence logic, appending final game scores into `classificacio.txt`.

## How to Run
1. Place the `countries.txt` file in the root directory of your project (or ensure it's accessible as a classpath resource).
2. Open the project in IntelliJ IDEA.
3. Run the `Main` class inside `nivel1.exercise3` to start the game.
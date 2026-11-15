# Nivel 3 - Exercise 1: Person Management System

## Overview
An interactive console application designed to manage a collection of people. The program allows users to dynamically add person records and display them sorted under multiple criteria (by name, surname, or DNI, both in ascending and descending alphabetical order) using custom `Comparator` implementations.

## Architecture & Components
Following the **Single Responsibility Principle (SRP)**, the application is divided into clean, modular components within the `level3.exercise1` package:
- **`Main.java`**: The lightweight executable entry point that initializes the application manager.
- **`PersonManager.java`**: Manages the core application loop, user interaction via `Scanner`, menu routing, and collection storage (`ArrayList`).
- **`Person.java`**: The core data model representing a person with `name`, `surname`, and `dni` attributes. It overrides `equals()` and `hashCode()` based on uniqueness of the DNI.
- **`PersonComparator.java`**: A utility class providing multiple static `Comparator` instances for multi-criteria sorting (Name A-Z/Z-A, Surname A-Z/Z-A, DNI A-Z/Z-A).

## Menu Options
1. **Add person**: Prompts the user for name, surname, and DNI to create and store a new record.
2. **Sort & Show options (2-7)**: Sorts the collection dynamically using custom comparators and displays the records in a formatted tabular view.
3. **Exit**: Terminates the application loop cleanly.


# Nivel 1 - Exercise 1: Duplicates

## Overview
This exercise explores collection behavior regarding insertion order and duplicate management using `ArrayList` and `HashSet`.

## Components
- `Month.java`: A model class representing a calendar month. It overrides `equals()` and `hashCode()` based on the `name` attribute to ensure proper duplicate detection.
- `Main.java`: Contains the logic to create an `ArrayList` with 11 months (excluding "August"), insert "August" at the correct chronological index (`7`), convert the list into a `HashSet` to test duplicate rejection, and traverse the collections using both a standard `for-each` loop and an `Iterator`.
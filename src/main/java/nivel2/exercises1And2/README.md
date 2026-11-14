# Level 2 - Exercises 1 and 2: ListIterator

## Overview
This exercise implements multi-criteria object sorting in Java using a custom `Comparator` implementation. It demonstrates how to establish a hierarchical sorting order based on multiple attributes.

## Components
- **`Restaurant.java`**: The core data model representing a restaurant with `name` and `score` attributes. It includes a constructor, getters, and overridden `equals()` and `hashCode()` methods to manage object identity and uniqueness.
- **`RestaurantComparator.java`**: A custom comparator implementing `Comparator<Restaurant>` that enforces multi-level sorting rules:
    1. **Primary Criterion**: Alphabetical sorting by restaurant name (`A-Z`).
    2. **Secondary Criterion**: If names match, sorts by score in **descending order** (highest score first).
- **`Main.java`**: The executable driver class that initializes a list of restaurants, applies the custom `RestaurantComparator` via `Collections.sort()`, and prints both the unsorted and sorted lists to the console.
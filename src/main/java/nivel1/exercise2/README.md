# Nivel 1 - Exercise 2: ListIterator

## Overview
This exercise focuses on bidirectional list traversal and data manipulation in Java using the `ListIterator` interface. It demonstrates how to efficiently invert the order of elements in a list without altering the original collection.

## Key Concepts & Objectives
- **List Initialization:** Creating and populating an initial `List<Integer>` with collection elements.
- **Bidirectional Iteration:** Utilizing `ListIterator` to navigate through list elements both forwards and backwards.
- **Cursor Positioning:** Instantiating the iterator at the very end of the source list (`originalList.size()`) to read elements in reverse order via `hasPrevious()` and `previous()`.
- **Data Inversion:** Populating a secondary list dynamically based on backward traversal.

## Implementation Details
- **`Main.java`**:
  1. Instantiates an `ArrayList<Integer>` and populates it with integer values.
  2. Creates a target `ArrayList<Integer>` for the reversed sequence.
  3. Obtains a `ListIterator` configured at the end of the original list.
  4. Iterates backwards through the source list, appending each element to the new list, and prints both the original and reversed lists to the console.


# S1-Tasca8 – Lambdas & Streams

## Description

This project is part of **S1-Tasca8**, focused on learning and practicing **lambda expressions** and the **Java Streams API** (Java 16+).

The goal of this exercise is to work with collections in a more declarative and readable way, using functional interfaces provided by Java instead of traditional loops.

---

## Exercise 1

From a list of `String` values, create a method that returns a new list containing only the strings that include the letter **'o'**.  
The result must be printed to the console.

---

## Concepts applied

- Lambda expressions
- Streams API
- `filter()` intermediate operation
- `toList()` terminal operation
- Separation of responsibilities between `main` and business logic
- Functional-style data processing without modifying the original collection

---

## Class responsibilities

### Main

- Creates and initializes the original list of car brands
- Calls the filtering method
- Prints both the original list and the filtered result

### StringFilter

- Contains a static method that:
  - Receives a list of strings
  - Filters the elements that contain the letter `'o'`
  - Returns a new list with the filtered results
- Uses Streams and lambda expressions
- Does not print or modify the original list

---

## Implementation details

The filtering logic is implemented using the Java Streams API:

- `stream()` to process the list
- `filter()` with a lambda expression to apply the condition
- `toList()` to collect the result into a new list

The original list remains unchanged.

Note: The filtering condition checks specifically for the lowercase character `'o'`.  
The exercise statement explicitly refers to the lowercase letter and does not specify handling uppercase characters, so no conversion to lowercase has been applied.

---

## Example output

```
Original car brands:
[Subaru, Lancia, Ford, Toyota, Peugeot, Mitsubishi, Porsche, Alpine]

Car brands containing 'o':
[Ford, Toyota, Peugeot, Porsche]
```

---

## Requirements

- Java 16 or higher
- Use of Java Lambdas and Streams API
- No traditional loops for filtering

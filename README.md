# S1-Tasca8 – Lambdas & Streams

## Description

This project is part of **S1-Tasca8**, focused on learning and practicing **lambda expressions** and the **Java Streams API** (Java 16+).

The goal of these exercises is to work with collections in a more declarative and readable way, using functional interfaces provided by Java instead of traditional loops.

---

## Exercise 1

### Statement

From a list of `String` values, create a method that returns a new list containing only the strings that include the letter **'o'**.  
The result must be printed to the console.

### Implementation

- A static method is used to filter the list.
- The filtering logic is implemented using the Java Streams API.
- The original list is not modified.

### Example output

```
Original car brands:
[Subaru, Lancia, Ford, Toyota, Peugeot, Mitsubishi, Porsche, Alpine]

Car brands containing 'o':
[Ford, Toyota, Peugeot, Porsche]
```

---

## Exercise 2

### Statement

Extend the previous exercise by modifying the filtering method so that it returns only the strings that:
- Contain the letter **'o'**
- Have **more than 5 characters**

The result must also be printed to the console.

### Implementation

- The same structure as Exercise 1 is reused.
- An additional condition is added to the stream filter.
- The original list remains unchanged.

Note: The filtering condition checks specifically for the lowercase character `'o'`.  
The exercise statement explicitly refers to the lowercase letter and does not specify handling uppercase characters, so no conversion to lowercase has been applied.

### Example output

```
Original car brands:
[Subaru, Lancia, Ford, Toyota, Peugeot, Mitsubishi, Porsche, Alpine]

Car brands containing 'o' and more than 5 letters:
[Toyota, Peugeot, Porsche]
```

---

## Exercise 3

### Statement

Create a list containing the names of the months of the year.  
Print all the elements of the list using a lambda expression.

### Implementation

- A list with the months of the year is created in `main`.
- A static method is used to print the elements of the list.
- The printing logic is implemented using a lambda expression with `forEach`.
- No filtering or transformation is applied.

### Example output

```
January
February
March
April
May
June
July
August
September
October
November
December
```

---

## Exercise 4

### Statement

Repeat the same output as in the previous exercise, but using a **method reference** instead of a lambda expression.

### Implementation

- The same list of months is reused.
- The printing logic is updated to use a method reference.
- The program behavior and output remain unchanged.

### Example output

```
January
February
March
April
May
June
July
August
September
October
November
December
```

---

## Class responsibilities

### Main

- Creates and initializes the original list of car brands
- Calls the filtering methods
- Prints the results to the console

### StringFilter

- Contains static filtering methods
- Uses Streams and lambda expressions
- Does not print or modify the original list

---

## Requirements

- Java 16 or higher
- Use of Java Lambdas and Streams API
- No traditional loops for filtering

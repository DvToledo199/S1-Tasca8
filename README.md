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

## Exercise 5

### Statement

Create a **Functional Interface** with a method named `getPiValue()` that returns a `double`.  
From the `main()` method, instantiate the interface using a lambda expression, assign it the value **3.1415**, invoke the method, and print the result.

### Implementation

- A custom functional interface is created with a single abstract method.
- The interface is implemented using a lambda expression.
- The lambda provides the return value `3.1415`.
- The method is invoked from `main`, and the returned value is printed to the console.

### Example output

```
3.1415
```

---

## Exercise 6

### Statement

Create a list containing both numbers and text strings, and sort the list so that the strings are ordered from the shortest to the longest.

### Implementation

- A mixed list (`List<Object>`) is created containing integers and strings.
- The sorting logic is implemented using a lambda expression as a `Comparator`.
- Strings are ordered by their length (ascending).
- Numbers keep their original relative order.
- The sorting logic is separated into a dedicated class.

### Example output

```
Sorted list:
[500, 34, 7, 1234, 89, 100000, 42, 3, Bo, Jo, Ana, Eva, Luis, Alexandra, Christopher, Maximiliano]
```

---

## Exercise 7

### Statement

Using the list from the previous exercise, sort it in reverse order, arranging the strings from the longest to the shortest.

### Implementation

- The same mixed list (`List<Object>`) is reused.
- The sorting logic is implemented using a lambda expression as a `Comparator`.
- Strings are ordered by length in descending order.
- Numbers keep their original relative order.
- Only the comparison logic is inverted from Exercise 6.

### Example output

```
Sorted list:
[500, 34, 7, 1234, 89, 100000, 42, 3, Maximiliano, Christopher, Alexandra, Luis, Ana, Eva, Jo, Bo]
```

---

## Exercise 8

### Statement

Create a **Functional Interface** containing a method named `reverse()` that receives and returns a `String`.  
From the `main()` method, implement the interface using a lambda expression so that it returns the received string reversed.  
Invoke the interface instance passing a string and verify that the result is correct.

### Implementation

- A custom functional interface defines the contract for reversing text.
- The reversing logic is implemented using a lambda expression.
- A `StringBuilder` is used to construct the reversed string efficiently.
- The lambda implementation is separated into a dedicated service class to keep `main` focused only on execution.

### Example output

```
oderflA
```

## Class responsibilities

### Main

- Creates and initializes the original list of car brands
- Calls the filtering methods
- Prints the results to the console

### StringFilter

- Contains static filtering methods
- Uses Streams and lambda expressions
- Does not print or modify the original list

### MixedListSorter

- Contains the sorting logic for mixed lists
- Uses a lambda expression as a `Comparator`
- Orders strings by length while preserving number order

### ReverseInterface

- Defines a functional interface with a single method to reverse a string
- Represents the contract implemented using a lambda expression

### ReverseService

- Provides the lambda implementation of the reversing logic
- Returns an implementation of `ReverseInterface`
- Keeps business logic separated from the `main` class

---

## Requirements

- Java 16 or higher
- Use of Java Lambdas and Streams API
- No traditional loops for filtering

---

# Level 2 – Functional Data Manipulation

## Exercise 1

### Statement

Create a list of proper names and implement a method that returns a new list containing only the strings that:
- Start with the uppercase letter **'A'**
- Have **exactly 3 characters**

Print the result to the console.

### Implementation

- The list of names is created in `main`.
- A dedicated class (`NameFilter`) contains a static method responsible for filtering.
- The filtering logic is implemented using the Java Streams API.
- Two conditions are combined inside a single `filter()` operation:
  - `startsWith("A")`
  - `length() == 3`
- The stream result is collected into a new list using `toList()`.
- The original list remains unchanged.

### Example output

```
Filtered names:
[Ary, Aeg]
```

---

## Exercise 2

### Statement

Create a method that receives a list of `Integer` values and returns a **comma‑separated String**.

Each number must be transformed as follows:
- If the number is **even**, prefix it with the letter **"e"**.
- If the number is **odd**, prefix it with the letter **"o"**.

Example:

Input list:
```
[3, 55, 44]
```

Output:
```
o3, o55, e44
```

The result must be printed to the console.

### Implementation

- The list of numbers is created in `main`.
- A dedicated class (`NumberFormatter`) contains the transformation logic.
- The method returns a single `String` built from the list.
- The Java Streams API is used:
  - `map()` transforms each number into its formatted representation.
  - The modulo operator (`%`) is used to determine whether a number is even or odd.
  - `Collectors.joining(", ")` is used to combine the results into a comma‑separated string.

### Example output

```
o3, o55, e44, e8, o11
```

---

## Exercise 3

### Statement

Create a **Functional Interface** containing a method named `operation()` that returns a `float`.  
From the `main()` method, implement the interface using **lambda expressions** so that different mathematical operations can be executed.

The operations demonstrated are:
- Addition
- Subtraction
- Multiplication
- Division

Each operation is implemented using a lambda expression and executed with different numeric values.

### Implementation

- A custom functional interface (`Operation`) defines a single abstract method.
- The method receives two `float` parameters and returns the result of the operation.
- Lambda expressions are used to implement the behavior of the method for each operation.
- The operations are executed in `main`, passing two numbers as arguments.

Note: Although the original statement only specifies returning a `float`, two parameters were added to the method in order to make the operations reusable and more realistic for mathematical calculations.

### Example output

```
Addition: 25.0
Subtraction: 22.0
Multiplication: 320.0
Division: 5.0

---

## Exercise 4

### Statement

Create a list containing several **text strings and numeric values (stored as Strings)**.

Perform the following operations using the Java Streams API:

- Sort the elements **alphabetically by their first character**.
- Place the strings that **contain the letter "e" first**, followed by the rest.
- Modify every element that contains the character **'a'**, replacing it with **'4'**.
- Display **only the elements that are numeric**, even though they are stored as Strings.

### Implementation

- The original list is created in `main`.
- A dedicated utility class (`ListProcessor`) contains static methods responsible for each transformation.
- The Java Streams API is used throughout the exercise:
  - `sorted()` with a lambda expression to order elements by the first character.
  - A custom comparator to place strings containing "e" first.
  - `map()` to replace the character `'a'` with `'4'`.
  - `filter()` combined with `Character.isDigit()` to keep only numeric strings.
- Each operation returns a **new list**, keeping the original list unchanged.

### Example output

```
Sorted by first character:
[123, 456, apple, banana, car, house, tree]

Strings containing "e" first:
[tree, apple, house, car, 456, banana, 123]

Replace 'a' with '4':
[c4r, 456, b4n4n4, tree, 123, 4pple, house]

Numeric elements only:
[456, 123]
```
```

# Unit 5: Writing Classes

AP Computer Science A

## Overview

This project covers **Unit 5: Writing Classes** concepts including class design, constructors (default, parameterized, and overloaded), instance variables, getter/setter methods, static variables/methods, and the `toString()` override. Complete the `Unit5.java` class and run the provided JUnit tests to verify your work.

## Getting Started

### Option 1: GitHub Codespaces (Recommended)

1. Click the green **Code** button on this repository
2. Select the **Codespaces** tab
3. Click **Create codespace on main**
4. Wait for the environment to build (~2 minutes the first time)
5. Start coding in `src/main/java/unit5/Unit5.java`

> **Note:** If the Java extension shows errors on first load, press `Cmd+Shift+P` (Mac) or `Ctrl+Shift+P` (Windows) and run **"Developer: Reload Window"**. This is a one-time setup step.

### Option 2: Local Development

1. Accept the assignment via the GitHub Classroom link
2. Clone the repository using GitHub Desktop
3. Open the project in your IDE (VS Code, IntelliJ, or Eclipse)
4. **Requirements:** Java 17+, Maven 3.x

## Running Tests

### In VS Code / Codespaces

Click the green play button next to any test method in `Unit5Test.java`, or open the **Testing** sidebar (beaker icon).

### Command Line

Run all tests:
```
mvn test
```

Run a single method's tests:
```
mvn -Dtest=Unit5Test#testDefaultConstructor test
```

## Scoring

| # | Test | Points | Concepts |
|---|------|--------|----------|
| 1 | Default constructor & static count | 20 | Default constructor, `static` variables |
| 2 | Parameterized constructor & getters | 20 | Parameterized constructor, getter methods |
| 3 | Setter methods | 20 | `setName()`, `setAge()` |
| 4 | Overloaded constructor | 15 | Constructor overloading, default values |
| 5 | `toString()` override | 25 | Method overriding, String formatting |
| | **Total** | **100** | |

## What You Need to Implement

In `Unit5.java`, implement:

### Instance Variables
- `private String name` — stores the person's name
- `private int age` — stores the person's age

### Static Variable
- `private static int count` — tracks how many Unit5 objects have been created

### Constructors
1. **Default constructor** — sets name to "Unknown", age to 0, increments count
2. **Parameterized constructor(String, int)** — sets both name and age, increments count
3. **Overloaded constructor(String)** — sets name, age defaults to 0, increments count

### Methods
- `getName()` — returns the name
- `setName(String name)` — updates the name
- `getAge()` — returns the age
- `setAge(int age)` — updates the age
- `static getCount()` — returns the total count of objects created
- `toString()` — returns `"Unit5{name='[name]', age=[age]}"`

## Common Mistakes

- Forgetting to declare instance variables as `private`
- Not incrementing `count` in **every** constructor
- Forgetting the `static` keyword on the count variable and getCount() method
- Using `name` instead of `this.name` when the parameter has the same name
- Incorrect toString format — must be exactly: `Unit5{name='John Doe', age=25}` with single quotes around the name
- Declaring `count` as an instance variable instead of static (each object would have its own count)

## Autograding

Your code is automatically graded when you push to GitHub. Check the **Actions** tab to see your score. Each test is run independently — you earn points for each test you pass.

## Contact

For questions, contact [kevin@csplusplus.com](mailto:kevin@csplusplus.com)

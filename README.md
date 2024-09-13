# Unit 5 - Understanding Classes in Java

## Overview
In this unit, students will learn about creating and using classes in Java, a fundamental concept in object-oriented programming. The focus will be on defining classes, using constructors, method overloading, getters and setters, static attributes, static methods, and overriding methods. This unit will help students understand how objects interact within a program and the importance of encapsulation, data management, and class structure.

## Learning Objectives
- Understand the structure and components of a Java class.
- Implement constructors, including default, parameterized, and overloaded versions.
- Use getters and setters to access and modify private instance data.
- Implement static variables and methods, and understand their use cases.
- Override the `toString` method to provide meaningful string representations of objects.

## Key Concepts
- **Class**: Defines a type and is used to specify the blueprint of objects.
- **Object**: An instance of a class that performs the actual work in a program.
- **Constructor**: A special method used to initialize objects.
- **Method Overloading**: Providing multiple methods with the same name but different parameters.
- **Getters/Setters**: Methods used to access and modify private instance data.
- **Static Attributes/Methods**: Shared among all instances of a class; belong to the class rather than any specific object.
- **Method Overriding**: Customizing methods inherited from a superclass, particularly the `toString` method.

## Common Mistakes
- Forgetting to declare an object before calling its methods.
- Omitting get/set methods for private instance variables.
- Missing a constructor definition, leading to potential initialization errors.
- Mismatch between the method definition and the method call in terms of name, number, type, order of arguments, and return type.
- Forgetting to declare data types for each argument in a method definition.
- Neglecting to use the return value of a method appropriately.

## Assignment
Students are required to complete the `Unit5.java` class by implementing all the necessary methods and attributes described in the JavaDoc comments. They will demonstrate their understanding by ensuring that all provided JUnit tests in `Unit5Test.java` pass successfully.

## JUnit Tests Description and Points

1. **Test Default Constructor and Static Count (20 points)**  
   Verifies that the default constructor correctly initializes the `name` to "Unknown" and `age` to 0, and that the static `count` variable increments properly with each new object.

2. **Test Parameterized Constructor and Getter Methods (20 points)**  
   Ensures the parameterized constructor correctly sets the `name` and `age` fields based on input parameters. Also tests the getter methods to verify the correct retrieval of these values.

3. **Test Setter Methods (20 points)**  
   Tests the setter methods to ensure they correctly update the private instance variables `name` and `age`. Verifies that the updated values can be retrieved using the corresponding getter methods.

4. **Test Overloaded Constructor (15 points)**  
   Checks that the overloaded constructor initializes the `name` with the provided value and sets `age` to 0. Ensures correct handling of constructor overloading.

5. **Test Overriding toString Method (25 points)**  
   Verifies that the `toString` method is correctly overridden to return a string in the specified format: `"Unit5{name='nameValue', age=ageValue}"`. This test ensures proper string representation of the object.

## Getting Started
1. Clone the repository containing the Unit 5 project.
2. Open the project in your preferred IDE (such as IntelliJ IDEA or Eclipse).
3. Navigate to `src/main/java/com/example/unit5/Unit5.java` and implement the required methods and attributes.
4. Run the JUnit tests in `src/test/java/com/example/unit5/Unit5Test.java` to verify your implementations.
5. Ensure all tests pass before submitting your code.

## Submission
Submit your completed `Unit5.java` file through the course's designated submission platform by the due date. Ensure that all tests pass and your code adheres to the style guidelines provided in class.

## Resources
- [Java Documentation](https://docs.oracle.com/javase/8/docs/api/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Object-Oriented Programming in Java](https://www.oracle.com/java/technologies/javase/learn/java-oop.html)

## Support
If you encounter any issues or have questions about the assignment, please reach out during office hours or post in the course discussion forum.

For additional assistance, contact: **Kevin** at [kevin@csplusplus.com](mailto:kevin@csplusplus.com).

---

**Unit 5 - Understanding Classes in Java** is part of the AP Computer Science A course, aimed at building a strong foundation in object-oriented programming and class design.

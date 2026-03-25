# CS++ Java — Unit 5: Writing Classes

> **Unit 5** | 100 Points | 5 Autograded Tests

In this assignment you will design a complete class with constructors, instance variables, getters, setters, a static variable, and a `toString()` override. This is the foundation of object-oriented programming.

---

## Table of Contents

1. [Concepts You Need](#concepts-you-need)
2. [Project Overview](#project-overview)
3. [What to Build](#what-to-build)
4. [File Structure](#file-structure)
5. [Autograding](#autograding)
6. [Try It Yourself — Practice Examples](#try-it-yourself--practice-examples)
7. [Tips for Success](#tips-for-success)
8. [FAQ](#faq)

---

## Concepts You Need

### Instance Variables

Instance variables belong to each object. They should be `private`:

```java
public class Student {
    private String name;
    private int grade;
}
```

### Constructors

A constructor initializes an object when it is created with `new`:

```java
// Default constructor (no parameters)
public Student() {
    name = "Unknown";
    grade = 0;
}

// Parameterized constructor
public Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
}
```

The `this` keyword refers to the current object. Use it when the parameter name matches the instance variable name.

### Getters and Setters

Getters return the value of a private variable. Setters change it:

```java
// Getter
public String getName() {
    return name;
}

// Setter
public void setName(String name) {
    this.name = name;
}
```

### Static Variables

A `static` variable belongs to the class, not to any individual object. All objects share the same copy:

```java
public class Student {
    private static int count = 0;  // shared by all Student objects

    public Student() {
        count++;  // incremented each time a new Student is created
    }

    public static int getCount() {
        return count;
    }
}

// Usage:
Student s1 = new Student();  // count is now 1
Student s2 = new Student();  // count is now 2
System.out.println(Student.getCount());  // 2
```

### Overloaded Constructors

You can have multiple constructors with different parameter lists:

```java
public Student() { ... }                        // no parameters
public Student(String name, int grade) { ... }  // two parameters
public Student(String name) { ... }             // one parameter
```

### toString() Override

`toString()` returns a string representation of the object. This is called automatically when you print an object:

```java
@Override
public String toString() {
    return "Student{name='" + name + "', grade=" + grade + "}";
}

// Usage:
Student s = new Student("Alice", 95);
System.out.println(s);  // prints: Student{name='Alice', grade=95}
```

---

## Project Overview

You will build the `Unit5` class from scratch. The class represents an object with a `name` (String) and `age` (int), plus a `static` counter that tracks how many objects have been created.

---

## What to Build

### Instance Variables
Declare these as `private`:
- `String name`
- `int age`
- `static int count` (shared across all objects)

### Constructors

**Default constructor** — `Unit5()`
- Set `name` to `"Unknown"`
- Set `age` to `0`
- Increment `count`

**Parameterized constructor** — `Unit5(String name, int age)`
- Set `name` and `age` to the provided values
- Increment `count`

**Overloaded constructor** — `Unit5(String name)`
- Set `name` to the provided value
- Set `age` to `0`
- Increment `count`

### Getter Methods
- `getName()` — returns the name
- `getAge()` — returns the age
- `getCount()` — returns the static count (this method should be `static`)

### Setter Methods
- `setName(String name)` — updates the name
- `setAge(int age)` — updates the age

### toString() Override
Return a string in this exact format:
```
Unit5{name='Alice', age=20}
```

Note the single quotes around the name value and no spaces after the commas except between key-value pairs.

---

## File Structure

```
Unit-5-Tests/
├── pom.xml                                <-- Maven config (DO NOT MODIFY)
├── src/
│   ├── main/java/unit5/
│   │   └── Unit5.java                     <-- YOUR CODE GOES HERE
│   └── test/java/unit5/
│       └── Unit5Test.java                 <-- Tests (DO NOT MODIFY)
└── .github/
    └── workflows/
        └── classroom.yml                  <-- Autograding (DO NOT MODIFY)
```

**Edit only `Unit5.java`.**

---

## Autograding

| Test | What It Checks | Points |
|------|---------------|--------|
| testDefaultConstructorAndCount | Default constructor sets name="Unknown", age=0, increments count | 20 |
| testParameterizedConstructorAndGetters | Constructor sets name/age correctly, getters return them | 20 |
| testSetters | setName/setAge update the values | 20 |
| testOverloadedConstructor | Single-parameter constructor sets name, age=0, increments count | 15 |
| testToString | Returns exact format `Unit5{name='X', age=Y}` | 25 |

**Total: 100 points**

---

## Try It Yourself — Practice Examples

Create `Practice.java` in the same directory and run it with `javac Practice.java && java Practice`.

**Example 1 — Basic class with constructor:**
```java
// Practice.java
public class Practice {
    private String name;
    private int score;

    public Practice(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public String toString() {
        return "Practice{name='" + name + "', score=" + score + "}";
    }

    public static void main(String[] args) {
        Practice p = new Practice("Alice", 95);
        System.out.println(p.getName());    // Alice
        System.out.println(p.getScore());   // 95
        p.setScore(100);
        System.out.println(p);              // Practice{name='Alice', score=100}
    }
}
```

**Example 2 — Static counter:**
```java
// Practice.java
public class Practice {
    private String name;
    private static int count = 0;

    public Practice(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() { return count; }

    public static void main(String[] args) {
        System.out.println("Count: " + Practice.getCount());  // 0
        Practice p1 = new Practice("Alice");
        Practice p2 = new Practice("Bob");
        Practice p3 = new Practice("Charlie");
        System.out.println("Count: " + Practice.getCount());  // 3
    }
}
```

**Example 3 — Multiple constructors:**
```java
// Practice.java
public class Practice {
    private String name;
    private int age;

    public Practice() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Practice(String name) {
        this.name = name;
        this.age = 0;
    }

    public Practice(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (age " + age + ")";
    }

    public static void main(String[] args) {
        System.out.println(new Practice());              // Unknown (age 0)
        System.out.println(new Practice("Alice"));       // Alice (age 0)
        System.out.println(new Practice("Bob", 17));     // Bob (age 17)
    }
}
```

---

## Tips for Success

1. Declare instance variables as `private` and the static count as `private static`
2. Every constructor must increment `count++`
3. Use `this.name = name;` when the parameter name matches the instance variable name
4. The `toString()` format must match exactly: `Unit5{name='X', age=Y}` — the test compares strings
5. The `getCount()` method should be `static` since it accesses a static variable
6. Run `mvn test` after each section (constructors, then getters/setters, then toString)

---

## FAQ

**Q: Why does the static count keep increasing across tests?**
Because `static` variables persist for the entire program. The test accounts for this — do not try to reset the counter.

**Q: Do I need the `@Override` annotation on `toString()`?**
It is not required for the test to pass, but it is good practice. The annotation tells the compiler you intend to override a method from the parent class.

**Q: What does `this` mean?**
`this` refers to the current object. `this.name = name;` means "set the object's `name` field to the parameter called `name`."

**Q: What if I forget to increment `count` in one constructor?**
The test creates objects using each constructor and checks that `getCount()` increases. If you miss one, that test will fail.

**Q: Should `getCount()` be static?**
Yes. Since `count` is a static variable, the getter should also be static. You call it with `Unit5.getCount()`.

---

View all assignments and scoring breakdowns at [csplusplus.com/maven-tests](https://csplusplus.com/maven-tests)

*CS++ — AP Computer Science A — [csplusplus.com](https://csplusplus.com)*

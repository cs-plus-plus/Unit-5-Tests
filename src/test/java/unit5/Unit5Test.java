package unit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Unit5Test {

    // ── Test 1: Default Constructor & Static Count (20 points) ──────────────

    @Test
    @DisplayName("testDefaultConstructor: Default constructor and static count (20 points)")
    public void testDefaultConstructor() {
        assertAll("Default Constructor",
            () -> {
                Unit5 obj = new Unit5();
                assertEquals("Unknown", obj.getName(),
                    "Default constructor should set name to \"Unknown\"");
                assertEquals(0, obj.getAge(),
                    "Default constructor should set age to 0");
            },
            () -> {
                int countBefore = Unit5.getCount();
                new Unit5();
                assertEquals(countBefore + 1, Unit5.getCount(),
                    "Each constructor call should increment the static count by 1. " +
                    "Make sure count++ is in every constructor.");
            }
        );
    }

    // ── Test 2: Parameterized Constructor (20 points) ───────────────────────

    @Test
    @DisplayName("testParameterizedConstructor: Constructor with name and age (20 points)")
    public void testParameterizedConstructor() {
        assertAll("Parameterized Constructor",
            () -> {
                Unit5 obj = new Unit5("John Doe", 25);
                assertEquals("John Doe", obj.getName(),
                    "new Unit5(\"John Doe\", 25) — getName() should return \"John Doe\"");
                assertEquals(25, obj.getAge(),
                    "new Unit5(\"John Doe\", 25) — getAge() should return 25");
            }
        );
    }

    // ── Test 3: Setter Methods (20 points) ──────────────────────────────────

    @Test
    @DisplayName("testSetters: setName and setAge update values (20 points)")
    public void testSetters() {
        assertAll("Setters",
            () -> {
                Unit5 obj = new Unit5();
                obj.setName("Jane Smith");
                assertEquals("Jane Smith", obj.getName(),
                    "After setName(\"Jane Smith\"), getName() should return \"Jane Smith\"");
            },
            () -> {
                Unit5 obj = new Unit5();
                obj.setAge(30);
                assertEquals(30, obj.getAge(),
                    "After setAge(30), getAge() should return 30");
            }
        );
    }

    // ── Test 4: Overloaded Constructor (15 points) ──────────────────────────

    @Test
    @DisplayName("testOverloadedConstructor: Constructor with name only, age defaults to 0 (15 points)")
    public void testOverloadedConstructor() {
        assertAll("Overloaded Constructor",
            () -> {
                Unit5 obj = new Unit5("Only Name");
                assertEquals("Only Name", obj.getName(),
                    "new Unit5(\"Only Name\") — getName() should return \"Only Name\"");
                assertEquals(0, obj.getAge(),
                    "new Unit5(\"Only Name\") — getAge() should return 0 (default age)");
            }
        );
    }

    // ── Test 5: toString Override (25 points) ───────────────────────────────

    @Test
    @DisplayName("testToStringOverride: toString returns formatted string (25 points)")
    public void testToStringOverride() {
        assertAll("toString",
            () -> {
                Unit5 obj = new Unit5("John Doe", 25);
                assertEquals("Unit5{name='John Doe', age=25}", obj.toString(),
                    "toString() should return exactly: Unit5{name='John Doe', age=25}. " +
                    "Check your formatting — single quotes around the name, no extra spaces.");
            }
        );
    }
}

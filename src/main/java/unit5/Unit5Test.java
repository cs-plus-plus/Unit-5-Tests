package unit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Unit5Test {

    private Unit5 unit;

    @BeforeEach
    public void setUp() {
        unit = new Unit5("John Doe", 25);
    }

    // Test default constructor and static count
    @Test
    public void testDefaultConstructor() {
        Unit5 defaultUnit = new Unit5();
        assertEquals("Unknown", defaultUnit.getName());
        assertEquals(0, defaultUnit.getAge());
        assertTrue(Unit5.getCount() > 0); // Ensure count is incremented
    }

    // Test parameterized constructor and getter methods
    @Test
    public void testParameterizedConstructor() {
        assertEquals("John Doe", unit.getName());
        assertEquals(25, unit.getAge());
    }

    // Test setter methods
    @Test
    public void testSetters() {
        unit.setName("Jane Smith");
        unit.setAge(30);
        assertEquals("Jane Smith", unit.getName());
        assertEquals(30, unit.getAge());
    }

    // Test overloaded constructor
    @Test
    public void testOverloadedConstructor() {
        Unit5 overloadedUnit = new Unit5("Only Name");
        assertEquals("Only Name", overloadedUnit.getName());
        assertEquals(0, overloadedUnit.getAge());
    }

    // Test overriding toString method
    @Test
    public void testToStringOverride() {
        assertEquals("Unit5{name='John Doe', age=25}", unit.toString());
    }
}

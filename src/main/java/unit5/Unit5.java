package unit5;

/**
 * A class demonstrating Unit 5 concepts: writing classes, constructors,
 * getters/setters, static variables, and toString override.
 *
 * <p>You need to implement:</p>
 * <ul>
 *   <li>Private instance variables: name (String) and age (int)</li>
 *   <li>A private static variable: count (int)</li>
 *   <li>Three constructors (default, parameterized, overloaded)</li>
 *   <li>Getter and setter methods for name and age</li>
 *   <li>A static getter for count</li>
 *   <li>A toString() override</li>
 * </ul>
 */
public class Unit5 {

    public static void main(String[] args) {
        // Test your class here by creating objects and calling methods
        // Example: test the parameterized constructor (after implementing it)
        // Unit5 obj = new Unit5("Alice", 25);
        // System.out.println("getName() = " + obj.getName());  // Expected: Alice
        // System.out.println("getAge() = " + obj.getAge());    // Expected: 25
        // System.out.println("toString() = " + obj);           // Expected: Unit5[name=Alice, age=25]
        System.out.println("Implement the class below, then uncomment the test code above.");
    }

    // TODO: Declare private instance variables:
    //   - name (String)
    //   - age (int)

    // TODO: Declare a private static variable:
    //   - count (int) — tracks how many Unit5 objects have been created

    /**
     * Default constructor. Sets name to "Unknown" and age to 0.
     * Must increment the static count variable.
     *
     * <p>Points: Part of 20-point test</p>
     *
     * <p>Hint: Initialize name = "Unknown" and age = 0, then do count++</p>
     */
    // TODO: Implement default constructor

    /**
     * Parameterized constructor. Sets name and age to the given values.
     * Must increment the static count variable.
     *
     * <p>Points: Part of 20-point test</p>
     *
     * <p>Example: new Unit5("John Doe", 25) creates an object with name="John Doe", age=25</p>
     *
     * <p>Hint: Use this.name = name and this.age = age, then count++</p>
     *
     * @param name the name to set
     * @param age the age to set
     */
    // TODO: Implement parameterized constructor

    /**
     * Overloaded constructor. Takes only a name, sets age to 0.
     * Must increment the static count variable.
     *
     * <p>Points: Part of 15-point test</p>
     *
     * <p>Example: new Unit5("Only Name") creates an object with name="Only Name", age=0</p>
     *
     * <p>Hint: Set name to the parameter, age to 0, and increment count.</p>
     *
     * @param name the name to set
     */
    // TODO: Implement overloaded constructor (name only)

    /**
     * Returns the name of this Unit5 object.
     *
     * @return the name
     */
    // TODO: Implement getName()

    /**
     * Sets the name of this Unit5 object.
     *
     * @param name the new name
     */
    // TODO: Implement setName()

    /**
     * Returns the age of this Unit5 object.
     *
     * @return the age
     */
    // TODO: Implement getAge()

    /**
     * Sets the age of this Unit5 object.
     *
     * @param age the new age
     */
    // TODO: Implement setAge()

    /**
     * Returns the total number of Unit5 objects created.
     * This is a static method because count belongs to the class, not an instance.
     *
     * @return the count of objects created
     */
    // TODO: Implement static getCount()

    /**
     * Returns a string representation of this Unit5 object.
     * Format: Unit5{name='[name]', age=[age]}
     *
     * <p>Points: 25</p>
     *
     * <p>Example: If name is "John Doe" and age is 25, returns:
     * Unit5{name='John Doe', age=25}</p>
     *
     * <p>Hint: Use string concatenation:
     * "Unit5{name='" + name + "', age=" + age + "}"</p>
     *
     * @return formatted string representation
     */
    // TODO: Override toString()
}

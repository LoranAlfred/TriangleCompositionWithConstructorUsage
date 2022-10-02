package triangle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import point.Point;


/**
 * This class is the test class of class {@link Triangle}.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class TriangleTest {

    private Triangle triangleToTest;

    /**
     * Initializing test object of type {@link Triangle}.
     *
     * @since 1.0
     */
    @BeforeEach
    public void initializeTestObject () {
        triangleToTest = new Triangle ();
    }

    /**
     * Cleaning used test object.
     *
     * @since 1.0
     */
    @AfterEach
    public void cleaningUsedTestObject () {
        triangleToTest = null;
    }

    /**
     * Verifies that if a {@link Point} is set the
     */
    @Test
    public void givenAPointObject_WhenFirstPointIsSet_ThenGetterReturnsExpectedValue () {
        Point firstPoint = new Point ( 2.0f, 3.0f );
        triangleToTest.setFirstPoint ( firstPoint );
        Assertions.assertEquals ( firstPoint, triangleToTest.getFirstPoint (), "The points have to be equal!" );
    }
}
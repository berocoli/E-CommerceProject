import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * The test class BayiBilgileriModelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BayiBilgileriModelTest
{
    /**
     * Default constructor for test class BayiBilgileriModelTest
     */
    public BayiBilgileriModelTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testSetIDSube()
    {
        BayiBilgileriModel bayiBilg1 = new BayiBilgileriModel();
        bayiBilg1.setIDSube("31");
        assertEquals("31", bayiBilg1.getIDSube());
        assertEquals(2, (bayiBilg1.getIDSube()).length());
    }
}


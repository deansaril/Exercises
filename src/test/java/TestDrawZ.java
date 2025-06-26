import org.exercises.DrawZ;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDrawZ {

    @Test
    public void testDrawZWithSize3()
    {
        String expectedDrawing = """
                ***
                 *\s
                ***
                """;

        assertEquals(expectedDrawing, DrawZ.drawZ(3));
    }

    @Test
    public void testDrawZWithSize5()
    {
        String expectedDrawing = """
                *****
                   *\s
                  * \s
                 *  \s
                *****
                """;

        assertEquals(expectedDrawing, DrawZ.drawZ(5));
    }

    @Test
    public void testDrawZWithSize7()
    {
        String expectedDrawing = """
                *******
                     *\s
                    * \s
                   *  \s
                  *   \s
                 *    \s
                *******
                """;

        assertEquals(expectedDrawing, DrawZ.drawZ(7));
    }

}

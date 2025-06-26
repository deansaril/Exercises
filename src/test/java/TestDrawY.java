import org.exercises.DrawY;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDrawY {

    @Test
    public void testDrawYWithSize3()
    {
        String expectedDrawing = """
                * *
                 *\s
                 *\s
                """;

        assertEquals(expectedDrawing, DrawY.drawY(3));
    }

    @Test
    public void testDrawYWithSize5()
    {
        String expectedDrawing = """
                *   *
                 * *\s
                  * \s
                  * \s
                  * \s
                """;

        assertEquals(expectedDrawing, DrawY.drawY(5));
    }

    @Test
    public void testDrawYWithSize7()
    {
        String expectedDrawing = """
                *     *
                 *   *\s
                  * * \s
                   *  \s
                   *  \s
                   *  \s
                   *  \s
                """;

        assertEquals(expectedDrawing, DrawY.drawY(7));
    }

}

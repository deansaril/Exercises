import org.exercises.DrawX;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDrawX {

    @Test
    public void testDrawXWithSize3()
    {
        String expectedDrawing = """
                * *
                 *\s
                * *
                """;

        assertEquals(expectedDrawing, DrawX.drawX(3));
    }

    @Test
    public void testDrawXWithSize5()
    {
        String expectedDrawing = """
                *   *
                 * *\s
                  * \s
                 * *\s
                *   * 
                """;

        assertEquals(expectedDrawing, DrawX.drawX(5));
    }

    @Test
    public void testDrawXWithSize7()
    {
        String expectedDrawing = """
                *     *
                 *   *\s
                  * * \s
                   *  \s
                  * * \s
                 *   *\s
                *     * 
                """;

        assertEquals(expectedDrawing, DrawX.drawX(7));
    }

}

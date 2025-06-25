import org.exercises.DrawX;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDrawX {

    @Test
    public void testDrawXWithSize3()
    {
        String expectedStar = """
                * *
                 *\s
                * *
                """;

        assertEquals(expectedStar, DrawX.drawX(3));
    }

    @Test
    public void testDrawXWithSize5()
    {
        String expectedStar = """
                *   *
                 * *\s
                  * \s
                 * *\s
                *   * 
                """;

        assertEquals(expectedStar, DrawX.drawX(5));
    }

    @Test
    public void testDrawXWithSize7()
    {
        String expectedStar = """
                *     *
                 *   *\s
                  * * \s
                   *  \s
                  * * \s
                 *   *\s
                *     * 
                """;

        assertEquals(expectedStar, DrawX.drawX(7));
    }

}

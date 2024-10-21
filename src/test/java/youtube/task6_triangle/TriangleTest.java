package youtube.task6_triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void test_Triangle() {
        assertEquals(Triangle.print().trim(),
                """
                *
                **
                ***
                ****
                *****
                """.trim());
    }

}

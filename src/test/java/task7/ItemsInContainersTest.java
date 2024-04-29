package task7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemsInContainersTest {
    @Test
    void test_numberOfItems() {
        assertEquals(new ArrayList<>(Arrays.asList(2, 3)),
                ItemsInContainers.numberOfItems("|**|*|*",
                        new ArrayList<>(Arrays.asList(1, 1)),
                        new ArrayList<>(Arrays.asList(5, 6))
                ));
    }

    @Test
    void test_numberOfItemsLong() {
        assertEquals(new ArrayList<>(Arrays.asList(3, 10)),
                ItemsInContainers.numberOfItems("|**|*|*****|**|*|",
                        new ArrayList<>(Arrays.asList(1, 1)),
                        new ArrayList<>(Arrays.asList(7, 15))
                ));
    }
}

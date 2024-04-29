package task8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShoppingOptionsTest {

    @Test
    void test_shoppingOptions() {
        int[] priceOfJeans = {2, 3};
        int[] priceOfShoes = {4};
        int[] priceOfSkirts = {2, 3};
        int[] priceOfTops = {1, 2};
        assertEquals(4, ShoppingOptions.getNumberOfOptions(priceOfJeans, priceOfShoes,
                priceOfSkirts, priceOfTops, 10));
    }

    @Test
    void test_shoppingOptionsBigPrices() {
        int[] priceOfJeans = {2, 10000, 3};
        int[] priceOfShoes = {2000002, 4};
        int[] priceOfSkirts = {2, 3000000, 3};
        int[] priceOfTops = {1, 2};
        assertEquals(4, ShoppingOptions.getNumberOfOptions(priceOfJeans, priceOfShoes,
                priceOfSkirts, priceOfTops, 10));
    }
}

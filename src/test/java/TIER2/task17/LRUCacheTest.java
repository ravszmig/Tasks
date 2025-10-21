package TIER2.task17;

import org.junit.jupiter.api.Test;

public class LRUCacheTest {

    @Test
    public void test_LRUCache() {

        LRUCache cache = new LRUCache(2);
        cache.put(1, 100); // cache is {1=100}
        assert cache.get(1) == 100;
        cache.put(2, 200); // cache is {1=100, 2=200}
        assert cache.get(1) == 100;
        assert cache.get(2) == 200;
        cache.get(1);    // returns 100, cache becomes {2=200, 1=100}
        assert cache.get(2) == 200;
        assert cache.get(1) == 100;
        cache.put(3, 300); // evicts key 2, cache is {1=100, 3=300}
        assert cache.get(1) == 100;
        assert cache.get(3) == 300;
        cache.get(2);
        assert cache.get(2) == -1;
    }
}

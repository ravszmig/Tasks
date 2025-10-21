package TIER2.task17;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    int capacity;
    LinkedHashMap<Integer, Integer> map;

    LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    int get(int key) {
        return map.getOrDefault(key, -1);
    }

    void put(int key, int value) {
        map.put(key, value);
    }
}

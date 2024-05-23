package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    private final ConcurrentHashMap<String, Object> cache = new ConcurrentHashMap<>();

    public InMemoryKV(Map<String, Object> initialData) {
        cache.putAll(initialData);
    }

    @Override
    public void set(String key, Object value) {
        if (key == null) {
	    return;
	}
        if (value == null) {
	    cache.remove(key);
	} else {
	    cache.put(key, value);
	}
    }

    @Override
    public void unset(String key) {
	cache.remove(key);
    }

    @Override
    public Object get(String key) {
	return cache.get(key);
    }

    @Override
    public void clear() {
	cache.clear();
    }

    @Override
    public long size() {
	return cache.size();
    }
}
// END

package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    private Map<String, String> database;

    public InMemoryKV(Map<String, String> database) {
        this.database = new HashMap<>(database);
    }

    @Override
    public void set(String key, String value) {
        database.put(key, value);
    }

    @Override
    public void unset(String key) {
        database.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return database.get(key) != null ? database.get(key) : defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(database);
    }
}
// END

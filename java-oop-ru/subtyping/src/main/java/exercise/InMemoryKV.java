package exercise;

import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    private Map<String, String> database;

    public InMemoryKV(Map<String, String> initialData) {
        this.database = initialData;
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
    public String get(String key) {
        return database.getOrDefault(key, "Key not found");
    }

    @Override
    public Map<String, String> toMap() {
        return database;
    }
}
// END

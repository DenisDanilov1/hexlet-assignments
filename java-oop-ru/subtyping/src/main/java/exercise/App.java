package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

// BEGIN
public class App {

    public static void main(String[] args) {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "value", "key2", "value2"));
        App.swapKeyValue(storage);
        System.out.println(storage.get("key", "default"));
        storage.get("value", "default");
    }

    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> temp = new HashMap<>(storage.toMap());
        for (var key : temp.keySet()) {
            String newKey = storage.get(key, "default");
            storage.set(newKey, key);
            storage.unset(key);
        }
    }
}
// END

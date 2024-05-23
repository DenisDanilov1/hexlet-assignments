package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {

    public static void swapKeyValue(KeyValueStorage storage) {

        for (Map.Entry<String, Object> entry : storage.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            storage.put(key, value);

        }

    }

}
// END

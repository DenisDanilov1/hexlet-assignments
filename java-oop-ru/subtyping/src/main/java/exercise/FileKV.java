package exercise;

// BEGIN
import java.util.Map;

class FileKV implements KeyValueStorage {

    private final String filePath;
    private Map<String, String> data;

    public FileKV(String filePath, Map<String, String> initialData) {
        this.filePath = filePath;
        this.data = initialData;
        Utils.writeFile(filePath, Utils.serialize(initialData));
    }

    @Override
    public String get(String key, String defaultValue) {
        if(data.containsKey(key)) {
            return data.get(key);
        } else {
            return defaultValue;
        }
    }

    @Override
    public void put(String key, String value) {
        data.put(key, value);
        Utils.writeFile(filePath, Utils.serialize(data));
    }

    @Override
    public void remove(String key) {
        data.remove(key);
        Utils.writeFile(filePath, Utils.serialize(data));
    }
}
// END

package exercise;

// BEGIN
public class FileKV implements KeyValueStorage {

    private String pathToFile;
    private Map<String, String> initialValue;

    public FileKV(String pathToFile, Map<String, String> initialValue) {
        this.pathToFile = pathToFile;
        this.initialValue = initialValue;
    }

    public void write(String key, String value) {
        writeFile(key, value);
    }

    public String get(String key, String defaultValue) {
        return readFile(key, defaultValue);
    }

    private void writeToFile(String key, String value) {
        writeFile(pathToFile, key, value);
    }

    private void readFile(String key, String defaultValue) {
        return readFile(pathToFile, key, defaultValue);
    }
}
// END

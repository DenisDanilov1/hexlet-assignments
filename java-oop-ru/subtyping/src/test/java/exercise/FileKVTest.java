package exercise;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import com.fasterxml.jackson.databind.ObjectMapper;
// BEGIN
import static org.junit.jupiter.api.Assertions.*;
// END


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.TRUNCATE_EXISTING);
    }

    // BEGIN
    @Test
    public void testGetSetDelete() {
        String filePath = "test.txt";
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }

        Map<String, String> initialData = new HashMap<>();
        initialData.put("key1", "value1");
        initialData.put("key2", "value2");

        FileKV fileKV = new FileKV(filePath, initialData);

        assertEquals("value1", fileKV.get("key1"));
        assertEquals("value2", fileKV.get("key2"));

        fileKV.set("key3", "value3");
        assertEquals("value3", fileKV.get("key3"));

        fileKV.delete("key1");
        assertNull(fileKV.get("key1"));

        fileKV.delete("key2");
        assertNull(fileKV.get("key2"));
    }
    // END
}

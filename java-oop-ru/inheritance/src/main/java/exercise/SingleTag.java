package exercise;

import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
class SingleTag extends Tag {

    SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    public String toString() {
        return String.format("<%s%s>", getName(), stringifyAttributes());
    }
}
// END

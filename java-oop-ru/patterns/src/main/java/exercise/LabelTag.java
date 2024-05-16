package exercise;

// BEGIN
public class LabelTag implements TagInterface {

    private String textValue;
    private TagInterface childTag;

    public LabelTag(String textValue, TagInterface childTag) {
        this.textValue = textValue;
        this.childTag = childTag;
    }

    public String getTextValue() {
        return textValue;
    }

    public TagInterface getChildTag() {
        return childTag;
    }
}
// END

package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String originalString;

    public ReversedSequence(String str) {
        this.originalString = str;
    }

    @Override
    public int length() {
        return originalString.length();
    }

    @Override
    public char charAt(int index) {
        return originalString.charAt(originalString.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String sub = originalString.substring(originalString.length() - end, originalString.length() - start);
        return new ReversedSequence(sub);
    }

    @Override
    public String toString() {
        StringBuilder reversed = new StringBuilder(originalString);
        return reversed.reverse().toString();
    }
}
// END

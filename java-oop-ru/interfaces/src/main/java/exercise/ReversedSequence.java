package exercise;

// BEGIN
class ReversedSequence implements CharSequence {

    private String input;

    public ReversedSequence(String input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return input.reverse();
    }
}
// END

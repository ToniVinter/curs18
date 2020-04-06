package ro.fasttrackit.curs18;

public class Recursive {
    public int length(String word) {
        if (word == null) throw new IllegalArgumentException("word cannot be null");
        if (word.equals("")) {
            return 0;
        } else {
            return length(word.substring(1)) + 1;
        }


    }
}

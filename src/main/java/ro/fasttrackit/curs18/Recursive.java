package ro.fasttrackit.curs18;

public class Recursive {
    public int length(String word){
        if(word == null) throw new IllegalArgumentException("word cannot be null");
            return 0;
    }
}

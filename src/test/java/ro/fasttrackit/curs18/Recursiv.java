package ro.fasttrackit.curs18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Recursiv {
    Recursive recursiv;
    @BeforeEach
    void setup(){
        recursiv = new Recursive();
    }
    @Test
    @DisplayName("WHEN null is received THEN throw exception")
    void ifNullThenException(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> recursiv.length(null));
    }

    @Test
    @DisplayName("WHEN word is empty THEN return 0")
    void ifIsEmpty(){
        org.assertj.core.api.Assertions.assertThat(recursiv.length("")).isEqualTo(1);
    }
}

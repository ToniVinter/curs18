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
        Assertions.assertThrows(IllegalArgumentException.class, ()-> recursiv.length("test"));
    }
}

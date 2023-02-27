package org.chepkasovavv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void execute() {
        Numbers numb = new Numbers(2,5);
        Sum sumCommand = new Sum(numb);
        assertEquals("7", sumCommand.execute().getValue());
    }
}
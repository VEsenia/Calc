package org.chepkasovavv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubTest {

    @Test
    void execute() {
        Numbers numb = new Numbers(2,5);
        Sub subCommand = new Sub(numb);
        assertEquals("3", subCommand.execute().getValue());
    }
}
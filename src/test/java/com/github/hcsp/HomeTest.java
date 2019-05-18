package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void referencePassingTest() {
        assertEquals(null, Home.cat1);
        assertEquals(null, Home.cat2);
        Home.createTwoCats();
        assertEquals("Cat(Tom)", Home.cat1.toString());
        assertEquals("Cat(Tom)", Home.cat2.toString());
        assertTrue(Home.cat1 != Home.cat2);
    }
}

package com.github.hcsp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void referencePassingTest() {
        Assertions.assertEquals(null, Home.cat1);
        Assertions.assertEquals(null, Home.cat2);
        Home.createTwoCats();
        Assertions.assertEquals("Cat(Tom)", Home.cat1.toString());
        Assertions.assertEquals("Cat(Tom)", Home.cat2.toString());
        Assertions.assertTrue(Home.cat1 != Home.cat2);
    }
}

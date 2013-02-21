package edu.macalester.generator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SteppingGeneratorTest {

    @Test
    public void worksWith8() {
        SteppingGenerator gen = new SteppingGenerator(3,5);
        assertEquals(8, gen.next(), 0.001);
        assertEquals(13, gen.next(), 0.001);
    }

    @Test
    public void worksWith2() {
        SteppingGenerator gen = new SteppingGenerator(2,5);
        assertEquals(7, gen.next(), 0.001);
        assertEquals(12, gen.next(), 0.001);
        assertEquals(17, gen.next(), 0.001);
    }

    @Test
    public void worksWithNegatives() {
        SteppingGenerator gen = new SteppingGenerator(-100,5);
        assertEquals(-95, gen.next(), 0.001);
        assertEquals(-90, gen.next(), 0.001);
    }
}

package com.guidetojavaemployment.designpatterns.structuralpattern.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SquarePegAdapterTest {

    @Test
    void shouldAdaptSquarePeg() {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        assertTrue(hole.fits(rpeg));

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        assertTrue(hole.fits(smallSqPegAdapter));
        assertFalse(hole.fits(largeSqPegAdapter));
    }
}
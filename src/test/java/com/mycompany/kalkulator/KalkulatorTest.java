/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.kalkulator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c-law
 */
public class KalkulatorTest {
    
    @Test
    public void testBEqualsZero() {
        assertEquals(1, Kalkulator.CariNilaiPangkat(2, 10));
        assertEquals(1, Kalkulator.CariNilaiPangkat(0, 0));
    }

    @Test
    public void testBNegative() {
        assertEquals(-1, Kalkulator.CariNilaiPangkat(2, -3));
    }

    @Test
    public void testBGreaterThanTen() {
        assertEquals(-2, Kalkulator.CariNilaiPangkat(2, 11));
    }

    @Test
    public void testAGreaterThanHundred() {
        assertEquals(-2, Kalkulator.CariNilaiPangkat(101, 3));
    }

    @Test
    public void testValidPangkat() {
        assertEquals(8, Kalkulator.CariNilaiPangkat(2, 3));
        assertEquals(16, Kalkulator.CariNilaiPangkat(2, 4));
    }
    
}

package org.junit.demo.MarkTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeTest {
    private Grade grade;

    @BeforeEach
    void setUp() {
        grade = new Grade();
    }

    @Test
    void testFailRange() {
        assertEquals("Fail", grade.printInWords((float) 2.00));
        assertEquals("Fail", grade.printInWords((float) 2.50));
        assertEquals("Fail", grade.printInWords((float) 2.99));
    }

    @Test
    void testPoorRange() {
        assertEquals("Poor", grade.printInWords((float) 3.00));
        assertEquals("Poor", grade.printInWords((float) 3.25));
        assertEquals("Poor", grade.printInWords((float) 3.49));
    }

    @Test
    void testGoodRange() {
        assertEquals("Good", grade.printInWords((float) 3.50));
        assertEquals("Good", grade.printInWords((float) 4.00));
        assertEquals("Good", grade.printInWords((float) 4.49));
    }

    @Test
    void testVeryGoodRange() {
        assertEquals("Very good", grade.printInWords((float) 4.50));
        assertEquals("Very good", grade.printInWords((float) 5.00));
        assertEquals("Very good", grade.printInWords((float) 5.49));
    }

    @Test
    void testExcellentRange() {
        assertEquals("Excellent", grade.printInWords((float) 5.50));
        assertEquals("Excellent", grade.printInWords((float) 6.00));
    }

    @Test
    void testOutOfRange() {
        assertEquals("", grade.printInWords((float) 1.99)); 
        assertEquals("", grade.printInWords((float) 6.01)); 
    }
}

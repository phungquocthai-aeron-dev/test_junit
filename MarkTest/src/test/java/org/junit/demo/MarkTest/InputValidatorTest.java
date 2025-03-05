package org.junit.demo.MarkTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InputValidatorTest {
    private InputValidator validator;

    @BeforeEach
    void setUp() {
        validator = new InputValidator();
    }

    @Test
    void testValidMark() {
        assertTrue(validator.isValidMark(2.00f));
        assertTrue(validator.isValidMark(4.50f));
        assertTrue(validator.isValidMark(6.00f));
    }

    @Test
    void testInvalidMark() {
        assertFalse(validator.isValidMark(1.99f));
        assertFalse(validator.isValidMark(6.01f));
    }
}
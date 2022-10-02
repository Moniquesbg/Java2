package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student Monique;

    @BeforeEach
    void setUp()
    {
        Monique = new Student("MoNiQue..", 328492, 2002, 10, 22);
    }
    @Test
    void createUrlFriendlyName() {
        assertEquals("monique-2002-10-22", Monique.createUrlFriendlyName(), "WRONG");
    }
}
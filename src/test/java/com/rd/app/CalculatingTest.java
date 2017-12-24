package com.rd.app;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatingTest {
    Calculating calc;

    @BeforeAll
    static void initAll() {
        System.out.println("before all");
    }

    @BeforeEach
    void init() {
        System.out.println("before each");
    }

    @Test
    @DisplayName("Test on sum")
    public void sum() throws Exception {
        calc = new Calculating();
        assertEquals(9,calc.sum(6,3));
    }

    @Test
    @DisplayName("Test on div")
    public void div() throws Exception {
        calc = new Calculating();
        assertEquals(2,calc.div(6,3),"ERROR DIV");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() throws Exception {
        // not executed
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("after all");
    }

}
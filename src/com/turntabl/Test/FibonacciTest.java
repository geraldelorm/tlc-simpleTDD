package com.turntabl.Test;
import com.turntabl.Main.Main;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    public void testFibonacciHappyPath(){
        //Happy Path or Base Case
        assertEquals(Main.fibonacci(2), List.of(0, 1));
        assertEquals(Main.fibonacci(7), List.of(0, 1, 1, 2, 3, 5, 8));
    }
    @Test
    public void testFibonacciEdgeCases(){
        //Edge Cases or Special Cases
        assertEquals(Main.fibonacci(1), List.of(0));
    }
    @Test
    public void testFibonacciErrorCases(){
        //Error Cases
        assertThrows(NumberFormatException.class, () -> Main.fibonacci(0));
        assertThrows(NumberFormatException.class, () -> Main.fibonacci(-1));
    }
}

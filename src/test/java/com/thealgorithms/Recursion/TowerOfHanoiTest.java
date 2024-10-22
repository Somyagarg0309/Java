package com.thealgorithms.Recursion;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public final class TowerOfHanoiTest {

    @Test
    void solveTowerOfHanoiTest() {
        // Redirect output stream to capture print statements
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        int n = 3; // Number of disks
        TowerOfHanoi.solveTowerOfHanoi(n, 'A', 'C', 'B');

        // Restore original output stream
        System.setOut(originalOut);

        String expectedOutput = "Move disk 1 from rod A to rod C\n" +
                                "Move disk 2 from rod A to rod B\n" +
                                "Move disk 1 from rod C to rod B\n" +
                                "Move disk 3 from rod A to rod C\n" +
                                "Move disk 1 from rod B to rod A\n" +
                                "Move disk 2 from rod B to rod C\n" +
                                "Move disk 1 from rod A to rod C\n";

        // Verify that the output matches the expected output
        assertTrue(outputStream.toString().equals(expectedOutput));
    }
}

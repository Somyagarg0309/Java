package com.thealgorithms.Recursion;

// program to solve Tower of Hanoi problem

public final class TowerOfHanoi {

    private TowerOfHanoi() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }
        
        // Move n-1 disks from source to auxiliary
        solveTowerOfHanoi(n - 1, source, auxiliary, destination);
        
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        
        // Move the n-1 disks from auxiliary to destination
        solveTowerOfHanoi(n - 1, auxiliary, destination, source);
    }
    
    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveTowerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }
}

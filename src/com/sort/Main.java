/**
 *  Java program to use build-in sorting algorithm.
 */

package com.mysort;

import java.util.Arrays;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an array.
        String[] array = {"c", "b", "a"};

        // Printing original array.
        System.out.println("Original: " + Arrays.toString(array)); // Output: Original: [c, b, a]

        // Sorting the array.
        Arrays.sort(array);

        // Printing sorted array.
        System.out.println("Sorted: " + Arrays.toString(array)); // Output: Sorted: [a, b, c]

    }
}

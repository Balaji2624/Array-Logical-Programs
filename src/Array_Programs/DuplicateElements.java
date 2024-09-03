package Array_Programs;

import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 20, 30, 20, 40, 50, 10, 60, 70, 50};

        // Create a HashSet to store elements and a HashSet for duplicates
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        // Iterate over the array to find duplicates
        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        // Print duplicate elements
        System.out.println("Duplicate elements in the array:");
        for (int num : duplicates) {
            System.out.println(num);
        }
    }
}



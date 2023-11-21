public class ContinueExperiment2 {
    public static void main(String[] args) {
        // Experiment 2: Using continue in a for loop
        System.out.println("Experiment 2: Using continue in a for loop");
        for (int i = 1; i <= 5; i++) {
            // Skip printing odd numbers
            if (i % 2 != 0) {
                System.out.println("Skipping odd number: " + i);
                continue; // Skip the rest of the loop body for odd numbers
            }

            System.out.println("Current number: " + i);
        }
    }
}

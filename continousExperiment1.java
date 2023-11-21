public class continousExperiment1 {
    public static void main(String[] args) {
        // Experiment 1: Using continue in a while loop
        int number = 0;

        System.out.println("Experiment 1: Using continue in a while loop");
        while (number < 5) {
            number++;

            // Skip printing even numbers
            if (number % 2 == 0) {
                System.out.println("Skipping even number: " + number);
                continue; // Skip the rest of the loop body for even numbers
            }

            System.out.println("Current number: " + number);
        }
    }
}

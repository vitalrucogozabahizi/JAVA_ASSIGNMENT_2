public class breakExperiment1 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Experiment 1: Using break in a while loop");
        while (true) {
            System.out.println("Iteration: " + i);
            if (i == 3) {
                System.out.println("Breaking the loop at iteration 3");
                break; // Terminate the loop when i equals 3
            }
            i++;
        }
    }
}
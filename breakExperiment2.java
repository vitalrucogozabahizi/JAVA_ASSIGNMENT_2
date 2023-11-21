public class breakExperiment2 {
    public static void main(String[] args) {
        int number = 1;

        System.out.println("Experiment 4: Using break in a while loop without arrays");
        while (true) {
            System.out.println("Current number: " + number);

            if (number > 5) {
                System.out.println("Number exceeds 5. Breaking the loop.");
                break; // Terminate the loop when the number exceeds 5
            }

            number++;
        }
    }
}

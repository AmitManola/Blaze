import java.util.*;
class CommandLineSum {
    public static void main(String[] args) {
        int sum = 0;
        if (args.length == 0) {
            System.out.println("No numbers provided!");
            System.out.println("Usage: java CommandLineSum 10 20 30");
            return; // Exit the program
        }

        // 2. Iterate through the command line arguments
        System.out.println("Calculating Sum...");
        
        for (int i = 0; i < args.length; i++) {
            try {
                // Convert String "10" to int 10
                int num = Integer.parseInt(args[i]);
                sum = sum + num;
            } catch (NumberFormatException e) {
                // Handle cases where user types "abc" instead of numbers
                System.out.println("Skipping invalid input: " + args[i]);
            }
        }

        // 3. Print the final result
        System.out.println("Total Sum: " + sum);
    }
}
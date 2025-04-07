public class LoopingStatementsDemo {
    public static void main(String[] args) {

        // While Loop
        int counter = 1;
        System.out.println("While Loop Output:");
        while (counter <= 5) {
            System.out.println("Count: " + counter);
            counter++;
        }

        // Reset counter for the next loop
        counter = 1;

        // Do-While Loop
        System.out.println("\nDo-While Loop Output:");
        do {
            System.out.println("Count: " + counter);
            counter++;
        } while (counter <= 5);

        // For Loop (Even Numbers)
        System.out.println("\nFor Loop Output (Even Numbers):");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }

        // Nested Loops (3x3 Grid)
        System.out.println("\nNested Loops Output (3x3 Grid):");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Newline after each row
        }

        // Loop with Break and Continue
        System.out.println("\nLoop with Break and Continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue; // Skip number 7
            }
            if (i > 8) {
                break; // Break out of the loop when i > 8
            }
            System.out.println("Number: " + i);
        }
    }
}


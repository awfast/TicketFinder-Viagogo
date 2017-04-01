package Input;

import java.util.Scanner;

public class InputReader {

    public void readInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your 'x' and 'y' event coordinates in the format('x,y').");
        String str = scan.next();
        if(validateInput(str)) {
            System.out.println("Thank you.");
        } else {
            System.out.println("\nYour coordinates seem to be of wrong format. Please try again.\n");
            readInput();
        }
    }

    private boolean validateInput(String input) {
        //Matching X and Y coordinates up to 3 digits
        if(input.matches("\\d,\\d") || input.matches("\\d{2},\\d{2}") || input.matches("\\d{3},\\d{3}")) {
            return true;
        }
        return false;
    }
}

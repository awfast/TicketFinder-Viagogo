package Input;

import Events.DataSeeder;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class InputReader {
    DataSeeder data = new DataSeeder();
    DistanceFinder d = new DistanceFinder();
    public void readInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your 'x' and 'y' event coordinates in the format('x,y').");
        String str = scan.next();

        //split input into X and Y coordinates
        int x = Integer.valueOf(str.substring(0, str.lastIndexOf(",")).trim());
        int y = Integer.valueOf(str.substring(str.lastIndexOf(",") + 1).trim());

        if(validateInput(x, y, str)) {
            System.out.println("Searching for events in the range: [" + x + ", " + y + "]");
            data.generateData(x, y);
            DistanceFinder d = new DistanceFinder();
            d.calculateDistance(x, y, data);
        } else {
            System.out.println("\nYour coordinates seem to be of wrong format. Please try again.\n");
            readInput();
        }
    }

    //Validate user input using regex
    private boolean validateInput(int x, int y,String input) {
        if(x >= -10 && x <= 10 && y >= -10 && y <= 10) {
            //Matching X and Y coordinates up to 2 digits
            if(x < 0 || y < 0) {
                //x represents single-digit numbers
                //xx represents double-digit numbers
                //cases for (-x,-x), (-xx, -xx), (-xx, -x), (-x, -xx), (-xx, x), (x, -xx), (-x, x), (x, -x), (xx, -xx), (-xx, xx)
                if(input.matches("-\\d,-\\d") || input.matches("-\\d{2},-\\d{2}") || input.matches("-\\d{2},-\\d")
                        || input.matches("-\\d,-\\d{2}") || input.matches("-\\d,-\\d") || input.matches("-\\d{2},\\d") || input.matches("\\d,-\\d{2}") || input.matches("-\\d,\\d") || input.matches("\\d,-\\d")
                        || input.matches("\\d{2},-\\d{2}") || input.matches("-\\d{2},\\d{2}")) {
                    return true;
                }
            } else {
                if(input.matches("\\d,\\d") || input.matches("\\d{2},\\d{2}") || input.matches("\\d,\\d{2}") || input.matches("\\d{2},\\d")) {
                    return true;
                }
            }
        }
        return false;
    }
}

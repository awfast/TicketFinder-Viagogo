package Events;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataSeeder {

    public List<Event> allEvents = new ArrayList<Event>();
    public void generateData(int user_x, int user_y) {
        Random rand = new Random();

        //total events to be created
        int total = rand.nextInt(50 + 5);
        //counter here plays two roles, one for ensuring a minimum number of events is created
        //and two, the role of an identifier for each event
        int counter = 0;
        while(counter != total) {
            //Operating in ranges from -10 to +10 for both X and Y
            int x = rand.nextInt(21) + -10;
            int y = rand.nextInt(21) + -10;
            counter++;
            //Each event has 0 or more tickets
            int tickets = rand.nextInt(300) + 0;

            List<Double> prices = new ArrayList<>();
            for(int j=1; j<=tickets; j++) {
                if(tickets == 0) {
                    prices.add(0.0);
                } else {
                    double price = tickets + rand.nextDouble();
                    double truncated = truncateDecimal(price, 2).doubleValue();
                    prices.add(truncated);
                }
            }
            String id = generateID(counter);
            Event e = new Event(x, y, id, tickets, prices);
            allEvents.add(e);
        }

        System.out.print("------------------------------------\n" + "List of events: (for developer purposes only)\n");
        System.out.println("------------------------------------");
        for(int i=0; i<allEvents.size(); i++) {
            System.out.println("X: " + allEvents.get(i).getX() + ", Y:" + allEvents.get(i).getY() + ", ID: " + allEvents.get(i).getIdentifier() + ", Tickets: " + allEvents.get(i).getTicketNumber() + ", Prices: " + allEvents.get(i).getPrice());
        }
        System.out.println("------------------------------------ \n    Closest Events to (" + user_x + "," + user_y + ") \n");
    }

    public List<Event> getAllEvents() {
        return this.allEvents;
    }

    public BigDecimal truncateDecimal(double x, int numberofDecimals) {
        if ( x > 0) {
            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
        } else {
            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
        }
    }

    private String generateID(int counter) {
        int length = (int)(Math.log10(counter)+1);
        if(length < 10) {
            return "00"+counter;
        }
        else if(length < 100 && length >= 10) {
            return "0"+counter;
        }
        else if(length < 1000 && length >=100) {
            return "" + counter;
        }
        else {
            return "";
        }
    }
}

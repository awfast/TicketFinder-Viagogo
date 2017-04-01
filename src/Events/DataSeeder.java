package Events;

import java.util.ArrayList;
import java.util.Random;

public class DataSeeder {

    public ArrayList<Event> allEvents = new ArrayList<Event>();
    public void generateData() {
        Random rand = new Random();

        //a minimum of 5 events will get created;
        int total = rand.nextInt(50 + 5);

        //counter here plays two roles, one for ensuring a minimum number of events is created
        //and two, the role of an identifier for each event
        int counter = 0;
        while(counter != total) {
            //Operating in ranges from -10 to +10 for both X and Y
            int x = rand.nextInt(21) + -10;
            int y = rand.nextInt(21) + -10;

            counter++;
            int capacity = rand.nextInt(200) + 60;
            int price = rand.nextInt(300) + 30;
            Event e = new Event(x, y, counter, capacity, price);
            allEvents.add(e);
        }

        System.out.println("List of events: ");
        for(int i=0; i<allEvents.size(); i++) {
            System.out.println("X: " + allEvents.get(i).getX() + ", Y:" + allEvents.get(i).getY() + ", ID: " + allEvents.get(i).getIdentifier() + ", Capacity: " + allEvents.get(i).getCapacity() + ", Price: " +  allEvents.get(i).getPrice());
        }
    }
}

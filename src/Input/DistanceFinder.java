package Input;

import Events.DataSeeder;
import Events.Event;

import java.util.*;

public class DistanceFinder  {
    Map<Integer, Event> eventDistance = new TreeMap<>();

    public void calculateDistance(int x, int y, DataSeeder d) {
        List<Event> allEvents = d.getAllEvents();

        for (int i = 0; i < allEvents.size(); i++) {
            //Calculate the Manhattan distance
            int distance = Math.abs(x - allEvents.get(i).getX() + Math.abs(y - allEvents.get(i).getY()));
            eventDistance.put(distance, allEvents.get(i));
        }

        //If the DataSeeder has generated less than 5 events, present those events as an alternative to the user
        if (eventDistance.size() < 5) {
            System.out.println("There aren't enough events for the coordinates specified.\n (Here is a list of all the events for this range of coordinates:) \n");
            calculateCheapest();
        } else {
            calculateCheapest();
        }
    }

    public void calculateCheapest() {
        //counter is used for displaying 5 events only
        int counter = 0;
        for (Map.Entry<Integer, Event> distance : eventDistance.entrySet()) {
            if (counter < 5) {
                List<Double> allPrices = distance.getValue().getPrice();
                Collections.sort(allPrices);
                System.out.println("Event" + distance.getValue().getIdentifier() + " - $" + allPrices.get(0) + ", Distance " + distance.getKey());
                counter++;
            }
        }
    }
}

package Events;

import java.util.List;

public class Event {

    int x,y,tickets;
    String identifier;
    List<Double> prices;

    public Event(int x, int y, String identifier, int tickets, List<Double> prices) {
        this.x = x;
        this.y = y;
        this.identifier = identifier;
        this.tickets = tickets;
        this.prices = prices;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setIdentifier(String id) {
        this.identifier = id;
    }

    public void setTicketNumber(int tickets) {
        this.tickets = tickets;
    }

    public void setPrices(List<Double> p) {
        this.prices = p;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getTicketNumber() {
        return tickets;
    }

    public List<Double> getPrice() {
        return this.prices;
    }
}

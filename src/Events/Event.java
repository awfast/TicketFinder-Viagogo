package Events;

public class Event {

    int x,y,identifier,tickets,price;

    public Event(int x, int y, int identifier, int tickets, int price) {
        this.x = x;
        this.y = y;
        this.identifier = identifier;
        this.tickets = tickets;
        this.price = price;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setIdentifier(int id) {
        this.identifier = id;
    }

    public void setTicketNumber(int tickets) {
        this.tickets = tickets;
    }

    public void setPrice(int p) {
        this.price = p;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getIdentifier() {
        return identifier;
    }

    public int getTicketNumber() {
        return tickets;
    }

    public int getPrice() {
        return this.price;
    }
}

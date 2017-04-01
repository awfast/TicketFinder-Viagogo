package Events;

public class Event {

    int x,y,identifier,capacity,price;

    public Event(int x, int y, int identifier, int capacity, int price) {
        this.x = x;
        this.y = y;
        this.identifier = identifier;
        this.capacity = capacity;
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

    public void setCapacity(int cap) {
        this.capacity = cap;
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

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return this.price;
    }
}

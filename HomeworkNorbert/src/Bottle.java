public class Bottle {
    private int capacity;
    private boolean open;
    private int available;

    public Bottle(int capacity, int available, boolean open) {
        setCapacity(capacity);
        setOpen(open);
        setAvailable(available);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public boolean hasMoreLiquid(int available) {
        return available != 0;
    }

    public int availableCapacity(int capacity, int available) {
        return capacity - available;
    }

    public void bottleOpener(boolean open) {
        if (!isOpen()) {
            System.out.println("The bottle is open");
            this.open = true;
        } else {
            System.out.println("The bottle is already opened");
        }
    }

    public void bottleCloser(boolean open) {
        if (isOpen()) {
            System.out.println("The bottle is closed");
            this.open = false;
        } else {
            System.out.println("The bottle is already closed");
        }
    }

    public void drinking(int amount) {
        if (isOpen()) {
            if (available >= amount) {
                System.out.println("You ar drinking " + amount + " ml");
                setAvailable(available - amount);
                return;
            } System.out.println("You want to drink " + amount + " ml, and there is " + available +" ml available");
        } else {
            System.out.println("The bottle is closed, pleas open it first ...");
        }
    }
}

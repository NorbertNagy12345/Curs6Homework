public class Bottle {
    private int capacity;
    private boolean open;
    private int available;

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

    public boolean hasMoreLiquid(int available){
        return available != 0;
    }
    public int availableCapacity(int capacity,int available){
        return capacity-available;
    }

    public void bottleOpener(boolean open){
        System.out.println("The bottle is open");
        this.open=true;
    }

    public void bottleCloser(boolean open){
        System.out.println("The bottle is closed");
        this.open=false;
    }

    public void drinking(int amount){
        System.out.println("You ar drinking "+amount+" ml");
        setAvailable(available-amount);
    }
}

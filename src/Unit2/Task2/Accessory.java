package Unit2.Task2;

public class Accessory {
    private int count;
    private double cost;

    public Accessory(int count, double cost) {
        this.count = count;
        this.cost = cost;
    }

    public void addCount(int count) {
        this.count += count;
    }

    public double getCost() {
        return cost*count;
    }
}

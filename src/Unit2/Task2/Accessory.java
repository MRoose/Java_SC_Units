package Unit2.Task2;

public class Accessory {
    private int count;
    private double cost;
    private String name;

    public Accessory(int count, double cost, String name) {
        this.count = count;
        this.cost = cost;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " : " + cost + " : " + count;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }
}

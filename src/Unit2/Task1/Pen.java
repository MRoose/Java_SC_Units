package Unit2.Task1;

public class Pen {
    private String type;
    private Double cost;

    public Pen(String type) {
        this.type = type;
    }

    public Pen(Double cost) {
        this.cost = cost;
    }

    public Pen(String type, Double cost) {
        this.type = type;
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) Math.round(cost);
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Pen guest = (Pen) obj;
        return cost == guest.cost &&
                (type == guest.type || (type != null && type.equals(guest.type)));
    }

    @Override
    public String toString() {
        return "Pen=type:" + type + ";cost:" + cost;
    }
}

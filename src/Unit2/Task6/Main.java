package Unit2.Task6;

public class Main {
    public static void main(String[] args) {
        AtomicBoat boat1 = new AtomicBoat();
        System.out.println(boat1.getStatus());
        boat1.go();
        System.out.println(boat1.getStatus());
    }
}


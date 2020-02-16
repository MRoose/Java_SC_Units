package Unit2.Task1;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen("gel", 30.22);
        Pen pen2 = new Pen("ball", 45.32);

        System.out.println(pen1.equals(pen1));   //true
        System.out.println(pen1.equals(pen2));   //false
        System.out.println(pen1.hashCode());     //104113
        System.out.println(pen2.hashCode());     //3018547
        System.out.println(pen1.toString());     //Pen=type:gel;cost:30.22
        System.out.println(pen2.toString());     //Pen=type:ball;cost:45.32
    }
}

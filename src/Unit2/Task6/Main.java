package Unit2.Task6;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        AtomicBoat boat1 = new AtomicBoat();
        System.out.println(boat1.getStatus());
        boat1.go();
        System.out.println(boat1.getStatus());

        Annotation[] annotations = boat1.getClass().getMethod("getStatus").getAnnotations();
        System.out.println("Аннотация : " + Arrays.toString(annotations));
    }
}


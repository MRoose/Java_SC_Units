package Task1;

public class Main {
    public static void main(String[] args) {
        CrazyLogger cl = new CrazyLogger();

        cl.addRecord("dubstep");
        cl.addRecord("battlefield3");
        cl.addRecord("battlefield4");
        cl.addRecord("java");
        cl.addRecord("5555555555555");
        cl.addRecord(".");

        System.out.println(cl.findRecordString("battlefield"));
        System.out.println("////////////////////////////////////////////////");
        System.out.println(cl.findRecordSList("battlefield"));
    }
}

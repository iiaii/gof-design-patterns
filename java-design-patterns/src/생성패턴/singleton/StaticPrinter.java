package 생성패턴.singleton;

public class StaticPrinter implements Printer {
    private static final Printer printer = new StaticPrinter();
    private int counter = 0;

    public static Printer getPrinter() {
        return printer;
    }

    @Override
    public synchronized void print(String str) {
        System.out.println(str+" : "+(++counter));
    }
}

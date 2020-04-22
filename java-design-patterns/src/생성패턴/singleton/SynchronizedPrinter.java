package 생성패턴.singleton;

public class SynchronizedPrinter implements Printer {
    private static Printer printer = null;
    private int counter = 0;
    private SynchronizedPrinter() {}

    public synchronized static Printer getPrinter() {
        return printer == null ? printer = new SynchronizedPrinter() : printer;
    }

    @Override
    public synchronized void print(String str) {
        System.out.println(str+" : "+(++counter));
    }
}

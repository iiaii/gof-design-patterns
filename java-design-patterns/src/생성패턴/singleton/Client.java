package 생성패턴.singleton;

public class Client {
    private static final int THREAD_NUM = 5;
    public static void main(String[] args) {
        PrintThread[] prints = new PrintThread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            prints[i] = new PrintThread((i+1)+"-thread");
            prints[i].setPrinter(EnumPrinter.getPrinter());
            prints[i].start();
        }
    }
}

class PrintThread extends  Thread {
    private Printer printer = null;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public PrintThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        printer.print(Thread.currentThread().getName()+" : "+printer.toString()+" 프린터 ");
    }
}


